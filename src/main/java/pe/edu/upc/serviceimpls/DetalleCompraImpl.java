package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IDetalleCompraDao;
import pe.edu.upc.entities.DetalleCompra;
import pe.edu.upc.serviceinterfaces.IDetalleCompraService;

@Named
public class DetalleCompraImpl implements IDetalleCompraService{

	@Inject
	private IDetalleCompraDao dcDao;
	
	@Override
	public void insert(DetalleCompra dc) {
		dcDao.insert(dc);
		
	}

	@Override
	public List<DetalleCompra> list() {
		return dcDao.list();
	}

}
