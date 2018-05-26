public class App {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree...");

        // Tree<Integer> intBst = new BinarySearchTree<>();

        // intBst.add(10);
        // intBst.add(-1);
        // intBst.add(1);
        // intBst.add(0);
        // intBst.add(1000);
        // intBst.add(-22);

        // System.out.printf("Minimum: %s\n", intBst.getMinimum());
        // System.out.printf("Maximum: %s\n", intBst.getMaximum());

        // intBst.traverse();


        // Tree<String> strBst = new BinarySearchTree<>();

        // strBst.add("Kurt");
        // strBst.add("Xenia");
        // strBst.add("Adam");
        // strBst.add("Paul");
        // strBst.add("Michael");
        // strBst.add("Daniel");
        // strBst.add("Joseph");

        // System.out.printf("Minimum: %s\n", strBst.getMinimum());
        // System.out.printf("Maximum: %s\n", strBst.getMaximum());

        // strBst.traverse();


        // Tree<Integer> intBst = new BinarySearchTree<>();

        // intBst.add(10);
        // intBst.add(5);
        // intBst.add(15);
        // intBst.add(3);
        // intBst.add(7);

        // intBst.remove(10);

        // intBst.traverse();


        // Tree<Integer> intBst = new BinarySearchTree<>();

        // intBst.add(10);
        // intBst.add(5);
        // intBst.add(15);
        // intBst.add(3);
        // intBst.add(7);

        // intBst.remove(3);

        // intBst.traverse();


        // Tree<Integer> intBst = new BinarySearchTree<>();

        // intBst.add(10);
        // intBst.add(5);
        // intBst.add(15);
        // intBst.add(3);

        // intBst.remove(5);

        // intBst.traverse();


        Tree<Integer> intBst = new BinarySearchTree<>();

        intBst.add(10);
        intBst.add(5);
        intBst.add(15);
        intBst.add(20);

        intBst.remove(15);

        intBst.traverse();


        // Tree<Person> pBst = new BinarySearchTree<>();

        // pBst.add(new Person("Kurt", 21));
        // pBst.add(new Person("Xenia", 19));
        // pBst.add(new Person("Adam", 16));
        // pBst.add(new Person("Paul", 29));
        // pBst.add(new Person("Michael", 11));
        // pBst.add(new Person("Joseph", 15));

        // System.out.printf("Minimum: %s\n", pBst.getMinimum());
        // System.out.printf("Maximum: %s\n", pBst.getMaximum());

        // pBst.traverse();
    }
}