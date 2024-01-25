public class NotesDrawback3 {
    public static void main(String[] args) {
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
    }
}
