import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		String texto1 = "PROGRAMAÇÃO ORIENTADA A OBJETO";
		String texto2 = "JAVA SE";
		String texto3 = "SENAI - JANDIRA";
		
		//CRIAÇÃO DE UM OBJETO DO TIPO ARRAYLIST DE STRINGS 
		ArrayList<String> dados = new ArrayList<String>();
		
		//ADICIONANDO VALORES NO ARRAYLIST dados
		dados.add(texto1);
		dados.add(texto2);
		dados.add(texto3);
		
		//REMOVENDO ELEMENTOS DE UM ARRAYLIST
		//dados.remove(1);
		
		if (dados.isEmpty()) {
			
			System.out.println("O ARRAY LIST ESTÁ VAZIO");
		} else {
			System.out.println("O ARRAY LIST POSSUI DADOS: " + dados.size());
			System.out.println("DADOS: " + dados);
			
			System.out.println("INDICE 0: " + dados.get(0));
			System.out.println("INDICE 1: " + dados.get(1));
			System.out.println("INDICE 2: " + dados.get(2));
		}
		
		//MANIPULANDO ARRALIST COM USO DE LOOPS DE REPETIÇÃO
		
		//LOOP FOR
		System.out.println();
		System.out.println("LOOP FOR:");
		for (int i = 0; i < dados.size(); i++) {
			
			System.out.println("INDICE: " + i + " VALOR: " + dados.get(i));
			
		}
		
		//LOOP FORECH
		System.out.println();
		System.out.println("LOOP FORECH:");
		for (String dado : dados) {
			System.out.println("VALOR: " + dado);
		}
		
		//MÉTODO FOREACH DO ARRAYLIST COM LAMBDA:
		System.out.println();
		System.out.println("FOREACH COM LAMBDA:");
		dados.forEach(dado->{
			System.out.println("VALOR: " + dado);
		});

	}

}
