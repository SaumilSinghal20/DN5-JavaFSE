import java.util.Arrays;

public class SearchLogic {

    // Simple linear search going one by one
    public static Product doLinearSearch(Product[] prods, String targetId) {
        for (int i = 0; i < prods.length; i++) {
            if (prods[i].getProductId().equals(targetId)) {
                return prods[i]; // found it
            }
        }
        return null; // not found
    }

    // Binary search (array needs to be sorted beforehand)
    public static Product doBinarySearch(Product[] sortedProds, String targetId) {
        int left = 0;
        int right = sortedProds.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = sortedProds[mid].getProductId().compareTo(targetId);

            if (res == 0) {
                return sortedProds[mid];
            }
            if (res < 0) {
                left = mid + 1; // ignore left half
            } else {
                right = mid - 1; // ignore right half
            }
        }
        return null;
    }
}
