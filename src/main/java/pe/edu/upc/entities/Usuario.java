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
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdUsuario;

	@Column(name = "NombreUsuario", nullable = false, length = 47)
	private String NombreUsuario;
	@Column(name = "ApellidoUsuario", nullable = false, length = 47)
	private String ApellidoUsuario;
	@Column(name = "CorreoUsuario", nullable = false, length = 47)
	private String CorreoUsuario;
	@Column(name = "ClaveUsuario", nullable = false, length = 47)
	private String ClaveUsuario;
	@Column(name = "TelefonoUsuario", nullable = false, length = 47)
	private String TelefonoUsuario;

	@ManyToOne
	@JoinColumn(name = "idCiudad", nullable = false)
	private Ciudad ciudad;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
			String claveUsuario, String telefonoUsuario, Ciudad ciudad) {
		super();
		this.IdUsuario = idUsuario;
		this.NombreUsuario = nombreUsuario;
		this.ApellidoUsuario = apellidoUsuario;
		this.CorreoUsuario = correoUsuario;
		this.ClaveUsuario = claveUsuario;
		this.TelefonoUsuario = telefonoUsuario;
		this.ciudad=ciudad;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return ApellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		ApellidoUsuario = apellidoUsuario;
	}

	public String getCorreoUsuario() {
		return CorreoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		CorreoUsuario = correoUsuario;
	}

	public String getClaveUsuario() {
		return ClaveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		ClaveUsuario = claveUsuario;
	}

	public String getTelefonoUsuario() {
		return TelefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		TelefonoUsuario = telefonoUsuario;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return IdUsuario == other.IdUsuario;
	}

	
}
