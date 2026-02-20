public class Boxing {
	public static void main(String [] args) {
		int primitive = 100;

		System.out.println(primitive +" "+((Object) primitive).getClass().getSimpleName());

		Integer reference = Integer.valueOf(primitive); // boxing

		System.out.println(reference+" "+  reference.getClass().isPrimitive());

		int anotherPrimitive = reference.intValue(); // unboxing

		System.out.println(anotherPrimitive+" "+ ((Object)anotherPrimitive).getClass());


		double primitiveDouble = 10.9;
		Double refereceDouble = primitiveDouble; // auto boxing
		double anotherPrimitiveDouble = refereceDouble; //auto unboxing

		// any method works for wrapper type
		Long referenceLong = 10L;
		Long referenceLong0 = new Long("10"); // constructor method depreciated since Java 9
		// special methods
		Long referenceLong1 = Long.parseLong("10");
		Long referenceLong2 = Long.valueOf("10");

		// since unboxing a null value give NullPointException
		long referenceLong3 = referenceLong != null ? referenceLong : 0; // won't throw exception


		// some notes
		// - primitive types are fasters
		// - wrapper are used if null values are needed
		// - primitive type can't be used in standard collection (list, sets, etc)
	}
}
