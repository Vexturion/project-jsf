/**
 * 
 */
package com.bassntunes.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Horiz
 *  clase encargada de cerrar la sesion del usuario
 *
 */
@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesion");
	}
	
	/**
	 * metodo que permite cerrar la sesion del usuario y regresar a la pantalla de login
	 */
	public void cerrarSesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * metodo que redirecciona al usuario a la pagina principal
	 * @param {@link String} pagina a redireccionar
	 * @throws IOException error al no encontrar la pagina
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
		
	}
	
}
