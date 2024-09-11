package atividadesAbatrata;

public class leao extends Animal {
	
	public leao(String nome, String sexo, String raca ) {
		super(nome, sexo, raca);
	}
	public void dormir() {
		System.out.println("o leao esta dormindo ");
	}
	public void caminhar() {
		System.out.println("o leao esta caminhando ");
	}
	public void correr() {
		System.out.println("o leao esta correrendo ");
	}
	public void emitirSom() {
		System.out.println("o leao esta rugi");
	}

}
