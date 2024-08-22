package exercise;

public class Ex5 {
  public static void main(String[] args) {
    Phone[] phones = {new Phone("황진이"),
    new Telephone("길동이", "내일"),
    new Smartphone("민국이","모레","갤러그")};
    for (Phone phone : phones){
      if (phone instanceof  Smartphone){
        Smartphone s = (Smartphone) phone;
        s.playGane();
      }
      else if (phone instanceof Telephone){
        Telephone t = (Telephone) phone;
        t.autoAnswering();
      }
      else if (phone instanceof Phone){
        phone.talk();
      }
    }

    Phone p = new Phone("폰");
    Telephone t = new Telephone("텔레폰","어제");
    Smartphone s = new Smartphone("스마트폰","오늘","롤");

//    p.talk();
//    t.autoAnswering();
//    s.playGane();
  }
}

class Phone {
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

    void talk () {
      System.out.println(owner + "가 통화 중");
  }
}
class Telephone extends Phone{
  private String when;

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }
    void autoAnswering(){
      System.out.println(owner +"가 부재중이니 "+ when +"에 전화요망");
  }
}

class Smartphone extends Telephone {
  private String game;

  public Smartphone(String owner, String when, String game) {
    super(owner, when);
    this.game = game;
  }

  void playGane() {
    System.out.println(owner + "가 " + game + "게임 중");
  }
}
