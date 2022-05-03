package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoProducto;
import pe.edu.upc.serviceinterfaces.ITipoProductoService;
@Named
@RequestScoped
public class TipoProductoController {
	@Inject
	private ITipoProductoService tiService;
	
	private TipoProducto ti;
	List<TipoProducto> listaTipoProductos;
	
	//constructor
	
	@PostConstruct
	public void init() {
		
		this.listaTipoProductos=new ArrayList<TipoProducto>();
		this.ti=new TipoProducto();
		this.list();
	}
	//metodos
	
	public String newTipoProducto() {
		return "tipoProducto.xhtml";
		
	}
	public void insert() {
		try {
			tiService.insert(ti);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de tipoproducto");
		}
	}
	
	public void list() {
		try {
			listaTipoProductos= tiService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controlador de tipoproducto");
		}
	}
	
	
	
	
	//getters and setters
	public TipoProducto getTi() {
		return ti;
	}
	public void setTi(TipoProducto ti) {
		this.ti = ti;
	}
	public List<TipoProducto> getListaTipoProductos() {
		return listaTipoProductos;
	}
	public void setListaTipoProductos(List<TipoProducto> listaTipoProductos) {
		this.listaTipoProductos = listaTipoProductos;
	}

	public ITipoProductoService getTiService() {
		return tiService;
	}

	public void setTiService(ITipoProductoService tiService) {
		this.tiService = tiService;
	}
	
	
	
}
