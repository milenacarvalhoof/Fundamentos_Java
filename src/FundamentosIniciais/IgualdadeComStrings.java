package Fundamentos;

import java.util.Scanner;

public class IgualdadeComStrings {

	public static void main(String[] args) {
	
		System.out.println("2" == "2");
		
		String s1 = new String("2");//coloca numero em string dessa forma
		System.out.println("2" == s1);//ira da falso pq a forma ta incorreta
		System.out.println("2".equals(s1));// a forma correta é essa
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		//forma == incorreta. ira dar falso
		System.out.println("2" == s2.trim()); //para excluir possiveis espacos digitados
		//forma correta com equals
		System.out.println("2".equals(s2.trim())); // e incluindo trim para remover espacos  
		
		entrada.close();
	}
}
