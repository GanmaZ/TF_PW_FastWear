package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DetalleCompra")
public class DetalleCompra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdDetalleCompra;
	
	@Column(name = "Importe", nullable = false, length = 47)
	private double Importe;
	@Column(name = "Cantidad", nullable = false, length = 47)
	private int Cantidad;
	
	@ManyToOne
	@JoinColumn(name = "IdCompra", nullable = false)
	private Compra compra;
	@ManyToOne
	@JoinColumn(name = "IdProducto", nullable = false)
	private Producto producto;
	
	public DetalleCompra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleCompra(int idDetalleCompra, double importe, int cantidad, Compra compra, Producto producto) {
		super();
		this.IdDetalleCompra = idDetalleCompra;
		this.Importe = importe;
		this.Cantidad = cantidad;
		this.compra = compra;
		this.producto = producto;
	}

	public int getIdDetalleCompra() {
		return IdDetalleCompra;
	}

	public void setIdDetalleCompra(int idDetalleCompra) {
		IdDetalleCompra = idDetalleCompra;
	}

	public double getImporte() {
		return Importe;
	}

	public void setImporte(double importe) {
		Importe = importe;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

}
