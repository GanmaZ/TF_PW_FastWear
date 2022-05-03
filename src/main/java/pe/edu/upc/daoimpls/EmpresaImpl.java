package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IEmpresaDao;

import pe.edu.upc.entities.Empresa;

public class EmpresaImpl implements IEmpresaDao {

	@PersistenceContext(unitName = "TF_FastWear")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Empresa e) {
		try {
			em.persist(e);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			System.out.println("Error al insertar empresa en el DAO");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> list() {
		List<Empresa> listaEmpresas = new ArrayList<Empresa>();
		try {
			Query jpql = em.createQuery("from Empresa e");
			listaEmpresas = (List<Empresa>) jpql.getResultList();
		} catch (Exception e2) {
			System.out.println("Error al listar en el DAO de empresa");
		}

		return listaEmpresas;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Empresa e = em.find(Empresa.class, id);
			em.remove(e);

		} catch (Exception e2) {
			System.out.println("Error al eliminar en el DAO de empresa");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> findByNameEmpresa(Empresa e) {
		List<Empresa> lista = new ArrayList<Empresa>();
		try {
			Query q = em.createQuery("from Empresa e where e.nombreEmpresa like ?1");
			q.setParameter(1, "%" + e.getNombreEmpresa() + "%");
			lista = (List<Empresa>) q.getResultList();
		} catch (Exception e2) {
			System.out.println("Error al listar empresas en el dao");
		}
		return lista;
	}

	@Transactional
	@Override
	public void update(Empresa e) {
		try {
			em.merge(e);
		} catch (Exception e2) {
			System.out.println("Error al modificar empresas en el dao");
		}

	}

}
