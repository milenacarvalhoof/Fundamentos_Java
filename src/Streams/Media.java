package Streams;

public class Media {
	
	private double total;
	private int qtde;
	
	public Media adc(double valor) {
		total += valor;
		qtde++;
		return this;
	}
	
	public double getValor() {
		return total / qtde;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.qtde = m1.qtde + m2.qtde;
		resultante.total = m1.total + m2.total;
		
		return resultante;
		
	}
	

}
