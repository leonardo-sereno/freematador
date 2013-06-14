package com.freematador.business;

import javax.ejb.Stateless;

import com.freematador.domain.User;

public @Stateless class SecurityEJBBean implements SecurityEJB {
	public void createUser(User u) {
		System.out.println("Se ha creado el usuario "+u.getName());
	}
}
