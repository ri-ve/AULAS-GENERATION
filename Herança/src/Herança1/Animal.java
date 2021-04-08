package Herança1;
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

public class Animal {
	
	private String nome;
	private String idade;
	private String som;
	private float correr;
	
	public Animal(String nome, String idade, String som, float correr)
	{
		this.nome=nome;
		this.idade=idade;
		this.som=som;
		this.correr=correr;
		
	}
	 
	public Animal() {
		// TODO Auto-generated constructor stub
	}


	public void imprimirInfo()
	{
		System.out.println("\nNome Do Animal:"+nome+"\nIdade Do Animal:"+idade+"\nSom que o Animal faz:"+som+"\nCorrer:"+correr);
		System.out.println("*******************************************************");
	}
	public float correrAnimal()
	{
		correr++;
		return correr;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public float getCorrer() {
		return correr;
	}

	public void setCorrer(float correr) {
		this.correr = correr;
	}

	public void setCorrer(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
