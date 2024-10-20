import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui implements ActionListener {
    JLabel lbl;
    JLabel s1, s2;
    JTextField fld1;
    JTextField fld2;

    Gui() {
        /* Initial setup */
        JFrame frm = new JFrame("Admission Count"); // Create new frame
        frm.setSize(500, 300); // Set frame's initial size
        frm.setLayout(new FlowLayout()); // Specify FlowLayout for Layout Manager
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminate when user closes application

        /* Create items */
        s1 = new JLabel("CSE");
        fld1 = new JTextField(5); // Create field with 5 width
        s2 = new JLabel("CSBS");
        fld2 = new JTextField(5);
        JButton btn = new JButton("Submit"); // Create push buttons
        btn.addActionListener(this); // Set action listners for buttons
        lbl = new JLabel("               "); // Create text-based label
        /* Add items to content pane */
        frm.add(s1);
        frm.add(fld1);
        frm.add(s2);
        frm.add(fld2);
        frm.add(btn);
        frm.add(lbl);
        /* Display frame */
        frm.setVisible(true);
    }

    /* Button processing​ */
    public void actionPerformed(ActionEvent ae) {
        int ct1 = 0, ct2 = 0;
        boolean invalidFlag = false;
        try {
            ct1 = Integer.parseInt(fld1.getText());
            ct2 = Integer.parseInt(fld2.getText());
        } catch (NumberFormatException ex) {
            invalidFlag = true;
        }

        if (ae.getActionCommand().equals("Submit")) {
            if (invalidFlag) {
                lbl.setText("Error: Invalid number");
            } else {
                if (ct1 < 0 || ct2 < 0)
                    lbl.setText("Error: Negative value");
                else {
                    int count = ct1 + ct2;
                    lbl.setText("Admission count: " + count);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Gui();
    }
}