package atividadesAbatrata;


public interface principalAnimal {
	public static void main(String[] args) {
		lobo montanhes = new lobo ("lobogato","macho", "montanhes");
		montanhes.dormir();
		montanhes.caminhar();
		montanhes.correr();
		montanhes.emitirSom();
		
		System.out.println("----------------------------");
		
		leao africano = new leao ("marley","macho", "africano");
		africano.dormir();
		africano.caminhar();
		africano.correr();
		africano.emitirSom();
		
		System.out.println("----------------------------");
		
		tigre americano = new tigre ("loren","femea", "americano");
		americano.dormir();
		americano.caminhar();
		americano.correr();
		americano.emitirSom();
		
		System.out.println("----------------------------");
		
		cachorro viralata = new cachorro ("dolar","femea", "viralata");
		viralata.dormir();
		viralata.caminhar();
		viralata.correr();
		viralata.emitirSom();
		
		System.out.println("----------------------------");
		
		gato perca = new gato ("mel","femea", "perca");
		perca.dormir();
		perca.caminhar();
		perca.correr();
		perca.emitirSom();
		
		System.out.println("----------------------------");
		
		
		
	}

}
