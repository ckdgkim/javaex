package objectpackage;

public class ColoredCircleDemo {
  public static void main(String[] args) {
    ColoredCircle cc1 = new ColoredCircle();
    System.out.printf("1번 원의 반지름과 색은 %d , %s 입니다. \n" , cc1.r, cc1.color);
    ColoredCircle cc2 = new ColoredCircle(" ");
    System.out.printf("2번 원의 반지름과 색은 %d , %s 입니다. \n" , cc2.r, cc2.color);
    ColoredCircle cc3 = new ColoredCircle(-10);
    System.out.printf("3번 원의 반지름과 색은 %d , %s 입니다. \n" , cc3.r, cc3.color);
    ColoredCircle cc4 = new ColoredCircle(10, "red");
    System.out.printf("4번 원의 반지름과 색은 %d , %s 입니다. \n" , cc4.r, cc4.color);
  }
}

class ColoredCircle {
  // 멤버 - 필드
  int r = 1;
  String color;
  // 생성자 - 4개 (오버로딩)
  public ColoredCircle(){
    color = "white";
  }
  public ColoredCircle(String color) {
    this(1,"white");
    if(r > 0){
      this.color = "white";
    }
    if (color == null || color.equals("") || color.equals(" ")) {
      this.color = "white";
    } else {
      this.color = color;
    }
  }
  public ColoredCircle(int r){
    this(r, "white");
//    if(r > 0) this.r = r;
  }
  public ColoredCircle(int r,String color){
    if(r > 0) {
      this.r = r;
    }else {
      this.r =1;
    }
    if(color == null || color.equals("") || color.equals(" ")){
      this.color = "white";
      }else{
        this.color = color;
      }
    }
  }
