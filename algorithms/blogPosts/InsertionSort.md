# Blog Notes: Insertion Sort
Insertion sort is an algorithm which will sort an array in ascending order. This sort method is not the quickest option available, but works very well if you think your data might be mostly sorted already and just needs a few corrections. 

On average and in the worst case, insertion sort has a runtime of O(n^2). However, in the best case scenario (a set of already sorted data) the runtime will be O(n), which is a good best-case runtime compared to sorting methods that run the same speed no matter the given input.


## Learning Objectives
* What is insertion sort?
* How does insertion sort work?
* When should you use it?


## Diagram
![Insertion sort gif](https://thumbs.gfycat.com/DenseBaggyIbis-size_restricted.gif)

## Algorithm
**will be added later**

## Pseudocode
```
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```

## Readings and References
#### Watch
* Video

#### Read
* Article 1
* Article 2

#### Bookmark
* Website