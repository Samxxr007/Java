import java.awt.*;
import java.awt.event.*;

public class CustomerFeedback extends Frame implements ActionListener {

    TextField nameField;
    TextArea feedbackArea, resultArea;
    Choice rating;
    Button submit, clear;

    CustomerFeedback() {

        setTitle("Customer Feedback System");
        setSize(600, 400);
        setLayout(new BorderLayout(10, 10));

        Panel form = new Panel(new GridLayout(4, 2, 10, 10));

        form.add(new Label("Customer Name:"));
        nameField = new TextField();
        form.add(nameField);

        form.add(new Label("Rating:"));
        rating = new Choice();
        rating.add("1 - Poor");
        rating.add("2 - Fair");
        rating.add("3 - Good");
        rating.add("4 - Very Good");
        rating.add("5 - Excellent");
        form.add(rating);

        form.add(new Label("Feedback:"));
        feedbackArea = new TextArea();
        form.add(feedbackArea);

        submit = new Button("Submit Feedback");
        clear = new Button("Clear");

        form.add(submit);
        form.add(clear);

        resultArea = new TextArea();
        resultArea.setEditable(false);

        add(form, BorderLayout.NORTH);
        add(resultArea, BorderLayout.CENTER);

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String name = nameField.getText().trim();
            String feedback = feedbackArea.getText().trim();

            if (name.isEmpty() || feedback.isEmpty()) {
                resultArea.setText("Please enter name and feedback.");
                return;
            }

            resultArea.setText(
                "FEEDBACK SUBMITTED\n\n" +
                "Customer: " + name + "\n" +
                "Rating: " + rating.getSelectedItem() + "\n" +
                "Feedback: " + feedback
            );
        }

        if (e.getSource() == clear) {
            nameField.setText("");
            feedbackArea.setText("");
            rating.select(0);
            resultArea.setText("");
        }
    }

    public static void main(String[] args) {
        new CustomerFeedback();
    }
}