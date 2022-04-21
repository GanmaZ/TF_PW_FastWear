package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioImpl implements IUsuarioDao {
	@PersistenceContext(unitName = "TF_FastWearDS")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Usuario u) {
		try {
			em.persist(u);
		} catch (Exception e) {
			System.out.println("Error al insertar en UsuarioImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();

		try {
			Query jpql = em.createQuery("from Usuario u");
			listaUsuarios = (List<Usuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en UsuarioImpl");
		}
		return listaUsuarios;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Usuario usr = em.find(Usuario.class, id);
			em.remove(usr);
			
		} catch (Exception e) {
			System.out.println("Error al Borrar en UsuarioImpl");
		}
		
	}

}
