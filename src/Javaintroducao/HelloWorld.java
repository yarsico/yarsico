package Javaintroducao;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Lucas Vinícius"; 
	    int idade = 26,x=7;
	    double altura = 1.86,nota1,nota2,nota3,média;
	    
	    Scanner leia = new Scanner(System.in);
	    
	    System.out.println("\nO seu nome é: "+nome);
	    System.out.println("\nSua idade é: "+idade+" anos de vida");
	    System.out.println("\nSua altura é: "+altura+" metros");
	    
	    System.out.println("\nEntre com a primeira nota: ");
	    nota1 = leia.nextDouble();
	    System.out.println("\nEntre com a segunda nota: ");
	    nota2 = leia.nextDouble();
	    System.out.println("\nEntre com a terceira nota: ");
	    nota3 = leia.nextDouble();
	    
	    média = (nota1+nota2)/3;
	    
	    System.out.println("\nA sua média é igual a:"+média);
	    System.out.printf("\nSua média foi: %.2f" ,média);
	    
	    nota1 = Math.sqrt(nota2);
	    nota2 = Math.pow(nota3,3);
	    
	    x = idade % x;
	    
	}

}
