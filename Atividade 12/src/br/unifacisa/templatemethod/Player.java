package br.unifacisa.templatemethod;

public abstract class Player {
	
	public abstract void play();
	public abstract void stop();
	public abstract void avancar();
	
	
	public final void executar() {
		
		play();
		avancar();
		stop();
	}

}
