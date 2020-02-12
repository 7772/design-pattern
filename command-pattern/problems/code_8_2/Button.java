package problems.code_8_2;



public class Button {
  private Alarm theAlarm;

  public Button(Alarm theAlarm) {
    this.theAlarm = theAlarm;
  }

  public void pressed() {
    this.theAlarm.start();
  }
}
