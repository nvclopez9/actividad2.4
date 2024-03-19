package com.app.ioc;


public class UsuarioFactory {
	iUsuario usr;
	public UsuarioFactory(iUsuario usr) {
		this.usr = usr;
	}
	public void getInsertoUsuario() {
		usr.insertaUsuario();
		}
	public void getEliminoUsuarioByID(int id) {
		usr.eliminaUsuarioByID(id);
		}
	
}
