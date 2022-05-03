package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.TipoProducto;

public interface ITipoProductoDao {
	public void insert(TipoProducto ti);
	public List<TipoProducto> list();
}
