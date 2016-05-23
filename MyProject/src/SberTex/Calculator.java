package SberTex;

public class Calculator {
	public int add (int a, int b){
		return a+b;
	}

	public int minus (int a, int b) {
			return a-b;		
	}
	
	public int div (int a, int b){
		if (b==0){
			throw new IllegalArgumentException();
		}
			
		return a/b;
	}
	
	public int mulplus (int a, int b){
			return a*b;		
	}	
	
	public int calc (String a, String b, String o){
		//System.out.println( "a="+a+";b="+b+";o="+o);
		if(a.isEmpty()|b.isEmpty()|o.isEmpty()){
			throw new IllegalArgumentException();
		}
		int aa =Integer.parseInt(a);
		int bb =Integer.parseInt(b); 
		int cc = 0;
		
		if (o.equals("+")){cc=aa+bb;}
		if (o.equals("*")){cc=aa*bb;}
		if (o.equals("-")){cc=aa-bb;}
		if (o.equals("/")){
			if (bb ==0){
				throw new IllegalArgumentException();
			}
			cc=aa/bb;}
		return cc;		
}	

	
	
}
