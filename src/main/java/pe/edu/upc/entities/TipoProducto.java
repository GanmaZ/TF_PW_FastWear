package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoProducto")
public class TipoProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTipoProducto;
	@Column(name = "nombreTipoProducto", nullable = false, length = 60)
	private String nombreTipoProducto;

	public TipoProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoProducto(int idTipoProducto, String nombreTipoProducto) {
		super();
		this.idTipoProducto = idTipoProducto;
		this.nombreTipoProducto = nombreTipoProducto;
	}

	public int getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getNombreTipoProducto() {
		return nombreTipoProducto;
	}

	public void setNombreTipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTipoProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoProducto other = (TipoProducto) obj;
		return idTipoProducto == other.idTipoProducto;
	}

}
