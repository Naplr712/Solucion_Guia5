package com.senati.eti.data;

import com.senati.eti.model.Calculadora2;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.println("LECTURA DE NÚMEROS");
		System.out.println("------------------");
		System.out.print("Número 1: ");
		n1 = sc.nextFloat();
		System.out.print("Número 2: ");
		n2 = sc.nextFloat();
		
		Calculadora2 objCalc = new Calculadora2(n1, n2);
		
		System.out.println("\n R E S U L T A D O S");
		System.out.println("----------------------");
		System.out.println("1. Suma..............: " + objCalc.Calcular(1));
		System.out.println("2. Resta.............: " + objCalc.Calcular(2));
		
		
		
	}

}
