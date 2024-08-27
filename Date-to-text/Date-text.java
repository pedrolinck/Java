public class Program{

  public static void main(String[] args){
    LocalDate date1 = LocalDate.parse("2024-08-26");

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy")


    System.out.println("date1  " + date1.format(fmt));


  }
}