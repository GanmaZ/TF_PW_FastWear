package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ITallaDao;
import pe.edu.upc.entities.Talla;
import pe.edu.upc.serviceinterfaces.ITallaService;

@Named
public class TallaServiceImpl implements ITallaService {

	@Inject
	private ITallaDao tDao;

	@Override
	public List<Talla> list() {
		// TODO Auto-generated method stub
		return tDao.list();
	}

}
