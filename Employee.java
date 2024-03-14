import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esal;
 
    void readme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        ename = sc.nextLine();
        System.out.println("Enter employee number: ");
        eno = sc.nextInt();
        //sca.nextLine(); // Consume newline character
        System.out.print("Enter employee salary: ");
        esal = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("Employee number: " + eno);
        System.out.println("Employee name: " + ename);
        System.out.println("Employee salary: " + esal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        
        Employee[] employees = new Employee[n]; // Array to store employee objects
        
        // Accepting information of n employees
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            System.out.println("\nEnter details of employee " + (i + 1) + ":");
            employees[i].readme();
        }
        
        // Displaying information of all employees
        System.out.println("\nDetails of all employees:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            employees[i].displayDetails();
        }
        
        // Searching for an employee by eno
        System.out.print("\nEnter the employee number to search: ");
        int searchEno = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eno == searchEno) {
                System.out.println("\nEmployee found:");
                employees[i].displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nEmployee with eno " + searchEno + " not found.");
        }
    }
}