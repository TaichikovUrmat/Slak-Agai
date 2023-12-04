import java.util.Arrays;
import java.util.Scanner;

public class Student {

   ////  5, 6, 7,
    private String firsName;
    private String lastName;
    private String email;
    private String password;
    private String gender;


    public Student() {
    }

    public Student(String firsName, String lastName, String email, String password, String gender) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }


    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student" +
                "\n firsName= " + firsName + '\'' +
                "\n lastName= " + lastName + '\'' +
                "\n  email= " + email + '\'' +
                "\n  password= " + password + '\'' +
                "\n  gender= " + gender + '\'';

    }

    public static void UbdateStudent(Student students, Group[] groups) {
        ///// 6
        Scanner scanner = new Scanner(System.in);

        System.out.print("Пиши  имя группы: ");
        String namee = scanner.nextLine();

        for (int i = 0; i < groups.length; i++) {
            if (namee.equalsIgnoreCase(groups[i].getGroupName())) {
                System.out.print("Имя студента: ");
                String name = scanner.nextLine();
                for (int j = 0; j < groups.length; j++) {
                    if (name.equalsIgnoreCase(groups[j].getStudents())) {
                        System.out.print("Новый имя студента: ");
                        groups[j].setStudents(scanner.nextLine());
                        return;
                    }
                    if (j == groups.length-1){
                        System.out.println("Чыккан жок");
                    }
                }
                    if (i == groups.length - 1) {
                        System.out.println("Чыккан жок");
                    }

            }
        }
    }

    public static void FindStudent(Group[] groups, Student[] students) {
        //// 7

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Имя студента: ");
        String name = scanner.nextLine();
        for (int i = 0; i < groups.length; i++) {
            if (name.equalsIgnoreCase(groups[i].getStudents())) {
                System.out.println(groups[i].toString());
            }

        }

    }

    public static Student AddStudent(Group[] group, Student student1) {
        ///// 5
        Scanner scanner1 = new Scanner(System.in);

//        Student student1 = new Student();
        System.out.print("Пиши  имя группыы: ");
        String namee = scanner1.nextLine();

        for (int i = 0; i < group.length; i++) {
            if (namee.equalsIgnoreCase(group[i].getGroupName())) {
                System.out.print("Student name: ");
                group[i].setStudents(scanner1.nextLine());
                System.out.print("Фамиля студента: ");
                student1.setLastName(scanner1.nextLine());
                System.out.print("email: ");
                student1.setEmail(scanner1.nextLine());
                System.out.print(" password: ");
                student1.setPassword(scanner1.nextLine());
                System.out.print("Жынысын жазыныз(male/female): ");
                student1.setGender(scanner1.nextLine());
                System.out.println();
//                group[i].setId(Myid.genratirId());
                System.out.println(STR. """
                          GROUP:
                          id   = \{ Myid.genratirId2() }
                         firsName= \{ group[i].getStudents() }
                         lastName= \{ student1.getLastName() }
                         email= " \{ student1.getEmail() }
                         password= \{ student1.getPassword() }
                         gender=  \{ student1.getGender() }

                        """ );

                return student1;
            }
            if (i == group.length - 1) {
                System.err.println("Чыккан жок");
            }
        }
        return student1;
    }

    public static Student[] ArrayStudent(Student[] groups, Student student) {
        Student[] newArray = Arrays.copyOf(groups, groups.length + 1);
        newArray[newArray.length - 1] = student;
        return newArray;
    }

//    public static void deleteStudent(Group[] groups, Student[] students) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Пиши группу: ");
//        String emeil = scanner.nextLine();
//        for (int i = 0; i < groups.length; i++) {
//
//
//        }
//    }
}



