package loop;

public class dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
for (int i= 1; i<=a; i++) {
	for ( int j= 1;j<=a ;j++) {
		 if (i==1 && j==3||i==2 &&j==2||i==2 && j==4||j==1 &&i==3||i==5 &&j==3 
				 ||j==5 &&i==3||i==4 &&j==2 ||i==4 &&j==4) 
		 {
			 System.out.print(" *");
		 }
		 else
		 {
		
		System.out.print( "  ");}
	}
	System.out.println();
}
		
		
		
		
		
		
		
	}

}
