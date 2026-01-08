# MergeSortDemo 🔀

A simple and beginner-friendly Java project that demonstrates the **Merge Sort** algorithm.

This project shows how Merge Sort works using a divide-and-conquer approach.  
It includes a demo class to generate random arrays and a dedicated class that implements the Merge Sort algorithm.

---

## 📂 Project Structure
```
MergeSortDemo/
│
├── MergeSort.java
├── MergeSortDemo.java
└── README.md
```

---

## ✨ Features

- Implements the **Merge Sort** algorithm
- Sorts an array of integers in ascending order
- Generates random arrays for testing
- Prints the array before and after sorting
- Clean, readable, and beginner-friendly code

---

## 🧠 Algorithm Overview

**Merge Sort** is a divide-and-conquer algorithm that works by:

1. Dividing the array into two halves  
2. Recursively sorting each half  
3. Merging the two sorted halves into a single sorted array  

This process continues until the array is completely sorted.

---

## 🧩 How the Program Works

1. A random integer array is generated using `Random`
2. The original array is printed to the console
3. The `MergeSort.sort()` method is called
4. The array is:
   - Split into two halves
   - Recursively sorted
   - Merged back together in sorted order
5. The sorted array is printed

---

## ▶ Example Output

Array before sorting:
```
[7, 27, 13, 34, 59, 71, 69, 24, 8, 11, 10, 74, 4, 74, 67, 80, 58, 3, 57, 7]
```

Array after sorting:
```
[3, 4, 7, 7, 8, 10, 11, 13, 24, 27, 34, 57, 58, 59, 67, 69, 71, 74, 74, 80]
```

---

## 🎯 Learning Goals

This project is designed for beginners who want to practice:

- Java arrays
- Recursion
- Divide-and-conquer algorithms
- Method decomposition
- Working with multiple classes
- Understanding sorting algorithms step by step

---

## ⏱ Time and Space Complexity

| Complexity | Value |
|-----------|-------|
| Time      | O(n log n) |
| Space     | O(n) |

---

## 🚀 How to Run

1. Make sure you have **Java 8 or higher** installed.  
2. Compile the files:
   ```
   javac MergeSort.java MergeSortDemo.java
   ```
3. Run the program:
   ```
   java MergeSortDemo
