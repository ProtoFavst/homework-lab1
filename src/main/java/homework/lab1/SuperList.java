package homework.lab1;

public interface SuperList {

    void add(int number);

    void removeByIndex(int index);

    void removeByValue(int value);

    int get(int index);

    void printAll();
}