package Classes;

public class DataTeste {

	public static void main(String[] args) {
		
		Data aniversario = new Data();
		//aniversario.dia = 06;
		//aniversario.mes = 06;
		//aniversario.ano = 1998;
		
		Data parto = new Data(20, 06, 2018);
				
		System.out.println("Milena Nasceu em: " + aniversario.dataFormatada());
		System.out.println("Milena teve seu parto em: " + parto.dataFormatada());
	}
}
