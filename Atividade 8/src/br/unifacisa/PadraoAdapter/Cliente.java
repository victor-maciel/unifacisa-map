package br.unifacisa.PadraoAdapter;

public class Cliente {
	
	public static void main(String[] args) {
		
		Imagem imagemBMP = new ImagemBMP();
		ImagemAdapter imagemAdapterBMP = new ImagemAdapter(imagemBMP);
		
		imagemBMP.gerarQuadrinho();
		imagemAdapterBMP.carregarQuadrinho();
		
		Imagem imagemJpeg = new ImagemJpeg();
		ImagemAdapter imagemAdapterJpeg = new ImagemAdapter(imagemJpeg);
		
		imagemJpeg.gerarQuadrinho();
		imagemAdapterJpeg.carregarQuadrinho();
		
	}

}
