package com.app.ioc;

public class UsuarioImploracle implements iUsuario {
@Override
public void insertaUsuario() {
	System.out.println("Insertando Usuario en Oracle");
}

@Override
public void eliminaUsuarioByID(int id) {
System.out.println("Eliminando usuario en Oracle:"+id);
}
}