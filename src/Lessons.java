import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lessons {

     /// 11 , 9 , 12 , 13

    public static Group AddLesson(Group[] group,Group groupp){
      /////   11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пиши  имя группы: ");
        String lesson = scanner.nextLine();

        for (int i = 0; i < group.length; i++) {
            if (lesson.equalsIgnoreCase(group[i].getGroupName())){
                System.out.print(" Пишите тема урока: ");
                group[i].setLessons(scanner.nextLine());
                return group[i];
            }
            if (i==group.length-1){
                System.out.println("Чыккан жок!!!!! ");
            }
        }
        return groupp;
    }

    public static Group[] ArrayLessons(Group[] groups,Group group) {
        Group[] newArray = Arrays.copyOf(groups,groups.length+1);
        newArray[newArray.length-1]=group;
        return newArray;
    }


    public static void  AllStudentLessons(Student[] students,Group[] group){
           //////////  9
           Scanner scanner = new Scanner(System.in);
        System.out.print("Пишите email студента: ");
        String name = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
                if (name.equalsIgnoreCase(students[i].getEmail())) {
                    for (int j = 0; j < group.length; j++) {
                        System.out.println(group[j].getLessons());
                    }
                    return;
                }
                if (i == students.length - 1) {
                    System.out.println("Invalit!!!!!!!");
                }
            }
        }


    public static void AllGroupLessons(Group[] groups){
           //// 12
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пиши имя студента :");
        String student = scanner.nextLine();
        for (int i = 0; i < groups.length; i++) {
            if (student.equalsIgnoreCase(groups[i].getStudents())){
                System.out.println(groups[i].getLessons());
            }

        }

    }

    public static void AllLessons(Group[] groups){
        ////    13. Получить весь урок по названию группы.

           Scanner scanner = new Scanner(System.in);
        System.out.print("Пиши имя груп: ");
        String lessons = scanner.nextLine();
        for (int i = 0; i < groups.length; i++) {
            if (lessons.equalsIgnoreCase(groups[i].getGroupName())){
                System.out.println(groups[i].getLessons().toString());
            }

        }
    }

}
