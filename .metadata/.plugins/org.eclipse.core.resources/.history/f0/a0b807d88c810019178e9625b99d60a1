import java.text.NumberFormat;
import java.util.Locale;

public class CodingProject {

    public static void main(String[] args) {
      String name = "John Smith";
      String address = "101 N. Main Street";
      String city = "Anytown";
      String state = "TX";
      String zipCode = "1111";
      int pinNumber;
      int tuitionOwed;
      int numberUnitsTaken = 18;
      final int CostPerUnit = 100;

    tuitionOwed = numberUnitsTaken * CostPerUnit;

      System.out.println("Name: "+ name);
      System.out.println("Address: "+ address);
      System.out.println("City: "+ city);
      System.out.println("State: "+ state);
      System.out.println("ZipCode "+ zipCode);
      Integer.toString(tuitionOwed);
      NumberFormat tuition = NumberFormat.getCurrencyInstance(Locale.US);
      System.out.println(("The tuition you owe is " + tuition.format(tuitionOwed)));
    }
}
