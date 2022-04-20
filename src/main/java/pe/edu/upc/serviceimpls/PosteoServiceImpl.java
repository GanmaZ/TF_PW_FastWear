package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IPosteoDao;
import pe.edu.upc.entities.Posteo;
import pe.edu.upc.serviceinterfaces.IPosteoService;

@Named
public class PosteoServiceImpl implements IPosteoService{
	@Inject
	private IPosteoDao pDao;
	
	@Override
	public void insert(Posteo p) {
		pDao.insert(p);
	}
	
	@Override
	public List<Posteo> list(){
		return pDao.list();
	}
	
	@Override
	public void delete(int id) {
		pDao.delete(id);
	}
}
