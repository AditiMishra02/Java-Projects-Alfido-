public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // Create new students
        sms.addStudent(new Student(1, "Riya", "A"));
        sms.addStudent(new Student(2, "Rohit", "B"));
        sms.addStudent(new Student(3, "Deepesh", "B+"));
        sms.addStudent(new Student(4, "Preeti", "A-"));

        // Read and display students
        System.out.println("Students List:");
        sms.viewStudents();

        // Update student's details
        sms.updateStudent(2, "Diya", "A+");
        System.out.println("\nAfter updating Bob's details:");
        sms.viewStudents();

        // Search for a student by name
        System.out.println("\nSearching for Ramesh:");
        Student foundStudent = sms.searchStudentByName("Ramesh");
        System.out.println(foundStudent != null ? foundStudent : "Student not found.");

        // Delete a student
        sms.deleteStudent(1);
        System.out.println("\nAfter deleting Riya:");
        sms.viewStudents();
    }
}