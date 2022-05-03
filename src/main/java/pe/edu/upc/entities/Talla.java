package pe.edu.upc.entities;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Talla")
public class Talla {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int idTalla;

	@Column(name = "nombreTalla", nullable = false, length = 47)
	private String nombreTalla;

	public Talla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Talla(int idTalla, String nombreTalla, List<Producto> productos) {
		super();
		this.idTalla = idTalla;
		this.nombreTalla = nombreTalla;
	}

	public int getIdTalla() {
		return idTalla;
	}

	public void setIdTalla(int idTalla) {
		this.idTalla = idTalla;
	}

	public String getNombreTalla() {
		return nombreTalla;
	}

	public void setNombreTalla(String nombreTalla) {
		this.nombreTalla = nombreTalla;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTalla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Talla other = (Talla) obj;
		return idTalla == other.idTalla;
	}

}
