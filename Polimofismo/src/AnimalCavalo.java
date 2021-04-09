
public class AnimalCavalo extends Animal {
	
	public AnimalCavalo(String nome, String idade, String som, String correr) {
		super(nome, idade, som, correr);
		System.out.println("===========================================CAVALO=====================================================");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void nome(String nome) {
		System.out.println("\nNome:Hercules");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void idade(String idade) {
		System.out.println("\nIdade:25 Anos");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void som(String som) {
		System.out.println("\nSom:hi..rin...hiiriinnn............");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correr(String corre) {
		System.out.println("\nCorre:60 Km/h");
		
		// TODO Auto-generated method stub
		
	}
	public void printInfo()
	{
		System.out.println("====================================PREGUIÇA===========================================");
	}

	
	

}
