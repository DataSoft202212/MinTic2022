package com.datasoft.sistemadegestion;

import com.datasoft.sistemadegestion.entidades.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemadegestionApplication {

	public static void main(String[] args) {
		MovimientoDinero mov1 = new MovimientoDinero(00001,"2022/02/12","pago prestamo","eder");
		System.out.println(mov1.toString());
		System.out.println(mov1.getConceptoMovimientoDinero());


	}

}
