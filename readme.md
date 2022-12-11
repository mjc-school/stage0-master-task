# Master task

**This task is to be completed if you are already familiar with topics covered in stage 0 and want to skip it.**

## OOP

#### Task 1

1. Work with class `Animal`.
2. Provide it with 3 private fields - **color**(`String`), **numberOfPaws**(`int`), **hasFur**(`boolean`).
3. Add **constructor with full parameters**. *Save the parameter order as it is listed in a second paragraph.*
4. Add a methods `getDescription()`, witch would use class fields and return a string with such pattern **"This animal
   is mostly `(color)`. It has `(numberOfPaws)` paws and `('a'/'no' -> depends on value of hasFur)` fur."**
5. **(Optional)**  *In the method `getDescription()` change the word **'paw'** depending on the `numberOfPaws`: number
   of paws is 1 -> 'paw', number of paws is different from 1 -> 'paws'.*

#### Task 2

1. Work with classes `Dog` and `Bird`. **Extend** them with the help of `Animal`.
2. Create **no-args constructor** for each where provide all necessary information for `Animal` constructor by `super()`
   method:
   * for `Dog`: `color` - *brown*, `numberOfPaws` - *4*, `hasFur` - *true*;
   * for `Bird`: `color` - *blue*, `numberOfPaws` - *2*, `hasFur` - *false*.
3. Override `getDescription()` method for class `Bird`: add one more sentence to the description. The result must be **"
   This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly."**
4. **(Optional)**  *Create an object of each class and call `getDescription()` method for both of them. Try to explain
   the output results.*

## Lang Syntax

#### Task 1. Numbers reverter.

Implement the method `revert` that takes a three-digit number and prints its digits in reverse order.

Example

```
Input:
489
Output:
984
```

The class for writing a solution

```java
public class NumberReverter {
    public void revert(int number) {
    }
}
```

#### Task 2. Digits sum calculator.

Implement the method `calculateSum` that takes a four-digit number and prints a sum of its digits.

Example

```
Input:
3471
Output:
15
```

The class for writing a solution

```java
public class DigitsSumCalculator {
    public void calculateSum(int number) {
    }
}
```

## Conditions

#### Task 1. Season determiner.

Implement the method `tellTheSeason` that takes a number of a month and prints a season name if a month number is valid;
otherwise the method prints `Wrong month number`.

Example

```
Input:
1
Output:
Winter
```

Example

```
Input:
0
Output:
Wrong month number
```

The class for writing a solution

```java
public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
    }
}
```

#### Task 2. Triangle sides validator.

Implement the method `validate` that takes three side lengths and prints `this is a valid triangle` if a triangle
with these sides exists, otherwise - `it's not a triangle`.

Example

```
Input:
1 4 4
Output:
this is a valid triangle
```

The class for writing a solution

```java
public class TriangleValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
    }
}
```

#### Task 3. Days in a month.

Implement the `printDays` method that takes a year and month, validates passed values, and prints the number of days
in this month considering a leap year.

If a year is negative or a month is not in a range 1 through 12 prints `invalid date`.

Example

```
Input:
2000 2
Output:
29
```

The class for writing a solution

```java
public class DaysInMonth {
    public void printDays(int year, int month) {

    }
}
```

#### Task 4. Integer divider.

Implement the method `printCompletelyDivided` that takes two integers and prints one of the following statements:
1. `can be divided completely`, when a quotient, result of integer division of `dividend` by `divisor`,
multiplied by `divisor` is equal to `dividend`;
2. `cannot be divided completely`, when the condition from the first paragraph is not met;
3. `division by zero`, when a `divider` is equal to zero;

Example

```
Input:
15 5
Output:
can be divided completely
```

The class for writing a solution

```java
public class IntegerDivider {
   public void printCompletelyDivided(int dividend, int divider) {
   }
}
```

#### Task 5. Coordinate Pane.

Implement the `printQuadrant` method that takes two integer coordinates of a point in a
two-dimensional Cartesian system and prints a quadrant in which this point lies
(`first`, `second`, `third`, `fourth` or `zero`).

Example

```
Input:
-1 1
Output:
second
```

The class for writing a solution

```java
public class CoordinatePane {
   public void printQuadrant(int x, int y) {
   }
}
```

#### Task 6. Bitwise values swap.

Implement the `swap` method that takes two integer parameters, and swaps its values (with help of bitwise operation
without creating new variables or objects), and then outputs them out.

Example

```
Input:
6 7
Output:
7
6
```

The class for writing a solution

```java
public class BitwiseValuesSwap {
    public void swap(int first, int second) {
    }
}
```

## LOOPS

#### Task 1. Multiplication table

Implement the `printTable` method that takes a number and prints multiplication operations of numbers 1 through 10
by the passed number.

Example

