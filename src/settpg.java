

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class settpg {
    static JFrame spgfr = new JFrame("VoteDrop - Settings");
    public static void main(){


        ImageIcon lgf = new ImageIcon(settpg.class.getClassLoader().getResource("main/resources/img/logo.png"));
        spgfr.setIconImage(lgf.getImage());

        Color nblk = new Color(220, 242, 226);

        Color sftrd = new Color(245, 110, 100);

        Font abc = new Font("Arial", Font.BOLD, 15);



        // spgfr.getContentPane().setBackground(nblk);

        JButton edtnme = new JButton("Edit Names");
        edtnme.setBounds(500, 400, 130,30);
        edtnme.setBackground(sftrd);
        edtnme.setBorderPainted(false);

        edtnme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spgfr.setVisible(false);
                edt.main();
            }
        });



        JLabel info = new JLabel("Select Number Of Total Candidates - ");
        info.setBounds(30,10,500,50);
        info.setFont(new Font("Arial", Font.BOLD, 24));

        JRadioButton rb1 = new JRadioButton("2 candidates");
        JRadioButton rb2 = new JRadioButton("3 candidates");
        JRadioButton rb3 = new JRadioButton("4 candidates");
        JRadioButton rb4 = new JRadioButton("5 candidates");
        JRadioButton rb5 = new JRadioButton("6 candidates");

        rb1.setBounds(60,60, 150, 50);
        rb2.setBounds(60,120,150,50);
        rb3.setBounds(60,180, 150, 50);
        rb4.setBounds(60,240, 150, 50);
        rb5.setBounds(60,300, 150, 50);

        rb1.setFont(abc);
        rb2.setFont(abc);
        rb3.setFont(abc);
        rb4.setFont(abc);
        rb5.setFont(abc);






        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2); bg.add(rb3); bg.add(rb4); bg.add(rb5);

        JButton cnfbt = new JButton("Confirm");
        cnfbt.setBounds(390, 400, 100,30);
        cnfbt.setBorderPainted(false);
        cnfbt.setBackground(Color.WHITE);
        cnfbt.setForeground(sftrd);




        cnfbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()){
                    VoteDrop.tocan = 2;
                }
                if (rb2.isSelected()){
                    VoteDrop.tocan = 3;
                }
                if (rb3.isSelected()){
                    VoteDrop.tocan = 4;
                }
                if (rb4.isSelected()){
                    VoteDrop.tocan = 5;
                }
                if (rb5.isSelected()){
                    VoteDrop.tocan = 6;
                }
                spgfr.setVisible(false);
                menusett.mnstmain();

            }
        });






        spgfr.add(rb1); spgfr.add(rb2); spgfr.add(rb3); spgfr.add(rb4); spgfr.add(rb5); spgfr.add(edtnme);
        spgfr.add(cnfbt);
        spgfr.add(info);


        spgfr.setSize(800,600);
        spgfr.setLayout(null);
        spgfr.setVisible(true);
        spgfr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void showframe(){
        spgfr.setVisible(true);
    }



}
