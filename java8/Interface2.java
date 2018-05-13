public interface Interface2{
    
    public void method2();
    
    default void log(String mess){
        System.out.println("Log from Interface2");
    }
    
}