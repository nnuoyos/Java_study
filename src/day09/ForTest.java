package day09;

public class ForTest {
	public static void main(String[] args) {
		//구구단 1단부터 9단까지 1중for문만을 사용하기
		for(int i=1; i<90; i++) {
			if(i % 10 ==0){
				i++;
				System.out.println();
			}
			System.out.printf("%d*%d=%d\n", (i / 10)+1, i%10, ((i / 10)+1) * ( i%10));
		}
		
	}
}
