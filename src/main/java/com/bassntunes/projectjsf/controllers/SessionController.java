/**
 * 
 */
package com.bassntunes.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.bassntunes.projectjsf.dto.UsuarioDTO;

/**
 * @author Horiz Clase que se encarga de mantener la informacion del usuario en
 *         sesion
 */
@ManagedBean
@SessionScoped
public class SessionController {

	/**
	 * usuario que se mantendra en sesion
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * inicializa la sesion del usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

	

}
