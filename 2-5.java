import java.util.Scanner;

public class math {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a range:");
    int num_range=sc.nextInt();

    for(int i=0;i<=num_range;i++){
      if(i==0||i==1){
        continue;
      }
      if(i==2){
        System.out.println(i);
        continue;
      }
      for(int j=2;j<=(int)(Math.sqrt(num_range));j++){
        if(i%j==0){
          break;
        }
        if(j==(int)(Math.sqrt(num_range))){
          System.out.println(i);
        }
      }
    }
  }
}
