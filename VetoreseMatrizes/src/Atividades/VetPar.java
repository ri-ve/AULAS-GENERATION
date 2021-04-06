package Atividades;
/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

import java.util.Scanner;

public class VetPar {

	public static void main(String[] args) {
	 
		 int[] num1=new int[6];
		 int somapar=0,somaimpar=0,quant=0;
		 
		 Scanner ler=new Scanner(System.in);
		
		 
		 for (int x=0;x<6;x++)
		 {
			 System.out.println("Entre com um numero:");
			 
			 num1[x] =ler.nextInt();
			 
			 if (num1[x]%2==0)
			 {
				 somapar=somapar+num1[x];
				
			 }
			 else 
			 {
				 quant++;
			 }
			 
			 
		 }
		 for (int x=0;x<6;x++)
		 {
			 if (num1[x]%2==0)
			 {
				 System.out.println(num1[x]+"<-É UM NUMERO PAR");
			
			 }
			
		 }
		 for (int x=0;x<6;x++)
		 {
		  if(num1[x]%2==1)
		 {
			 System.out.println( +num1[x]+"<-É UM NUMERO IMPAR");
			
			
		 }
		
		 }
		 for (int x=0;x<1;x++)
			 if (num1[x]%2==0)
		 somapar=somapar+num1[x];
		 System.out.println("\n SOMA DOS NUMEROS PARES:"+ somapar);
		 
		 for (int x=0;x<0;x++)
			 if (num1[x]%2==1)
		
		 somaimpar=somaimpar+num1[x];
		 System.out.println("\n SOMA DOS NUMEROS IMPARES:"+ quant++);
		
		
		
		// TODO Auto-generated method stub

	}

}
