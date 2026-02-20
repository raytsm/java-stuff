public class Args {
    public static void main(String[] args) {

        // java Args.java string 100
        System.out.println(args[0]);
        int num = Integer.parseInt(args[1]);
        System.out.println(num);
    }
}