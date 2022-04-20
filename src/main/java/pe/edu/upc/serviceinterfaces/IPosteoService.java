package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Posteo;

public interface IPosteoService {

	public void insert(Posteo p);

	public List<Posteo> list();

	public void delete(int id);
}
