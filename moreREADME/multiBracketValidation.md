# Challenge Summary
<!-- Short summary or background information -->
#### [Code](/Data-Structures/stacksandqueues/src/main/java/stacksandqueues/utilities/MultiBracketValidation.java) | [Tests](/Data-Structures/stacksandqueues/src/test/java/stacksandqueues/utilities/MultiBracketValidationTest.java)

## Challenge Description
<!-- Description of the challenge -->
* On your main file, create a method `public static boolean multiBracketValidation(String input)`
* Your method should take a `String` as its only argument, and should return a `boolean` representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

  1. Round Brackets : `()`
  2. Square Brackets : `[]`
  3. Curly Brackets : `{}`


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I chose to add two arraylists and a stack. I have an arraylist of opening brackets, an arraylist of closing brackets, and a stack for valid closing brackets. 
1. Break the string into individual characters
2. loop through the characters
3. if the character is contained in the opening brackets arraylist, add the corresponding closing bracket (same index in the closing brackets arraylist) to the valid brackets stack
4. if the character is contained in the closing bracket arraylist, pop from the valid closing bracket stack.
    1. if the two brackets match, great! that was a valid bracket pair. Keep going.
    2. if the two brackets don't match, this is not a valid string of brackets, return false
5. after the loop, make sure to check that we don't have extra brackets needing to be closed.
    1. if there's nothing in the valid closing bracket stack, great! return true
    2. if there is something in the stack, this is not a valid string of brackets. return false

#### Big O Analysis
Time: `O(n)`
Space: `O(n)` for the character array


## Solution
<!-- Embedded whiteboard image -->
![whiteboard](/assets/bracketValidation.jpg)
