//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, clrButton;
    JPanel panel;


    Calculator(){

    };
    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }

    public void actionPerformned(ActionEvent e){

    }
}