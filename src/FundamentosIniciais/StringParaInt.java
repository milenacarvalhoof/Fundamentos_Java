package Fundamentos;

import javax.swing.JOptionPane;

public class StringParaInt {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		int numero = Integer.parseInt(valor);
		
		System.out.println(numero);
	}
}
