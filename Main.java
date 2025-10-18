public class Main {
    public static void main(String[] args) {
        // Task 1
        Person person = new Person("Ali", 25);
        person.displayInfo();

        // Task 2
        person.setName("Ali");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Task 3
        Student student = new Student("Ali", 25, "S101");
        student.displayInfo();

        // Task 4
        Person polyStudent = new Student("Ali", 25, "S101");
        polyStudent.displayInfo();
    }
}
