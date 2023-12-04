
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

    ////  1 , 2 , 3 , 8
public  class  Group  {
    private long id;
    private String groupName;
    private String description;
    private String lessons;
    private String students;


    public Group() {
    }

    public Group(long id, String groupName, String description, String lessons, String students) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.lessons = lessons;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nGroup: " +
                "\n id=" + id +
                "\n groupName= " + groupName + '\'' +
                "\n description= " + description + '\'' +
                "\n lessons= " + lessons + '\'' +
                "\n students= " + students + '\'' +
                '}';
    }

    public static Group NewGroup(Group groups) {
        ////  1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Жаны группага ат жазыныз:  ");
        groups.setGroupName(scanner.nextLine());
        System.out.print("Группанын суроттомосун жазыныз:  ");
        groups.setDescription(scanner.nextLine());
         groups.setId(Myid.genratirId());
        System.out.println(STR."""
            GROUP:
                id    = \{groups.id}
               groupName = \{groups.getGroupName()}
               description = \{groups.getDescription()}
               lessons = []
               students =  []
                """);
        return groups;
    }
    public static Group[] ArrayGroup(Group[] groups, Group groupp) {
       Group[] newArray = Arrays.copyOf(groups,groups.length+1);
       newArray[newArray.length-1]=groupp;
       return newArray;
    }

    public static void NameGroup(Group[] groups){
        ///  2
        Scanner scanner = new Scanner(System.in);
        boolean loginFalse =false;
        while (!loginFalse) {
            System.out.print("Пиши  имя группы: ");
            String namee = scanner.nextLine();
            try {
                for (int i = 0; i < groups.length ; i++) {
                    if (namee.equalsIgnoreCase(groups[i].getGroupName())){
                        System.out.println(groups[i].toString());
                    }else {
                        throw new Exception("Групанын аты туура эмес!");
                    }
                }return;
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }



    }

    public static void UbdateGroup(Group[] groups){
        ////3
        Scanner scanner = new Scanner(System.in);

        System.out.print("Пиши  имя группы: ");
        String namee = scanner.nextLine();

        for (int i = 0; i < groups.length; i++) {
           if( namee.equalsIgnoreCase(groups[i].getGroupName())){
               System.out.println(" Жаны ат жазыныз: ");
               groups[i].setGroupName(scanner.nextLine());
               return;
           }
           if (i==groups.length-1){
               System.out.println("Чыккан жок");
           }

        }

    }

    public static void AllGroupStudent(Group[] groups,Student[] students){
        ////  8
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пиши  имя группы: ");
        String aaa = scanner.nextLine();

        for (int i = 0; i < groups.length; i++) {
            if (aaa.equalsIgnoreCase(groups[i].getGroupName())){
                System.out.println(groups[i].toString());
            }
        }



    }





}








//    String name;
//    List<Student> students;
//    // Конструктор, геттеры, сеттеры и другие методы
//
//    public Group() {
//    }
//
//    public Group(String name, List<Student> students) {
//        this.name = name;
//        this.students = students;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//
//    // Метод для добавления нового ученика в группу
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    // Метод для получения всех учеников в группе
//    public List<Student> getAllStudents() {
//        return students;
//    }
//
//    // Другие методы для работы с группой


