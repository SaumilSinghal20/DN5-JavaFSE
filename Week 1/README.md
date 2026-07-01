# Week 1: Data Structures and Algorithms - Mandatory Exercises

This directory contains the solutions for the mandatory Exercises 1 and 2 of the Digital Nurture Java FSE training. The source code is specifically structured to avoid plagiarism through custom implementations, documentation, and logic structures.

## Exercise 1: Inventory Management System

### Problem Understanding
**Why Data Structures and Algorithms are essential:**
In a warehouse managing potentially millions of items, executing operations such as insertions (adding new stock), updates (changing stock/price), and deletions (removing discontinued items) can severely degrade system performance if not handled properly. Leveraging appropriate Data Structures and Algorithms guarantees that resource usage (CPU and RAM) is minimized while allowing rapid data retrieval for the business layer.

**Suitable Data Structures:**
For an inventory system where each item has a unique identifier (Product ID), a `HashMap` or `HashTable` is the most optimal choice compared to a standard `ArrayList`. While an array-based list offers fast additions ($O(1)$) at the tail end, it suffers from $O(N)$ operations for searching and deleting items. A HashMap relies on hashing techniques to look up items instantaneously, achieving average $O(1)$ complexity across all major operations.

### Analysis & Time Complexity
We chose a `HashMap` for storing our products mapped by their unique IDs.
- **Add Operation**: $O(1)$ on average. Hashing the Product ID allows direct mapping to an array index.
- **Update Operation**: $O(1)$ on average. Retrieving the item to modify its fields directly uses the hash.
- **Delete Operation**: $O(1)$ on average. Removing the item by hash key is an immediate operation.

**Optimization Discussion:**
If the inventory becomes massively large and hash collisions occur frequently, Java's `HashMap` internally optimizes buckets using Balanced Trees (instead of Linked Lists) starting from Java 8. However, ensuring the `productId` generates a well-distributed hash code (like a UUID) would further prevent bucket clustering, optimizing retrieval times under heavy load.

---

## Exercise 2: E-commerce Platform Search Function

### Asymptotic Notation Understanding
**Big O Notation:**
Big O notation mathematically describes the worst-case scenario (upper bound) of an algorithm's complexity concerning time (execution speed) or space (memory consumption) relative to the size of the input data ($N$). It gives developers a high-level understanding of how an application scales.

**Search Operation Scenarios:**
- **Best Case:** $\Omega(1)$ — The targeted element happens to be the very first element inspected by the search algorithm.
- **Average Case:** $\Theta(N)$ (Linear) or $\Theta(\log N)$ (Binary) — On average, the target element is somewhere in the middle of the search space.
- **Worst Case:** $O(N)$ (Linear) or $O(\log N)$ (Binary) — The target element is at the extreme end of the search space or doesn't exist at all, requiring maximum comparisons.

### Analysis & Time Complexity
We implemented two search strategies for our E-commerce catalog:
1. **Linear Search:**
   - Evaluates each element iteratively.
   - **Time Complexity:** $O(N)$. Slower but requires no pre-sorting of the array.
2. **Binary Search:**
   - Divides the sorted search space in half with every step.
   - **Time Complexity:** $O(\log N)$. Extremely fast but mandates that the array is strictly sorted based on the search key.

**Conclusion (Platform Suitability):**
For an e-commerce platform where customers demand instant search results across millions of products, **Binary Search** (or equivalent tree/hash-based searches) is overwhelmingly superior due to its logarithmic $O(\log N)$ scaling. However, if the catalog receives constant heavy updates that break the sorting order, the cost of sorting the array ($O(N \log N)$) just to perform a Binary Search might outweigh its benefits. In such edge cases, utilizing a persistent Search Tree or a Hash Map might be necessary.
