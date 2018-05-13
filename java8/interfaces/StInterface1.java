package interfaces;

public interface StInterface1{
    
    default void method1(){
        isNull("method1");
        System.out.println("method1");
    }
    
    static boolean isNull(String str){
        System.out.println("Interface Null Check");
        return str == null ? true : "".equals(str) ? true : false; 
    }
}

