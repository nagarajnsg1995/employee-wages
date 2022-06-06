public class EmployeeWages {
    public static void main(String[] args) {
        int ispresent = 1;
        int rateperhour = 20;
        int mysalary = 0;
        int hours = 8;
        System.out.println("Welcome to the Employee Wages");
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (ispresent == empcheck)
            mysalary = (rateperhour * hours);
        System.out.println("salary per day:" +mysalary);
    }
}


