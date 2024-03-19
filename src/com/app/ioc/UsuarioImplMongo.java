package com.app.ioc;

public class UsuarioImplMongo implements iUsuario {

	@Override
	public void insertaUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Insertando Usuario en Mongo");

	}

	@Override
	public void eliminaUsuarioByID(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando Usuario en Mongo: " + id);

	}

}
