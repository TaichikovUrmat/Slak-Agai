
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
//1.Добавить новую группу
// 2. Получить группу по имени
// 3.Обновить имя группы.
// 4.Получить все группы
// 5.Добавьте нового ученика в группу.
// 6.Обновите студент 7.Найти ученика по имени
// 8. Соберите всех учеников по группам.
// 9. Получите урок всего ученика.
// 10.Удалить студента по электронной почте
// 11. Добавить новый урок в группу.
// 12.Получить урок по имени
// 13. Получить весь урок по названию группы.
// 14.Удалить урок по ID
// 15.Удалить группу по имени

public class Main {
    public static void main(String[] args) {
        Register[] registers = new Register[0];


        Group[] group = new Group[0];
        Student[] students = new Student[0];
        Lessons[] lessons = new Lessons[0];

        Group group1 = new Group();
        Student student = new Student();


        System.out.println("Текущее время: " + LocalTime.now() + "  " + LocalDate.now());

        boolean isTrue = false;
        while (true) {
            if (!isTrue) {
                System.out.println("""
                        Катталган болсонуз 1  басыныз 
                        пароль унутуп калып озгортуу учун 2 басыныз!
                        """);
                System.out.print("Выбирите число----->  ");
            } else {
                System.out.println("""
                         ДОБРО пожаловать!                          
                        ********************************
                                               
                        //1.Добавить новую группу
                        // 2. Получить группу по имени
                        // 3.Обновить имя группы.
                        // 4.Получить все группы
                        // 5.Добавьте нового ученика в группу.
                        // 6.Обновите студент 
                           7.  Найти ученика по имени
                        // 8. Соберите всех учеников по группам.
                        // 9. Получите урок всего ученика.
                        // 10.Удалить студента по электронной почте
                        // 11. Добавить новый урок в группу.
                        // 12.Получить урок по имени
                        // 13. Получить весь урок по названию группы.
                        // 14.Удалить урок по ID
                        // 15.Удалить группу по имени             
                        """);
                System.out.print("Выбирите число----->  ");
            }
            if (!isTrue) {
                switch (new Scanner(System.in).nextLine()) {
                    case "1" -> {
                        isTrue = true;
                        Register ree = Register.UserRegister(new Register());
                        registers = Register.addUserToArray(registers, ree);
                        System.out.println();
                    }
                    case "2" -> {
                        System.out.println("sd");
                    }
                }
            } else {
                switch (new Scanner(System.in).nextLine()) {
                    case "1" -> {
                        Group ggg = Group.NewGroup(new Group());
                        group = Group.ArrayGroup(group, ggg);
                    }
                    case "2" -> {
                        Group.NameGroup(group);
                    }
                    case "3" -> {

                        Group.UbdateGroup(group);
                    }
                    case "4" -> {
                        System.out.println("4");
                        // Операция 4: Получить все группы
                        for (int j = 0; j < group.length; j++) {
                            System.out.println(group[j]);
                        }
                    }
                    case "5" -> {
                        Student ree = Student.AddStudent(group,new Student());
                        students = Student.ArrayStudent(students,ree);
                    }
                    case "6" -> {
                        Student.UbdateStudent(student, group);
                    }
                    case "7" -> {
                        Student.FindStudent(group, students);
                    }
                    case "8" -> {
                        Group.AllGroupStudent(group,students);
                    }
                    case "9" -> {
                        Lessons.AllStudentLessons(students,group);
                    }
                    case "10" -> {


                    }
                    case "11" -> {
                        Group ggg = Lessons.AddLesson(group,new Group());
                        group = Lessons.ArrayLessons(group,ggg);
                    }
                    case "12" -> {
                        Lessons.AllGroupLessons(group);
                    }
                    case "13" -> {
                        Lessons.AllLessons(group);
                    }
                    case "14" -> {
                        System.out.println("14");
                    }
                    case "15" -> {
                        Delete.Delete(group,students);
                    }
                    case "20"->{
                        System.out.println(Arrays.toString(students));

                    }

                }
            }

        }
    }
}


//

//

//


//        }

