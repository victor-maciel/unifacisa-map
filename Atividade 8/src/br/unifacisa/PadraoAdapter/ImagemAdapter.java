package br.unifacisa.PadraoAdapter;

public class ImagemAdapter implements ImagemTarget {
	
	Imagem imagem;
	
	public ImagemAdapter(Imagem imagem) {
		this.imagem = imagem;
	}
	
	
	@Override
	public void carregarQuadrinho() {
		// TODO Auto-generated method stub
		this.imagem.gerarQuadrinho();

		
	}

	@Override
	public void desenharQuadrinho() {
		// TODO Auto-generated method stub
		this.imagem.PintarQuadrinho();
		
	}
	
	

}
