import java.util.Random;
import java.util.Scanner;

public class RandExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위 던질 횟수 입력:");
		int num=sc.nextInt();
		int aaa=0;
		int rand =0;
		for(int i=1; i<=num; i++) {
			rand=rd.nextInt(6)+1;
			aaa+=rand;
			System.out.printf("%d번째 숫자는 %d입니다.\n", i, rand);
		}
		System.out.println(aaa);

	}

}
