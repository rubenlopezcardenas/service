package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Declaracion_aduanera;

public interface IDeclaracion_aduaneraService {
	public void insertar(Declaracion_aduanera declaracion_aduanera);

	public List<Declaracion_aduanera> listar();

	public void eliminar(int idDeclaracion_aduanera);

}
