package com.datasoft.sistemadegestion;

import com.datasoft.sistemadegestion.entidades.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemadegestionApplication {

	public static void main(String[] args) {
		Empresa empresa1 = new Empresa(900465357,"DataSoft","Calle 1 No. 1 - 1",1234567,"datasoft@gmail.com");
		System.out.println(empresa1.toString());
		Rol rol1 = new Rol(01,"admin",true);
		System.out.println(rol1.toString());
		TipoDocumento tipoDocumento = new TipoDocumento(001,"Cedula de Ciudadania","CC",true);
		System.out.println(tipoDocumento.toString());
		Empleado empleado1 = new Empleado(001,1076543123,tipoDocumento,"oscar","garcia","bogota","8762345","oscgar@gmail.com",rol1,empresa1);
		System.out.println(empleado1.toString());
		MovimientoDinero movDinero1 = new MovimientoDinero(00001,"12/05/2022","pago de tarjeta",-3450000,empleado1);
		System.out.println(movDinero1.toString());



	}

}
