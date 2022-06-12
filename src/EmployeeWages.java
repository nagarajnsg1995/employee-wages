import java.util.ArrayList;
import java.util.Scanner;

interface IEmpWages {
    void computeEmpWage(EmployeeWages.EmpWageBuilder EmpWageBuilder);
}

public class EmployeeWages implements IEmpWages {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;
    // ArrayList to Store daily Wage along with Monthly Wage

    ArrayList<Integer> empDailyMonthlyTotalWage = new ArrayList<Integer>();

    public void computeEmpWage(EmpWageBuilder EmpWageBuilder) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int empDailyWage = 0;
        while (totalWorkingDays < EmpWageBuilder.getNumOfWorkingDays() && totalEmpHrs <=  EmpWageBuilder.getMaxHoursPerMonth()) {

            int empCheck = (int) ((Math.random() * 10) % 3);
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
            totalWorkingDays++;
            totalEmpHrs = totalEmpHrs + empHrs;
            empDailyWage = empHrs * EmpWageBuilder.getEmpRatePerHour();
            empDailyMonthlyTotalWage.add( empDailyWage );
        }
        totalEmpWage=( totalEmpHrs * EmpWageBuilder.getEmpRatePerHour());
        empDailyMonthlyTotalWage.add( totalEmpWage );
        EmpWageBuilder.setTotalEmpWage( totalEmpWage );
    }
    //Main Function
    public static void main(String[] args) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        EmployeeWages emp = new EmployeeWages();
        //ArrayList of Multiple Companies Wage

        ArrayList<EmpWageBuilder> company = new ArrayList<EmpWageBuilder>();
        while (true) {

            System.out.println("Please Enter your choice to show Company Monthly Total Wage ");
            System.out.println("1: Zomato");
            System.out.println("2: Swiggy ");
            System.out.println("3: Dominoz");
            System.out.println("4: Exit Computation");

            Scanner sobj = new Scanner(System.in);
            int choice = sobj.nextInt();
            switch (choice) {
                case 1:
                    company.add( new EmpWageBuilder("Hero", 20,20,100));
                    emp.computeEmpWage(company.get(0));
                    System.out.println("Employee Total wage for Hero : " + company.get(0).getTotalEmpWage());
                    System.out.println();
                    break;
                case 2:
                    company.add( new EmpWageBuilder("Honda",30,25,120));
                    emp.computeEmpWage(company.get(1));
                    System.out.println("Employee Total wage for Honda: " + company.get(1).getTotalEmpWage());
                    System.out.println();
                    break;
                case 3:
                    company.add( new EmpWageBuilder("Suzuki",40,30,140));
                    emp.computeEmpWage(company.get(2));
                    System.out.println("Employee Total wage for Suzuki: " + company.get(2).getTotalEmpWage());
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    System.exit(0);
            }
        }
    }

    public static class EmpWageBuilder {

        public String companyName=" ";
        public int empRatePerHour=0;
        public int numOfWorkingDays=0;
        public int maxHoursPerMonth=0;
        public int totalEmpWage=0;

        public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            this.companyName = companyName;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;
        }
        //GETTERS method to get variables
        public String getCompanyName(){
            return companyName;
        }
        public int getEmpRatePerHour(){
            return empRatePerHour;
        }

        public int getNumOfWorkingDays(){
            return numOfWorkingDays;
        }

        public int getMaxHoursPerMonth(){
            return maxHoursPerMonth;
        }

        public void setTotalEmpWage( int totalEmpWage ){
            this.totalEmpWage = totalEmpWage;
        }

        public int getTotalEmpWage(){
            return totalEmpWage;
        }

    }
}