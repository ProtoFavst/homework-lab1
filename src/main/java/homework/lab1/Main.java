package homework.lab1;

public class Main {

    public static void main(String[] args) {

        SuperListImpl superListImpl = new SuperListImpl();
        superListImpl.add(2);
        superListImpl.add(5);
        superListImpl.add(7);
        superListImpl.removeByIndex(3);
        superListImpl.add(8);
        superListImpl.add(9);
        superListImpl.printAll();
        superListImpl.removeByValue(8);
        superListImpl.add(2);
        superListImpl.add(8);
        superListImpl.add(1);
        superListImpl.removeByIndex(2);
        superListImpl.printAll();

        System.out.println(superListImpl.get(5));

    }
}
