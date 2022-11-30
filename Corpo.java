package aula13.unit.com.br;

public class Corpo {
	private int idCorpo;
	private String nome;
	private String situacao;
	
	public Corpo(int idCorpo, String nome) {
		
		this.idCorpo = idCorpo;
		this.nome = nome;
		this.situacao ="Aguardando Sepultamento";
		
	}
	
	public void sepultar() {	
		situacao = "Seputado";	
	}
	
	public void exumar() {	
		situacao = "Exumado";	
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdCorpo() {
		return idCorpo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String toString() {
		return "\nIdentificação do corpo        : " + this.idCorpo +
			   "\nNome do corpo                 : " + this.nome +
			   "\nSituação do corpo             : " + this.situacao;
	
	}
}
