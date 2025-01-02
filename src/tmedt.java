import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tmedt {
    public static void main(){
        JFrame tmfrm = new JFrame("VoteDrop - Settings");
        ImageIcon logo = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/logo.png"));
        tmfrm.setIconImage(logo.getImage());
        tmfrm.setVisible(true);
        tmfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tmfrm.setLayout(null);
        tmfrm.setResizable(false);
        tmfrm.setSize(800, 600);


        JLabel head = new JLabel(" Select Break time From following (in seconds) -" );
        tmfrm.add(head);
        head.setBounds(20,30,600,45);
        head.setFont(new Font("Ariel", Font.BOLD, 20));
        JRadioButton _2sec = new JRadioButton("2");
        tmfrm.add(_2sec);
        _2sec.setBounds(20, 100, 450,45);
        JRadioButton _3sec = new JRadioButton("3");
        tmfrm.add(_3sec);
        _3sec.setBounds(20,150, 450, 45 );
        JRadioButton _4sec = new JRadioButton("4");
        tmfrm.add(_4sec);
        _4sec.setBounds(20, 200, 450, 45);
        JRadioButton _5sec = new JRadioButton("5");
        tmfrm.add(_5sec);
        _5sec.setBounds(20, 250, 450, 45);
        JRadioButton _6sec = new JRadioButton("6");
        tmfrm.add(_6sec);
        _6sec.setBounds(20, 300, 450, 45);

        ButtonGroup bg = new ButtonGroup();
        bg.add(_2sec); bg.add(_3sec); bg.add(_4sec); bg.add(_5sec); bg.add(_6sec);

        JButton cnfm = new JButton("Confirm");
        tmfrm.add(cnfm);
        cnfm.setBounds(150, 400, 120, 40);

        cnfm.setBorder(BorderFactory.createEmptyBorder());
        cnfm.setHorizontalTextPosition(JButton.CENTER);
        cnfm.setHorizontalAlignment(JButton.CENTER);

        ImageIcon dflt = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/default.png"));
        ImageIcon rlbt = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/ds1.png"));
        ImageIcon slbt = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/ds2.png"));

        cnfm.setIcon(dflt);

        cnfm.setRolloverIcon(rlbt);
        cnfm.setSelectedIcon(slbt);
        cnfm.setPressedIcon(slbt);

        cnfm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(_2sec.isSelected()){
                    VoteDrop.brktime = 2000;
                }

                if (_3sec.isSelected()){
                    VoteDrop.brktime = 3000;
                }
                if (_4sec.isSelected()){
                    VoteDrop.brktime = 4000;
                }
                if (_5sec.isSelected()){
                    VoteDrop.brktime = 5000;
                }
                if (_6sec.isSelected()){
                    VoteDrop.brktime = 6000;
                }
                tmfrm.setVisible(false);
                menusett.mnstmain();
                System.out.printf(String.valueOf(VoteDrop.brktime));

            }
        });

    }
}
