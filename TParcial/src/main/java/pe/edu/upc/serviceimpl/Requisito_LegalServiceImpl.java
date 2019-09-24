package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IRequisitoLegalDao;
import pe.edu.upc.entity.Requisito_legal;
import pe.edu.upc.service.IRequisito_LegalService;

public class Requisito_LegalServiceImpl implements IRequisito_LegalService {

	@Inject
	private IRequisitoLegalDao rL;

	@Override
	public void insertar(Requisito_legal requisito_legal) {
		// TODO Auto-generated method stub
		try {
			rL.insertar(requisito_legal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<Requisito_legal> listar() {
		// TODO Auto-generated method stub
		return rL.listar();
	}

	@Override
	public void eliminar(int idRequisito_legal) {
		// TODO Auto-generated method stub
		rL.eliminar(idRequisito_legal);
	}

	@Override
	public void modificar(Requisito_legal requisito_legal) {
		// TODO Auto-generated method stub
		try {
			rL.modificar(requisito_legal);
		}catch(Exception e) {
			e.getMessage();
		}
		
	}

}
