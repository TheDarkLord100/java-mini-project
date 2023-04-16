import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

class Project {
    public static void main(String[] args) {

        Project obj = new Project();

        JFrame frame = new JFrame("Vijayant Singh");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        c.anchor = GridBagConstraints.NORTH;
        c.weighty = 1.0;
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

        JLabel errorLabel = new JLabel("");


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

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.size() == 0) {
                    errorLabel.setVisible(false);
                }
                list.add(0, obj.getRandomNumber());
                listLabel.setText(list.toString());
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.size() == 0) {
                    errorLabel.setText("List is already Empty");
                    errorLabel.setVisible(true);
                    return ;
                }
                list.removeLast();
                listLabel.setText(list.toString());
            }
        });

        JPanel stackButtonPanel = new JPanel(new FlowLayout());
        JButton pushButton = new JButton("Push");
        JButton popButton = new JButton("Pop");
        stackButtonPanel.add(pushButton);
        stackButtonPanel.add(popButton);

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.size() == 0) {
                    errorLabel.setVisible(false);
                }
                list.add(0, obj.getRandomNumber());
                listLabel.setText(list.toString());
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.size() == 0) {
                    errorLabel.setText("List is already Empty");
                    errorLabel.setVisible(true);
                    return ;
                }
                list.removeFirst();
                listLabel.setText(list.toString());
            }
        });

        c.gridy = 4;
        panel.add(stackButtonPanel, c);

        c.gridy = 5;
        panel.add(errorLabel, c);
        errorLabel.setVisible(false);

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

    int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}