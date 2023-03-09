
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {94, 85, 95, 88, 90};
		int aaa = 0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>aaa) {
				aaa=num[i];
			}
		}
		System.out.println("최대값 : " + aaa);
//aaa
	}

}
