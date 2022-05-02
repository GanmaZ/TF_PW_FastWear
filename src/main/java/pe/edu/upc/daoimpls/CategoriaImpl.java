package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerfaces.ICategoriaDao;
import pe.edu.upc.entities.Categoria;

public class CategoriaImpl implements ICategoriaDao{

	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> list() {
		List<Categoria> listaCategorias = new ArrayList<Categoria>();
		
		try {
			Query jpql = em.createQuery("from Categoria c");
			listaCategorias = (List<Categoria>) jpql.getResultList();
		} catch (Exception e) {

			System.out.println("Error al listar en el DAO de Categoria");
		}
		return listaCategorias;
	}

}
