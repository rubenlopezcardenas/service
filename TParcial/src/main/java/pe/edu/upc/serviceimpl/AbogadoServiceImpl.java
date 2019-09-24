package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IAbogadoDao;
import pe.edu.upc.entity.Abogado;
import pe.edu.upc.service.AbogadoService;

public class AbogadoServiceImpl implements AbogadoService {

	@Inject
	private IAbogadoDao AD;

	@Override
	public List<Abogado> listar() {
		// TODO Auto-generated method stub
		return AD.listar();
	}

	@Override
	public void select(int idAbogado) {
		// TODO Auto-generated method stub
	

	}

}
