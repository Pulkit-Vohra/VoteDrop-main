import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class st {
    public static void main() {

        ImageIcon log = new ImageIcon("src/main/resources/img/logo.png");



        ImageIcon dfb = new ImageIcon("src/main/resources/img/default.png");
        ImageIcon bt1 = new ImageIcon("src/main/resources/img/ds1.png");
        ImageIcon bt2 = new ImageIcon("src/main/resources/img/ds2.png");


        Color nrd = new Color(143, 72, 67);
        Color nblk = new Color(220, 242, 226);

        JLabel lablpass;
        final JPasswordField[] passfield = new JPasswordField[1];
        JButton enterpass;
        JFrame stf = new JFrame("VoteDrop - Set Pass");
        stf.setIconImage(log.getImage());

        stf.getContentPane().setBackground(nblk);

        lablpass = new JLabel("Enter PassWord");
        lablpass.setBounds(300,100,500,50);
        lablpass.setFont(new Font("Arial", Font.BOLD, 20));
        lablpass.setForeground(nrd);

        passfield[0] = new JPasswordField();
        passfield[0].setBounds(300,150,150,50);
        passfield[0].setEchoChar('*');

        ImageIcon psh = new ImageIcon("src/main/resources/img/psh.png");



        enterpass = new JButton("Confirm");
        enterpass.setBounds( 300,300,190,40);
        enterpass.setHorizontalAlignment(JButton.CENTER);
        enterpass.setHorizontalTextPosition(JButton.CENTER);
        enterpass.setIcon(dfb);
        enterpass.setRolloverIcon(bt1);
        enterpass.setPressedIcon(bt2);

        enterpass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VoteDrop.passw = passfield[0].getText();


                stf.setVisible(false);

                vp.main();
            }
        });

        JToggleButton passhhd = new JToggleButton(psh);
        passhhd.setBounds(460, 155, 40,40);


          passhhd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (passhhd.isSelected()){
            passfield[0].setEchoChar((char)0);
        }
        else {
            passfield[0].setEchoChar('*');
        }
            }
        });

        stf.add(passfield[0]); stf.add(enterpass); stf.add(lablpass); stf.add(passhhd);
        stf.setSize(800,600);
        stf.setLayout(null);
        stf.setVisible(true);
        stf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}