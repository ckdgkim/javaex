package exercise;


public class Ex6 {
  public static void main(String[] args) {
    Car c = new Car("파랑색",200,1000,5);
    c.show();

    System.out.println();
    Vehicle v = new Vehicle("빨강색",300);
    v.show();
  }
}

class Vehicle{
  String color;
  int speed;

  public Vehicle(String color,int speed) {
    this.color = color;
    this.speed = speed;
  }
void show(){
  System.out.println(color+"에다가 속도는"+speed+"입니다.");
  }
}

class Car extends Vehicle{
  int displacement;
  int gears;

  public Car(String color,int speed, int displacement,int gears){
    super(color,speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  @Override
  void show(){
    System.out.println(color+"에다가 속도는"+speed+"이고 " +
        "배기량은"+displacement+"인데 기어 단수는"+gears+"입니다.");
  }
}
