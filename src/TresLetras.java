import java.util.Scanner;

public class TresLetras {

	public static void main(String[] args) {
		
		String palavra;
		String[] letras;
		String[] palavrasTres;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma palavra com cinco caracteres:");
		palavra = input.nextLine().substring(0, 5);
		
		letras = palavra.split("");
		
		palavrasTres = new String[(int)Math.pow(3.0, (double)letras.length)];
		
		System.out.println(palavrasTres.length);
	}

}
