import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Administration admin = new Administration("Magnus", "050697-1849", 25, 23000, 5);
        Instructor instructor = new Instructor("Moritz", "133713-1337", 37, 37 * 456);
        Member member = new Member("Marvin", "121193-4327", true);
        Member member2 = new Member("Asger", "021094-0321", false);

        ArrayList<Object> employeeList = new ArrayList<>();
        employeeList.add(admin);
        employeeList.add(instructor);

        ArrayList<Object> memberList = new ArrayList<>();
        memberList.add(member);
        memberList.add(member2);

        System.out.println("What list do you want? 1 for Employees, 2 for Members, 3 for Employees & members");
        String listChoice = scanner.nextLine();

        if (listChoice.equals("1")) {
            System.out.println("Employees");
            System.out.println("---------");
            for (int i = 0; i < employeeList.size(); i++) {
                System.out.println(employeeList.get(i));
            }
        } else if (listChoice.equals("2")) {
            System.out.println("Members");
            System.out.println("---------");
            for (int i = 0; i < memberList.size(); i++) {
                System.out.println(memberList.get(i));
            }
        } else if (listChoice.equals("3")) {
            System.out.println("Employees & Members");
            System.out.println("---------");
            for (int i = 0; i < employeeList.size(); i++) {
                System.out.println(employeeList.get(i));
            }
            for (int i = 0; i < memberList.size(); i++) {
                System.out.println(memberList.get(i));
            }
        }
    }
}
