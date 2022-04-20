package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICompraDao;
import pe.edu.upc.entities.Compra;
import pe.edu.upc.serviceinterfaces.ICompraService;

@Named
public class CompraServiceImpl implements ICompraService {
	@Inject
	private ICompraDao cDao;

	@Override
	public void insert(Compra c) {

		cDao.insert(c);
	}

	@Override
	public List<Compra> list() {

		return cDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cDao.delete(id);
	}

}
