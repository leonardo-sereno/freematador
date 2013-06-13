package com.freematador.presentation;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.freematador.domain.User;

@ManagedBean
@ViewScoped
public class Register implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public Register() {
		user = new User();
	}

	public void submit() {
		FacesMessage message = new FacesMessage("Registration succesful!");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public User getUser() {
		return user;
	}
	
}