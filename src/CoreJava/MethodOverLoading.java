package CoreJava;

public class MethodOverLoading {
	void Q(int a, String Kan)
	{
		System.out.println("Q");
	}
	void Q(String name, int b)
	{
		System.out.println("Zero");
	}
	

	public static void main(String[] args) {
		MethodOverLoading Ol=new MethodOverLoading();
		Ol.Q("priyanka", 15);

	}

}
