package basic;

public class AdderDemo {
  public static void main(String[] args) {
    int i = 0;
    int j;
    j = i++;
    System.out.printf("i = %d, j = %d \n", i,j);

    int x = 0;
    int y;
    y = ++x;
    System.out.printf("x = %d, y = %d", x,y);
  }
}
