package interfaces;

public class StInterfaceImpl1 implements StInterface1{
    
    public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

}

