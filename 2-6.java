import java.util.ArrayList;
import java.util.Scanner;

public class flower_num {

  public static ArrayList<Integer> putin(Integer num) {
    ArrayList<Integer> list = new ArrayList<>();
    for(;;){
      list.add(num%10);
      num /= 10;
      if(num<1){
        break;
      }
    }
    return list;
  }

  public static Integer add(ArrayList<Integer> list) {
    Integer temp = 0;
    for(int i=0;i<list.size();i++){
      temp += (int)Math.pow(list.get(i), list.size());
    }
    return temp;
  }
    
  public static void main(String[] args) {
    System.out.println("Please enter a num range: ");
    Scanner sc = new Scanner(System.in);
    Integer num = sc.nextInt();
    
    for(int i=0;i<num;i++){
      if(i==add(putin(i))){
        System.out.println(i);
      }
    }
  }
}
