import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Banking_Interface extends JFrame {

    JTextField fromField, toField, amountField;
    JLabel balanceLabel;
    JTextArea historyArea;

    double balance = 50000.00;
    ArrayList<String> transactions = new ArrayList<>();

    Banking_Interface() {
        setTitle("Online Banking Interface");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("From Account:"));
        fromField = new JTextField();
        panel.add(fromField);

        panel.add(new JLabel("To Account:"));
        toField = new JTextField();
        panel.add(toField);

        panel.add(new JLabel("Transfer Amount:"));
        amountField = new JTextField();
        panel.add(amountField);

        JButton transferButton = new JButton("Transfer Funds");
        JButton balanceButton = new JButton("Check Balance");
        JButton historyButton = new JButton("Transaction History");

        panel.add(transferButton);
        panel.add(balanceButton);
        panel.add(historyButton);

        balanceLabel = new JLabel("Balance: ₹50,000.00");
        panel.add(balanceLabel);

        historyArea = new JTextArea();
        historyArea.setEditable(false);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(historyArea), BorderLayout.CENTER);

        transferButton.addActionListener(e -> transferMoney());
        balanceButton.addActionListener(e ->
                balanceLabel.setText(String.format("Balance: ₹%.2f", balance)));

        historyButton.addActionListener(e -> showHistory());

        setVisible(true);
    }

    void transferMoney() {
        try {
            String from = fromField.getText().trim();
            String to = toField.getText().trim();

            if (from.isEmpty() || to.isEmpty()) {
                throw new IllegalArgumentException("Account numbers cannot be empty.");
            }

            if (!from.matches("\\d+") || !to.matches("\\d+")) {
                throw new IllegalArgumentException("Account numbers must contain digits only.");
            }

            if (from.equals(to)) {
                throw new IllegalArgumentException(
                        "Sender and receiver accounts cannot be the same.");
            }

            double amount = Double.parseDouble(amountField.getText().trim());

            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Transfer amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient balance.");
            }

            balance -= amount;

            String transaction = "Transferred ₹" + String.format("%.2f", amount)
                    + " from " + from + " to " + to;

            transactions.add(transaction);

            balanceLabel.setText(
                    String.format("Balance: ₹%.2f", balance));

            JOptionPane.showMessageDialog(
                    this,
                    "Fund Transfer Successful!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            amountField.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Enter a valid numeric amount.",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE
            );

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage(),
                    "Transaction Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    void showHistory() {
        historyArea.setText("");

        if (transactions.isEmpty()) {
            historyArea.setText("No transactions available.");
        } else {
            historyArea.append("TRANSACTION HISTORY\n");
            historyArea.append("---------------------------\n");

            for (String transaction : transactions) {
                historyArea.append(transaction + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Banking_Interface());
    }
}