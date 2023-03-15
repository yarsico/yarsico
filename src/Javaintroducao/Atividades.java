package Javaintroducao;

import java.util.Scanner;

public class Atividades {

	public static void main(String [] args) {
		float salário = 0 , abono = 0, novoSal;
	    Scanner leia = new Scanner(System.in);
	    
	    System.out.println("Infrome o valor do seu salário: "+salário);
	    salário = leia.nextFloat();
	    System.out.println("Agora infome de quanto foi o seu abono: "+abono);
	    abono = leia.nextFloat();
	    
	   
	    novoSal = salário - abono; 
	    
	    System.out.println("Seu novo salário é igual a: " +novoSal);
	    novoSal = leia.nextFloat();
	    

	}
}
