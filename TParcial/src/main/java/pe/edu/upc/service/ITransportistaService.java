package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Transportista;

public interface ITransportistaService {
	public void insertar(Transportista transportista);

	public List<Transportista> listar();

	public void eliminar(int idTransportista);
}
