package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.AccelerometerSensor;
import com.google.appinventor.components.runtime.TextToSpeech;
class Screen2 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private AccelerometerSensor AccelerometerSensor1;
  private TextToSpeech TextToSpeech1;
  protected void $define() {
    this.AboutScreen("Show Dice Pics");
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("Dice");
    this.BackgroundColor(0xFF00FFFF);
    this.Title("Screen2");
    Label1 = new Label(this);
    Label1.BackgroundColor(0xFFFFC800);
    Label1.FontBold(true);
    Label1.FontSize(25);
    Label1.Height(60);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("SHAKE YOUR PHONE");
    Label1.TextColor(0xFFFF0000);
    AccelerometerSensor1 = new AccelerometerSensor(this);
    TextToSpeech1 = new TextToSpeech(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}