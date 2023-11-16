import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton Login, Clear, SignIn, SignUp;
    JTextField cardTextField;
    JPasswordField  PINTextField;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon("icons/logo.png");
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 200, 200);
        add(label);
        JLabel text = new JLabel("Wellcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(250, 40, 400, 100);
        add(text);
        JLabel CardNo = new JLabel("Card No:");
        CardNo.setFont(new Font("Railway", Font.BOLD, 25));
        CardNo.setBounds(150, 150, 400, 100);
        add(CardNo);
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 190, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);
        JLabel PIN = new JLabel("PIN No:");
        PIN.setFont(new Font("Osward", Font.BOLD, 25));
        PIN.setBounds(150, 220, 400, 100);
        add(PIN);
        PINTextField = new JPasswordField();
        PINTextField.setBounds(300, 255, 230, 30);
        PINTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(PINTextField);
        Login = new JButton("SIGN IN");
        Login.setBounds(300, 300, 100, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);
        Clear = new JButton("CLEAR");
        Clear.setBounds(430, 300, 100, 30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);
        SignUp = new JButton("SIGN UP");
        SignUp.setBounds(300, 350, 230, 30);
        SignUp.setBackground(Color.BLACK);
        SignUp.setForeground(Color.WHITE);
        SignUp.addActionListener(this);
        add(SignUp);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Clear) {
            cardTextField.setText("");
            PINTextField.setText("");
        } else if (ae.getSource() == Login) {

        } else if (ae.getSource() == SignIn) {

        } else if (ae.getSource() == SignUp) {

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Login();
        sc.close();
    }
}