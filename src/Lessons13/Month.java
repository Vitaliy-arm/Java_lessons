package Lessons13;

public class Month {
  public static void month(int a) {
       switch (a) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               System.out.println("Month " + a + " has 31 days.");
               break;

           case 4:
           case 6:
           case 9:
           case 11:
               System.out.println("Month " + a + " has 30 days.");
               break;

           case 2:
               System.out.println("Month " + a + " has 30 days.");
               break;

           default:
               System.out.println("You input wrong month.");
       }

   }

    public static void main(String[] args) {
        Month.month(1);
        Month.month(2);
        Month.month(11);
        Month.month(50);


    }

}
