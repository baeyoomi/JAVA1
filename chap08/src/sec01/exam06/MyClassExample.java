package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		//필드의 다형성
		System.out.println("1)----------------");
		MyClass myClass1 = new MyClass();            // 생성자 RemoteControl rc = new Television(); 
		myClass1.rc.turnOn(); 
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		MyClass myClass2 = new MyClass(new Audio()); // 생성자 RemoteControl rc = new Audio();
		
		System.out.println("3)----------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();                         // 메소드의 로컬변수 형식으로... 인터페이스 변수 사용
		
		System.out.println("4)----------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());         // 메소드의 매개변수 형식으로... 인터페이스 변수 사용
	}

}
