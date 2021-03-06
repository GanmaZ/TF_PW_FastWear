package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Empresa;
import pe.edu.upc.serviceinterfaces.IEmpresaService;

@Named
@RequestScoped
public class EmpresaController {
	@Inject
	private IEmpresaService eService;
	// atributos
	private Empresa emp;
	private List<Empresa> listaEmpresas;

	// metodos
	@PostConstruct
	public void init() {
		this.listaEmpresas = new ArrayList<Empresa>();
		this.emp = new Empresa();
		this.list();
	}

	public String newEmpresa() {
		this.setE(new Empresa());
		return "empresa.xhtml";
	}

	public void insert() {
		try {
			eService.insert(emp);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de empresa al insertar");
		}
	}

	public void list() {
		try {
			listaEmpresas = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar empresas en el controller");
		}
	}

	public void delete(Empresa emp) {
		try {
			eService.delete(emp.getIdEmpresa());
		} catch (Exception e) {
			System.out.println("Error al eliminar empresas en el controller");
		}
	}

	public void findByNameEmpresa() {
		try {
			listaEmpresas = eService.findByNameEmpresa(this.getE());
		} catch (Exception e) {
			System.out.println("Error al buscar Empresa en el controlador");
		}
	}

	// lleva la data al formulario
	public String updatePre(Empresa emp) {
		this.setE(emp);
		return "preupdateEmpresa.xhtml";
	}

	// modificacion en la bd
	public void update() {
		try {
			eService.update(this.emp);
		} catch (Exception e) {
			System.out.println("Error al modicar Empresa en el controlador");
		}
	}

	// getters & setters
	public Empresa getE() {
		return emp;
	}

	public void setE(Empresa emp) {
		this.emp = emp;
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}

}
