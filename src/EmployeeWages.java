public class EmployeeWages {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmpWage(String company, int empaRtePerHour, int numofWorkingDays, int maxHoursPerMonth)
    {
        int emphrs = 0, totalEmpHrs = 0, totalworkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalworkingDays < numofWorkingDays) {
            totalworkingDays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case 1:
                    emphrs = 4;
                    break;

                case 2:
                    emphrs = 8;
                    break;

                default:
                    emphrs = 0;
                    break;
            }
            totalEmpHrs += emphrs;
            System.out.println("Day#: " + totalworkingDays + " Emp Hr: " + emphrs);


        }
        int totalEmpWage = totalEmpHrs * empaRtePerHour;
        System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
        return totalEmpWage;

    }

    public static void main(String[] args) {
        computeEmpWage("Hero", 20, 20, 100);
        computeEmpWage("Honda", 30, 25, 120);
        computeEmpWage("Suzuki", 40, 30, 150);
    }

}
