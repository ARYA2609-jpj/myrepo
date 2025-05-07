package stringExample;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("hellow");
		System.out.println(a);
		StringBuilder b=new StringBuilder("hai");
		System.out.println(b);
		//insert
		System.out.println(a.insert(3,"world"));
		//Append
		System.out.println(a.append("Hiii"));
		//replace
		System.out.println(a.replace(3, 10, "world"));
		//delete
		System.out.println(a.delete(2, 4));
		

	}

}
