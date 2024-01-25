# Enhanced `for` Loop for Arrays

With basic traversal skills under our belt from Unit 6 Section 2, we can start to think more critically about the design of our loops when working with arrays.

---

## The Need for Enhanced `for` Loops

For the purposes of our analysis, here is a default `int` array and a `for` loop that prints out each value within that array from the `NotesNeed1.java` file:

```java
int[] nums = new int[10];
for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]);
}
```

While this is fairly concise (already way shorter than manually programming a print statement for each index) and does the job well, it does seem a bit complex for what it's doing.

At a glance, it seems like the loop control variable `i` is a strict requirement, since it counts through our indices, and then in the print statement allows us to access that index. At the same time though, it would seem like the loop should be capable of just using each value of the array instead of doing it through the index. In that case, the variable `i` would just be the value stored in the array, changing with each iteration of the loop, so we could just print out `i` instead of `nums[i]`.

Fortunately, this is actually something we can do!

---

## Setting Up Enhanced `for` Loop

An **enhanced `for` loop** or **`for-each` loop** is a specialized `for` loop that specifically goes through the values of things like arrays. The concept is that the loop control variable will represent the actual value of each slot in the array, as opposed to an index like our earlier examples. Here is a sample from the `NotesForEach1.java` file that accomplishes the same result as our example above:

```java
int[] nums = new int[10];
for (int num : nums) {
    System.out.println(num);
}
```

Note the syntax here in the `for` loop header:
- We start now by declaring a variable of the type that the array stores. In this case, the `nums` array stores `int` values, so we declare an `int` variable `num`.
- After the variable declaration, we use a colon `:` (not a semicolon).
- After the colon, we write the array that we are going through, which in this case is `nums`.

These are commonly referred to as `for-each` loops as they are `for` loops that go through `each` element of an array, assigning them to the loop control variable. This is commonly phrased as "We do the following lines of code `for each` of the values of this array".

This is really convenient, as we no longer have to deal with the mess of indices, and will probably help to eliminate `off-by-one` errors in a lot of cases!

---

## Equivalence of `for` and Enhanced `for` Loops

Just like `for` and `while` loops are equivalent in the sense that anything done with one can be done with the other, the same is true for `for` and enhanced `for` loops. As an example, here is the average age algorithm we developed in Unit 6 Section 2 from the `NotesEquivalent1.java` file:

```java
int[] ages = new int[] {26, 25, 24, 26, 27, 32, 31, 26, 24, 25};
int sum = 0;
for (int i = 0; i < ages.length; i++) {
    sum += ages[i];
}
double average = (double) sum / ages.length;
System.out.println(average);
```

Here is what the same algorithm re-written with an enhanced `for` loop would look like from the `NotesEquivalent2.java` file:

```java
int[] ages = new int[] {26, 25, 24, 26, 27, 32, 31, 26, 24, 25};
int sum = 0;
for (int age : ages) {
    sum += age;
}
double average = (double) sum / ages.length;
System.out.println(average);
```

While the change in this problem is more subtle as there was more to it than the loop, this has simplified the `for` loop quite a bit, and made it a lot easier to read and understand.

---

## Drawbacks of Enhanced `for` Loops

If enhanced `for` loops are so great, why did we even bother learning how to do this without them? While they look like they are just generally superior, there are a couple of drawbacks of enhanced `for` loops that prevent them from being the only tool we need. Let's investigate!

### Not Modifying Elements

First, is the lack of ability to modify elements of the array. Let's look at this example from the `NotesDrawback1.java` file:

```java
int[] nums = new int[3];
        
// Print each value, increase it by 1, then print again.
for (int num : nums) {
    System.out.print(num + " -> ");
    num += 1;
    System.out.println(num);
}
System.out.println();

// Print each value
for (int num : nums) {
    System.out.println(num);
}
```

This produces the following output:

```
0 -> 1
0 -> 1
0 -> 1

0
0
0
```

At-a-glance, the first loop clearly seems to edit the value of `num` and increases it by `1`. The second loop though, seems to show that the values of the array didn't actually change. This is because the loop control variable is assigned a **copy** of the value from the array to work with, so editing it does not result in a change to the original value.

