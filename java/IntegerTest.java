public class IntegerTest {
    public static void main(String[] args) {
      String aNumberStr = "001";
      Integer number = Integer.parseInt(aNumberStr);
      System.out.println(number * 3);
      Double bNumber = 3.0 / 2;
      System.out.println(bNumber % 1 == 0);
    }
  }