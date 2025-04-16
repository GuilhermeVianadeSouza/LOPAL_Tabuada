package br.dev.guilhermeV;

import javax.swing.JTextField;

import br.dev.guilhermeV.gui.TelaTabuada;
import br.dev.guilhermeV.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		
		TelaTabuada tela = new TelaTabuada();
		tela.criarTela("Tabuada DS1MA");
		/*
		//Adaptando-se e brincando com vetores
		double[] notas = new double [5];
		notas[0] = 7.0;
		notas[1] = 8.3;
		notas[2] = 8.1;
		notas[3] = 6.9;
		notas[4] = 9.7;
		System.out.println(notas[2]);
		System.out.println(notas[0] + notas[3]);
		
		notas[0] = 7.7;
		
		System.out.println(notas[0] + notas[3]);
		
		System.out.println(notas.length);
		
		double media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;
		System.out.println("Média: " + media);
		
		int i = 0;
		double totalNotas = 0.0;
		while (i < notas.length) {
			totalNotas += notas[i];
			i++;
		}
		
		media = totalNotas / notas.length;
		
		System.out.println("A média do aluno é " + media);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		String[] cidades = new String[8];
		cidades[0] = "Jandira";
		cidades[1] = "Barueri";
		cidades[2] = "Carapicuiba";
		cidades[3] = "Itapevi";
		cidades[4] = "Saopaulo";
		cidades[5] = "AnaRosa";
		cidades[6] = "SaoBernado";
		cidades[7] = "Maracatu";
		
		i = 0;
		while (i < cidades.length) {
			System.out.println(i + " - " + cidades[i]);
			i++;
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		String[] equipamentos = {
				"Mouse",
				"Teclado",
				"Monitor",
				"Impressora",
				"Scanner",
				"Acess Point",
				"Roteador"
		};
		i = 0;
		while (i < equipamentos.length) {
			System.out.println(i + 1 + " - " + equipamentos[i]);
			i++;
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		double precos[] = {12.5, 28.99, 65.78, 71.82};
		
		JTextField campos[] = {new JTextField(), new JTextField(), new JTextField(),};
	*/
	}
}