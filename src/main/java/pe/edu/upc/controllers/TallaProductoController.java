package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Producto;
import pe.edu.upc.entities.Talla;
import pe.edu.upc.entities.TallaProducto;
import pe.edu.upc.serviceinterfaces.IProductoService;
import pe.edu.upc.serviceinterfaces.ITallaProductoService;
import pe.edu.upc.serviceinterfaces.ITallaService;

@Named
@RequestScoped
public class TallaProductoController {

	@Inject
	private ITallaProductoService tapService;
	@Inject
	private IProductoService pService;
	@Inject
	private ITallaService tService;
	private TallaProducto tap;
	private List<TallaProducto> listaTallaProductos;
	private List<Producto> listaProductos;
	private List<Talla> listaTallas;

	// construct
	@PostConstruct
	public void init() {
		this.tap = new TallaProducto();
		this.listaTallaProductos = new ArrayList<TallaProducto>();
		this.listaProductos = new ArrayList<Producto>();
		this.listaTallas = new ArrayList<Talla>();
		this.listaProductos = new ArrayList<Producto>();
		this.listaProductos();
		this.listTallas();
		this.list();

	}

	public void insert() {
		try {
			tapService.insert(tap);
			this.list();
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de tallaproducto al insertar");
		}
	}

	public void list() {
		try {
			listaTallaProductos = tapService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tallaproducto en el controller");
		}
	}

	public void listTallas() {
		try {
			listaTallas = tService.list();

		} catch (Exception e) {
			System.out.println("Error al listar tallas en el controller");
		}
	}

	public void listaProductos() {
		try {
			listaProductos = pService.list();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// getter
	public TallaProducto getTap() {
		return tap;
	}

	public void setTap(TallaProducto tap) {
		this.tap = tap;
	}

	public List<TallaProducto> getListaTallaProductos() {
		return listaTallaProductos;
	}

	public void setListaTallaProductos(List<TallaProducto> listaTallaProductos) {
		this.listaTallaProductos = listaTallaProductos;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public List<Talla> getListaTallas() {
		return listaTallas;
	}

	public void setListaTallas(List<Talla> listaTallas) {
		this.listaTallas = listaTallas;
	}

}
