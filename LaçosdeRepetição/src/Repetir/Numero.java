package Repetir;
//1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		int X,num;
		Scanner ler=new Scanner(System.in);
		
		
		for(int x=0;x<=1999;x++)
		{
			
					
			if(x>1000 && x%11==5)
			
		{
			
			System.out.println("numero :"+x);
		}
			
		
		}
			
		
		// TODO Auto-generated method stub

	}

}
