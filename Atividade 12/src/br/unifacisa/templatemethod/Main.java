package br.unifacisa.templatemethod;

public class Main {
	
	public static void main(String[] args) {
	
	Player player = new MP3Player();
	player.executar();
	
	
	player = new WmvPlayer();
	player.executar();
	
	}
	

}
