package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23; // -128 ate 127
		short numeroDeVoos = 542;
		int id = 56_789;
		long pontosAcumulados = 3_234_845_223L;// colocar letra L para long		
		
		// tipos numericos reais
		float salario = 11_445.44F; // colocar letra F para float
		double vendasAcumuladas = 2_991_797_103.01; // cabe o dobro do float
		
		// tipo boleano
		boolean estaDeFerias = false; // ou true
		
		// tipo caractere
		char status = 'A'; // com aspas simples
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias = " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
