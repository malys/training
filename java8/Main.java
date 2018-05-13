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
    
    public static void main(String args[]){
        interfacesDefault();
    }
}