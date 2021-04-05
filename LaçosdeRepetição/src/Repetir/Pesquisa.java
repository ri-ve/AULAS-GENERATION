package Repetir;
//exercisio 6
import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		int num,somamult3=0,cont=0;
		float media3;
		 Scanner leia= new Scanner(System.in);
		 System.out.println("\nEntre com um numero:");
		 num=leia.nextInt();
		 do
		 {
			 if(num%3==0)
			 {
				 somamult3=somamult3+num;
				 cont++;
			 }
			 System.out.println("\nEntre com um numero:");
			 num=leia.nextInt();
		 }while(num!=0);
		 media3=somamult3/cont;
		 System.out.println("\nmedia dos numeros multiplo de  3: "+media3);
		// TODO Auto-generated method stub

	}

}
