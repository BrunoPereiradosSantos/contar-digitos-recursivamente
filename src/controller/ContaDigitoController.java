package controller;

public class ContaDigitoController {
	public ContaDigitoController() {
		super();
	}
	
	public int repetido(int numero1, int numero2) {
		int contador;
		if(numero1 == 0) return 0; //condição de parada se n chegar a zero, fim do algoritmo
		if(numero1 % 10 == numero2) { //comparo os 2 últimos algarismos do número n, se forem iguais a k, incremento o contador
			contador = 1;
		}else {
			contador = 0;
		}
		return contador + repetido(numero1 /10, numero2); //divido n por 10 (eliminando assim o último dígito) e continuo a contagem
	}
}
