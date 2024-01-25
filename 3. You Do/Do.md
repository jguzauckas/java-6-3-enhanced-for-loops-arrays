# You Do

To get more comfortable with arrays that could be much larger, we are going to make some arrays with random information.

In the `Do.java` file, you are going to make the `assignRandomValues` method. This method is going to take a `double` array, and two `double` values as parameters. It will use the two `double` values as a `minimum` and `maximum` value respectively, and use `Math.random()` with those values to assign random decimal numbers between `minimum` and `maximum`, inclusive, to each element of the `double` array parameter.

Advanced question: Does this method need to return that `double` array?

Once that is done, you are going to make the `smoothValues` method. This method is going to take a `double` array as a parameter. It will make a new `int` array that is the same size as the `double` array parameter. It will use the `double` array parameter to assign rounded `int` values to the equivalent positions in the new `int` array, and return the resulting `int` array at the end.

You will notice that the `Do.java` file already has code written in the `main` method. This is to properly test the code that you write for your two methods, which should be within the same `Do` class.

Here is a sample of what the structure would look like when you are done:

```java
public class Do {
    public static void main(String[] args) {
        // Test code already written here.
    }

    public static ____ assignRandomValues(____) {
        // Your code for assignRandomValues
    }

    public static ____ smoothValues(____) {
        // Your code for smoothValues
    }
}
```

To help determine if you programmed it correctly, use the output (remember: this is using random numbers, so every output will be different). Here is a sample output:

```
Minimum: 26.677850576807007
Maximum: 71.99892441566872
After assignRandomValues:
Index 1871 is 67.71240147242983
Index 2630 is 68.62707087666212
Index 1905 is 33.647969924789706
Index 2768 is 29.8768560919049
Index 3250 is 51.564367212008335
After smoothValues:
Index 3207 was 39.19276122548418 and is now 39
Index 504 was 37.565780371932654 and is now 38
Index 2340 was 60.883313960877274 and is now 61
Index 894 was 58.45770184349959 and is now 58
Index 16 was 42.749745375495614 and is now 43
```

My verification of correctness would be that each of the assigned random `double` values is between the `minimum` and `maximum`, and then that each of the rounded `int` values are appropriately rounded from their original `double` values.

Once you have gotten to just warnings, save the Java file and commit and push your changes via GitHub Desktop.
