package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.ProductoEmpresa;

public interface IProductoEmpresaService {
	public void insertar(ProductoEmpresa productoempresa);

	public List<ProductoEmpresa> listar();

	public void eliminar(int idProductoEmpresa);

	public void modificar(ProductoEmpresa productoempresa);

}
