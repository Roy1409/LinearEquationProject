import java.util.Scanner;








public class LinearEquationLogic {




    private Scanner Scan = new Scanner(System.in);
    private LinearEquation coord = new LinearEquation(0, 0, 0, 0);




    public LinearEquationLogic() {




    }




    public  void  start() {


        System.out.println("Welcome to the linear equation calculator!");
        main();
        repeat();
    }
    public void repeat() {
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String answer=Scan.nextLine();
        if (answer.equals("y")) {
            main();
        } }


    public void main() {
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = Scan.nextLine();
        int index = coordinate1.indexOf(",");
        String x1 = coordinate1.substring(1, index);
        String y1 = coordinate1.substring(index+2, coordinate1.length() - 1);
        int intOfx1 = Integer.parseInt(x1);
        int intOfy1 = Integer.parseInt(y1);
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = Scan.nextLine();
        System.out.println();
        int index1 = coordinate2.indexOf(",");
        String x2 = coordinate2.substring(1, index1);
        String y2 = coordinate2.substring(index1+2, coordinate2.length() - 1);
        int intOfx2 = Integer.parseInt(x2);
        int intOfy2 = Integer.parseInt(y2);
        coord=new LinearEquation(intOfx1,intOfy1,intOfx2,intOfy2);
        System.out.println(coord.lineInfo());
        System.out.println();
        System.out.print("Enter an x value: ");
        double xValue=Scan.nextDouble();
        Scan.nextLine();
        System.out.println(coord.coordinateForX(xValue));
        repeat();
    }
}


