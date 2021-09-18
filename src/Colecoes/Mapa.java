package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		//Map (chave, valor)
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		// para adc e substituir utiliza o metodo put
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Rafaela");
		
		System.out.println(usuarios.size());// mostra a qtde de elementos 
		System.out.println(usuarios.isEmpty());// retorna se está vazio ou não
		System.out.println(usuarios.keySet());// mostra todas as chaves sem ordem
		System.out.println(usuarios.values());// mostra todos os valores sem ordem
		System.out.println(usuarios.entrySet());// mostra todas as chaves e valores sem ordem
		System.out.println(usuarios.containsKey(2));//mostra se está ou não contido a chave
		System.out.println(usuarios.containsValue("Ricardo"));// mostra se esta ou não contido o valor
		System.out.println(usuarios.get(4));// mostra o valor da determinada chave
		//System.out.println(usuarios.remove(1));// remove a chave e valor da determinada chave
		//System.out.println(usuarios.remove(2, "Ricardo"));//remove a chave e valor se os dois estiverem correto
		
		//para percorrer as chaves
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		// para percorrer os valores 
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//para percorrer as chaves e os valores
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		
	}
}
