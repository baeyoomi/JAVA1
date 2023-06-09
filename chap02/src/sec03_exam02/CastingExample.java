package sec03_exam02;

public class CastingExample {

	public static void main(String[] args) {
		// 강제형변환(캐스팅) : 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 저장하는 것
		// 자동형변환(프로모션) : 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생
		// byte(정수) < short(정수)/char(문자) < int(정수) < long(정수) < float(실수) < double(실수)
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);

	}

}
