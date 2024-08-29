package exercise_ch07;

abstract class Controller{
  abstract void show();
  abstract String getName();
}

class TV2 extends Controller{
  boolean power;

  public TV2(boolean power){
    this.power = power;
  }
  @Override
  void show() {
    if (power){
    System.out.println("TV가 켜졌습니다..");
  } else {
      System.out.println("TV가 꺼졌습니다.");
    }
  }

    @Override
  String getName() {
    return "TV2";
  }
}

class Radio extends Controller {
  boolean power;

  public Radio(boolean power) {
    this.power = power;
  }

  @Override
  void show() {
    if (power) {
      System.out.println("Radio가 켜졌습니다.");
    } else {
      System.out.println("Radio가 꺼졌습니다.");
    }
  }
  @Override
  String getName() {
    return "Radio";
  }
}

