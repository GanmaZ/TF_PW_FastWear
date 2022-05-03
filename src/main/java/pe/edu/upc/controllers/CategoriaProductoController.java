package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Categoria;
import pe.edu.upc.entities.CategoriaProducto;
import pe.edu.upc.entities.Producto;
import pe.edu.upc.serviceinterfaces.ICategoriaProductoService;
import pe.edu.upc.serviceinterfaces.ICategoriaService;
import pe.edu.upc.serviceinterfaces.IProductoService;

@Named
@RequestScoped
public class CategoriaProductoController {

	@Inject
	private ICategoriaProductoService cpService;
	@Inject
	private IProductoService PService;
	@Inject
	private ICategoriaService cService;
	
	private CategoriaProducto cp;
	private List<Producto> listaProductos;
	private List<Categoria> listaCategorias;
	

	@PostConstruct
	public void init() {
		this.cp = new CategoriaProducto();
		this.listaCategorias = new ArrayList<Categoria>();
		this.listaProductos = new ArrayList<Producto>();
		this.listCategorias();
		this.listProductos();
	}

	
	public void insert() {
		try {
			cpService.insert(cp);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de CategoriaProducto al insertar");
		}
	}
	
	public void listProductos() {
		try {
			listaProductos = PService.list();
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de CategoriaProducto al listarpersonas");
		}
	}
	
	public void listCategorias() {
		try {
			listaCategorias = cService.list();
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de CategoriaProducto al listarcategorias");
		}
	}
	
	
	public CategoriaProducto getCp() {
		return cp;
	}

	public void setCp(CategoriaProducto cp) {
		this.cp = cp;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}


	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	
}
