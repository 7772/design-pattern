package solutions.code_8_4;


public class AlarmOnCommand implements Command {
  private Alarm theAlarm;

  public AlarmOnCommand(Alarm theAlarm) {
    this.theAlarm = theAlarm;
  }

  public void execute() {
    theAlarm.start();
  }
}
