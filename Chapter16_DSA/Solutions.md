# Chapter 16 - Solutions

## Solution 1 - Maximum Number
```java
static int max(int[] arr) {
    int max = arr[0];
    for (int n : arr) {
        if (n > max) max = n;
    }
    return max;
}
```

## Solution 2 - Count Vowels
```java
static int countVowels(String text) {
    int count = 0;
    for (char c : text.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(c) >= 0) count++;
    }
    return count;
}
```

## Solution 3 - Reverse Array
```java
static void reverse(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
```

## Solution 4 - Linear Search
```java
static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}
```

## Solution 5 - Binary Search
```java
static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

## Solution 6 - Valid Parentheses
```java
static boolean isValid(String text) {
    Stack<Character> stack = new Stack<>();
    for (char c : text.toCharArray()) {
        if (c == '(') stack.push(c);
        else if (c == ')') {
            if (stack.isEmpty()) return false;
            stack.pop();
        }
    }
    return stack.isEmpty();
}
```

## Solution 7 - Queue Simulation
```java
Queue<String> queue = new LinkedList<>();
queue.add("Asha");
queue.add("Ravi");
System.out.println(queue.poll());
```

## Solution 8 - Recursion Factorial
```java
static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```

## Solution 9 - Bubble Sort
```java
static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

Nested loops make this `O(n^2)`.

## Solution 10 - BFS
```java
static void bfs(Map<Integer, List<Integer>> graph, int start) {
    Set<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {
        int node = queue.poll();
        System.out.println(node);
        for (int next : graph.getOrDefault(node, List.of())) {
            if (visited.add(next)) {
                queue.add(next);
            }
        }
    }
}
```

## Solution 11 - Word Frequency
```java
Map<String, Integer> freq = new HashMap<>();
for (String word : sentence.split("\\s+")) {
    freq.put(word, freq.getOrDefault(word, 0) + 1);
}
```

## Solution 12 - Top K Numbers
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
for (int n : nums) {
    pq.add(n);
    if (pq.size() > k) pq.poll();
}
```

