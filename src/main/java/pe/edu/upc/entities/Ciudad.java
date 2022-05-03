package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudad")
public class Ciudad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCiudad;	
	
	@Column(name = "NombreCiudad", nullable = false)
	private String NombreCiudad;

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudad(int idCiudad, String nombreCiudad) {
		super();
		this.idCiudad = idCiudad;
		this.NombreCiudad = nombreCiudad;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombreCiudad() {
		return NombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		NombreCiudad = nombreCiudad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCiudad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return idCiudad == other.idCiudad;
	}

}
