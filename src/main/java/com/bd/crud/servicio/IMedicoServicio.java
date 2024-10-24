package com.bd.crud.servicio;

import java.util.List;

import com.bd.crud.modelo.Medico;

public interface IMedicoServicio {
	
	public void RegistrarMedico(Medico clpmedico);
	public void EliminarMedico(Integer id);
	public List<Medico> ListadoMedicos();
	public Medico BuscarporId(Integer id);
	

}  //fin de la interface...
