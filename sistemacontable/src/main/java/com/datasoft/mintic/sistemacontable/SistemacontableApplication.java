package com.datasoft.mintic.sistemacontable;

import com.datasoft.mintic.sistemacontable.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SistemacontableApplication {

	public static void main(String[] args) {

		//instancia de un objeto clase empresa
		SpringApplication.run(SistemacontableApplication.class, args);
		Empresa empresaUno = new Empresa(1,83250223,"soporteTI","neiva",608872205,"soporteti@gmail.com");
		System.out.println(empresaUno.toString());

		//instancia de un objeto Rol
		Rol rolUno = new Rol(4,"Adminstrador",true);
		System.out.println(rolUno.toString());

		//instancia de un objeto TipoDocumento
		TipoDocumento tipoDocumentoUno = new TipoDocumento(1212,"Cedula Ciudadania","CC",true);
		System.out.println(tipoDocumentoUno.toString());

		//instancia de un objeto Usuario
		Usuario userUno = new Usuario(1,tipoDocumentoUno,"1075212567","camilo","vargas","bogota",601234345,"cvargasg@hotmail.com",rolUno,"1q2w3e4r5t",true);
		System.out.println(userUno.toString());

	}

}
