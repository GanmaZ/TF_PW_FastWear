package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Ciudad;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.ICiudadService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private ICiudadService cService;

	private Usuario u;
	List<Usuario> listaUsuarios;
	List<Ciudad> listaCiudades;

	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaCiudades = new ArrayList<Ciudad>();
		this.u = new Usuario();
		this.list();
		this.listCiudades();
	}

	public String newUsuario() {
		this.setU(new Usuario());
		return "usuario.xhtml";
	}

	public void insert() {
		try {
			uService.insert(u);
		} catch (Exception e) {
			System.out.println("Error en Clase controller metodo-insertar");
		}
	}
	
	public void list() {
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error en Clase controller metodo-listar");
		}
	}
	
	
	public void listCiudades() {
		try {
			listaCiudades = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar ciudades en el controlador Usuario");
		}
	}

	public void delete(Usuario usr) {
		try {
			uService.delete(usr.getIdUsuario());
		} catch (Exception e) {
			System.out.println("Error en Clase controller metodo-borrar");
		}
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}

	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}
	
	
}
