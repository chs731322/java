package e08_is_a;

public class IsAMain {

	public static void main(String[] args) {
		Person p = new Person();
		Dog d= new Dog();
		
		Animal a = p;
		a.eat();
		Person e = (Person)a; //a가 e보다 상위 개념이기 때문에 (Person)으로 강제로 바꿔줌
		e.eat();
		
		// 동일한 객체를 가리킴 = 해시 코드가 같음
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(e));
		
		//a, d, g도 같은 객체
		a = d;
		a.eat();
		d.eat();
		Dog g = (Dog) a;
		g.eat();
		
		Animal al = d;
		//Animal에 Dog 인스턴스이기 때문에 Dog는 Person으로 변경 불가
		//Dog와 Person은 관계가 없다.
		Person pr = (Person) al;
		pr.eat();
		
	}

}
