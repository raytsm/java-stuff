public class SwitchPatternMatching {
	public static void main(String[] args) {
//		Object obj = new Person("James Ghosling");
		Object obj = null;
		switchTypeCheck(obj);
	}
	static void switchTypeCheck(Object o) {
		switch(o){
			case null -> System.out.println("Null");
			case Integer i -> System.out.println("Integer");
			case Double d when d > 0 -> System.out.printf("Double %f is positive", d);
			case Person p -> System.out.println(p.toString());
			case String s -> System.out.println("String");
			default -> System.out.println("No match");
		}
	}
}
class Person {
	private String name;

	public Person (String name) {
		this.name = name;
	}
	public String toString() {
		return "NAME = " + name;
	}
}
