public class EmployeeWages {
    public static final int emprateperhrs = 20;
    public static final int empfulltime = 1;
    public static final int empparttime = 2;
    public static final int empmaxhrs = 100;
    public static final int empnoworkingdays = 20;


    public static void employeeWage() {
        int emphr = 0;
        int totalemphrs = 0;
        int emptotalworkingdays = 0;
        int empwage = 0;
        System.out.println("Welcome to the Employee Wages");
        while (totalemphrs <= empmaxhrs && emptotalworkingdays < empnoworkingdays) {
            emptotalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;


            switch (empcheck) {
                case 1:
                    emphr = 4;
                    break;

                case 2:
                    emphr = 8;
                    break;

                default:
                    emphr = 0;
            }
            totalemphrs += emphr;
            System.out.println(emptotalworkingdays + "emphrs" + emphr);
        }
        empwage = (emphr * emprateperhrs);
        System.out.println("per day emp wage for " + emphr + "is:" + empwage);
        int hrs = totalemphrs * emprateperhrs;
        System.out.println("total wage for " + totalemphrs + "hrs is :" + hrs);

    }
    public static void main(String[] args) {
        employeeWage();
    }
}

