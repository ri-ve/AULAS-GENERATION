
public abstract class Animal {
	
	private  String nome;
	private String idade;
	private String som;
	private String correr;
	
	public Animal (String nome,String idade, String som, String correr)
	{
		this.nome=nome;
		this.idade=idade;
		this.som=som;
		this.correr=correr;
		
	}
	abstract public void nome(String nome);
	abstract public void idade(String idade);
	abstract public void som(String som);
	abstract public void correr(String correr);
	
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

	public String getCorrer() {
		return correr;
	}

	
	
	
	
	
	
	
	
	
	


	 
		// TODO Auto-generated method stub
		
	}
