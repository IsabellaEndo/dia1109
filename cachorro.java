package atividadesAbatrata;

public class cachorro extends Animal {
	public cachorro(String nome, String sexo, String raca ) {
		super(nome, sexo, raca);
	}
	public void dormir() {
		System.out.println("o cachorro esta dormindo ");
	}
	public void caminhar() {
		System.out.println("o cachorro esta caminhando ");
	}
	public void correr() {
		System.out.println("o cachorro esta correrendo ");
	}
	public void emitirSom() {
		System.out.println("o cachorro esta a late");
	}

}
