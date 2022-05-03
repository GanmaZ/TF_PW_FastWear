package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column(name = "CantReacciones", nullable = true)
	private int CantReacciones;
	
	@ManyToOne
	@JoinColumn(name = "IdUsuario", nullable = true)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "IdEmpresa", nullable = true)
	private Empresa empresa;
	
	public Posteo() {
		super();
		
	}
	
	public Posteo(int idPosteo, String descripcionPosteo, Date fechaPosteo, int cantReacciones, Usuario usuario,
			Empresa empresa) {
		super();
		this.idPosteo = idPosteo;
		this.DescripcionPosteo = descripcionPosteo;
		this.FechaPosteo = fechaPosteo;
		this.CantReacciones = cantReacciones;
		this.usuario = usuario;
		this.empresa = empresa;
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
	public int getCantReacciones() {
		return CantReacciones;
	}
	public void setCantReacciones(int cantReacciones) {
		CantReacciones = cantReacciones;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
}
