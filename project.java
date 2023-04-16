import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

class Project {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vijayant Singh");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 8, 20, 8);


        JLabel buttonHeading = new JLabel("Data Structure");
        panel.add(buttonHeading, c);

        JRadioButton stackButton = new JRadioButton("Stack");
        JRadioButton queueButton = new JRadioButton("Queue");
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(0, 0, 0, 0);
        panel.add(stackButton, c);

        c.gridx = 1;
        panel.add(queueButton, c);

        ButtonGroup group = new ButtonGroup();
        group.add(queueButton);
        group.add(stackButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}