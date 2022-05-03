package pe.edu.upc.daoimpls;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICategoriaProductoDao;
import pe.edu.upc.entities.CategoriaProducto;

public class CategoriaProductoImpl implements ICategoriaProductoDao {

	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(CategoriaProducto cp) {
		try {
			em.persist(cp);
		} catch (Exception e) {
			System.out.println("Error al insertar CategoriaProducto en DAO");
		}

	}
}
