package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.TallaProducto;

public interface ITallaProductoDao {
	public void insert(TallaProducto tap);

	public List<TallaProducto> list();

}
