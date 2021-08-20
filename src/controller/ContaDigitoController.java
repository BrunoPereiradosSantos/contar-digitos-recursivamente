package controller;

public class ContaDigitoController {
	public ContaDigitoController() {
		super();
	}
	
	public int repetido(int n, int k) {
		int c;
		if(n == 0) return 0; //condição de parada se n chegar a zero, fim do algoritmo
		if( n % 10 == k) { //comparo os 2 últimos algarismos do número n, se forem iguais a k, incremento o contador
			c = 1;
		}else {
			c = 0;
		}
		return c + repetido(n /10, k); //divido n por 10 (eliminando assim o último dígito) e continuo a contagem
	}
}
