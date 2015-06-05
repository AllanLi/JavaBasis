package external.III;

public class Test01 {
	public void m01(){
		String line = "FDR100100,10";
		String[] info = line.split(",");
		System.out.println(info[0]);
		System.out.println(info[1]);
	}
	public void m02(){
		System.out.println("002");
		
		long lo=10L;
		String s = "10";
		
		
		
		if (s.equals("lo")){
			System.out.println("YES");
		}else{
			
			System.out.println("NO");
		}
		
		Long OR = Long.valueOf("12");
		System.out.println(OR);
		
	}
	public void m03(){
		int reject = 0;
		int rated = 0;
		//sql1 : file_type_id = 4
			
		//sql2 : file_type_id = 2, 有可能沒有值
		
	
		boolean fileListCorrect = true;
          fileListCorrect = (1 == 1 ) && (1 == 1 );
          
          String pp[]=new String[]{("OK"),("OK"),("XX"),("OK"),("OK"),("OK")}; 
           
          for( int i = 0; i < pp.length; i++ ) {
              fileListCorrect = fileListCorrect && ( pp[i] == "OK" );
              System.out.println("1"+fileListCorrect);
            }
		
		System.out.println("2"+fileListCorrect);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 t = new Test01();
		t.m03();
	}

}
