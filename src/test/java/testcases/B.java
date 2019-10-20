package testcases;



public class B extends A{
 
/*	B(){
		
		System.out.println("Enter");
	}
	B(int x){
		
		
		
		System.out.println(x);
	}
*/
	public void Exception1(){
		
		throw new NullPointerException();
	}
	
	
	public void print(){
		
		try {
			System.out.println("this is B");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String args[]){
	
	/*B b = new B();
	B b1 = new B(10);
	
	b1.print();*/
	
	A a = new B();
	a.print(3);
	
	
}




}
