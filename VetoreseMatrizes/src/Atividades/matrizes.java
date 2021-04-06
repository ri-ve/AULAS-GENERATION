package Atividades;

import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] [] num=new int [3][3];
		int soma=0,cont=0;
		Scanner leia=new Scanner(System.in);
		
		for (int l=0;l<3;l++)
		{
				for (int c=0;c<3;c++)
				{
					System.out.println("\n ENTRE COM UM NUMERO:");	
					num[l][c]=leia.nextInt();
					
				cont++;
				
				
				}
		}
		
		for (int l=0;l<3;l++)
		{
				for (int c=0;c<3;c++)
					if(num[l][c]>10)
				{
						System.out.println("\n QUANTIDADE DE NUMEROS MAIORES QUE 10:\t "+num[l][c]);
					    
						soma=soma+num[l][c];
				
				}
		}
		
		
				
	    
		
		
		
		

	}

}
