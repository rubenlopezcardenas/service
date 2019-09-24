package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.DetalleProducto;

public interface IDetalleProductoService {
	public void insertar(DetalleProducto detalleProducto);

	public List<DetalleProducto> listar();

	public void eliminar(int idDetalleProducto);
}
