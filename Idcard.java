import java.awt.*; //java awt and swing package used
import java.awt.event.*; //for using event handling 
import javax.swing.*;

public class Idcard { // class define
    Idcard() { // creating a method

        JFrame panel = new JFrame("Employee Management System"); // use for making frame
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setSize(557, 383);

        JLabel headLabel = new JLabel("Employee Management "); // Label tag for label
        headLabel.setBounds(100, 5, 500, 60); // setBounds for area
        panel.add(headLabel); // add()--> for add in frame
        Font f = new Font("consolas", Font.BOLD, 30); // Font use for chanding font styles
        headLabel.setFont(f); // setFont keyword used

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 60, 80, 25);
        panel.add(nameLabel);

        JLabel detLabel = new JLabel("Detail");
        detLabel.setBounds(350, 60, 80, 25);
        panel.add(detLabel);

        JTextField nameTextField = new JTextField(20); // TextField is a area where the input is taken
        nameTextField.setBounds(100, 60, 165, 25);
        panel.add(nameTextField);

        JLabel designationLabel = new JLabel("Designation:");
        designationLabel.setBounds(10, 100, 80, 25);
        panel.add(designationLabel);

        JTextField designationTextField = new JTextField(20);
        designationTextField.setBounds(100, 100, 165, 25);
        panel.add(designationTextField);

        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(10, 140, 80, 25);
        panel.add(departmentLabel);

        JTextField departmentTextField = new JTextField(20);
        departmentTextField.setBounds(100, 140, 165, 25);
        panel.add(departmentTextField);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(10, 180, 80, 25);
        panel.add(salaryLabel);

        JTextField salaryTextField = new JTextField(20);
        salaryTextField.setBounds(100, 180, 165, 25);
        panel.add(salaryTextField);

        JButton addEmpButton = new JButton("Add Employee"); // Button class is used to create a button

        addEmpButton.setBounds(10, 220, 100, 25);
        panel.add(addEmpButton);

        JButton clearButton = new JButton("Clear");

        clearButton.setBackground(Color.BLUE);
        clearButton.setFont(new Font("consolas", Font.BOLD, 18));
        clearButton.setForeground(Color.white);
        clearButton.setBounds(150, 220, 100, 25);
        panel.add(clearButton);

        JTextArea employeeDetailsTextArea = new JTextArea(); // TextArea is where you can types or show the input given
                                                             // in textField
        employeeDetailsTextArea.setBounds(280, 100, 200, 200);
        panel.add(employeeDetailsTextArea);

        addEmpButton.addActionListener(new ActionListener() { // adding the addActionListener method to button for making
                                                              // action
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText(); // getText method is used for taking the input
                String designation = designationTextField.getText();
                String department = departmentTextField.getText();
                String salary = salaryTextField.getText();

                employeeDetailsTextArea.append("Name: " + name + "\n"); // append method is used to append in the
                // TextArea where the data will show....
                employeeDetailsTextArea.append("Designation: " + designation + "\n");
                employeeDetailsTextArea.append("Department: " + department + "\n");
                employeeDetailsTextArea.append("Salary: " + salary + "\n\n");

                nameTextField.setText(""); // setText is also a method uset for what you want to show the data in input
                // field here setText("" --> this "" show the data in empty afted append the
                // input data in the TextArea)
                designationTextField.setText("");
                departmentTextField.setText("");
                salaryTextField.setText("");
            }
        });

        clearButton.addActionListener(new ActionListener() { // adding the addActionListener to button for making action
            public void actionPerformed(ActionEvent e) { // class actionPerformed (ActionEvent e --> object)
                nameTextField.setText(""); // Here inside the setText("" --> this blank is used to clear the input data
                                           // or
                                           // clear screen of TextField )
                designationTextField.setText("");
                departmentTextField.setText("");
                salaryTextField.setText("");
                employeeDetailsTextArea.setText("");
            }
        });
    }

    public static void main(String[] args) { // main method used
        Idcard id = new Idcard();
    }
}