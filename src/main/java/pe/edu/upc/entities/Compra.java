package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Compra")
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdCompra;
	
	@Column(name = "Total",nullable = false, length = 47)
	private double Total;
	
	@Column(name = "FechaCompra",nullable = false)
	private Date FechaCompra;
	
	@Column(name = "MetodoPago",nullable = false, length = 46)
	private String MetodoPago;

	@ManyToOne
	@JoinColumn(name = "IdUsuario", nullable = false)
	private Usuario usuario;
	
	// CONSTRUCTOR SIN PARÁMETROS
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	// CONSTRUCTOR CON PARÁMETROS

	public Compra(int idCompra, double total, Date fechaCompra, String metodoPago, Usuario usuario) {
		super();
		this.IdCompra = idCompra;
		this.Total = total;
		this.FechaCompra = fechaCompra;
		this.MetodoPago = metodoPago;
		this.usuario = usuario;
	}


	// GENERAR GETTER'S A SETTER'S
	public int getIdCompra() {
		return IdCompra;
	}

	public void setIdCompra(int idCompra) {
		this.IdCompra = idCompra;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public Date getFechaCompra() {
		return FechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		FechaCompra = fechaCompra;
	}

	public String getMetodoPago() {
		return MetodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		MetodoPago = metodoPago;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCompra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return IdCompra == other.IdCompra;
	}
	
	
	
}
