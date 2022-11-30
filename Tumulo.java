package aula13.unit.com.br;

public class Tumulo {
	private int idTumulo;
	private String localizacao;
	private boolean ocupado;
	
	public Tumulo(int idTumulo, String localizacao) {

		this.idTumulo = idTumulo;
		this.localizacao = localizacao;
		ocupado = false;
	}
	
	public void ocupar() {
		ocupado = true;
		
	}
	
	public void desocupar() {
		
		ocupado = false;
		
	}
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getIdTumulo() {
		return idTumulo;
	}

	public boolean isOcupado() {
		return ocupado;
	}
	public String toString() {
		return "\nIdentificação do tumulo        : " + this.idTumulo +
			   "\nLocalização do tumulo          : " + this.localizacao +
			   "\nSituação do tumulo               " + this.ocupado;
	} 
}
