 public class Searcher {

        // default access method (no modifier)
        int linearSearch(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i; // key found at index i
                }
            }
            return -1; // key not found
        }

        public static void main(String[] args) {
            int[] numbers = {4, 7, 1, 9, 3};
            int target = 9;

            Searcher searcher = new Searcher();          // create object
            int index = searcher.linearSearch(numbers, target); // call default method

            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found.");
            }
        }
    }


