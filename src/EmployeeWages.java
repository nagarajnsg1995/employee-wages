public class EmployeeWages {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWage;

    public EmployeeWages() {
        companyEmpWage = new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWage[numOfCompany] = new  CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWage[i].setTotalEmpWage(this. computeEmpWage(companyEmpWage[i]));
            System.out.println(companyEmpWage[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <=  companyEmpWage.maxHoursPerMonth && totalWorkingDays <  companyEmpWage.numOfWorkingDays) {
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
            System.out.println("Day"+ totalWorkingDays + "Emp Hr:" +empHrs);

        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }
    public static void main(String[] args) {
        EmployeeWages EmpWageArray  = new EmployeeWages();
        EmpWageArray.addCompanyEmpWage("Hero",20,25,100);
        EmpWageArray.addCompanyEmpWage("Honda", 30, 25, 120);
        EmpWageArray.addCompanyEmpWage("Suzuki", 40, 30, 150);
        EmpWageArray.computeEmpWage();

    }

    public class CompanyEmpWage {
        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public  int totalEmpWage;

        public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            this.company = company;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;
        }
        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }
        @Override
        public String toString() {
            return "Total Emp Wage for Company : " +company+" is: "+ totalEmpWage;
        }
    }
}
