public class Check {
    public static void main (String[] args){
        double[] testArray = new double[(int)(Math.random() * 10000 + 1000)]; // Makes an array of random length from 1000 to 10999
        double minimum = (Math.random() * 100 + 10); // Makes the minimum a random number between 10 and 110
        double maximum = (Math.random() * (110 - minimum) + minimum); // Makes the maximum a random number between minimum and 111
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        double[] assignedValuesArray = assignRandomValues(testArray, minimum, maximum);
        System.out.println("After assignRandomValues:");
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * assignedValuesArray.length);
            System.out.println("Index " + randomIndex + " is " + assignedValuesArray[randomIndex]);
        }
        int[] smoothedValuesArray = smoothValues(assignedValuesArray);
        System.out.println("After smoothValues:");
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * smoothedValuesArray.length);
            System.out.println("Index " + randomIndex + " was " + assignedValuesArray[randomIndex] + " and is now " + smoothedValuesArray[randomIndex]);
        }
    }

    public static double[] assignRandomValues(double[] arr, double min, double max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * (max - min) + min;
        }
        return arr;
    }

    public static int[] smoothValues(double[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (int) (arr[i] + 0.5);
        }
        return newArr;
    }
}
