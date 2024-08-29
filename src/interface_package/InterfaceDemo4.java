package interface_package;

public class InterfaceDemo4 {
  public static void main(String[] args) {
    Controllable[] controllables = new Controllable[2];
    controllables[0] = new TV();
    controllables[1] = new Computer();

    for (Controllable controllable : controllables){
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
    }
//    controllables[0].turnOn();
//    controllables[0].turnOff();
//    controllables[0].repair();
//
//    controllables[1].turnOn();
//    controllables[1].turnOff();
//    controllables[1].repair();
  }
}
