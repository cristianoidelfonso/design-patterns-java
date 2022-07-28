package one.dio.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author cristianoidelfonso
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
