public class ForEachLoop  {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'a', 'e', 'a'};

        int counter = 0;
        for (char ch : characters) { // can't modify array because ch only hold copy of the elements or skip steps
            if (ch == 'a') {
                counter++;
            }
        }

        System.out.println(counter);
    }
}