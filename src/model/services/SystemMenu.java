package model.services;

import java.util.Scanner;

import model.entities.Matrix;
import model.exception.DominException;

public class SystemMenu {	
	private Integer option;
	
	private Matrix matrix = new Matrix();
	private Scanner scanner = new Scanner(System.in);
	
	public Integer getOption() {
		return option;
	}

	public void setOption(Integer option) {
		this.option = option;
	}
	
	// Regras e negócio 
	public void validationOption() {
		if (getOption() > 5) {
			throw new  DominException("(Menu entre 1 e 5)");
		}
		if (getOption() < 0) {
			throw new  DominException("(Número negativo)");
		}
		if (getOption() == 0) {
			throw new  DominException("(Menu entre 1 e 5): informado: " + getOption());
		}
	}

	public int menuOption() {
		System.out.print("====== MENU DE CONTROLE ======="
				+ "\n= 1: Inicializar a Matriz     ="
				+ "\n= 2: Imprimir a Matriz        ="
				+ "\n= 3: Inserir valor na Matriz  ="
				+ "\n= 4: Identificar o Menor      ="
				+ "\n= 5: Sair do Programa         ="
				+ "\n==============================="
				+"\n     Informe a opção: ");
		setOption(scanner.nextInt());
		System.out.println("Menu: " + option);
		validationOption();
		return getOption();
	}
	
	public void sizeMatrix() {
		System.out.print("Informe o tamanho da matriz:");
		matrix.setSize(scanner.nextInt());
		
		// Regra de négocio
		if (matrix.getSize() == 0) {
			throw new  DominException("Tamanho não informado: " + matrix.getSize());
		}
		
		if (matrix.getSize() < 0) {
			throw new  DominException("(Número negativo)");
		}
		
		System.out.println("Tamanho: " + matrix.getSize() + " status[Salvo]");
	}
	
	public void menu() {
		do {
			menuOption();
			
			switch (getOption()) {
			case 1:
				sizeMatrix();
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			}
		}while(getOption() != 5);
	}
}
