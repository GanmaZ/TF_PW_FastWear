package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Compra;

public interface ICompraDao {
	public void insert(Compra c);
	
	public List<Compra> list();
	
	public void delete(int id);
}
