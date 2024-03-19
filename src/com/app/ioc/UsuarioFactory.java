package com.app.ioc;


public class UsuarioFactory {
	public void getInsertUsuario() {
		System.out.println("Insertado usuario con Oracle");
	}
	public void getEliminarUsuarioByID(int id) {
		System.out.println("Eliminando usuario con Oracle: " + id);
	}
}
