package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICategoriaDao;
import pe.edu.upc.entities.Categoria;
import pe.edu.upc.serviceinterfaces.ICategoriaService;

@Named
public class CategoriaServiceImpl implements ICategoriaService{

	@Inject
	private ICategoriaDao cDao;

	@Override
	public List<Categoria> list() {
		return cDao.list();
	}
	
	
}
