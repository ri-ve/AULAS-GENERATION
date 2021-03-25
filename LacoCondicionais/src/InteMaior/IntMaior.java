package InteMaior;
// 1-	Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class IntMaior {

	public static void main(String[] args) {
		int n1 ,n2 , n3;
		Scanner ler= new Scanner(System.in);
		System.out.println("Entre com um numero" );
	      n1=ler.nextInt();
	      System.out.println("Entre com um numero" );
	      n2=ler.nextInt();
	      System.out.println("Entre com um numero" );
	      n3=ler.nextInt();
	      if(n1>n2)
	      {
	    	  System.out.println("PRIMEIRO NUMERO É O MAIOR");
	      }
	      else if (n2>n3 )
	      {
	    	 System.out.println("SEGUNDO NUMERO É O MAIOR"); 
	      }
	       if (n3>n1)
	      {
	    	  System.out.println("TERCEIRO NUMERO É O MAIOR"); 
	      }
	    	  
	      
		// TODO Auto-generated method stub

	}

}
