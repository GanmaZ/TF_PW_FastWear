package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Compra;
import pe.edu.upc.entities.DetalleCompra;
import pe.edu.upc.entities.Producto;
import pe.edu.upc.serviceinterfaces.ICompraService;
import pe.edu.upc.serviceinterfaces.IDetalleCompraService;
import pe.edu.upc.serviceinterfaces.IProductoService;

@Named
@RequestScoped
public class DetalleCompraController {
	@Inject
	private IDetalleCompraService dcService;
	@Inject
	private ICompraService cService;
	@Inject
	private IProductoService pService;

	private DetalleCompra dc;
	private List<DetalleCompra> listaDetallesCompras;
	private List<Compra> listaCompras;
	private List<Producto> listaProductos;

	@PostConstruct
	public void init() {
		this.dc = new DetalleCompra();
		this.listaDetallesCompras = new ArrayList<DetalleCompra>();
		this.listaCompras = new ArrayList<Compra>();
		this.listaProductos = new ArrayList<Producto>();
		this.listCompras();
		this.listProductos();
		this.list();
	}

	public void insert() {
		try {
			dcService.insert(dc);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de Detalle al insertar");
		}
	}

	public void list() {
		try {
			listaDetallesCompras = dcService.list();
		} catch (Exception e) {
			System.out.println("Error al listar DetallesCompras en el controller");
		}
	}

	public void listCompras() {
		try {
			listaCompras = cService.list();
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de DetalleCompra al listarcompras");
		}
	}

	public void listProductos() {
		try {
			listaProductos = pService.list();
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de DetalleCompra al listarProductos");
		}
	}

	public DetalleCompra getDc() {
		return dc;
	}

	public void setDc(DetalleCompra dc) {
		this.dc = dc;
	}

	public List<DetalleCompra> getListaDetallesCompras() {
		return listaDetallesCompras;
	}

	public void setListaDetallesCompras(List<DetalleCompra> listaDetallesCompras) {
		this.listaDetallesCompras = listaDetallesCompras;
	}

	public List<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
