package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITipoProductoDao;
import pe.edu.upc.entities.TipoProducto;

public class TipoProductoImplDao implements ITipoProductoDao{

	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(TipoProducto ti) {
		try {
			em.persist(ti);
		} catch (Exception e) {
			System.out.println("Error al insertar tipoproducto en el dao");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoProducto> list() {
		List<TipoProducto> listaTipoProductos= new ArrayList<TipoProducto>();
		try {
			Query jpql=em.createQuery("from TipoProducto ti");
			listaTipoProductos=(List<TipoProducto>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de tipo producto");
		}
		return listaTipoProductos;
	}
	

}
