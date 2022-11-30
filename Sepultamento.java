package aula13.unit.com.br;

public class Sepultamento {
	private int idSepultamento;
	private String data;
	private Corpo corpo;
	private Tumulo tumulo;
	public Sepultamento(int idSepultamento, String data, Corpo corpo,Tumulo tumulo) {
		
		this.idSepultamento = idSepultamento;
		this.data = data;
		this.corpo = corpo;
		this.tumulo = tumulo;
	}
	public void sepultar() {
		corpo.setSituacao("Sepultado");
		tumulo.ocupar();
	}
	public int getIdSepultamento() {
		return idSepultamento;
	}
	public void setIdSepultamento(int idSepultamento) {
		this.idSepultamento = idSepultamento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public Corpo getCorpo() {
		return corpo;
	}
	public void setCorpo(Corpo corpo) {
		this.corpo = corpo;
	}
	public Tumulo getTumulo() {
		return tumulo;
	}
	public void setTumulo(Tumulo tumulo) {
		this.tumulo = tumulo;
	}
	@Override
	public String toString() {
		return "\nIdentificação do sepultamento   : " + this.idSepultamento +
			   "\nData do sepultamento            : " + this.data;
	}
}
