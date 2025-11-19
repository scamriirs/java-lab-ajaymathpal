import java.awt.*;
class LabelButtonDemo {
    LabelButtonDemo() {
        Frame f = new Frame("Demo");
        Label l = new Label("Click Button");
        Button b = new Button("OK");
        l.setBounds(100,50,100,30);
        b.setBounds(100,100,80,30);
        f.add(l); f.add(b);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new LabelButtonDemo();
    }
}
