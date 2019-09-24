package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Requisito_legal;

public interface IRequisito_LegalService {
	public void insertar(Requisito_legal requisito_legal);

	public List<Requisito_legal> listar();

	public void eliminar(int idRequisito_legal);

	public void modificar(Requisito_legal requisito_legal);
}
