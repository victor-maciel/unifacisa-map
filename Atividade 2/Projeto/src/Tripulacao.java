
public class Tripulacao {
	private Pessoa pessoa;
	private int idTripulacao;
	
	public int getIdTripulacao() {
		return idTripulacao;
	}
	
	public String getNome() {
		return pessoa.getNome();
	}
	
	public String getEndereco() {
		return pessoa.getEndereco();
	}

	public void setNome(String nome) {
		pessoa.setNome(nome);
	}

	public void setEndereco(String endereco) {
		pessoa.setEndereco(endereco);
	}

	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}
}
