import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Objects;

public class edt {
    public static void main(){
        JFrame edtfm = new JFrame("VoteDrop - Edit Names");
        ImageIcon vtlg = new ImageIcon("src/main/resources/img/logo.png");

        JPanel edpnl = new JPanel();
        edpnl.setLayout(null);

        edtfm.setIconImage(vtlg.getImage());

        Font abc = new Font("Arial", Font.BOLD, 15);


       JLabel ed1 = new JLabel("Candidate no. 1 -> ");
       JLabel ed2 = new JLabel("Candidate no. 2 -> ");
       JLabel ed3 = new JLabel("Candidate no. 3 -> ");
       JLabel ed4 = new JLabel("Candidate no. 4 -> ");
       JLabel ed5 = new JLabel("Candidate no. 5 -> ");
       JLabel ed6 = new JLabel("Candidate no. 6 -> ");

       ed1.setBounds(30,20, 200,20);
       ed1.setFont(abc);

       ed2.setBounds(30, 70, 200, 20);
       ed2.setFont(abc);

       ed3.setBounds(30,120,200,20);
       ed3.setFont(abc);

       ed4.setBounds(30,170,200,20);
       ed4.setFont(abc);

       ed5.setBounds(30,220,200,20);
       ed5.setFont(abc);

       ed6.setBounds(30,270,200,20);
       ed6.setFont(abc);

       Color sftrd = new Color(245, 110, 100);


       JTextField ednm1 = new JTextField("Candidate no. 1");
        ednm1.setForeground(Color.GRAY);
       ednm1.addFocusListener(new FocusListener() {
                                  @Override
                                  public void focusGained(FocusEvent e) {
                                      if (ednm1.getForeground() == Color.GRAY){
                                          ednm1.setText("");
                                          ednm1.setForeground(sftrd);
                                      }
                                  }

                                  @Override
                                  public void focusLost(FocusEvent e) {
                                    if (ednm1.getText().trim().isEmpty()){
                                        ednm1.setText("Candidate No. 1");
                                        ednm1.setForeground(Color.GRAY);
                                    }
                              } });


       JTextField ednm2 = new JTextField("Candidate no. 2");
       ednm2.setForeground(Color.GRAY);
        ednm2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ednm2.getForeground() == Color.GRAY){
                    ednm2.setText("");
                    ednm2.setForeground(sftrd);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (ednm2.getText().trim().isEmpty()){
                    ednm2.setText("Candidate No. 2");
                    ednm2.setForeground(Color.GRAY);
                }
            }
        });

       JTextField ednm3 = new JTextField("Candidate no. 3");
        ednm3.setForeground(Color.GRAY);
        ednm3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ednm3.getForeground() == Color.GRAY){
                    ednm3.setText("");
                    ednm3.setForeground(sftrd);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (ednm3.getText().trim().isEmpty()){
                    ednm3.setText("Candidate No. 3");
                    ednm3.setForeground(Color.GRAY);
                }
            }
        });
       JTextField ednm4 = new JTextField("Candidate no. 4");
        ednm4.setForeground(Color.GRAY);
        ednm4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ednm4.getForeground() == Color.GRAY){
                    ednm4.setText("");
                    ednm4.setForeground(sftrd);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (ednm4.getText().trim().isEmpty()){
                    ednm4.setText("Candidate No. 4");
                    ednm4.setForeground(Color.GRAY);
                }
            }
        });
       JTextField ednm5 = new JTextField("Candidate no. 5");
        ednm5.setForeground(Color.GRAY);
        ednm5.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ednm5.getForeground() == Color.GRAY){
                    ednm5.setText("");
                    ednm5.setForeground(sftrd);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (ednm5.getText().trim().isEmpty()){
                    ednm5.setText("Candidate No. 5");
                    ednm5.setForeground(Color.GRAY);
                }
            }
        });
       JTextField ednm6 = new JTextField("Candidate no. 6");
        ednm6.setForeground(Color.GRAY);
       ednm6.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
               if (ednm6.getForeground() == Color.GRAY){
                   ednm6.setText("");
                   ednm6.setForeground(sftrd);
               }
           }

           @Override
           public void focusLost(FocusEvent e) {
               if (ednm6.getText().trim().isEmpty()){
                   ednm6.setText("Candidate No. 6");
                   ednm6.setForeground(Color.GRAY);
               }
           }
       });


       ednm1.setBounds(200, 20, 200, 20);
       ednm2.setBounds(200, 70,200,20);
       ednm3.setBounds(200,120,200,20);
       ednm4.setBounds(200,170,200,20);
       ednm5.setBounds(200,220,200, 20);
       ednm6.setBounds(200,270, 200, 20);


        JLabel dne = new JLabel("All Names Saved Successfully;");
        dne.setForeground(Color.BLACK);
        dne.setBounds(390,350,250,50);
        dne.setVisible(false);


        JButton cnbt = new JButton("Confirm");
       cnbt.setBackground(sftrd);
       cnbt.setBorderPainted(false);
       cnbt.setBounds(500, 400, 100,30);
       cnbt.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               VoteDrop.nmcn1 = ednm1.getText();
               VoteDrop.nmcn2 = ednm2.getText();
               VoteDrop.nmcn3 = ednm3.getText();
               VoteDrop.nmcn4 = ednm4.getText();
               VoteDrop.nmcn5 = ednm5.getText();
               VoteDrop.nmcn6 = ednm6.getText();
               dne.setVisible(true);
           }
       });

       JButton gbck = new JButton("Go Back");
       gbck.setBackground(Color.WHITE);
       gbck.setForeground(sftrd);
       gbck.setBorderPainted(false);

        gbck.setBounds(390, 400, 100,30);
        gbck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edtfm.setVisible(false);
                settpg.showframe();
            }
        });






       edpnl.add(ed1); edpnl.add(ed2); edpnl.add(ed3); edpnl.add(ed4); edpnl.add(ed4); edpnl.add(ed5); edpnl.add(ed6);

       edpnl.add(ednm1); edpnl.add(ednm2); edpnl.add(ednm3); edpnl.add(ednm4); edpnl.add(ednm5); edpnl.add(ednm6);
       edpnl.add(cnbt); edpnl.add(gbck);
       edpnl.add(dne);


       edtfm.add(edpnl);

       edtfm.setSize(800,600);
       edtfm.setVisible(true);
       edtfm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       edtfm.setLayout(null);
       edtfm.setResizable(false);



    }
}
