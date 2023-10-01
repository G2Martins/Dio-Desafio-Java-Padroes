/**
 * Singleton Lazy Holder
 * 
 * @see <a href="https:stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author G2Martins
 */

public class SingletonLazyHolder {
    
    private static class instanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
        
    public static SingletonLazyHolder getInstancia() {
        return instanceHolder.instancia;
    }
   
}
