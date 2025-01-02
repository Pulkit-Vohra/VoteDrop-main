import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class menusett {

    public static void mnstmain(){
        JFrame mstframe = new JFrame("VoteDrop - Settings");
        ImageIcon logo = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/logo.png"));
        mstframe.setIconImage(logo.getImage());
        mstframe.setVisible(true);
        mstframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mstframe.setLayout(null);
        mstframe.setResizable(false);
        mstframe.setSize(800, 600);


        Color nblk = new Color(46, 59, 66);


        JPanel mnopt = new JPanel();
        mstframe.add(mnopt);
        mnopt.setLayout(null);
        mnopt.setVisible(true);
        mnopt.setBounds(50, 0, 300, 600);
        mnopt.setBackground(nblk);


        ImageIcon mnico1 = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/mnico1.png"));
        ImageIcon mnico2 = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/mnico2.png"));
        ImageIcon mnico3 = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/mnico3.png"));
        ImageIcon mnico4 = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/mnico4.png"));


        JLabel mnicon = new JLabel();
        mstframe.add(mnicon);
        mnicon.setVisible(true);
        mnicon.setBounds(450,150,200,200);


        JLabel mninfo = new JLabel();
        mstframe.add(mninfo);
        mninfo.setVisible(true);
        mninfo.setFont(new Font("Ariel", Font.BOLD, 13));
        mninfo.setForeground(Color.decode("#5188e0"));
        mninfo.setBounds(470, 375, 250, 90);

        ImageIcon dflt = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/default.png"));
        ImageIcon rlbt = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/ds1.png"));
        ImageIcon slbt = new ImageIcon(menusett.class.getClassLoader().getResource("main/resources/img/ds2.png"));


        JButton bt = new JButton("Edit Number of Candidates");
        bt.setBorder(BorderFactory.createEmptyBorder());

        bt.setBounds(55, 100, 190, 40);
        bt.setIcon(dflt);
        bt.setHorizontalAlignment(JButton.CENTER);
        bt.setHorizontalTextPosition(JButton.CENTER);

        bt.setRolloverIcon(rlbt);
        bt.setSelectedIcon(slbt);
        bt.setPressedIcon(slbt);

        bt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                mnicon.setIcon(mnico1);
                mninfo.setText("<html>Edit Total Number <BR>of Candidates Contesting<BR>in this Election.<BR></html>");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                mnicon.setIcon(null);
                mninfo.setText(null);
            }
        });
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settpg.main();
                mstframe.setVisible(false);
            }
        });

        mnopt.add(bt);


        JButton bt1 = new JButton("Edit name of Candidates");
        bt1.setBorder(BorderFactory.createEmptyBorder());

        bt1.setBounds(55, 150, 190, 40);
        bt1.setIcon(dflt);
        bt1.setHorizontalAlignment(JButton.CENTER);
        bt1.setHorizontalTextPosition(JButton.CENTER);

        bt1.setRolloverIcon(rlbt);
        bt1.setSelectedIcon(slbt);
        bt1.setPressedIcon(slbt);

        bt1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                mnicon.setIcon(mnico2);
                mninfo.setText("<html>Edit Names of each<BR> Candidate Contesting<BR>in this Election.<BR></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                mnicon.setIcon(null);
                mninfo.setText(null);
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edt.main();
                mstframe.setVisible(false);
            }
        });


        mnopt.add(bt1);


        JButton bt2 = new JButton("Edit Break Timer");
        bt2.setBorder(BorderFactory.createEmptyBorder());

        bt2.setBounds(55, 200, 190, 40);
        bt2.setIcon(dflt);
        bt2.setHorizontalAlignment(JButton.CENTER);
        bt2.setHorizontalTextPosition(JButton.CENTER);

        bt2.setRolloverIcon(rlbt);
        bt2.setSelectedIcon(slbt);
        bt2.setPressedIcon(slbt);

        bt2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                mnicon.setIcon(mnico3);
                mninfo.setText("<html>Edit Break time<BR> Between two Continuous Voting.<BR> This will disable voting<BR> Button for a selected<BR> time.</html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                mnicon.setIcon(null);
                mninfo.setText(null);
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tmedt.main();
                mstframe.setVisible(false);
            }
        });
        mnopt.add(bt2);

        JButton bt3 = new JButton(" Back to Home");

        bt3.setBorder(BorderFactory.createEmptyBorder());

        bt3.setBounds(55, 250, 190, 40);
        bt3.setIcon(dflt);
        bt3.setHorizontalAlignment(JButton.CENTER);
        bt3.setHorizontalTextPosition(JButton.CENTER);

        bt3.setRolloverIcon(rlbt);
        bt3.setSelectedIcon(slbt);
        bt3.setPressedIcon(slbt);

        bt3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                mnicon.setIcon(mnico4);
                mninfo.setText("<html> Get back to where<BR>you started </html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                mnicon.setIcon(null);
                mninfo.setText(null);
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mstframe.setVisible(false);
                h.hmain();

            }
        });
        mnopt.add(bt3);


    }
}
