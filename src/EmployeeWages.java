public class EmployeeWages {
    public static void hero(int emprateperhrs, int empnoworkingdays, int empmaxhrs) {
        int emphr = 0;
        int totalemphrs = 0;
        int emptotalworkingdays = 0;
        int empwage = 0;
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

        }
        empwage = (emphr * emprateperhrs);
        System.out.println("Hero company wage:");
        System.out.println("per day employee wage for " + emphr + "is:" + empwage);
        int hrs = totalemphrs * emprateperhrs;
        System.out.println("total wage for " + totalemphrs + "hrs is :" + hrs);
    }


    static void honda(int emprateperhrs, int empnoworkingdays, int empmaxhrs) {
        int emphr = 0;
        int totalemphrs = 0;
        int emptotalworkingdays = 0;
        int empwage = 0;
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

        }
        empwage = (emphr * emprateperhrs);
        System.out.println("Honda company wage:");
        System.out.println("per day employee wage for " + emphr + "is:" + empwage);
        int hrs = totalemphrs * emprateperhrs;
        System.out.println("total wage for " + totalemphrs + "hrs is :" + hrs);
    }


    static void suzuki(int emprateperhrs, int empnoworkingdays, int empmaxhrs) {
        int emphr = 0;
        int totalemphrs = 0;
        int emptotalworkingdays = 0;
        int empwage = 0;
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
        }
        empwage = (emphr * emprateperhrs);
        System.out.println("Suzuki company wage:");
        System.out.println("per day employee wage for " + emphr + "is:" + empwage);
        int hrs = totalemphrs * emprateperhrs;
        System.out.println("total wage for " + totalemphrs + "hrs is :" + hrs);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wages");
        EmployeeWages wage = new EmployeeWages();
        wage.hero(20, 20, 100);
        wage.honda(30, 25, 120);
        wage.suzuki(40, 30, 150);

    }
}