This, of course, works differently with reference types. If we were to make a `Person` array and update the ages of people, the actual ages would be changed because `Person` objects are mutable. This is because the loop control variable would copy the reference to the `Person` object (this is what the array itself stores), which gives it access to the object itself (being stored elsewhere in memory). On the other hand, with immutable objects like `String` objects, the original `String` objects are left untouched, resulting in the array remaining unchanged like our `int` example above. Here is an example of these in action from the `NotesDrawback2.java` file:

```java
Person[] people = new Person[] {new Person("Mr. G", 26), new Person("John", 25)};

// Print the people's ages, increase them by 1, and print them again
for (Person person : people) {
    System.out.print(person.getAge() + " -> ");
    person.setAge(person.getAge() + 1);
    System.out.println(person.getAge());
}
System.out.println();

// Print the people's ages
for (Person person : people) {
    System.out.println(person.getAge());
}
System.out.println();

String[] strings = new String[] {"Hello, World", "Hi everybody"};

// Print the strings, concatenate an exclamation point onto them, and print them again
for (String str : strings) {
    System.out.print(str + " -> ");
    str += "!";
    System.out.println(str);
}
System.out.println();

// Print the strings
for (String str : strings) {
    System.out.println(str);
}
```

This produces the following output:

```
26 -> 27
25 -> 26

27
26

Hello, World -> Hello, World!
Hi everybody -> Hi everybody!

Hello, World
Hi everybody
```

We can see that our analysis was correct: modifying mutable objects through the loop control variable persists, but modifying immutable objects through the loop control variable does not.

Regardless of the fact that we can modify mutable objects with an enhanced `for` loop, it is considered best practice to use a normal `for` or `while` loop when the goal of a loop is to modify the values in an array for clarity and consistency.

### Lack of Access to Index

The other drawback of using an enhanced `for` loop is the general lack of access to the index of each element. While this seems like a benefit at first glance as it makes the elements easier to work with, it can be a detriment depending on what you are trying to accomplish. A frequently asked question is something like "which index, if any, of the array holds the value _?". With an enhanced `for` loop, we could answer a simpler version of the question "Does the array contain the value _?", but we would have to make it more complicated to answer the same question. Here is an example showing this from the `NotesDrawback3.java` file:

```java
double[] nums = new double[] {0.12, 1.23, 2.34, 3.45, 4.56, 5.67, 6.78, 7.89, 8.90, 9.01};
double searchValue = 4.56;

// Enhanced for loop
boolean contains = false;
for (double num : nums) {
    if (num == searchValue) {
        contains = true;
    }
}
if (contains) {
    System.out.println("The array does contain the value " + searchValue);
} else {
    System.out.println("The array does not contain the value " + searchValue);
}

// Regular for loop
int index = -1;
for (int i = 0; i < nums.length; i++) {
    if (nums[i] == searchValue) {
        index = i;
    }
}
if (index >= 0) {
    System.out.println("The array has the value " + searchValue + " at index " + index);
} else {
    System.out.println("The array does not contain the value " + searchValue);
}

// Enhanced for loop
index = -1;
int i = 0;
for (double num : nums) {
    if (num == searchValue) {
        index = i;
    }
    i++;
}
if (index >= 0) {
    System.out.println("The array has the value " + searchValue + " at index " + index);
} else {
    System.out.println("The array does not contain the value " + searchValue);
}
```

This produces the following output:

```
The array does contain the value 4.56
The array has the value 4.56 at index 4
The array has the value 4.56 at index 4
```

In order for the enhanced `for` loop to accomplish what the regular `for` loop did, we had to introduce a new variable to keep track of the current index as we go through the elements with the enhanced `for` loop. While this works, it is now missing some safeguards provided by a regular `for` loop:
- Since we never actually use the tracking index `i` with the `nums` array, it is entirely possible for it to lose track somewhere if we do some math incorrectly.
- We never check if `i` has gotten too big, so it is possible that `i` is not a valid index for `nums`.

Overall, it is generally regarded as poor practice to utilize an enhanced `for` loop in those scenarios where the index plays an important role.

While there are more nuances to regular `for` loops and enhanced `for` loops with arrays, these are the two major aspects that give regular `for` loops their role when working with arrays.

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
