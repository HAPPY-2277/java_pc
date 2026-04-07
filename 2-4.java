import java.util.Scanner;
public class month{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for(;;){
      System.out.println("Enter an int from 1 to 12: ");
      int num = scanner.nextInt();

      String m = switch (num) {
        case 1->"January";
        case 2->"February";
        case 3->"March";
        case 4->"April";
        case 5->"May";
        case 6->"June";
        case 7->"July";
        case 8->"Augest";
        case 9->"September";
        case 10->"October";
        case 11->"November";
        case 12->"December";

        default->null;
      };
      if(m==null){
        System.out.println("Error Input!");
        continue;
      }
      else{
        System.out.println(m);
        break;
      }
    }
  }  
}
