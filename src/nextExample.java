public class nextExample {

    // default access method
    int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid; // key found
            if (arr[mid] < key)
                left = mid + 1; // search right half
            else
                right = mid - 1; // search left half
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] sortedNumbers = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        Searcher searcher = new Searcher();
        int index = searcher.binarySearch(sortedNumbers, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}

