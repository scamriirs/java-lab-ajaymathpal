// Ques 26
import java.awt.*;
class CheckBoxDemo {
    CheckBoxDemo() {
        Frame f = new Frame("CheckBox Demo");
        Checkbox c1 = new Checkbox("Java");
        Checkbox c2 = new Checkbox("Python");
        c1.setBounds(100,100,80,30);
        c2.setBounds(100,150,80,30);
        f.add(c1); f.add(c2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
