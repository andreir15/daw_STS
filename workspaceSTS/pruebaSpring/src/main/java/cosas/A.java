package cosas;

public class A {
private static A a;
	private A() {
	
}
	public static A getA() {
		if(a==null) {
			a=new A();
		}
		return a;
	}
	public void f() {
	System.out.println("f de la clase A");
}
}
