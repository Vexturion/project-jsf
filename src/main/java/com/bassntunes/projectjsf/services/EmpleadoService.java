/**
 * 
 */
package com.bassntunes.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.bassntunes.projectjsf.entity.Empleado;

/**
 * @author Horiz
 *
 */
public class EmpleadoService {

	/**
	 * metodo que permite consultar la lista de empleados
	 * @return {@link empleado lista de empleados}
	 */
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoAcer = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Alejandro");
		empleadoIBM.setPrimerApellido("Cruz");
		empleadoIBM.setSegundoApellido("Duran");
		empleadoIBM.setPuesto("Desarrollador");
		empleadoIBM.setStatus(true);
		
		empleadoAcer.setNombre("Diego");
		empleadoAcer.setPrimerApellido("Laporta");
		empleadoAcer.setSegundoApellido("Villa");
		empleadoAcer.setPuesto("CEO");
		empleadoAcer.setStatus(true);
		
		empleadoApple.setNombre("Pedro");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Fernandez");
		empleadoApple.setPuesto("Arquitecto de software");
		empleadoApple.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoAcer);
		
		return empleados;
		
				
	}
	
}
