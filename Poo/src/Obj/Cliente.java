package Obj;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	//Declação dos tributos da classe
	
	private String nome;
	private String idade;
	private String sexo;
	private String endereco;
	
	
	//metodo construtor 
	public Cliente(String nome,String idade,String sexo,String endereco)
	{
		this.nome=nome;//metodo:parametro.
		this.idade=idade;//metodo:parametro.
		this.sexo=sexo;//metodo:parametro.
		this.endereco=endereco;//metodo:parametro.
	}
	//criaçao dos demais metodos da minha classe automovel.
	
	public void imprimirInfo()
	{
		System.out.println("Nome:" +nome+ "\nIdade:"+idade+ "\nSexo: "+sexo+   "\nEndereço:"+endereco);
	}
	public String getnome() 
	{
		return
				nome;
	}
	public void setnome(String nome) 
	
	{
		this.nome=nome;
	}
	public String getidade() 
	{
		return
				idade;
	}
public void setidade(String idade) 
	
	{
		this.idade=idade;
	}		
public String getsexo() 
{
	return
			sexo;
}
public void setsexo(String sexo) 

{
	this.sexo=sexo;
}
public String getendereco() 
{
	return
			endereco;
}
public void setendereco(String endereco) 

{
	this.endereco=endereco;
}
}
