public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Assuming the current element is the minimum
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) { // Check if any element is smaller
                    minIndex = j; // Update minimum index if found
                }
            }
            if (minIndex != i) { // Swap minimum element with current element
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted array: ");
        printArray(arr);
        sort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
