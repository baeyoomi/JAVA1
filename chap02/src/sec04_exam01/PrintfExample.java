package sec04_exam01;

public class PrintfExample {

	public static void main(String[] args) {
		// printf
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);    // 123
		System.out.printf("상품의 가격:%6d원\n", value);   // 6자리를 가진 123
		System.out.printf("상품의 가격:%-6d원\n", value);  // -6자리를 가진 123
		System.out.printf("상품의 가격:%06d원\n", value);  // 6자리 빈란은 0으로 채워진 123
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름의 %d인 원의 넓이:%10.2f\n", 10,area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
