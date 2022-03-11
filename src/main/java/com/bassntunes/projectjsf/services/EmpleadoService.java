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
		Empleado empleadoGoogle = new Empleado();
		Empleado empleadoDell = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoLenovo = new Empleado();
		Empleado empleadoAsus = new Empleado();
		Empleado empleadoSamsung = new Empleado();
		
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
		
		empleadoGoogle.setNombre("Santiago");
		empleadoGoogle.setPrimerApellido("Cruz");
		empleadoGoogle.setSegundoApellido("Hernandez");
		empleadoGoogle.setPuesto("Desarrollador FrontEnd");
		empleadoGoogle.setStatus(true);
		
		empleadoDell.setNombre("Miguel");
		empleadoDell.setPrimerApellido("Arias");
		empleadoDell.setSegundoApellido("Dominguez");
		empleadoDell.setPuesto("Desarrollador Java");
		empleadoDell.setStatus(true);
		
		empleadoHP.setNombre("Lucas");
		empleadoHP.setPrimerApellido("Huerta");
		empleadoHP.setSegundoApellido("Lopez");
		empleadoHP.setPuesto("Desarrollador Python");
		empleadoHP.setStatus(true);
		
		empleadoLenovo.setNombre("Hugo Jesus");
		empleadoLenovo.setPrimerApellido("Galindo");
		empleadoLenovo.setSegundoApellido("Martinez");
		empleadoLenovo.setPuesto("Experto AWS");
		empleadoLenovo.setStatus(false);
		
		empleadoAsus.setNombre("Jonathan");
		empleadoAsus.setPrimerApellido("Zarate");
		empleadoAsus.setSegundoApellido("Ortiz");
		empleadoAsus.setPuesto("Desarrollador Ruby");
		empleadoAsus.setStatus(true);
		
		empleadoSamsung.setNombre("Victor");
		empleadoSamsung.setPrimerApellido("Guzman");
		empleadoSamsung.setSegundoApellido("Ayala");
		empleadoSamsung.setPuesto("Experto Azure");
		empleadoSamsung.setStatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoAcer);
		empleados.add(empleadoGoogle);
		empleados.add(empleadoDell);
		empleados.add(empleadoHP);
		empleados.add(empleadoLenovo);
		empleados.add(empleadoAsus);
		empleados.add(empleadoSamsung);
		
		return empleados;
		
				
	}
	
}
