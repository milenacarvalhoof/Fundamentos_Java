package Fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		final double Y = 5/9.0;		 	
		final int X = 32; // constante - Valor fixo (usar letras maiusculas)
		double fahrenheit, celsius; // variaveis
		
		fahrenheit = 86;
		celsius = (fahrenheit - X) * Y;
		
		System.out.println("O resultado é " + celsius + "ºC.");
		
		 
				
		
	}


}
