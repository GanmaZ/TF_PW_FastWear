package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Empresa;
import pe.edu.upc.entities.Producto;
import pe.edu.upc.entities.TipoProducto;
import pe.edu.upc.serviceinterfaces.IEmpresaService;
import pe.edu.upc.entities.Marca;
import pe.edu.upc.serviceinterfaces.IMarcaService;
import pe.edu.upc.serviceinterfaces.IProductoService;
import pe.edu.upc.serviceinterfaces.ITipoProductoService;

@Named
@RequestScoped
public class ProductoController {
	@Inject
	private IProductoService pService;

	@Inject
	private ITipoProductoService tiService;
	
	@Inject
	private IEmpresaService eService;
  
	@Inject
	private IMarcaService maService;
  
	private Producto p;
	private List<Producto> listaProductos;
	private List<TipoProducto> listaTipoProductos;
	private List<Empresa> listaEmpresas;
	private List<Marca> listaMarcas;


	// metodos
	@PostConstruct
	public void init() {
		this.p = new Producto();
		this.listaProductos = new ArrayList<Producto>();
		this.listaTipoProductos = new ArrayList<TipoProducto>();
		this.listaEmpresas = new ArrayList<Empresa>();
		this.listaMarcas = new ArrayList<Marca>();
		this.listTipoProducto();
		this.listEmpresa();
		this.listMarca();
		this.list();
	}

// de esto no dice nada ah
/*	public String newProducto() {
		this.setP(new Producto());
		return "producto.html";
	}
*/
	public void insert() {
		try {
			pService.insert(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ocurrio en el controlador de producto al insertar !!");
		}
	}

	public void list() {
		try {
			listaProductos = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar productos en el controller !!");
			// TODO: handle exception
		}
	}

	public void eliminar(Producto pro) {

		pService.eliminar(pro.getIdProducto());
		list();
	}

	public void listTipoProducto() {
		try {
			listaTipoProductos = tiService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipoproductos en el controlador");
		}
	}
	
	public void listEmpresa() {
		try {
			listaEmpresas = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Empresa en el controlador");
		}
	}

	public void listMarca() {
		try {
			listaMarcas=maService.list();
		} catch (Exception e) {
			System.out.println("Error al listar marca en el controlador");
		}
	}

	// getters and setters
	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public List<TipoProducto> getListaTipoProductos() {
		return listaTipoProductos;
	}

	public void setListaTipoProductos(List<TipoProducto> listaTipoProductos) {
		this.listaTipoProductos = listaTipoProductos;
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}
	

	public List<Marca> getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}

}
