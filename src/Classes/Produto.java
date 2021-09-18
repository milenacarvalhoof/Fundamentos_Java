package Classes;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//construtor - ele nao tem return pode ser vazio ou não
	//tem o mesmo nome da clase
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
		
	//objeto - tem return
	double precoComDesconto () {
		return preco * (1 - desconto);
	}

}
