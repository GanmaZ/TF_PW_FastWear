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
@Table(name = "Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProducto;

	@ManyToOne
	@JoinColumn(name = "TipoProducto", nullable = false)
	private TipoProducto idTipoproducto;

	@Column(name = "nombreProducto", nullable = false, length = 60)
	private String nombreProducto;

	@Column(name = "descripcionProducto", nullable = false, length = 200)
	private String descripcionProducto;

	@Column(name = "precioProducto", nullable = false)
	private double precioProducto;

	@Column(name = "anioProduccion", nullable = false)
	private int anioProduccion;

	/*
	 * @Column(name="nombreTipoProducto", nullable=false) private String
	 * nombreTipoProducto;
	 */
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Producto(int idProducto, TipoProducto tipoproducto, String nombreProducto, String descripcionProducto,
			double precioProducto, int anioProduccion) {
		super();
		this.idProducto = idProducto;
		this.idTipoproducto = tipoproducto;
		this.nombreProducto = nombreProducto;
		this.descripcionProducto = descripcionProducto;
		this.precioProducto = precioProducto;
		this.anioProduccion = anioProduccion;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getAnioProduccion() {
		return anioProduccion;
	}

	public void setAnioProduccion(int anioProduccion) {
		this.anioProduccion = anioProduccion;
	}

	public TipoProducto getTipoproducto() {
		return idTipoproducto;
	}

	public void setTipoproducto(TipoProducto tipoproducto) {
		this.idTipoproducto = tipoproducto;
	}

	/**
	 * @param idProducto
	 * @param tipoproducto
	 * @param nombreProducto
	 * @param descripcionProducto
	 * @param precioProducto
	 * @param anioProduccion
	 */
	

}
