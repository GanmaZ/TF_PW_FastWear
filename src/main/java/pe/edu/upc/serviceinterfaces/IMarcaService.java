package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Marca;

public interface IMarcaService {
	public void insert(Marca ma);
	public List<Marca> list();
}
