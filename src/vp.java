import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class vp {
    static JFrame vpf = new JFrame("VoteDrop - Voting Page");
    public static void main(){
        final int[] votercount = {0};

        ImageIcon dfb = new ImageIcon("src/main/resources/img/default.png");
        ImageIcon bt1 = new ImageIcon("src/main/resources/img/ds1.png");
        ImageIcon bt2 = new ImageIcon("src/main/resources/img/ds2.png");

        ImageIcon lgf = new ImageIcon("src/main/resources/img/logo.png");
        vpf.setIconImage(lgf.getImage());

        Color nblk = new Color(220, 242, 226);
        vpf.getContentPane().setBackground(nblk);

        Color nbtcl = new Color(207, 199, 134);

        JButton endvt = new JButton("end");
        endvt.setBounds(700,2,64,20);
        endvt.setBackground(nbtcl);
        endvt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vpb.main();

            }
        });

        Font abc = new Font("Arial", Font.BOLD, 15);




        JLabel cannme = new JLabel(" CANDIDATES -> ");
        cannme.setBounds(10, 10, 500,50);
        cannme.setFont(new Font("Arial", Font.BOLD, 24));

        JRadioButton can1 = new JRadioButton();
        can1.setText(VoteDrop.nmcn1);
        can1.setBounds(60, 60, 150, 50);
        can1.setFont(abc);

        JRadioButton can2 = new JRadioButton();
        can2.setText(VoteDrop.nmcn2);
        can2.setBounds(60, 100, 150,50);
        can2.setFont(abc);

        JRadioButton can3 = new JRadioButton();
        can3.setText(VoteDrop.nmcn3);
        can3.setBounds(60,140,150,50);
        can3.setFont(abc);

        JRadioButton can4 = new JRadioButton();
        can4.setText(VoteDrop.nmcn4);
        can4.setBounds(60, 180, 150,50);
        can4.setFont(abc);

        JRadioButton can5 = new JRadioButton();
        can5.setText(VoteDrop.nmcn5);
        can5.setBounds(60,220, 150,50);
        can5.setFont(abc);

        JRadioButton can6 = new JRadioButton();
        can6.setText(VoteDrop.nmcn6);
        can6.setBounds(60,260,150,50);
        can6.setFont(abc);




        ButtonGroup canbg = new ButtonGroup();
        canbg.add(can1); canbg.add(can2); canbg.add(can3); canbg.add(can4); canbg.add(can5); canbg.add(can6);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(400, 400, 190,40);
        submit.setHorizontalAlignment(JButton.CENTER);
        submit.setHorizontalTextPosition(JButton.CENTER);
        submit.setIcon(dfb);
        submit.setRolloverIcon(bt1);
        submit.setPressedIcon(bt2);


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (can1.isSelected()) {
                    VoteDrop.voteofcan1++;
                }

                if (can2.isSelected()) {
                    VoteDrop.voteofcan2++;
                }

                if (can3.isSelected()) {
                    VoteDrop.voteofcan3++;
                }
                if (can4.isSelected()) {
                    VoteDrop.voteofcan4++;
                }
                if (can5.isSelected()) {
                    VoteDrop.voteofcan5++;
                }
                if (can6.isSelected()) {
                    VoteDrop.voteofcan6++;
                }
                canbg.clearSelection();
                votercount[0]++;



                submit.setEnabled(false);


                SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
                    @Override
                    protected Void doInBackground() throws Exception {

                        Thread.sleep(5000);// change time as per your flexibility
                        return null;
                    }

                    @Override
                    protected void done() {
                        submit.setEnabled(true);
                    }
                };


                worker.execute();
            }
        });



        if (VoteDrop.tocan == 2){
            vpf.add(can1); vpf.add(can2);
        }
        if (VoteDrop.tocan == 3){
            vpf.add(can1); vpf.add(can2); vpf.add(can3);
        }
        if (VoteDrop.tocan == 4){
            vpf.add(can1); vpf.add(can2); vpf.add(can3); vpf.add(can4);
        }
        if (VoteDrop.tocan == 5){
            vpf.add(can1); vpf.add(can2); vpf.add(can3); vpf.add(can4); vpf.add(can5);
        }
        if (VoteDrop.tocan == 6){
            vpf.add(can1); vpf.add(can2); vpf.add(can3); vpf.add(can4); vpf.add(can5); vpf.add(can6);
        }





        vpf.add(endvt);   vpf.add(cannme);


        vpf.add(submit);

        vpf.setSize(800,600);
        vpf.setLayout(null);
        vpf.setResizable(false);
        vpf.setVisible(true);
        vpf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void hideframe(){
        vpf.setVisible(false);
    }

    public static void showframe(){
        vpf.setVisible(true);
    }
}

