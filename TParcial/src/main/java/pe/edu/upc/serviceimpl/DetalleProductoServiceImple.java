package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IDetalleProducto;
import pe.edu.upc.entity.DetalleProducto;
import pe.edu.upc.service.IDetalleProductoService;

public class DetalleProductoServiceImple implements IDetalleProductoService {

	
	@Inject
	private IDetalleProducto DP;

	@Override
	public void insertar(DetalleProducto detalleProducto) {
		// TODO Auto-generated method stub
		try {
			DP.insertar(detalleProducto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<DetalleProducto> listar() {
		// TODO Auto-generated method stub
		return DP.listar();
	}

	@Override
	public void eliminar(int idDetalleProducto) {
		// TODO Auto-generated method stub
		DP.eliminar(idDetalleProducto);

	}

}
