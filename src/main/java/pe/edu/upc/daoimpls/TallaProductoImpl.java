package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITallaProductoDao;

import pe.edu.upc.entities.TallaProducto;

public class TallaProductoImpl implements ITallaProductoDao {

	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(TallaProducto tap) {
		try {
			em.persist(tap);
		} catch (Exception e) {
			System.out.println("Error al insertar tallaproducto en el DAO");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TallaProducto> list() {
		List<TallaProducto> listaTallaProductos = new ArrayList<TallaProducto>();
		try {
			Query jpql = em.createQuery("from TallaProducto tap");
			listaTallaProductos = (List<TallaProducto>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de tallaproducto");
		}

		return listaTallaProductos;
	}

}
