package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICiudadDao;
import pe.edu.upc.entities.Ciudad;
import pe.edu.upc.serviceinterfaces.ICiudadService;

@Named
public class CiudadServiceImpl implements ICiudadService{
@Inject
	private ICiudadDao ciDao;

	@Override
	public List<Ciudad> list() {
		// TODO Auto-generated method stub
		return ciDao.list();
	}

}
