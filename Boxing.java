public class Boxing {
	public static void main(String [] args) {
		int primitive = 100;
		System.out.println(primitive +" "+((Object) primitive).getClass().getSimpleName());
		Integer reference = Integer.valueOf(primitive);
		System.out.println(reference+" "+  reference.getClass().isPrimitive());
		int anotherPrimitive = reference.intValue();
		System.out.println(anotherPrimitive+" "+ ((Object)anotherPrimitive).getClass());
	}
}
