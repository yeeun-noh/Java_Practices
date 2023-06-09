package ex12;

//하위클레스 => 상위클래스 (접근/사용 가능) + (참조불가능)
//상위클레스 => 하위클래스 (접근/사용 불가능==> 오버라이딩하면 그 함수만 사용가능) + (참조가능)

class Object {
	void tostring() {
		System.out.println("Object클래스의 tostring()");
	}
	
	void onlyObject() {
		System.out.println("Object클래스의 onlyObject()");
	}
}

class A extends Object{ 
	int i = 10;
	
	void func() {
		System.out.println("A클래스의 func(), i의값은 " + i);
	}
	
	void tostring() {	//오버라이딩
		System.out.println("A클래스의 tostring()");
	}
	
	void onlyA() {
		System.out.println("A클래스의 onlyA()");
	}
}

class B extends A {
	int i = 20;
	
	void func() {		//오버라이딩
		System.out.println("B클래스의 func(), i의값은 " + i);
	}
	
	void tostring() {	//오버라이딩
		System.out.println("B클래스의 tostring()");
	}
	
	void onlyB() {
		System.out.println("B클래스의 onlyB()");
	}
}

class C extends A {} //instanceof 설명하기 위해 만든것

public class Exam01 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		//상위클래스는 하위클래스 참조가능 (하위클래스는 상위클래스 참조불가능):
		A aa = new B();		//aa는 A클래스와 Object클래스 접근/사용가능
		Object ob = new B(); 	//ob는 Object클래스만 접근/사용가능

//		B bb = new A(); 	//불가능 (하위클래스는 상위클래스 참조불가능)
		B bb = (B)aa;		//가능 (aa의 타입은 'A'이므로 '(B)'를 추가해서 타입을 바꿔주기) ==> bb(B클래스)는 aa처럼 B클래스를 참조하고 있음
		
		/* 불가능: A클래스(타입)의 a를 B클래스(타입)의 a로 변환해서 사용할수없음! 이미 A클래스를 참조하고 있기 때문
		A a = new A();
		B bbb = (B)a;
		*/
		
		//오버라이딩을 통해, 하위클래스의 함수 접근/사용가능:
		a.tostring();		//A클래스의 tostring()
		b.tostring();		//B클래스의 tostring()
		aa.tostring();		//B클래스의 tostring()
		ob.tostring();		//B클래스의 tostring()

		//하위클래스가 상위클래스의 함수를 오버라이딩하면, 상위클래스는 하위클래스에 접근가능(단, 오버라이딩한 함수만 접근가능):
		a.func();		//A클래스의 func(), i의값은 10
		b.func();		//B클래스의 func(), i의값은 20
		aa.func();		//B클래스의 func(), i의값은 20
//		ob.func();		//에러, Object클래스(ob)가 B클래스를 참조하고있지만 (오버라이딩 함수 제외,) Object클래스만 접근/사용가능!

		b.onlyB();		//B클래스의 onlyB()
//		aa.onlyB();		//에러, A클래스(aa)가 B클래스를 참조하고있지만 (오버라이딩 함수 제외,) A클래스,Object클래스만 접근/사용가능!				
		
		System.out.println("----------------------------------------------------");
		
		//instanceof 설명
		//밑에 static void action(A a)이랑 같이봐보기:
		action(new A());	// A a = new A();
		action(new B());	// A a = new B();
		action(new C());	// A a = new C();
	}
	
	
	static void action(A a) {
		if(a instanceof A) { 		//a가 참조하고 있는대상이 A클래스이면 true, 아니면 false
			A aaa = a;		//-> aaa와 a는 모두 타입(A)이므로 형변환 필요없음
		} else if(a instanceof B) {	//a가 참조하고 있는대상이 B클래스이면 true, 아니면 false
			B bbb = (B)a;		//-> a의 타입(A)을 bbb와 같은 B타입으로 형변환
		} else if(a instanceof C) {	//a가 참조하고 있는대상이 C클래스이면 true, 아니면 false
			C ccc = (C)a;		//-> a의 타입(A)을 ccc와 같은 C타입으로 형변환
		}
	}

}
