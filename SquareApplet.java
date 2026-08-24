import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SquareApplet extends Applet implements ActionListener {

    TextField num;
    Label result;
    Button button;

    public void init() {
        setLayout(new FlowLayout());

        add(new Label("Enter Number:"));

        num = new TextField(10);
        add(num);

        button = new Button("Find Square");
        add(button);

        result = new Label("Square: ");
        add(result);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(num.getText());
            result.setText("Square: " + (n * n));
        } catch (NumberFormatException ex) {
            result.setText("Enter a valid number");
        }
    }
}