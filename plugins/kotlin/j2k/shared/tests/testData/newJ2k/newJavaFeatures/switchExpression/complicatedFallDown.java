// IGNORE_K2
package demo;

public class SwitchDemo {
    public static void print(Object o) {
        System.out.println(o);
    }

  public static void test(int i) {
    String monthString = "<empty>";
    int x = switch (i) {
        case 1:  print(1);
        case 2:  print(2);
        case 3:  print(3);
        case 4:  print(4);
        case 5:  print(5); yield 5;
        case 6:  print(6);
        case 7:  print(7);
        case 8:  print(8);
        case 9:  print(9);
        case 10: print(10);
        case 11: print(11);
        case 12: monthString = "December"; yield 12;
        default: monthString = "Invalid month"; yield 13;
    }
    System.out.println(monthString);
  }

    public static void main(String[] args) {
        for (int i = 1; i <=12 ; i++)
          test(i);
    }
}