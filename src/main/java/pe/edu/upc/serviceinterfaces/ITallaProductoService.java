package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.TallaProducto;

public interface ITallaProductoService {

	public void insert(TallaProducto tap);

	public List<TallaProducto> list();

}
