import java.util.Scanner;

public class Project_test1 {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        System.out.print("Enter YOur Salary :");
        double p = val.nextDouble();
        System.out.print("Enter your yearly intrest :");
        double intres = val.nextDouble();
        double intre = intres/100/12;
        System.out.print("Enter Outcome Time or something(Yearly):");
        double years = val.nextDouble();
        double year = years*12;
        double up = p*(1+intre);
        double ups = Math.pow(up,year);
        double down = (1+intre);
        double downs = Math.pow(down,year);
        double downs_1 = downs - 1;
        double M = ups/downs_1;
        System.out.println("The Mortage Calculate of Output :$"+ M);
    }
}
