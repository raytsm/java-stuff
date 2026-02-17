public class ReferenceType {
    static void main() {
        // primitive types are stored in stack memory and reference types in heap memory
        // 8 primitive types with starting letters is small
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = s2;

        System.out.println(s1 == s2); // compares the reference addersses rather than actual values
        System.out.println(s2 == s3);

        System.out.println(s1.equals(s2)); // compares the values
        System.out.println(s2.equals(s3));

        String str = null; // reference type can refer to special null value
        System.out.println(str);
        str = "hello";
        System.out.println(str);

       // int n = null; // primitive types cannot refer to special null value
    }
}