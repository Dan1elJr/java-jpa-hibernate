package application;

import java.util.Locale;

import dominio.Pessoa;

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		
		Pessoa p1 = new Pessoa (1,"Carlos da Silva", "carlosgmail.com");
		Pessoa p2 = new Pessoa (2,"Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa (3,"Ana Maria", "ana@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
}
