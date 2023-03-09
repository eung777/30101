import java.util.Scanner;

public class javaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		int a, b;
		a=sc.nextInt(); 
		b=sc.nextInt();
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
