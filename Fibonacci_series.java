package loop;

public class Fibonacci_series {

	public static void main(String[] args) {
		System.out.println("===== fobonacci series=====");
	int a=5;
	int b=0;
	int c=1;
	 for ( int i=0;i<=a;i++)
	 {
		 System.out.println(b);
		 int d=b+c;
		b=c;
		c=d;
				 
	 }
System.out.println(" try ");
		int a1=0; int a2=1;
		for ( int i=0;i<=10; i++)
		{
			System.out.println(a1);
			int a3=a2+a1;
			a1=a2;
			a2=a3;
		}
		
		
		
	}

}
