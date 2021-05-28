package aula29;

public class Fibonacci {

	public static void main(String[] args) {

		//SERIE FIBONACCI
		int anterior = 1;
		int proximo = 0;
		System.out.println(anterior);
		
		while(proximo<50) {
			System.out.println(proximo);
			proximo = proximo + anterior; //PROXIMO NUMERO FIBONACCI
			anterior = proximo - anterior; //ATUALIZANDO O NÚMERO ANTERIOR (SOMA - ANTERIOR)
		}
	}
}
