package com.datasoft.sistemadegestion;

import com.datasoft.sistemadegestion.entidades.Empleado;
import com.datasoft.sistemadegestion.entidades.MovimientoDinero;
import com.datasoft.sistemadegestion.entidades.Rol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemadegestionApplication {

	public static void main(String[] args) {
		Rol rol1 = new Rol(0001,"administrador",true);
		System.out.println(rol1.toString());
		MovimientoDinero mov1 = new MovimientoDinero(2345,"2022/05/12","pago credito","camilo");
		System.out.println(mov1.toString());
		Empleado empleado1 = new Empleado("pedro","suarez","neiva","876536","pedro@gmail",0002,2395);
		System.out.println(empleado1.toString());


	}

}
