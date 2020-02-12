package problems.code_8_1;

import problems.code_8_1.Lamp;
import problems.code_8_1.Button;


public class Client {
  public static void main(String[] args) {
    Lamp lamp = new Lamp();
    Button lampButton = new Button(lamp);
    lampButton.pressed();
  }
}
