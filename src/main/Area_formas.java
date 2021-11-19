package main;

public class Area_formas {
	
	float area = 0;
	float area2 = 0;
	float b;
	float h;
	
	public String retorno(float b,float h) {
				
		area = b*h;
		
		area2 = (b*h)/2;
		
		if(b==h) {
			return "\nArea do quadrado: " + area +
				   "\nArea do triangulo: " + area2;
		}
		else {
			return "\nArea do retangulo: " + area +
				   "\nArea do triangulo: " + area2;
		}
		
	}

}
