import java.util.ArrayList;

interface IEmpWages {
    EmpWageBuilder computeEmpWage(EmpWageBuilder EmpWageBuilder);
}
public class EmployeeWages implements IEmpWages {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    @Override
    public EmpWageBuilder computeEmpWage(EmpWageBuilder empWageBuilder) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        while (totalWorkingDays < empWageBuilder.getNumOfWorkingDays() && totalEmpHrs <=  empWageBuilder.getMaxHoursPerMonth()) {

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
        }
        empWageBuilder.setTotalEmpWage( totalEmpHrs * empWageBuilder.empRatePerHour );
        System.out.println("Employee Monthly Wage of " + empWageBuilder.getCompanyName() + " is " + empWageBuilder.getTotalEmpWage());

        return empWageBuilder;
    }
    //Main Function
    public static void main(String[] args) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        EmployeeWages emp = new EmployeeWages();
        //ArrayList of Multiple Companies Wage

        ArrayList<EmpWageBuilder> company = new ArrayList<EmpWageBuilder>();
        // assign value to object of Companyempwage
        company.add( new EmpWageBuilder("Hero", 20,20, 100));
        emp.computeEmpWage(company.get(0));
        company.add( new EmpWageBuilder("Honda", 30,25,120));
        emp.computeEmpWage(company.get(1));
        company.add( new EmpWageBuilder("Suzuki",40,30,150));
        emp.computeEmpWage(company.get(2));
    }
}

class EmpWageBuilder {

    public String companyName = " ";
    public int empRatePerHour = 0;
    public int numOfWorkingDays = 0;
    public int maxHoursPerMonth = 0;
    public int totalEmpWage = 0;

    public EmpWageBuilder(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    //GETTERS method to get variables
    public String getCompanyName() {
        return companyName;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }
}