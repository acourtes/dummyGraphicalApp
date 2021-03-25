package fr.arolla;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Toolkit;

public class MyGraphicalApp {

    public static void main(String[] args) {
        JButton button = getButtonClose();
        JLabel label = getLabel();

        var panel = new JPanel();
        panel.add(label);
        panel.add(button);

        JFrame frame = getFrame();
        frame.add(panel);
        frame.setVisible(true);
    }

    private static JFrame getFrame() {
        var frame = new JFrame("Beautiful graphical app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        var width = 350;
        var height = 200;
        frame.setBounds(screenSize.width / 2 - 100, screenSize.height /2 - 100, width, height);

        return frame;
    }

    private static JLabel getLabel() {
        var label = new JLabel();
        label.setText("My graphical app to package with jpackage !");

        return label;
    }

    private static JButton getButtonClose() {
        var button = new JButton("Close");
        button.setSize(60, 20);
        button.addActionListener(al -> System.exit(0));

        return button;
    }
}
