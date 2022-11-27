package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Clock;
class Screen1 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Label Label2;
  private Clock Clock1;
  protected void $define() {
    this.AboutScreen("Program Start Page");
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("Dice App");
    this.BackgroundImage("wallpaper.jpg");
    this.Title("Dice App");
    Label1 = new Label(this);
    Label1.BackgroundColor(0xFFFFC800);
    Label1.FontBold(true);
    Label1.FontItalic(true);
    Label1.FontSize(40);
    Label1.FontTypeface(2);
    Label1.Text("Loading . . .");
    Label2 = new Label(this);
    Label2.FontBold(true);
    Label2.FontSize(25);
    Label2.Text("10");
    Clock1 = new Clock(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}