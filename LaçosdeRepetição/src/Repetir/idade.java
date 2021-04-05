package Repetir;

import java.util.Scanner;

/*3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
public class idade {

	public static void main(String[] args) {
		int idade,cont21=0,cont50=0;
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("\nQual a sua idade:");
		idade=entrada.nextInt();
		
		while(idade!=-99)
		{
			
			if (idade<21)
			{
				cont21++;
			}
			if (idade>50)
			{
				cont50++;
			}
			System.out.println("\nQual a sua idade:");
			idade=entrada.nextInt();
			
		}
		System.out.println("\nTEMOS: " +cont21+"pessoas com menos de 21 anos...");
		System.out.println("\nTEMOS: " +cont50+"pessoas com mais de 50 anos...");
				
				
		
		
	}
}
		// TODO Auto-generated method stub

		
	


