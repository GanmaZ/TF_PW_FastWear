package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITipoProductoDao;
import pe.edu.upc.entities.TipoProducto;
import pe.edu.upc.serviceinterfaces.ITipoProductoService;

@Named
public class TipoProductoServiceImpl implements ITipoProductoService {
	@Inject
	private ITipoProductoDao tiDao;

	@Override
	public void insert(TipoProducto ti) {
		// TODO Auto-generated method stub
		tiDao.insert(ti);
	}

	@Override
	public List<TipoProducto> list() {
		// TODO Auto-generated method stub
		return tiDao.list();
	}

}
