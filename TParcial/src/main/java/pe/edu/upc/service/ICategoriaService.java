package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Categoria;

public interface ICategoriaService {
	public void insertar(Categoria categoria);

	public List<Categoria> listar();

	public void eliminar(int idcategoria);

}
