package pe.edu.upc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CategoriaProducto")
public class CategoriaProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdCategoriaProducto;
	
	@ManyToOne
	@JoinColumn(name = "IdCategoria", nullable = false)
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "idProducto", nullable = false)
	private Producto producto;
	
	public CategoriaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoriaProducto(int idCategoriaProducto, Categoria categoria, Producto producto) {
		super();
		IdCategoriaProducto = idCategoriaProducto;
		this.categoria = categoria;
		this.producto = producto;
	}
	public int getIdCategoriaProducto() {
		return IdCategoriaProducto;
	}
	public void setIdCategoriaProducto(int idCategoriaProducto) {
		IdCategoriaProducto = idCategoriaProducto;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
