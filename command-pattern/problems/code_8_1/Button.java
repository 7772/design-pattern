package problems.code_8_1;

import problems.code_8_1.Lamp;

public class Button {
  private Lamp lamp;

  public Button(Lamp theLamp) {
    this.lamp = theLamp;
  }

  public void pressed() {
    this.lamp.turnOn();
  }
}
