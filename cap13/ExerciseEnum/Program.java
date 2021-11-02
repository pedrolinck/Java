package cap13.ExerciseEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter work data:");
        System.out.print("Name: ");
        String workerName =sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker w = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print("Enter contract #"+ i + " data\n");
            System.out.print("Date (dd/MM/yyyy): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration hours: ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(date, value,hours);
            w.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/yyyy): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println();
        System.out.println("Name: " + w.getName());
        System.out.println("Department: "+w.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+": "+String.format("%.2f", w.income(year, month)));

        sc.close();
    }
}