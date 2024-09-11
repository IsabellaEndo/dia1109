package atividadesAbatrata;

public class gato extends Animal {
	public gato(String nome, String sexo, String raca ) {
		super(nome, sexo, raca);
	}
	public void dormir() {
		System.out.println("o gato esta dormindo ");
	}
	public void caminhar() {
		System.out.println("o gato esta caminhando ");
	}
	public void correr() {
		System.out.println("o gato esta correrendo ");
	}
	public void emitirSom() {
		System.out.println("o gato esta  miando");
	}

}
