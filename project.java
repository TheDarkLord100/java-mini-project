import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.*;

class Project {
    public static void main(String[] args) {

        Project obj = new Project();

        JFrame frame = new JFrame("Vijayant Singh");
        frame.setSize(400, 400);
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

        LinkedList<Integer> list = obj.getList();
        JLabel listLabel = new JLabel(list.toString());
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.insets = new Insets(20, 0, 0, 0);
        panel.add(listLabel, c);

        JPanel queueButtonPanel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        queueButtonPanel.add(addButton);
        queueButtonPanel.add(deleteButton);

        c.gridy = 3;
        panel.add(queueButtonPanel, c);

        JPanel stackButtonPanel = new JPanel(new FlowLayout());
        JButton pushButton = new JButton("Push");
        JButton popButton = new JButton("Pop");
        stackButtonPanel.add(pushButton);
        stackButtonPanel.add(popButton);

        c.gridy = 4;
        panel.add(stackButtonPanel, c);

        stackButtonPanel.setVisible(false);
        queueButtonPanel.setVisible(false);

        stackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stackButton.isSelected()) {
                    stackButtonPanel.setVisible(true);
                    queueButtonPanel.setVisible(false);
                }
            }
        });

        queueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(queueButton.isSelected()) {
                    stackButtonPanel.setVisible(false);
                    queueButtonPanel.setVisible(true);
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    LinkedList<Integer> getList() {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            newList.add(rand.nextInt(100));
        }
        return newList;
    }
}