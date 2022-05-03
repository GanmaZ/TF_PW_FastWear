package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Marca;
import pe.edu.upc.serviceinterfaces.IMarcaService;

@Named
@RequestScoped
public class MarcaController {
	@Inject
	private IMarcaService maService;
	
	private Marca ma;
	List<Marca> listaMarcas;
	
	@PostConstruct
	public void init() {
		this.listaMarcas = new ArrayList<Marca>();
		this.ma= new Marca();
		this.list();
	}
	//metodos
	
	public void insert() {
			try {
				maService.insert(ma);
			} catch (Exception e) {
				System.out.println("Error al insertar en el controlador de marca");
			}
		}
		
	public void list() {
			try {
				listaMarcas= maService.list();
			} catch (Exception e) {
				System.out.println("Error al listar en el controlador de marca");
			}
		}



	//getters and setters 
	public IMarcaService getMaService() {
		return maService;
	}

	public void setMaService(IMarcaService maService) {
		this.maService = maService;
	}

	public Marca getMa() {
		return ma;
	}

	public void setMa(Marca ma) {
		this.ma = ma;
	}

	public List<Marca> getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}
	
	
	
}
