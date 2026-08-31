import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Biodata {
    String name, father, dob, sex, address, qualification;

    Biodata(String name, String father, String dob, String sex,
            String address, String qualification) {
        this.name = name;
        this.father = father;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.qualification = qualification;
    }
}

public class JDBC extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4;
    JComboBox<String> jc1, jc2;
    JButton submit, view;
    JLabel result;

    static ArrayList<Biodata> database = new ArrayList<>();

    JDBC() {
        setTitle("Biodata Registration");
        setSize(600, 600);
        setLayout(null);

        addLabel("Name:", 100, 60);
        t1 = addTextField(250, 60);

        addLabel("Father's Name:", 100, 110);
        t2 = addTextField(250, 110);

        addLabel("Date of Birth:", 100, 160);
        t3 = addTextField(250, 160);

        addLabel("Sex:", 100, 210);

        jc1 = new JComboBox<>(new String[]{"M", "F"});
        jc1.setBounds(250, 210, 200, 30);
        add(jc1);

        addLabel("Address:", 100, 260);
        t4 = addTextField(250, 260);

        addLabel("Qualification:", 100, 310);

        jc2 = new JComboBox<>(new String[]{"B.E.", "M.E.", "Ph.D."});
        jc2.setBounds(250, 310, 200, 30);
        add(jc2);

        submit = new JButton("Submit");
        submit.setBounds(180, 370, 110, 35);
        add(submit);

        view = new JButton("View Data");
        view.setBounds(300, 370, 110, 35);
        add(view);

        result = new JLabel("");
        result.setBounds(150, 430, 350, 40);
        add(result);

        submit.addActionListener(this);
        view.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void addLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 150, 30);
        add(label);
    }

    JTextField addTextField(int x, int y) {
        JTextField field = new JTextField();
        field.setBounds(x, y, 200, 30);
        add(field);
        return field;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            if (t1.getText().isEmpty() ||
                t2.getText().isEmpty() ||
                t3.getText().isEmpty() ||
                t4.getText().isEmpty()) {

                result.setText("Please fill all fields");
                return;
            }

            Biodata data = new Biodata(
                t1.getText(),
                t2.getText(),
                t3.getText(),
                (String) jc1.getSelectedItem(),
                t4.getText(),
                (String) jc2.getSelectedItem()
            );

            database.add(data);

            result.setText("Record Inserted Successfully");
        }

        if (e.getSource() == view) {

            if (database.isEmpty()) {
                result.setText("No Records Found");
                return;
            }

            Biodata data = database.get(database.size() - 1);

            JOptionPane.showMessageDialog(this,
                "Name: " + data.name +
                "\nFather's Name: " + data.father +
                "\nDate of Birth: " + data.dob +
                "\nSex: " + data.sex +
                "\nAddress: " + data.address +
                "\nQualification: " + data.qualification,
                "Biodata Record",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new JDBC();
    }
}