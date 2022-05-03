package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IMarcaDao;
import pe.edu.upc.entities.Marca;
import pe.edu.upc.serviceinterfaces.IMarcaService;

@Named
public class MarcaServiceImpl implements IMarcaService{
	@Inject
	private IMarcaDao maDao;
	@Override
	public void insert(Marca ma) {
		// TODO Auto-generated method stub
		maDao.insert(ma);
		
	}

	@Override
	public List<Marca> list() {
		// TODO Auto-generated method stub
		return maDao.list();
	}

}
