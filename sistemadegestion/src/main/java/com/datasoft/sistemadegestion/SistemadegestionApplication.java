package com.datasoft.sistemadegestion;

import com.datasoft.sistemadegestion.entidades.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SistemadegestionApplication {

	public static void main(String[] args) {
		//Instancia de la clase Empresa
		Empresa empresa1 = new Empresa(900465357,"DataSoft","Calle 1 No. 1 - 1",1234567,"datasoft@gmail.com");
		System.out.println(empresa1.toString());
		//update atributo de la clase Empresa
		empresa1.setDireccionEmpresa("cartagena");
		System.out.println(empresa1.toString());

		//Instancia de la clase Rol
		Rol rol1 = new Rol(01,"admin",true);
		System.out.println(rol1.toString());
		//Instancia de la clase TipoDocumento
		TipoDocumento tipoDocumento = new TipoDocumento(001,"Cedula de Ciudadania","CC",true);
		System.out.println(tipoDocumento.toString());

		//Instancia de la clase Empleado
		Empleado empleado1 = new Empleado(001,1076543123,tipoDocumento,"oscar","garcia","bogota","8762345","oscgar@gmail.com",rol1,empresa1);
		System.out.println(empleado1.toString());
		//update atributo de la clase Empleado
		empleado1.setApellidoEmpleado("Perez");
		System.out.println(empleado1.toString());

		//Instancia de la clase MovimientoDinero
		MovimientoDinero movDinero1 = new MovimientoDinero(0001, LocalDate.now(),"pago de tarjeta credito",-45000,empleado1);
		System.out.println(movDinero1.toString());

		//update atributo de la clase MovimientoDinero
		movDinero1.setValorMovimientoDinero(-56000);
		System.out.println(movDinero1.getNumMovimientoDinero());
		System.out.println(movDinero1.toString());
	}
}
