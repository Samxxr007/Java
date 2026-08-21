import javax.swing.*;
import java.awt.*;

public class Ticket_Booking extends JFrame {

    JTextField nameField, seatField;
    JTextArea output;
    boolean booked = false;
    int bookedSeat = -1;

    Ticket_Booking() {
        setTitle("Ticket Booking System");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel main = new JPanel(new BorderLayout(10, 10));

        JPanel form = new JPanel(new GridLayout(4, 2, 10, 10));
        form.setBorder(BorderFactory.createTitledBorder("Booking Details"));

        form.add(new JLabel("Passenger Name:"));
        nameField = new JTextField();
        form.add(nameField);

        form.add(new JLabel("Seat Number (1-20):"));
        seatField = new JTextField();
        form.add(seatField);

        JButton book = new JButton("Book Ticket");
        JButton cancel = new JButton("Cancel Ticket");

        form.add(book);
        form.add(cancel);

        JButton seats = new JButton("View Seats");
        JButton clear = new JButton("Clear");

        form.add(seats);
        form.add(clear);

        output = new JTextArea();
        output.setEditable(false);

        main.add(form, BorderLayout.NORTH);
        main.add(new JScrollPane(output), BorderLayout.CENTER);

        add(main);

        book.addActionListener(e -> bookTicket());
        cancel.addActionListener(e -> cancelTicket());

        seats.addActionListener(e -> {
            output.setText("AVAILABLE SEATS\n\n");

            for (int i = 1; i <= 20; i++) {
                if (i == bookedSeat)
                    output.append("Seat " + i + " : BOOKED\n");
                else
                    output.append("Seat " + i + " : AVAILABLE\n");
            }
        });

        clear.addActionListener(e -> {
            nameField.setText("");
            seatField.setText("");
        });

        setVisible(true);
    }

    void bookTicket() {
        try {
            String name = nameField.getText().trim();

            if (name.isEmpty())
                throw new Exception("Passenger name is required.");

            int seat = Integer.parseInt(seatField.getText());

            if (seat < 1 || seat > 20)
                throw new Exception("Seat number must be between 1 and 20.");

            if (booked)
                throw new Exception("A seat is already booked.");

            bookedSeat = seat;
            booked = true;

            output.setText(
                "BOOKING CONFIRMED\n\n" +
                "Passenger : " + name + "\n" +
                "Seat No   : " + seat + "\n" +
                "Status    : Confirmed"
            );

            JOptionPane.showMessageDialog(
                this,
                "Ticket Booked Successfully!"
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Enter a valid seat number.",
                "Invalid Input",
                JOptionPane.ERROR_MESSAGE
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this,
                e.getMessage(),
                "Booking Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    void cancelTicket() {

        if (!booked) {
            JOptionPane.showMessageDialog(
                this,
                "No ticket is currently booked."
            );
            return;
        }

        booked = false;

        output.setText(
            "TICKET CANCELLED\n\n" +
            "Seat " + bookedSeat + " is now available."
        );

        bookedSeat = -1;

        JOptionPane.showMessageDialog(
            this,
            "Ticket Cancelled Successfully!"
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new Ticket_Booking()
        );
    }
}