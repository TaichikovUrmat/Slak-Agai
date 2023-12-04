import java.util.Scanner;

public class Delete {

    public static void Delete(Group[] groups,Student[] students){
          /////////// 15
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пиши имя группу: ");
        String email = scanner.nextLine();

        int indexToDelete = 0;
        for (int i = 0; i < groups.length; i++) {
            if (email.equalsIgnoreCase(groups[i].getGroupName())) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete != -1) {
            // Создание нового массива без удаленного студента
            Group[] newStudentsArray = new Group[groups.length - 1];
            System.arraycopy(groups, 0, newStudentsArray, 0, indexToDelete);
            System.arraycopy(groups, indexToDelete + 1, newStudentsArray, indexToDelete, groups.length - indexToDelete - 1);
            // Присвоение нового массива в переменную students
           groups = newStudentsArray;
            System.out.println("Студент удален!");
        } else {
            System.out.println("Студент с указанным email не найден.");
        }








    }

}
