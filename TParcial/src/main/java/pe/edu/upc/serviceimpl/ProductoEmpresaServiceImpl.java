package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IProductoEmpresa;
import pe.edu.upc.entity.ProductoEmpresa;
import pe.edu.upc.service.IProductoEmpresaService;

public class ProductoEmpresaServiceImpl implements IProductoEmpresaService {

	@Inject
	private IProductoEmpresa pE;

	@Override
	public void insertar(ProductoEmpresa productoempresa) {
		// TODO Auto-generated method stub
		try {
			pE.insertar(productoempresa);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<ProductoEmpresa> listar() {
		// TODO Auto-generated method stub
		return pE.listar();
	}

	@Override
	public void eliminar(int idProductoEmpresa) {
		// TODO Auto-generated method stub
		pE.eliminar(idProductoEmpresa);

	}

	@Override
	public void modificar(ProductoEmpresa productoempresa) {
		// TODO Auto-generated method stub
		try {
			pE.modificar(productoempresa);
		}catch(Exception e) {
			e.getMessage();
			}
	}

}
