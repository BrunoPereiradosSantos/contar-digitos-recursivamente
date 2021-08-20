package view;

import javax.swing.JOptionPane;

import controller.ContaDigitoController;

public class Principal {
	public static void main(String args[]) {
		ContaDigitoController cd = new ContaDigitoController();
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if(numero1 >= 10 && numero1 < 999999 && numero2 >= 0 && numero2 < 10) {
			int resultado = cd.repetido(numero1,  numero2);
			if(resultado < 2) {
				System.out.println("Encontrei o número " + numero2 + ": " + resultado + " vez");
			}else {
				System.out.println("Encontrei o número " + numero2 + ": " + resultado + " vezes");
			}	
		}else {
			System.out.println("O primeiro numero precisa ser maior ou igual a 10 e menor que 999999 e o segundo numero precisa ser maior ou igual a zero e menor que 10");
		}
	}
}
