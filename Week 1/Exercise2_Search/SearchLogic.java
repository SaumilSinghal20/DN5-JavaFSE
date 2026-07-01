package Exercise2_Search;

public class SearchLogic {

    /**
     * Executes a straightforward linear search across an array of products.
     * Evaluates each element one by one from the start until a match is found.
     * 
     * Time Complexity: O(N) where N is the total count of products.
     */
    public static Product performLinearSearch(Product[] catalogArray, String searchId) {
        for (int i = 0; i < catalogArray.length; i++) {
            if (catalogArray[i].getProductId().equals(searchId)) {
                return catalogArray[i];
            }
        }
        return null; // Signals item wasn't located
    }

    /**
     * Executes a binary search. The array MUST be sorted prior to invoking this method.
     * This halves the search space iteratively.
     * 
     * Time Complexity: O(log N).
     */
    public static Product performBinarySearch(Product[] sortedCatalog, String searchId) {
        int leftIndex = 0;
        int rightIndex = sortedCatalog.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            Product middleElement = sortedCatalog[middleIndex];
            
            int comparisonValue = middleElement.getProductId().compareTo(searchId);

            if (comparisonValue == 0) {
                return middleElement; // Found the item
            } else if (comparisonValue < 0) {
                leftIndex = middleIndex + 1; // It must be in the upper region
            } else {
                rightIndex = middleIndex - 1; // It must be in the lower region
            }
        }
        return null;
    }
}
