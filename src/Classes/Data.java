package Classes;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 1; // padrao que pode ser alterado
		mes = 1; // padrao
		ano = 1970; // padrao
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String dataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}

}
