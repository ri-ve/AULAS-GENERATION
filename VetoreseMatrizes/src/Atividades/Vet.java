package Atividades;

import java.util.Scanner;

/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/


public class Vet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={1,0,5,-2,-5,7};
		int valor;
		int soma=0,cont=0;
		
		Scanner leia= new Scanner(System.in);
		
		for(int x=0;x<6;x++)
		{
			
			System.out.println("VETOR");
			 valor=leia.nextInt(); 
			cont++;
	   }
		
		{
		 soma=soma+A[0]+A[1]+A[5];
		  System.out.println("A SOMA DOS VETORES A[0] E A[1] E A[5]: " +soma);
		 
		     
		}
		for(int x=0;x<6;x++)
		{
			 A[4]=100;
			 
			 System.out.println("VETOR"+A[x]);
			
		} 
		
		
		
	   
		
	}

	   }
		
