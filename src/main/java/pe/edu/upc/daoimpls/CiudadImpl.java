package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerfaces.ICiudadDao;
import pe.edu.upc.entities.Ciudad;

public class CiudadImpl implements ICiudadDao {
	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Ciudad> list() {
		List<Ciudad> listaCiudades = new ArrayList<Ciudad>();
		try {
			
			Query jpql = em.createQuery("from Ciudad ciu");
			listaCiudades = (List<Ciudad>)jpql.getResultList();
			
		} catch (Exception e) {
			
			System.out.println("Error al listar en el dao de Ciudad");
		}
		
		return listaCiudades;
	}

}
