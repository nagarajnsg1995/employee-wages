public class EmployeeWages {
    public static void main(String[] args) {
        int rateperhrs= 20;
        int fulltime= 1;
        int parttime= 2;
        int empwage= 0;
        int emphr = 0;
        int empcheck = (int)Math.floor(Math.random()*10)%3;
        System.out.println("Welcome to the Employee Wages");
        switch (empcheck)
        {
            case 1:
                emphr = 4;
                break;

            case 2:
                emphr = 8;
                break;

            default:
                emphr =0;
                break;
        }
        empwage =  ( emphr * rateperhrs );
        System.out.println ("salary per day" +empwage );
    }
}



