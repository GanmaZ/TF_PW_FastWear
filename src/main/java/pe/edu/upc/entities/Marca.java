package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Marca")
public class Marca {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idMarca;
	
	@Column (name="nombreMarca", nullable = false, length =60)
	private String nombreMarca;
	
	@Column (name = "descripcionMarca", nullable= false, length =200)
	private String descripcionMarca;

	public Marca() {
		super();
	}
	public Marca(int idMarca, String nombreMarca, String descripcionMarca) {
		super();
		this.idMarca = idMarca;
		this.nombreMarca = nombreMarca;
		this.descripcionMarca = descripcionMarca;
	}
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	public String getDescripcionMarca() {
		return descripcionMarca;
	}
	public void setDescripcionMarca(String descripcionMarca) {
		this.descripcionMarca = descripcionMarca;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idMarca);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return idMarca == other.idMarca;
	}
	
	

}
