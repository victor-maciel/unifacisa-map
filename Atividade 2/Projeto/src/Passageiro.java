
public class Passageiro {
	private Pessoa pessoa;
	private int numeroSmiles;
	
	public int getNumeroSmiles() {
		return numeroSmiles;
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

	public void setNumeroSmiles(int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
	}
	
}
