public class NotesDrawback2 {
    public static void main(String[] args) {
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
    }
}
