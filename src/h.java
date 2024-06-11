import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class h {
    static JFrame hf = new JFrame("VoteDrop - Home");
    public static void hmain() {

        Color nsb = new Color(220, 242, 226);





        Color nblk = new Color(46, 59, 66);
        JPanel hpnl = new JPanel();

        hpnl.setLayout(null);
        hpnl.setBounds(0, 0, 200, 600);
        hpnl.setBackground(nblk);

        JPanel[] emp = new JPanel[4];

        for(int x = 0; x < emp.length; x++){
            emp[x] = new JPanel() ;
            emp[x].setBackground(nblk);
        }
        ClassLoader classLoader = h.class.getClassLoader();

        ImageIcon dflt = new ImageIcon("src/main/resources/img/default.png");
        ImageIcon rlbt = new ImageIcon("src/main/resources/img/ds1.png");
        ImageIcon slbt = new ImageIcon("src/main/resources/img/ds2.png");
        ImageIcon lg = new ImageIcon("src/main/resources/img/logo.png");
        ImageIcon lg2 = new ImageIcon("src/main/resources/img/logo2.png");
        ImageIcon lg3 = new ImageIcon("src/main/resources/img/logo3.png");



        hf.setIconImage(lg.getImage());


        JButton settbt = new JButton("Settings");
        settbt.setBorder(BorderFactory.createEmptyBorder());

        settbt.setBounds(5,100, 190,40);
        settbt.setIcon(dflt);
        settbt.setHorizontalAlignment(JButton.CENTER);
        settbt.setHorizontalTextPosition(JButton.CENTER);

        settbt.setRolloverIcon(rlbt);
        settbt.setSelectedIcon(slbt);
        settbt.setPressedIcon(slbt);

        settbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settpg.main();
                hf.setVisible(false);
            }
        });


        JButton gitbt = new JButton("Github");
        gitbt.setBorder(BorderFactory.createEmptyBorder());

        gitbt.setBounds(5,150, 190,40);
        gitbt.setIcon(dflt);
        gitbt.setHorizontalAlignment(JButton.CENTER);
        gitbt.setHorizontalTextPosition(JButton.CENTER);

        gitbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Desktop.isDesktopSupported()) {

                    {
                        Desktop desk = Desktop.getDesktop();


                        try {
                            desk.browse(new URI("https://github.com/Pulkit-Vohra"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } catch (URISyntaxException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }
        });



        gitbt.setRolloverIcon(rlbt);
        gitbt.setSelectedIcon(slbt);
        gitbt.setPressedIcon(slbt);

        JButton insbt = new JButton("Instagram");
        insbt.setBorder(BorderFactory.createEmptyBorder());

        insbt.setBounds(5,190, 190,40);
        insbt.setIcon(dflt);
        insbt.setHorizontalAlignment(JButton.CENTER);
        insbt.setHorizontalTextPosition(JButton.CENTER);

        insbt.setRolloverIcon(rlbt);
        insbt.setSelectedIcon(slbt);
        insbt.setPressedIcon(slbt);

        insbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Desktop.isDesktopSupported()) {

                    {
                        Desktop desk = Desktop.getDesktop();


                        try {
                            desk.browse(new URI("https://www.instagram.com/pulkit__vohra/"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } catch (URISyntaxException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }

        });



        JButton rptbt = new JButton("Report Bug");
        rptbt.setBorder(BorderFactory.createEmptyBorder());

        rptbt.setBounds(5,230, 190,40);
        rptbt.setIcon(dflt);
        rptbt.setHorizontalAlignment(JButton.CENTER);
        rptbt.setHorizontalTextPosition(JButton.CENTER);

        rptbt.setRolloverIcon(rlbt);
        rptbt.setSelectedIcon(slbt);
        rptbt.setPressedIcon(slbt);

        rptbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Desktop.isDesktopSupported()) {

                    {
                        Desktop desk = Desktop.getDesktop();


                        try {
                            desk.browse(new URI("https://t.me/User_is_bot"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } catch (URISyntaxException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }

        });

        JButton abtbt = new JButton("About");
        abtbt.setBorder(BorderFactory.createEmptyBorder());

        abtbt.setBounds(5,270, 190,40);
        abtbt.setIcon(dflt);
        abtbt.setHorizontalAlignment(JButton.CENTER);
        abtbt.setHorizontalTextPosition(JButton.CENTER);
        abtbt.setRolloverIcon(rlbt);
        abtbt.setSelectedIcon(slbt);
        abtbt.setPressedIcon(slbt);


        JLabel vrlbl = new JLabel("Version 1.1");


        vrlbl.setBounds(100,530, 190,40);
        vrlbl.setForeground(Color.RED);


        Color infocol = new Color(100, 119, 217);

        JLabel info = new JLabel("Click on the Logo to Start");
        info.setFont(new Font("Arial", Font.PLAIN, 24));

        info.setBounds(350, 100, 300, 40);
        info.setForeground(infocol);

        JButton stbttn = new JButton();
        stbttn.setBounds(400, 150, 200, 200);
        stbttn.setBorder(BorderFactory.createEmptyBorder());
        stbttn.setIcon(lg);
        stbttn.setRolloverIcon(lg2);
        stbttn.setSelectedIcon(lg3);
        stbttn.setPressedIcon(lg3);

        stbttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                st.main();
                hf.setVisible(false);
            }
        });


        JLabel crdt = new JLabel("By - PV");
        crdt.setBounds(740,530, 190,40);


        hpnl.add(settbt);
        hpnl.add(gitbt);
        hpnl.add(insbt);
        hpnl.add(rptbt);

        hpnl.add(vrlbl);


        hf.add(hpnl); hf.add(info); hf.add(stbttn); hf.add(crdt);
        hf.setSize(800, 600);

        hf.setLayout(null);
        hf.setVisible(true);
        hf.setResizable(false);
        hf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void vihf (){
        hf.setVisible(true);
    }
}
