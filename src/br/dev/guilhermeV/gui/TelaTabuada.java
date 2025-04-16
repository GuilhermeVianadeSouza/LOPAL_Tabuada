package br.dev.guilhermeV.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import br.dev.guilhermeV.model.Tabuada;

public class TelaTabuada {

	private String tituloDaTela;
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;

	public void criarTela(String tituloDaTela) {
		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		
		//obtendo a referência do painel de conteúdo da tela
		Container container = tela.getContentPane();

		// Criar o JLabel
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		//criando o text field multiplicando
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);
		
		
		//Criar o label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador: ");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);
		
		//criar text field MinMultiplicador
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 60, 50, 30);
		
		//Criando o Label MaxMultiplicador Sozinho
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);
		
		//criando text field MaxMultiplicador
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 100, 50, 30);
		
		//Criando o Button
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		//Adicionar o Jlist na tela
		listTabuada = new JList();
		
		//Criar o ScrollPane
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 190, 210, 300);

		// adicionando os componentes no painel de conteúdo do JFrame
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMultiplicando);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		container.add(scrollTabuada);
		
		
		//Adicionar ouvinte de ação aos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//recuperei valores digitados pelo usuário
				String multiplicando = textMultiplicando.getText();
				String minMultiplicador = textMinMultiplicador.getText();
				String maxMultiplicador = textMaxMultiplicador.getText();
				
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minMultiplicadorDouble = Double.parseDouble(minMultiplicador);
				double maxMultiplicadorDouble = Double.parseDouble(maxMultiplicador);

				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				
				String[] tabuadaResult = tabuada.mostrarTabuada();
				
				listTabuada.setListData(tabuadaResult);
				
				tabuada.mostrarTabuada();
				
			}
		});
		
		// Tornar a tela visível "DEVE!!!" ser a ultima instrução
		tela.setVisible(true);
	}

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}

}
