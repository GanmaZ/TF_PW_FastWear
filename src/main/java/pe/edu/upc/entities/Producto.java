package pe.edu.upc.entities;

import java.util.Objects;

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

	@Column(name = "nombreProducto", nullable = false, length = 60)
	private String nombreProducto;

	@Column(name = "descripcionProducto", nullable = false, length = 200)
	private String descripcionProducto;
	
	@ManyToOne
	@JoinColumn(name = "IdMarca", nullable = false)
	private Marca idMarca;
	
	@Column(name = "precioProducto", nullable = false)
	private double precioProducto;

	@Column(name = "anioProduccion", nullable = false)
	private int anioProduccion;

	@ManyToOne
	@JoinColumn(name = "IdTipoProducto", nullable = false)
	private TipoProducto idTipoproducto;

	@ManyToOne
	@JoinColumn(name = "IdEmpresa", nullable = false)
	private Empresa idEmpresa;

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Producto(int idProducto, TipoProducto tipoproducto, Empresa idEmpresa, String nombreProducto, String descripcionProducto, Marca idmarca,
			double precioProducto, int anioProduccion) {
		super();
		this.idProducto = idProducto;
		this.idTipoproducto = tipoproducto;
		this.idEmpresa = idEmpresa;
		this.nombreProducto = nombreProducto;
		this.descripcionProducto = descripcionProducto;
		this.idMarca=idmarca;
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

	public Empresa getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Marca getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Marca marca) {
		this.idMarca = marca;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return idProducto == other.idProducto;
	}
	
	
}
