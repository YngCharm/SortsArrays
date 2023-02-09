public class Main {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 2, 5};
        int[] arrayTwo = {9, 8, 22, 23, 51};

        First first = new First();
        first.quickSort(array, 0, 4);

        first.showSortedArray(array);

        Second second = new Second();
        second.bubbleSort(array);
        second.showSortedArray(array);

        Third third = new Third();
        third.showSortedArray(arrayTwo);


        Fourth fourth = new Fourth();
        fourth.selectionSort(array);

    }
}
