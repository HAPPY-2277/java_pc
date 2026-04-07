public class test {
  public static void main(String[] args) {
    
    int[] a = new int[5];
    a[0]=3;
    a[1]=4;
    a[2]=1;
    a[3]=6;
    a[4]=2;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5-i-1; j++) {
        if (a[j]>a[j+1]) {
          int temp = a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    for (int var : a) {
      System.out.println(var);
    }
  }
}

