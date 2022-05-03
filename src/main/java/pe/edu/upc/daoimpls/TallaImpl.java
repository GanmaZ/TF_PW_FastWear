package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerfaces.ITallaDao;
import pe.edu.upc.entities.Talla;

public class TallaImpl implements ITallaDao {

	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager ta;

	@SuppressWarnings("unchecked")
	@Override
	public List<Talla> list() {
		List<Talla> listatallas = new ArrayList<Talla>();
		try {
			Query jpql = ta.createQuery("from Talla t");
			listatallas = (List<Talla>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de talla");
		}
		return listatallas;
	}

}
