package atividadesAbatrata;

public class tigre extends Animal {
	
	public tigre(String nome, String sexo, String raca ) {
		super(nome, sexo, raca);
	}
	public void dormir() {
		System.out.println("o tigre esta dormindo ");
	}
	public void caminhar() {
		System.out.println("o tigre esta caminhando ");
	}
	public void correr() {
		System.out.println("o tigre esta correrendo ");
	}
	public void emitirSom() {
		System.out.println("o tigre esta a rugi");
	}

}
