import java.util.Scanner;

public class TresLetras {

	public static void main(String[] args) {
		
		String palavra;
		String[] letras;
		String[] palavrasTres = new String[60];
		int cont = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma palavra com cinco caracteres:");
		palavra = input.nextLine().substring(0, 5);
		
		letras = palavra.split("");
		
		//palavrasTres = new String[(int)Math.pow(3.0, (double)letras.length)];
	
		for(int i = 0; i < letras.length; i++) {
			
			//System.out.printf("%d", i);
			
			for(int j = 0; j < letras.length; j++) {
				
				if(j != i) {
					
					for(int k = 0; k < letras.length; k++) {
						
						if(k != i && k != j) {
							
							palavrasTres[cont] = String.format("%s%s%s", letras[i], letras[j], letras[k]);
							cont++;
							
						}
						
					}
					
				}
				
				
				
			}
			
		}
		
		System.out.printf("Palavras possíveis com as letras \"%s\".%n%n", palavra);
		
		for(String a : palavrasTres) {
			
			System.out.println(a);
			
		}
		
	}

}
