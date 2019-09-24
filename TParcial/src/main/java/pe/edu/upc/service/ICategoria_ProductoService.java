package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Categoria_Producto;

public interface ICategoria_ProductoService {

	public void insertar(Categoria_Producto categoria_producto);

	public List<Categoria_Producto> listar();

	public void eliminar(int idcategoria_producto);
}
