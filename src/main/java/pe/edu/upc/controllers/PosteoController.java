package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Empresa;
import pe.edu.upc.entities.Posteo;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IEmpresaService;
import pe.edu.upc.serviceinterfaces.IPosteoService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped

public class PosteoController {

	@Inject
	private IPosteoService pService;
	@Inject
	private IUsuarioService uService;
	@Inject
	private IEmpresaService eService;

	private Posteo p;
	private List<Posteo> listaPosteos;
	private List<Usuario> listaUsuarios;
	private List<Empresa> listaEmpresas;

	@PostConstruct
	public void init() {
		this.listaPosteos = new ArrayList<Posteo>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaEmpresas = new ArrayList<Empresa>();
		this.p = new Posteo();
		this.listUsuarios();
		this.listEmpresas();
		this.list();
	}

	public String newPosteo() {
		this.setP(new Posteo());
		return "posteo.xhtml";
	}

	public void insert() {
		try {
			pService.insert(p);
		} catch (Exception e) {
			System.out.println("Error ocurrió en el controlador de posteo al insertar");
		}
	}

	public void list() {
		try {
			listaPosteos = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar personas en el controlador");
		}
	}
	
	public void listUsuarios() {
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de posteo al listarusuarios");
		}
	}
	
	public void listEmpresas() {
		try {
			listaEmpresas = eService.list();
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de posteoal listarempresas");
		}
	}

	public void delete(Posteo pers) {
		try {
			pService.delete(pers.getIdPosteo());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador posteo");
		}
	}

	// getters and setters
	public IPosteoService getpService() {
		return pService;
	}

	public void setpService(IPosteoService pService) {
		this.pService = pService;
	}

	public Posteo getP() {
		return p;
	}

	public void setP(Posteo p) {
		this.p = p;
	}

	public List<Posteo> getListaPosteos() {
		return listaPosteos;
	}

	public void setListaPosteos(List<Posteo> listaPosteos) {
		this.listaPosteos = listaPosteos;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}
	
	
}
