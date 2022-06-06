public class EmployeeWages {
    public static void main(String[] args) {
        int ispresent = 1;

        System.out.println("Welcome to the Employee Wages");
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == ispresent)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");

    }
}


