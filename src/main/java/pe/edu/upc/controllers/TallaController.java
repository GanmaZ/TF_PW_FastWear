package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Talla;
import pe.edu.upc.serviceinterfaces.ITallaService;

@Named
@RequestScoped
public class TallaController {

	@Inject
	private ITallaService tService;

	// metodos
	@PostConstruct
	public void init() {
		this.listatallas = new ArrayList<Talla>();
		this.ta = new Talla();
	}

	public void list() {
		try {
			listatallas = tService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tallas en el controller");
		}
	}

	// atributos
	private Talla ta;
	List<Talla> listatallas;

	public Talla getT() {
		return ta;
	}

	public void setT(Talla ta) {
		this.ta = ta;
	}

	public List<Talla> getListatallas() {
		return listatallas;
	}

	public void setListatallas(List<Talla> listatallas) {
		this.listatallas = listatallas;
	}

}
