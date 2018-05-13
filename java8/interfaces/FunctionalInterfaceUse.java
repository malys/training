public class FunctionalInterfaceUse{
    public String method1(String mess1,String mess2, FunctionalInterface1 f){
        
        return "Result:" +  f.create(mess1,mess2).toString();
    }
    
    public void method2(String mess1, java.util.function.Consumer c){
        c.accept(mess1);
    }
}