package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.DetalleCompra;

public interface IDetalleCompraService {

	public void insert(DetalleCompra dc);
	public List<DetalleCompra> list();
}
