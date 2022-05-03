package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.DetalleCompra;

public interface IDetalleCompraDao {
	
	public void insert(DetalleCompra dc);
	public List<DetalleCompra> list();
}
