# Understanding Check

It can often be frustrating that arrays can only store one type of data, but there are two ways that we typically have as programmers to get around this:
- **Paired arrays** - This is where we make two or more arrays that store different data (can, but does not have to be, different types) that are all the same length. We assign these values such that values at the same index in the different arrays are related. For example, let's say I wanted to store `name` and `age`. I could do this with `String` and `int` arrays that are paired, like this example:

```java
String[] names = new String[] {"John", "Will", "Owen"};
int[] ages = new int[] {25, 26, 23};
```

In this example, index `0` holds `"John"` in `names` and `25` in `ages`, which are paired values, so John's age is 25. Similarly, `"Will"` is `26` and `"Owen"` is `23`.

- **Custom object arrays** - If there pieces of information belong together, another solution is to make a custom class for that information to bundle it together. Then you can just make a single array of the information, and everything that is related is stored in the same object! With our example above, if we had a `Person` class, we could have done this instead:

```java
Person[] friends = new Person[] {new Person("John", 25), new person("Will", 26), new Person("Owen", 23)};
```

In `Understanding.java`, you are going to try both of these methods to save some information and print out the relationships. You are going to store your school courses and their grades from Quarter 2. Start by making paired arrays for your course names and grades, and use loops to print out pairs like `"AP Computer Science was a 78"`. Then, write a basic class called `Course` in the `Course.java` file and underneath your other work in `Understanding.java`, write this alternative way of doing it with an array of `Course` objects. Ultimately, your code should print out the pairs twice, once with paired arrays, and once with object arrays. The two copies of the output should match.

Once you have gotten to just warnings, save the Java file and commit and push your changes via GitHub Desktop.
