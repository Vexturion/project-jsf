/**
 * 
 */
package com.bassntunes.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.bassntunes.projectjsf.dto.UsuarioDTO;

/**
 * @author Jose Alejandro Cruz
 * clase que permite controlar el funcionamiento con la pantalla de login.xhtml
 */
@ManagedBean
public class LoginController {

	/**
	 * usuario que ingresa en el login
	 */
	private String usuario;
	
	/**
	 * password que permite al usuario ingresar
	 */
	private String password;
	
	/**
	 * bean que mantiene la informacion en sesion
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	/**
	 * metodo que permite ingresar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		System.out.println("Usuario: " + usuario + " Password: " + password);
		if (usuario.equals("pepe") && password.equals("123")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("Principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "404", "La pagina no existe"));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ups", "EL usuario no existe"));
			FacesContext.getCurrentInstance().addMessage("formLogin:txtPassword", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ups", "Password incorrecto"));
		}
	}

	/**
	 * metodo que redirecciona al usuario a la pagina principal
	 * @param pagina
	 * @throws IOException
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
		
	}
	
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
}
