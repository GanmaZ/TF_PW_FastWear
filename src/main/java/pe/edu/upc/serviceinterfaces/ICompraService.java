package pe.edu.upc.serviceinterfaces;

import java.util.List;
import pe.edu.upc.entities.Compra;

public interface ICompraService {

	public void insert(Compra c);

	public List<Compra> list();
	
	public void delete(int id);
	
}
