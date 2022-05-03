package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IMarcaDao;
import pe.edu.upc.entities.Marca;

public class MarcaImplDao implements IMarcaDao{

	@PersistenceContext(unitName= "TF_FastWear")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Marca ma) {
		try {
			em.persist(ma);
		} catch (Exception e) {
			System.out.println("Error al insertar marca en el dao");
		}
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Marca> list() {
		List<Marca> listaMarcas= new ArrayList<Marca>();
		try {
			Query jpql=em.createQuery("from Marca ma");
			listaMarcas=(List<Marca>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de marca");
		}
		return listaMarcas;
	}

}
