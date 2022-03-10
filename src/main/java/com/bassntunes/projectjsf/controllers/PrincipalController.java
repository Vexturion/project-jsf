/**
 * 
 */
package com.bassntunes.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.bassntunes.projectjsf.entity.Empleado;
import com.bassntunes.projectjsf.services.EmpleadoService;

/**
 * @author Horiz
 * clase controler que se encarga de procesar informacion para la pantalla principal.xhtml
 */
@ManagedBean //notacion que permite indicar que esta clase va a definirse como un controlador
@ViewScoped //notacion que nos permite mantener la informacion en pantalla hasta cambiar a otra pantalla
public class PrincipalController {

	/**
	 * lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/**
	 * servicio con los metodos que realizan la logica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct //cuando una pantalla genera un bean, se ejecuta el init
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * metodo que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @return the empleadoService
	 */
	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

	/**
	 * @param empleadoService the empleadoService to set
	 */
	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}
	
}
