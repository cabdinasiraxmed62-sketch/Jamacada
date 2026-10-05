class Student {
    private String studentID;
    private String name;
    private int age;
    private String department;
    private double gpa;

    public static String universityName = "Jamhuriya University of Science & Technology (JUST)";
    private static int totalStudents = 0;

    public Student(String studentID, String name, int age, String department, double gpa) {
        this.studentID = studentID;
        this.name = name;
        setAge(age);
        this.department = department;
        setGpa(gpa);
        totalStudents++;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Fadlan geli da' sax ah! Waa la diiday da'da: " + age);
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Fadlan geli GPA sax ah (0.0 - 4.0)! Waa la diiday: " + gpa);
        }
    }

    public void displayStudentInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Jaamacadda: " + universityName);
        System.out.println("Ardayga ID: " + studentID);
        System.out.println("Magaca: " + name);
        System.out.println("Da'da: " + age);
        System.out.println("Waaxda (Department): " + department);
        System.out.println("GPA-ga: " + gpa);
        System.out.println("Xaaladda Imtixaanka: " + (hasPassed() ? "Waa Gudbay (Passed)" : "Waa Dhacay (Failed)"));
    }

    public boolean hasPassed() {
        return this.gpa >= 2.0;
    }

    public static void displayUniversitySummary() {
        System.out.println("========================================");
        System.out.println("Guud ahaan Jaamacadda: " + universityName);
        System.out.println("Tirada Guud ee Ardayda Diiwaangashan: " + totalStudents);
        System.out.println("========================================");
    }
}

public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("S1001", "Ahmed Ali", 21, "Computer Science", 3.7);
        Student s2 = new Student("S1002", "Fatima Omar", 20, "Software Engineering", 3.9);
        Student s3 = new Student("S1003", "Mohamed Farah", 22, "Information Technology", 1.8);
        Student s4 = new Student("S1004", "Aisha Abdi", 19, "Cyber Security", 3.2);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
        s4.displayStudentInfo();

        System.out.println();
        Student.displayUniversitySummary();
    }
}