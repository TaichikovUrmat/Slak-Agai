import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;
import java.util.Scanner;

public class  Register   {
    Register [] registers = new Register[0];
    private String email;
    private String password;

    public Register() {
    }

    public Register(String email, String password) {
        this.email = email;
        this.password = password;
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

    public static Register UserRegister(Register registers){
        Scanner scanner = new Scanner(System.in);
        registers.setEmail("@urmat");
        registers.setPassword("1234");

        boolean loginFalse =false;
        while (!loginFalse){
            System.out.print("email жазыныз: " );
            String login = scanner.nextLine();

            System.out.print("password жазыныз :");
            String password = scanner.nextLine();
            try {
                if (registers.getEmail().equalsIgnoreCase(login) && registers.getPassword().equalsIgnoreCase(password)){
                    loginFalse = true;
                    return registers;
                }else {
                    throw  new Exception("Email же параль туура эмес!");
                }
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }
             return registers;
    }
       public static Register[] addUserToArray(Register[] registers, Register registerr) {
        Register[] newArray = Arrays.copyOf(registers, registers.length + 1);
        newArray[newArray.length - 1] = registerr;
        return newArray;
    }

    @Override
    public String toString() {
        return "Register{" +
                "registers=" + Arrays.toString(registers) +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
