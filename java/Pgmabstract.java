abstract class Pgm1
{
	public static void staticmethod(){
	System.out.println("static method with Acces specifire");
	}
	
	
	public void nonstatic(){
	System.out.println("non static method with Acces specifire");
	}
	
	static void withoutacces(){
	System.out.println("static method without Acces specifire");
	}
	
    void withoutstaticandaccess(){
	System.out.println("non-static Method with out Access Specifier");
    }
    abstract void withabstract();
	
}


