package interfaces;

public class InterfaceImpl12 implements Interface1, Interface2{
    
    public void method1(){
        System.out.println("Method1");
    }
    
    public void method2(){
        System.out.println("Method2");
    }
    
    //Necessary because two default implementation of log methods
    public void log(String mess){
        System.out.println(mess);
    }
}