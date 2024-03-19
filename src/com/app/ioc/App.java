package com.app.ioc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImploracle()); 
		obj.getInsertoUsuario();
		obj.getEliminoUsuarioByID(1);;
		UsuarioFactory obj2 = new UsuarioFactory(new UsuarioImplMongo()); 
		obj2.getInsertoUsuario();
		obj2.getEliminoUsuarioByID(1);;
	}

}
