package basis.I;

public class HelloWorld {
	private String str = "HelloWorld" ;
	
	public String sayHello(){
		return str;
	}

	public static void main( String args[]){
		HelloWorld hello = new HelloWorld();
		System.out.println( hello.sayHello());
	}

}


