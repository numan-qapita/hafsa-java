public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.search(10);
    }

    int []arrayToSearchIn = { 10, 11, 25, 67, 89, 100 };

    public void search(int numberToSearch) {
        System.out.println("You are looking up " + numberToSearch);

        int low = 0;
        int high = arrayToSearchIn.length - 1;
        int position = -1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if(numberToSearch == arrayToSearchIn[mid]) {
                position = mid;
                break;
            }
            else if(numberToSearch < arrayToSearchIn[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if(position == -1) {
            System.out.println("Number not found");
        }
        else {
            System.out.println("Number found at position " + position);
        }
    }
}
