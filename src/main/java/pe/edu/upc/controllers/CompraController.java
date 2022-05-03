package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Compra;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.ICompraService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class CompraController {
	@Inject
	private ICompraService cService;
	@Inject
	private IUsuarioService uService;

//atributos
	private Compra c;
	private List<Compra> listaCompras;
	private List<Usuario> listaUsuarios;

	// métodos
	@PostConstruct
	public void init() {
		this.listaCompras = new ArrayList<Compra>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.c = new Compra();
		this.listUsuarios();
		this.list();
	}

	public String newCompra() {
		this.setC(new Compra());
		return "compra.xhmtl";
	}

	public void insert() {
		try {
			cService.insert(c);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de compra al insertar");
		}
	}

	public void list() {
		try {
			listaCompras = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar compras en el controller");
		}
	}
	
	public void listUsuarios() {
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Uusarios en el controlador Compra");
		}
	}

	public void delete(Compra comp) {
		try {
			cService.delete(comp.getIdCompra());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de compra");
		}
	}

	// getter's & setter's
	public Compra getC() {
		return c;
	}

	public void setC(Compra c) {
		this.c = c;
	}

	public List<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	
}
