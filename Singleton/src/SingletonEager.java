/**
 * Singleton Eager
 * 
 * @author G2Martins
 */

public class SingletonEager {
    private static SingletonEager  instancia = new SingletonEager();

    private SingletonEager (){
        super();
    }
    
    public static SingletonEager getInstancia() {
        return instancia;
    }

   
}
