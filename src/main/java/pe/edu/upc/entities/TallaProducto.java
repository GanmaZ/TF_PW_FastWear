package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "TallaProducto")
public class TallaProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTallaProducto;

	@ManyToOne
	@JoinColumn(name = "idProducto", nullable = false)
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "idTalla", nullable = false)
	private Talla talla;

	public TallaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TallaProducto(int idTallaProducto, Producto producto, Talla talla) {
		super();
		this.idTallaProducto = idTallaProducto;
		this.producto = producto;
		this.talla = talla;
	}

	public int getIdTallaProducto() {
		return idTallaProducto;
	}

	public void setIdTallaProducto(int idTallaProducto) {
		this.idTallaProducto = idTallaProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	@Override
	public int hashCode() {
		return Objects.hash(producto, talla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TallaProducto other = (TallaProducto) obj;
		return Objects.equals(producto, other.producto) && Objects.equals(talla, other.talla);
	}

}
