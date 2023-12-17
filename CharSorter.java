import java.util.Scanner;

public class CharSorter {

    private char[] chars;

    public CharSorter(int size) {
        this.chars = new char[size];
    }

    public void getChars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 characters: ");
        for (int i = 0; i < chars.length; i++) {
            chars[i] = sc.next().charAt(0);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < chars.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < chars.length - 1 - i; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public void displayChars() {
        System.out.println("Original Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Sorted Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        CharSorter sorter = new CharSorter(10);
        sorter.getChars();
        sorter.bubbleSort();
        sorter.displayChars();
    }
}
