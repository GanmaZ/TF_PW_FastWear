package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITallaProductoDao;
import pe.edu.upc.entities.TallaProducto;
import pe.edu.upc.serviceinterfaces.ITallaProductoService;

@Named
public class TallaProductoServiceImpl implements ITallaProductoService {

	@Inject
	private ITallaProductoDao tapDao;

	@Override
	public void insert(TallaProducto tap) {
		tapDao.insert(tap);

	}

	@Override
	public List<TallaProducto> list() {
		// TODO Auto-generated method stub
		return tapDao.list();
	}

}
