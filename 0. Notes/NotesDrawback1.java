public class NotesDrawback1 {
    public static void main(String[] args) {
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
    }
}
