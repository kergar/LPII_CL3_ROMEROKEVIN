package com.bd.crud.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "TBL_MEDICOCL3")
public class Medico {
	// declaramos sus atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedicoCl3;
	private String nombreCl3;
	private String apellidoCl3;
	private String email;
	private String dniCl3;
	private String estadoCivilCl3;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fechaNacimCl3;

	public Medico(int idMedicoCl3, String nombreCl3, String apellidoCl3, String email, String dniCl3,
			String estadoCivilCl3, Date fechaNacimCl3) {
		// super();
		this.idMedicoCl3 = idMedicoCl3;
		this.nombreCl3 = nombreCl3;
		this.apellidoCl3 = apellidoCl3;
		this.email = email;
		this.dniCl3 = dniCl3;
		this.estadoCivilCl3 = estadoCivilCl3;
		this.fechaNacimCl3 = fechaNacimCl3;
	} // fin del constructor con parametros

	public Medico() {
		// super();
	}// fin del constructor vacio....

	public int getIdMedicoCl3() {
		return idMedicoCl3;
	}

	public void setIdMedicoCl3(int idMedicoCl3) {
		this.idMedicoCl3 = idMedicoCl3;
	}

	public String getNombreCl3() {
		return nombreCl3;
	}

	public void setNombreCl3(String nombreCl3) {
		this.nombreCl3 = nombreCl3;
	}

	public String getApellidoCl3() {
		return apellidoCl3;
	}

	public void setApellidoCl3(String apellidoCl3) {
		this.apellidoCl3 = apellidoCl3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDniCl3() {
		return dniCl3;
	}

	public void setDniCl3(String dniCl3) {
		this.dniCl3 = dniCl3;
	}

	public String getEstadoCivilCl3() {
		return estadoCivilCl3;
	}

	public void setEstadoCivilCl3(String estadoCivilCl3) {
		this.estadoCivilCl3 = estadoCivilCl3;
	}

	public Date getFechaNacimCl3() {
		return fechaNacimCl3;
	}

	public void setFechaNacimCl3(Date fechaNacimCl3) {
		this.fechaNacimCl3 = fechaNacimCl3;
	}

}// fin de la clase...
