package loop;

public class armstrong_number {

	public static void main(String[] args) {
	int num=153;
	int s=num;
	int sum=0;
	while(num>0) {
		int reminder=num%10;
		 sum=sum+reminder*reminder*reminder;
		 num/=10;
	}
		if(s==sum) {
			System.out.println(" this is armstrong number");
		}else {
			System.out.println("given number is not Armstrong");
		}
	}
	

}
