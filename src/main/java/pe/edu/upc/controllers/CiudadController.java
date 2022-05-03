package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Ciudad;
import pe.edu.upc.serviceinterfaces.ICiudadService;

@Named
@RequestScoped
public class CiudadController {
	@Inject
	private ICiudadService ciService;
	
	private Ciudad ci;
	private List<Ciudad> listaCiudades;

	// CONSTRUCTOR
	@PostConstruct
	public void init() {
		this.ci = new Ciudad();
		this.listaCiudades = new ArrayList<Ciudad>();
	}

	// MÉTODOS

	public void List() {
		try {
			listaCiudades = ciService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controlador de Ciudad");
		}
	}

		//GETTERS AND SETTERS
	public Ciudad getCi() {
		return ci;
	}

	public void setCi(Ciudad ci) {
		this.ci = ci;
	}

	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}

	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}
	
}