```
Input:
3
Output:
1 x 3 = 3
2 x 3 = 6
3 x 3 = 9
4 x 3 = 12
5 x 3 = 15
6 x 3 = 18
7 x 3 = 21
8 x 3 = 24
9 x 3 = 27
10 x 3 = 30
```

The class for writing a solution

```java
public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
    }
}
```

#### Task 2. Pyramid

Implement the `printPyramid` method that takes the height of a pyramid and prints the pyramid from numbers like in the
picture and according to the passed height.

Example

```
Input:
6
Output:
     1
    212
   32123
  4321234
 543212345
65432123456
```

The class for writing a solution

```java
public class Pyramid {
    public void printPyramid(int cathetusLength) {
    
    }

    public static void main(String[] args) {
      new Pyramid().printPyramid(7);
    }
}
```

:![img.png](https://github.com/mjc-school/MJC-School/blob/main/stage%20%230/module%20%234.%20Java%20Fundamentals/lesson%20%232.%20FOR%20statement/final-task/img/img.png?raw=true)

#### Task 3. Power

Implement the `printPower` method, using a for loop, that takes base and power as integers and prints
a raised base to the power.

Example

```
Input:
2 3
Output:
8
```

The class for writing a solution

```java
public class Power {
    public void printPower(int numberToPrint, int power) {
    
    }

    public static void main(String[] args) {
      new Power().printPower(10, 3);
    }
}
```

#### Task 4. Half-Pyramid

Implement the `printHalfPyramid` method that takes the height of a pyramid and prints the pyramid using
asterisk symbols like in the picture and according to the passed height.

Example

```
Input:
8
Output:
       *
      **
     ***
    ****
   *****
  ******
 *******
********
```

The class for writing a solution

```java
public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
    
    }

    public static void main(String[] args) {
      new HalfPyramid().printHalfPyramid(8);
    }
}
```

:![img_1.png](https://github.com/mjc-school/MJC-School/blob/main/stage%20%230/module%20%234.%20Java%20Fundamentals/lesson%20%232.%20FOR%20statement/final-task/img/img_1.png?raw=true)

## Algorithm and Arrays

#### Task 1. Algorithm Complexity

Tasks for assessing the algorithm complexity. The following are the ratios of the constants with the BigO estimate:

```
Complexity.O_LOG_N       -> O(log N)
Complexity.O_N_2         -> O(log N^2)
Complexity.O_FACTORIAL_N -> O(!N)
Complexity.O_2_N         -> O(2 * N)
Complexity.O_N_LOG_N     -> O(N * log N)
Complexity.O_1           -> O(1)
Complexity.O_N           -> O(N)
```

#### Subtasks:

* `badLinerSearch `- return the linear search complexity if the element you are looking for is at the end of the array.
* `arrayIndexItemAccess` - return the complexity of accessing an array element by index.
* `binarySorting` - return the complexity of a binary search.
* `twoCycleSorting` - return the complexity of the Two Cycle Sorting algorithm.

#### Task 2. Arrays Tasks

Here are the tasks for working with the arrays.
The usage of any additional packages (such as` java.util.*`) is forbidden.

### Subtasks:

* `seasonsArray` - return a `String[]` array that will list all the seasons of the year, starting with winter.
* `generateNumbers` - generate an `int[]` array of consecutive positive integers starting at 1 of the given length (
  length parameter > 0)

```
Example:
length = 1  -> [1]
length = 3  -> [1, 2, 3]
length = 5  -> [1, 2, 3, 4, 5]
```

* `totalSum` - find the sum of all elements of the `int[]` array.

```
Example:
arr = [1, 3, 5]   -> sum = 9
arr = [5, -3, -4] -> sum = -2
````

* `findIndexOfNumber` - return the index of the first occurrence of `number` in the `arr` array. If there is no such
  element in the array, return `-1`.

```
Example:
arr = [99, -7, 102], number = -7    ->   2
arr = [5, -3, -4],   number = 10    ->  -1
````

* `reverseArray` - return the new `String[]` array obtained from the arr array by reversing the order of the elements.

```
Example:
arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
````

* `getOnlyPositiveNumbers` - return new `int[]` array obtained from `arr int[]` array by choosing positive numbers only.
  P.S. 0 is not a positive number

```
Example:
arr = [1,-2, 3]      -> [1, 3]
arr = [-1, -2, -3]   -> []
arr = [1, 2]         -> [1, 2]
````

* **[OPTIONAL]** `sortRaggedArray` - return a sorted, ragged, two-dimensional `int[][]` array following these rules:
    * incoming one-dimensional arrays must be arranged in ascending order of their length;
    * numbers in all one-dimensional arrays must be in ascending order.

```
Example:
arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
arr = [[5, 4], [7]]       -> [[7], [4, 5]]
````
