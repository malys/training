import interfaces.*;


public class Main{
    
    private static void interfacesDefault(){
        //https://www.journaldev.com/2752/java-8-interface-changes-static-method-default-method
        Interface1 i1=new InterfaceImpl1();
        i1.method1();
        i1.log("Log1"); // default Ok
        
        Interface2 i2=new InterfaceImpl2();
        i2.method2();
        i2.log("Log2"); // default KO
        
        
        //InterfaceImpl12 has to implement log methods
        Interface1 i12=new InterfaceImpl12();
        i12.method1();
        i12.log("Log12");
        
        Interface2 i21=new InterfaceImpl12();
        i21.method2();
        i21.log("Log21");
    }
    
    private static void interfacesStatic(){
        StInterfaceImpl1 stI=new StInterfaceImpl1();
        stI.method1();
        stI.isNull("");
        StInterface1.isNull("not null");
        
        //System.out.println(StInterface1.isNull(""));
    }
    
        private static void interfacesFunctional(){
        FunctionalInterfaceUse f= new FunctionalInterfaceUse();
        System.out.println(f.method1("1","2",(m1,m2) ->  m1+m2));
        System.out.println(f.method1("1","2",(m1,m2) ->  m1+"!!!!!"+m2));
        //Class::new constructor
        //Class::method static method
        //instance:method method
        
        /*  Consumer : opération qui accepte un unique argument (type T) et ne retourne pas de résultat. - void accept(T);
            Function<T,R> : opération qui accepte un argument (type T) et retourne un résultat (type R). - R apply(T);
            Supplier : opération qui ne prend pas d’argument et qui retourne un résultat (type T). - T get();
        */
        
        f.method2("3",System.out::println);
    }
    
    public static void main(String args[]){
        //interfacesDefault();
        //interfacesStatic();
        interfacesFunctional();
    }
}