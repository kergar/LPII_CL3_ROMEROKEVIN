package com.bd.crud.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.crud.modelo.Medico;
import com.bd.crud.repositorio.IMedicoRepository;

@Service
public class ClassMedicoServicioImp implements IMedicoServicio{
	
	@Autowired
	private IMedicoRepository imedicorepository;

	@Override
	public void RegistrarMedico(Medico clpmedico) {
		// TODO Auto-generated method stub
		imedicorepository.save(clpmedico);
	}

	@Override
	public void EliminarMedico(Integer id) {
		// TODO Auto-generated method stub
		imedicorepository.deleteById(id);
	}

	@Override
	public List<Medico> ListadoMedicos() {
		// TODO Auto-generated method stub
		return (List<Medico>) imedicorepository.findAll();
	}

	@Override
	public Medico BuscarporId(Integer id) {
		// TODO Auto-generated method stub
		return imedicorepository.findById(id).orElse(null);
	}
	

}
