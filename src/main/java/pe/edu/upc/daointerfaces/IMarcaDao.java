package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Marca;

public interface IMarcaDao {
	public void insert(Marca ma);
	public List<Marca> list();
}
