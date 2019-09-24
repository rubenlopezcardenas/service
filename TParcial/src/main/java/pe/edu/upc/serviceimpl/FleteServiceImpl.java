package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IFlete;
import pe.edu.upc.entity.Flete;
import pe.edu.upc.service.IFleteService;

public class FleteServiceImpl implements IFleteService {

	@Inject
	private IFlete mF;

	@Override
	public List<Flete> listar() {
		// TODO Auto-generated method stub
		return mF.listar();
	}

	@Override
	public void Select(int idFlete) {
		// TODO Auto-generated method stub

	}

}
