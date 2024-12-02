import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        JButton button = new JButton(" GFG WebSite Click");
        button.setBounds(150,200,220,50);
        frame.add(button);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
