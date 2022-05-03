package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDetalleCompraDao;
import pe.edu.upc.entities.DetalleCompra;

public class DetalleCompraImpl implements IDetalleCompraDao{


	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(DetalleCompra dc) {
		try {
			em.persist(dc);
		} catch (Exception e) {
			System.out.println("Error al insertar DetalleCompra en DAO");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleCompra> list() {
		List<DetalleCompra> listaDetallesCompras = new ArrayList<DetalleCompra>();
		try {
			Query jpql = em.createQuery("from DetalleCompra dc");
			listaDetallesCompras = (List<DetalleCompra>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de DetalleCompra");
		}

		return listaDetallesCompras;
	}

}
