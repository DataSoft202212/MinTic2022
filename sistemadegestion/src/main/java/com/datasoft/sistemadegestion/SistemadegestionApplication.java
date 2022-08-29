package com.datasoft.sistemadegestion;

import com.datasoft.sistemadegestion.entidades.Empleado;
import com.datasoft.sistemadegestion.entidades.Empresa;
import com.datasoft.sistemadegestion.entidades.MovimientoDinero;
import com.datasoft.sistemadegestion.entidades.Rol;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemadegestionApplication {

	public static void main(String[] args) {
		Rol rol1 = new Rol(01,"admin",true);
		System.out.println(rol1.toString());
		MovimientoDinero mov1 = new MovimientoDinero(2345,"2022/05/12","pago credito","camilo");
		System.out.println(mov1.toString());
		Empleado empleado1 = new Empleado("carlos","perez","neiva","987654","carlos@gmail",rol1,mov1);
		System.out.println(empleado1.toString());
		Empresa empresa1 = new Empresa(900465357,"DataSoft","Calle 1 No. 1 - 1",1234567,"datasoft@gmail.com");
		System.out.println(empresa1.toString());



	}

}
