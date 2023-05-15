package files.AulasCode;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates {
  public static void main(String[] args) {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date d = new Date();
    System.out.println("Data atual: " + sdf.format(d));

    LocalDate dataAtualLd = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Data atual com LD: " + formatter.format(dataAtualLd));
  }
}
