package homework.lab1;

public class SuperListImpl implements SuperList{
    int[] myArray = new int[1];

    @Override
    public void add(int number) {
        int [] numbersCopy = new int[myArray.length+1];
        System.arraycopy(myArray, 0,numbersCopy, 0, myArray.length);
        numbersCopy[numbersCopy.length-1] = number;
        myArray = numbersCopy;

    }

    @Override
    public void removeByIndex(int index) {
        if(index>-1 && index< myArray.length) {
            int[] newArray = new int[myArray.length - 1];
            System.arraycopy(myArray, 0, newArray, 0, index);
            System.arraycopy(myArray, index+1 ,newArray, index, myArray.length-1-index);
            myArray = newArray;

        }
        else throw new ArrayIndexOutOfBoundsException();

    }

    @Override
    public void removeByValue(int value) {
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]==value) {
                removeByIndex(i);
                i--;
            }

        }

    }

    @Override
    public int get(int index) {
        if(index>-1 && index< myArray.length)
         return myArray[index];
        else throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public void printAll() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }
        System.out.println();
    }
}
