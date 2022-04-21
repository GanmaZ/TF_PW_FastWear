package pe.edu.upc.daoimpls;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICompraDao;
import pe.edu.upc.entities.Compra;

public class CompraImpl implements ICompraDao {
	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Compra c) {

		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("Error al insertar compra en DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Compra> list() {
		List<Compra> listaCompras = new ArrayList<Compra>();
		try {
			Query jpql = em.createQuery("from Compra c");
			listaCompras = (List<Compra>) jpql.getResultList();
		} catch (Exception e) {

			System.out.println("Error al listar en el DAO de Compra");
		}

		return listaCompras;
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			Compra com = em.find(Compra.class, id);			
			em.remove(com);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO");
		}

	}
}
