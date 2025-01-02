import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class vpb {
    public static void main(){
        JFrame vpbf = new JFrame("VoteDrop - Verify Password");

        ImageIcon lgf = new ImageIcon(vpb.class.getClassLoader().getResource("main/resources/img/logo.png"));
        vpbf.setIconImage(lgf.getImage());

        Font abc = new Font("Arial", Font.BOLD, 15);


        vp.hideframe();

        Color nblk = new Color(220, 242, 226);


        Color sftrd = new Color(245, 110, 100);

        vpbf.getContentPane().setBackground(nblk);

        JButton canbut = new JButton("Cancel");
        canbut.setBounds(330,200,100,30);
        canbut.setBorderPainted(false);
        canbut.setBackground(Color.WHITE);
        canbut.setForeground(sftrd);

        canbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vpbf.setVisible(false);
                vp.showframe();
            }
        });

        JLabel verlbl = new JLabel("Enter PassWord To Verify !! : ");
        verlbl.setFont(abc);
        verlbl.setBounds(10,40,500,50);

        JLabel wrongpas = new JLabel("WRONG PASSWORD, TRY AGAIN !");
        wrongpas.setBounds(200,150,200,50);
        wrongpas.setForeground(Color.RED);
        wrongpas.setVisible(false);

        JTextField verpass = new JTextField();
        verpass.setBounds(230,50,120,30);

        JButton butver = new JButton("Verify");
        butver.setBounds(450,200,100,30);
        butver.setBackground(sftrd);
        butver.setBorderPainted(false);



        butver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String verpassstring = verpass.getText();
                if(Objects.equals(verpassstring, VoteDrop.passw)){
                    System.out.println("pass correct");
                    wrongpas.setVisible(false);
                    vpbf.setVisible(false);
                    r.main();
                }
                else{
                    verpassstring = "";
                    verpass.setText("");
                    wrongpas.setVisible(true);

                }

            }
        });

        vpbf.add(verlbl); vpbf.add(verpass); vpbf.add(butver); vpbf.add(wrongpas);
        vpbf.add(canbut);


        vpbf.setSize(700,300);
        vpbf.setLayout(null);
        vpbf.setVisible(true);
        vpbf.setResizable(false);
        vpbf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
