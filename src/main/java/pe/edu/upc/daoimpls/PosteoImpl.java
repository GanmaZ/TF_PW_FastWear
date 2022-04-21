package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IPosteoDao;
import pe.edu.upc.entities.Posteo;

public class PosteoImpl implements IPosteoDao {
	@PersistenceContext(unitName = "TF_FastWearDS")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Posteo p) {

		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar posteo en DAO");

		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Posteo> list(){
		List<Posteo> listaPosteos=new ArrayList<Posteo>();
		try {
			Query jpql=em.createQuery("from Posteo p");
			listaPosteos=(List<Posteo>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO");
		}
		return listaPosteos;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		try {
			Posteo per=em.find(Posteo.class, id);
			em.remove(per);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO");
		}
	}
}
