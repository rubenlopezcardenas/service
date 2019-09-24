package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAbogadoDao;
import pe.edu.upc.entity.Abogado;

public class AbogadoDaoImpl implements IAbogadoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Abogado abogado) {
		try {
			em.persist(abogado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void eliminar(int idAbogado) {
		Abogado abog = new Abogado();
		try {
			abog = em.getReference(Abogado.class, idAbogado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	@Override
	public void modificar(Abogado abogado) {
		try {
			em.merge(abogado);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Abogado> listar() {
		List<Abogado> lista = new ArrayList<Abogado>();
		try {
			Query q = em.createQuery("select a from Abogado a");
			lista = (List<Abogado>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;

	}

}
