package atividadesAbatrata;


public class lobo extends Animal{
	public lobo(String nome, String sexo, String raca ) {
		super(nome, sexo, raca);
	}
	public void dormir() {
		System.out.println("o lobo esta dormindo ");
	}
	public void caminhar() {
		System.out.println("o lobo esta caminhando ");
	}
	public void correr() {
		System.out.println("o lobo esta correrendo ");
	}
	public void emitirSom() {
		System.out.println("o lobo esta uivando");
	}


}
