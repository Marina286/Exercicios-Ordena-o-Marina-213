package exercicio.ordenação;

public class TesteRecursividade {
	public static void main(String[]  args) {
		int fatorialNR = Recursividade.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = Recursividade.fatorial(5);
		System.out.println(fatorialR);
	}
}
