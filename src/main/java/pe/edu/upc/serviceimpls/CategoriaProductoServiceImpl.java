package pe.edu.upc.serviceimpls;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICategoriaProductoDao;
import pe.edu.upc.entities.CategoriaProducto;
import pe.edu.upc.serviceinterfaces.ICategoriaProductoService;

@Named
public class CategoriaProductoServiceImpl implements ICategoriaProductoService {

	@Inject
	private ICategoriaProductoDao cpDao;

	@Override
	public void insert(CategoriaProducto cp) {
		cpDao.insert(cp);
	}

}
