package aula13.unit.com.br;

public class Exumacao {
	private int idExumacao;
	private String data;
	private Sepultamento sepultamento;
	public Exumacao(int idExumacao, String data, Sepultamento sepultamento) {
		super();
		this.idExumacao = idExumacao;
		this.data = data;
		this.sepultamento = sepultamento;
	}
	public void exumar() {
		sepultamento.getCorpo().setSituacao("Exumado");
		sepultamento.getTumulo().desocupar();
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Sepultamento getSepultamento() {
		return sepultamento;
	}
	public void setSepultamento(Sepultamento sepultamento) {
		this.sepultamento = sepultamento;
		
	}
	@Override
	public String toString() {
		return "\nIdentificação         : " + this.idExumacao +
			   "\nData                  : " + this.data;
	}
}
