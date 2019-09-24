package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Flete;

public interface IFleteService {
	

	public List<Flete> listar();

	public void Select(int idFlete);

}
