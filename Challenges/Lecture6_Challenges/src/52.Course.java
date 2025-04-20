class Course {

    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudent;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudent = new String[maxCapacity];

    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudent[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student Removed");
        enrollments--;
    }
}
