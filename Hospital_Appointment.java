import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Hospital_Appointment extends JFrame {

    JTextField patientField, doctorField, dateField, timeField;
    JTable table;
    DefaultTableModel model;

    Hospital_Appointment() {

        setTitle("Hospital Appointment Management System");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createTitledBorder("Appointment Details"));

        form.add(new JLabel("Patient Name:"));
        patientField = new JTextField();
        form.add(patientField);

        form.add(new JLabel("Doctor Name:"));
        doctorField = new JTextField();
        form.add(doctorField);

        form.add(new JLabel("Date:"));
        dateField = new JTextField();
        form.add(dateField);

        form.add(new JLabel("Time:"));
        timeField = new JTextField();
        form.add(timeField);

        JButton book = new JButton("Book");
        JButton update = new JButton("Update");

        form.add(book);
        form.add(update);

        model = new DefaultTableModel(
                new String[]{"Patient", "Doctor", "Date", "Time"}, 0);

        table = new JTable(model);

        JButton cancel = new JButton("Cancel Appointment");
        JButton clear = new JButton("Clear");

        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(cancel);
        buttons.add(clear);

        add(form, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        book.addActionListener(e -> bookAppointment());
        update.addActionListener(e -> updateAppointment());
        cancel.addActionListener(e -> cancelAppointment());
        clear.addActionListener(e -> clearFields());

        table.getSelectionModel().addListSelectionListener(e -> {
            int row = table.getSelectedRow();

            if (row >= 0) {
                patientField.setText(model.getValueAt(row, 0).toString());
                doctorField.setText(model.getValueAt(row, 1).toString());
                dateField.setText(model.getValueAt(row, 2).toString());
                timeField.setText(model.getValueAt(row, 3).toString());
            }
        });

        setVisible(true);
    }

    void bookAppointment() {

        if (patientField.getText().isEmpty() ||
            doctorField.getText().isEmpty() ||
            dateField.getText().isEmpty() ||
            timeField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Please fill all fields.");
            return;
        }

        model.addRow(new Object[]{
                patientField.getText(),
                doctorField.getText(),
                dateField.getText(),
                timeField.getText()
        });

        JOptionPane.showMessageDialog(this,
                "Appointment Booked Successfully!");

        clearFields();
    }

    void updateAppointment() {

        int row = table.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Select an appointment to update.");
            return;
        }

        model.setValueAt(patientField.getText(), row, 0);
        model.setValueAt(doctorField.getText(), row, 1);
        model.setValueAt(dateField.getText(), row, 2);
        model.setValueAt(timeField.getText(), row, 3);

        JOptionPane.showMessageDialog(this,
                "Appointment Updated Successfully!");
    }

    void cancelAppointment() {

        int row = table.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Select an appointment to cancel.");
            return;
        }

        model.removeRow(row);

        JOptionPane.showMessageDialog(this,
                "Appointment Cancelled Successfully!");

        clearFields();
    }

    void clearFields() {
        patientField.setText("");
        doctorField.setText("");
        dateField.setText("");
        timeField.setText("");
        table.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new Hospital_Appointment());
    }
}