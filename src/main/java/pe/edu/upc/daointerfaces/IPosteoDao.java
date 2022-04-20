package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Posteo;

public interface IPosteoDao {
	public void insert(Posteo p);
	public List<Posteo> list();
	public void delete(int id);
}
