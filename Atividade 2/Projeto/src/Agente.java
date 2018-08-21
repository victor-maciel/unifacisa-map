
public class Agente {
	
	private Pessoa pessoa;
	private int idAgente;
	
	public int getIdAgente() {
		return idAgente;
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

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

}
