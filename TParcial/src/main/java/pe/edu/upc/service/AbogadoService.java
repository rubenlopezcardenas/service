package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Abogado;

public interface AbogadoService {

	public List<Abogado> listar();

	public void select(int idAbogado);

}
