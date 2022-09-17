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



	}

}
