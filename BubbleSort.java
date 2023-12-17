class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.sort();
    }
    
    public void sort() {

        int []a =  { 200, 120, 600, 900, 1100 };
        System.out.println("Before performing the sort...");

        ArrayUtil.Print(a);

        int counter = 1;

        for(int i = 0; i < a.length - 1; i++) {
            Boolean anythingSwapped = false;
            for(int j = 0; j < a.length - 1; j++) {
                System.out.println("Total iterations: " + counter);
                counter++;
                if(a[j] > a[j + 1]) {
                    int temporaryVariable = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = temporaryVariable;
                    anythingSwapped = true;
                }
            }
            if(anythingSwapped) {
                break;
            }
        }

        System.out.println("\nAfter performing the sort...");
        ArrayUtil.Print(a);
    }
}