public class EmployeeWages {


    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    //Instance variables
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private  int totalEmpWage;

    //Constructor
    public EmployeeWages(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }


    private void computeEmpWage() {

        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:

                    empHrs = 4;
                    break;
                case IS_FULL_TIME:

                    empHrs = 8;
                    break;
                default:

                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + "Emp Hr: " +empHrs);

        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company : " +company+" is: "+ totalEmpWage);
    }
    @Override
    public String toString() {
        return "Total Emp Wage for Company : " +company+" is: "+ totalEmpWage;
    }
    public static void main(String[] args) {
        EmployeeWages zomato = new EmployeeWages("Hero", 20, 20, 100);
        EmployeeWages swiggy = new EmployeeWages("Honda", 25, 25, 120);
        EmployeeWages dominoz = new EmployeeWages("Suzuki", 30, 30, 140);
        zomato.computeEmpWage();
        swiggy.computeEmpWage();
        dominoz.computeEmpWage();
    }
}