package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.LineadePedido;

public interface ILineadePedidoService {
	public void insertar(LineadePedido lineadePedido);

	public List<LineadePedido> listar();

	public void eliminar(int idLineadePedido);

}
