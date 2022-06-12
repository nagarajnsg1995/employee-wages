interface IEmpWages {
    EmpWageBuilder computeEmpWage(EmpWageBuilder EmpWageBuilder);
}

public class EmployeeWages implements IEmpWages {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    public static void main(String[] args) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        EmployeeWages emp = new EmployeeWages();
        //Array of object of Companyempwage class
        EmpWageBuilder[] company = new EmpWageBuilder[10];
        // assign value to object of Companyempwage
        company[0] = new EmpWageBuilder("Hero", 20, 20, 100);
        emp.computeEmpWage(company[0]);
        company[1] = new EmpWageBuilder("Honda", 30, 25, 120);
        emp.computeEmpWage(company[1]);
        company[2] = new EmpWageBuilder("Suzuki", 30, 30, 140);
        emp.computeEmpWage(company[2]);
    }

    @Override
    public EmpWageBuilder computeEmpWage(EmpWageBuilder EmpWageBuilder) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        while (totalWorkingDays < EmpWageBuilder.getNumOfWorkingDays() && totalEmpHrs <= EmpWageBuilder.getMaxHoursPerMonth()) {

            int empCheck = (int) ((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    //    System.out.println("Employee is Present");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    //    System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                default:
                    //    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalWorkingDays++;
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        EmpWageBuilder.setTotalEmpWage(totalEmpHrs * EmpWageBuilder.empRatePerHour);
        EmpWageBuilder.setCompanyName(EmpWageBuilder.companyName);
        System.out.println("Employee Monthly Wage of " + EmpWageBuilder.getCompanyName() + " is " + EmpWageBuilder.getTotalEmpWage());
        return EmpWageBuilder;
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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

}
