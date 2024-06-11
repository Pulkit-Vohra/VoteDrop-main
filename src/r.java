import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class r {




    public static void main(){
        JFrame rf = new JFrame("votingJAVA - Results");



        ImageIcon lgf = new ImageIcon("src/main/resources/img/logo.png");
        rf.setIconImage(lgf.getImage());
        Color nblk = new Color(220, 242, 226);
        rf.getContentPane().setBackground(nblk);




        JLabel win1 = new JLabel("");
        win1.setForeground(Color.RED);
        win1.setFont(new Font("Arial", Font.BOLD, 25));
        win1.setBounds(100, 100, 350, 50);

        int rc1 = VoteDrop.voteofcan1;
        int rc2 = VoteDrop.voteofcan2;
        int rc3 = VoteDrop.voteofcan3;
        int rc4 = VoteDrop.voteofcan4;
        int rc5 = VoteDrop.voteofcan5;
        int rc6 = VoteDrop.voteofcan6;

        JLabel tvote1 = new JLabel(VoteDrop.nmcn1+" -> "+rc1);
        JLabel tvote2 = new JLabel(VoteDrop.nmcn2+" -> "+rc2);
        JLabel tvote3 = new JLabel(VoteDrop.nmcn3+" -> "+rc3);
        JLabel tvote4 = new JLabel(VoteDrop.nmcn4+" -> "+rc4);
        JLabel tvote5 = new JLabel(VoteDrop.nmcn5+" -> "+rc5);
        JLabel tvote6 = new JLabel(VoteDrop.nmcn6+" -> "+rc6);


        //designing start
        JButton shwwnr = new JButton();
        shwwnr.setFont(new Font("Arial", Font.PLAIN, 24));
        Color infocol = new Color(100, 119, 217);
        shwwnr.setBounds(280, 30, 250, 40);
        ImageIcon shwn = new ImageIcon("src/main/resources/img/shwnrbt.jpg");
        ImageIcon shwn2 = new ImageIcon("src/main/resources/img/shwnrbt2.jpg");
        shwwnr.setIcon(shwn);
        shwwnr.setRolloverIcon(shwn2);
        shwwnr.setBorder(null);
        rf.add(shwwnr);
        ImageIcon pnbg = new ImageIcon("src/main/resources/img/winners.png");

        ImagePanel wnnme = new ImagePanel("src/main/resources/img/winners.png");


        wnnme.setBounds(100,90,600,300);

        rf.add(wnnme);
        wnnme.setVisible(false);
        shwwnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wnnme.setVisible(true);
            }
        });




        ImageIcon rltbg = new ImageIcon("src/main/resources/img/result.png");
        ImagePanel rslt = new ImagePanel("src/main/resources/img/result.png");


        rslt.setBounds(50, 400,700,250);





        int totalnoofcan = VoteDrop.tocan;
        int[] votescounting = {rc1, rc2, rc3, rc4, rc5, rc6};

        String[] candidatesname = {VoteDrop.nmcn1,VoteDrop.nmcn2, VoteDrop.nmcn3, VoteDrop.nmcn4, VoteDrop.nmcn4, VoteDrop.nmcn5};
        JLabel[] wn1 = new JLabel[6];

       for (int j = 0; j<6; j++){
           wn1[j] = new JLabel(candidatesname[j]);

       }




        int maxvotes = findwinner(votescounting);

        System.out.println("\n(s) with the highest number of (" + maxvotes + "):");
        for (int i = 0; i < 6; i++) {
            if (votescounting[i] == maxvotes) {
                wn1[i].setText(candidatesname[i]);
            }
        }

        JLabel wnr[] = new JLabel[6];
        Font abc = new Font("Arial", Font.BOLD, 22);
        for(int j=0; j<wnr.length; j++){
            wnr[j] = new JLabel();
            wnr[j].setFont(abc);
        }


        StringBuilder winnernames = new StringBuilder();
        int k = 0;


            if(rc1 == maxvotes){wnr[k].setText(String.valueOf(VoteDrop.nmcn1)); k++;}
            if(rc2 == maxvotes){wnr[k].setText(String.valueOf(VoteDrop.nmcn2)); k++; }
            if(rc3 == maxvotes){wnr[k].setText(String.valueOf(VoteDrop.nmcn3)); k++; }
            if(rc4 == maxvotes){wnr[k].setText(String.valueOf(VoteDrop.nmcn4)); k++; }
            if(rc5 == maxvotes){wnr[k].setText(String.valueOf(VoteDrop.nmcn5)); k++; }
            if(rc6 == maxvotes){wnr[k].setText(String.valueOf(VoteDrop.nmcn6)); k++; }

        wnr[0].setBounds(210,15,200,50);
        wnr[1].setBounds(210,50, 200, 50);
        wnr[2].setBounds(210,95,200,50);
        wnr[3].setBounds(210,130, 200, 50);
        wnr[4].setBounds(210,175,200,50);
        wnr[5].setBounds(210,220, 200, 50);


        wnnme.add(wnr[0]);
        wnnme.add(wnr[1]);
        wnnme.add(wnr[2]);
        wnnme.add(wnr[3]);
        wnnme.add(wnr[4]);
        wnnme.add(wnr[5]);
        System.out.printf(String.valueOf(winnernames));

        for (int l = 0; l == totalnoofcan;){
            if (Objects.equals(wnr[l].getText(), "")){ wnr[l].setVisible(false);}
          l++;
        }


        tvote1.setBounds(40, 55, 150, 50);
        tvote2.setBounds(40, 140, 150, 50);
        tvote3.setBounds(280, 55, 150, 50);
        tvote4.setBounds(280, 140, 150, 50);
        tvote5.setBounds(520, 55, 150, 50);
        tvote6.setBounds(520, 140, 150, 50);




        if (VoteDrop.tocan == 2){

            rslt.add(tvote1); rslt.add(tvote2);

        }
        if (VoteDrop.tocan == 3){
            rslt.add(tvote1); rslt.add(tvote2); rslt.add(tvote3);
        }
        if (VoteDrop.tocan == 4){
            rslt.add(tvote1); rslt.add(tvote2); rslt.add(tvote3); rslt.add(tvote4);
        }
        if (VoteDrop.tocan == 5){
            rslt.add(tvote1); rslt.add(tvote2); rslt.add(tvote3); rslt.add(tvote4); rslt.add(tvote5);
        }
        if (VoteDrop.tocan == 6){
            rslt.add(tvote1); rslt.add(tvote2); rslt.add(tvote3); rslt.add(tvote4); rslt.add(tvote5); rslt.add(tvote6);
        }

         rf.add(win1);


        rf.add(rslt);
        rf.setLayout(null);
        rf.setSize(800,700);
        rf.setVisible(true);
        rf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        rf.setResizable(false);

    }

    public static int findwinner(int[] allvotes) {
        if (allvotes.length == 0) {
            throw new IllegalArgumentException("At least one Candidate is required");
        }

        int max = allvotes[0];
        for (int i = 1; i < allvotes.length; i++) {
            if (allvotes[i] > max) {
                max = allvotes[i];
            }
        }
        return max;
    }




}


