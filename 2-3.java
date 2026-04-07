import java.util.*;
public class num{
  public static void main(String[] args) {
    Integer num = 1000 ;
    for(int i=0;i<num;i++){
      ArrayDeque<Integer> d= new ArrayDeque<Integer>();
      Integer temp = i;
      for(;;){
        d.offerFirst(temp % 10);
        temp /= 10;
        if(temp<1){
          break;
        }
      }
      for(;;){
        Integer f = d.pollFirst();
        Integer l = d.pollLast();
        if(f == null){
          System.out.println(i);
          break;
        }
        else{
          if(l == null){
            System.out.println(i);
            break;
          }
          else{
            if(f == l){
              continue;
            }
            else{
              break;
            }
          }
        }
      }
    }
  }
}
