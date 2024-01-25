# Understanding Check

Fill in the `Course` class in `Course.java` with the following information:
- Instance variables to store period (1, 2, 3, or 4), day ("A" or "B"), name (ex. "Computer Science A"), level (ex. "College", "Honors", etc.), and grade (ex. 75).
- A constructor that has parameters for all instance variables.
- Accessor methods for each instance variables.
- A `toString` method that creates a result like `3A AP Computer Science A - 75` or `4B AP Computer Science A - 94` using the instance variables

In `Understanding.java`, use a `Scanner` object to ask the user how many courses they have in their schedule. Use the entered value to create an array of `Course` objects with that length.

For each element of the array, ask the user for information about a course to collect all the information needed to construct a new object. Once constructed, assign this new object to the array. When completed, the array should be filled with courses that align with the user's schedule.

Go through the course array and print out the user's schedule so that they know when their classes are.

Here is a sample output:

```
How many courses are you taking? 6

Course Period: 1
Course Day: A
Course Name: Data Science 1
Course Level: College
Course Grade: 100

Course Period: 2
Course Day: A
Course Name: Computer Science 1
Course Level: College
Course Grade: 95

Course Period: 3
Course Day: A
Course Name: Computer Science A
Course Level: AP
Course Grade: 85

Course Period: 1
Course Day: B
Course Name: Algebra 2
Course Level: College
Course Grade: 91

Course Period: 3
Course Day: B
Course Name: Computer Science 1
Course Level: College
Course Grade: 67

Course Period: 4
Course Day: B
Course Name: Computer Science A
Course Level: AP
Course Grade: 85

Here is your course schedule:
1A College Data Science 1 - 100
2A College Computer Science 1 - 95
3A AP Computer Science A - 85
1B College Algebra 2 - 91
3B College Computer Science 1 - 67
4B AP Computer Science A - 85
```

Once you have gotten to just warnings, save the Java file and commit and push your changes via GitHub Desktop.
