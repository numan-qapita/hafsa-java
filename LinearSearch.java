public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        ls.search(1100);
    }

    public void search(int numberToFind) {
        int []a =  { 200, 120, 600, 900, 1100 };

        System.out.println("Searching "+ numberToFind +" in array");

        Boolean isFound = false;
        for(int i = 0; i <= a.length - 1; i++) {
            if(a[i] == numberToFind){
                isFound = true;
                break;
            }
        }

        System.out.println(numberToFind + " is found: " + isFound);
    }
}
