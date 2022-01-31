package cosas;

public class Main {
public static void main(String[] args) {
	A a=new A();
	A b=new B();
	C c=new C();
	a.f();
	b.f();
	((B)b).soloB();
	c.f();
}
}
