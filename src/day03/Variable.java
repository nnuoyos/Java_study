package day03;

public class Variable {
	public static void main(String[] args) {
		int i = 10;
		long l = 100L;
		double d1 = 1.23;
		double d2 = 1.23D;
		float f = 1.23F; //실수의 기본형(double) 이 아닌 float을 사용할 경우 뒤에 F를 붙여줘야 한다
		char c1 = 'A';
		String s = "장소영";
		
		
		
		
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(f);
//		System.out.println(c1);
//		System.out.println(s);
		
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%d\n", l);
		System.out.printf("%.2f\n", d1);
		System.out.printf("%f\n", f);
		System.out.printf("%c\n", c1);
		System.out.printf("%s\n", s);
		
		
	}

}
