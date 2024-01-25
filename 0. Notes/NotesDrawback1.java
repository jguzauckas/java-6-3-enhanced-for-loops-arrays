public class NotesDrawback1 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        for (int num : nums) {
            System.out.print(num + " -> ");
            num += 1;
            System.out.println(num);
        }
        System.out.println();
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
