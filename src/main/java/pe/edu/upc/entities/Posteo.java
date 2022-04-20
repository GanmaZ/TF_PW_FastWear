package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Posteo")
public class Posteo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPosteo;
	@Column(name = "DescripcionPosteo", nullable = false, length = 80)
	private String DescripcionPosteo;
	
	@Column(name = "FechaPosteo", nullable = false)
	private Date FechaPosteo;
	
	@Column(name = "CantReacciones", nullable = false)
	private String CantReacciones;
	
	public Posteo() {
		super();
		
	}
	public Posteo(int idPosteo, String DescripcionPosteo, Date FechaPosteo, String CantReacciones) {
		super();
		this.idPosteo=idPosteo;
		this.DescripcionPosteo=DescripcionPosteo;
		this.FechaPosteo=FechaPosteo;
		this.CantReacciones=CantReacciones;
	}
	public int getIdPosteo() {
		return idPosteo;
	}
	public void setIdPosteo(int idPosteo) {
		this.idPosteo = idPosteo;
	}
	public String getDescripcionPosteo() {
		return DescripcionPosteo;
	}
	public void setDescripcionPosteo(String descripcionPosteo) {
		DescripcionPosteo = descripcionPosteo;
	}
	public Date getFechaPosteo() {
		return FechaPosteo;
	}
	public void setFechaPosteo(Date fechaPosteo) {
		FechaPosteo = fechaPosteo;
	}
	public String getCantReacciones() {
		return CantReacciones;
	}
	public void setCantReacciones(String cantReacciones) {
		CantReacciones = cantReacciones;
	}
	
}
