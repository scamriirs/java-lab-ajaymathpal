import java.awt.*;
class ListScrollDemo {
    ListScrollDemo() {
        Frame f = new Frame("List and ScrollBar");
        List list = new List();
        list.add("C");
        list.add("Java");
        list.add("Python");
        list.add("Kotlin");
        list.setBounds(100,100,100,80);
        Scrollbar s = new Scrollbar();
        s.setBounds(220,100,20,100);
        f.add(list);
        f.add(s);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ListScrollDemo();
    }
}
