package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Categoria;
import pe.edu.upc.serviceinterfaces.ICategoriaService;

@Named
@RequestScoped
public class CategoriaController {

	@Inject
	private ICategoriaService cService;
	
	List<Categoria> listaCategorias;
	
	@PostConstruct
	public void init() {
		this.listaCategorias = new ArrayList<Categoria>();
	}
	
	
	public void list() {
		try {
			listaCategorias = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Categorias en el controller");
		}
	}
	

	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}
	
	
}
