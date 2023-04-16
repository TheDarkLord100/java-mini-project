import java.awt.Component;

import javax.swing.*;

class Project {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vijayant Singh");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel buttonHeading = new JLabel("Data Structure");
        panel.add(buttonHeading);
        buttonHeading.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton stackButton = new JRadioButton("Stack");
        JRadioButton queueButton = new JRadioButton("Queue");
        stackButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        queueButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(stackButton);
        panel.add(queueButton);

        ButtonGroup group = new ButtonGroup();
        group.add(queueButton);
        group.add(stackButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}