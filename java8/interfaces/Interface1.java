package interfaces;

public interface Interface1{
    
    public void method1();
    
    default void log(String mess){
        System.out.println("Log from Interface1");
    }
    
}