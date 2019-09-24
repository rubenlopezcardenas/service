package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ProductoEmpresa;

public interface IProductoEmpresa {

	public void insertar(ProductoEmpresa productoempresa);

	public void eliminar(int idProductoEmpresa);

	public void modificar(ProductoEmpresa productoempresa);

	public List<ProductoEmpresa> listar();
}
