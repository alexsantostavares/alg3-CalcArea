package main;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		System.out.println("Digite o valor de base e altura");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		Area_formas AF = new Area_formas();
		
		System.out.print("Base: ");
		AF.b = sc.nextInt();
		System.out.println("");
		System.out.print("Altura: ");
		AF.h = sc.nextInt();
		
		
		System.out.println(AF.retorno(AF.b, AF.h));
		
		
		

	}

}
