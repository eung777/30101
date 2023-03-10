
import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int a = sc.nextInt();
		int sum=0;
		for(int i=1; i<=a; i++) {
			if(i % 4 == 0) {
				System.out.println(i);
				sum+=i;
				
			}
			
		}
		System.out.println(sum);

	}

}
