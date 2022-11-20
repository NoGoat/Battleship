import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main
{
    int flag = 0;
    String[] aircraft_pos = new String[5];
    String[] battleship_pos = new String[4];
    String[] submarine_pos = new String[3];
    String[] cruiser_pos = new String[3];
    String[] destroyer_pos = new String[2];
    JLabel l = new JLabel("That is an invalid move - Please try another move");
    String path_h = "aircraft-carrier/aircraft-h.png";
    String path_v = "aircraft-carrier/aircraft-v.png";
    String cur_aircraft = "aircraft-carrier";
    JFrame j = new JFrame("Battleship");
    JButton j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, j75, j76, j77, j78, j79, j80, j81, j82, j83, j84, j85, j86, j87, j88, j89, j90, j91, j92, j93, j94, j95, j96, j97, j98, j99, j100;
    public void welcome_screen()
    {
        Icon logo = new ImageIcon("logo.png");
        JLabel l = new JLabel(logo);
        l.setBounds(65,100,666,122);
        j.add(l);
        JButton start = new JButton();
        j.getContentPane().setBackground(Color.BLACK);
        // start.setBackground(Color.LIGHT_GRAY);
        start.setOpaque(true);
        start.setFocusPainted(false);
        start.setBounds(350, 500, 100, 50);
        Icon si = new ImageIcon("start.png");
        start.setIcon(si);
        j.add(start);
        start.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(start);
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                play_window();
            }
        });
    }
    public void play_window()
    {
        Icon i = new ImageIcon("water.png");
        j1 = new JButton(i);
        j2 = new JButton(i);
        j3 = new JButton(i);
        j4 = new JButton(i);
        j5 = new JButton(i);
        j6 = new JButton(i);
        j7 = new JButton(i);
        j8 = new JButton(i);
        j9 = new JButton(i);
        j10 = new JButton(i);
        j11 = new JButton(i);
        j12 = new JButton(i);
        j13 = new JButton(i);
        j14 = new JButton(i);
        j15 = new JButton(i);
        j16 = new JButton(i);
        j17 = new JButton(i);
        j18 = new JButton(i);
        j19 = new JButton(i);
        j20 = new JButton(i);
        j21 = new JButton(i);
        j22 = new JButton(i);
        j23 = new JButton(i);
        j24 = new JButton(i);
        j25 = new JButton(i);
        j26 = new JButton(i);
        j27 = new JButton(i);
        j28 = new JButton(i);
        j29 = new JButton(i);
        j30 = new JButton(i);
        j31 = new JButton(i);
        j32 = new JButton(i);
        j33 = new JButton(i);
        j34 = new JButton(i);
        j35 = new JButton(i);
        j36 = new JButton(i);
        j37 = new JButton(i);
        j38 = new JButton(i);
        j39 = new JButton(i);
        j40 = new JButton(i);
        j41 = new JButton(i);
        j42 = new JButton(i);
        j43 = new JButton(i);
        j44 = new JButton(i);
        j45 = new JButton(i);
        j46 = new JButton(i);
        j47 = new JButton(i);
        j48 = new JButton(i);
        j49 = new JButton(i);
        j50 = new JButton(i);
        j51 = new JButton(i);
        j52 = new JButton(i);
        j53 = new JButton(i);
        j54 = new JButton(i);
        j55 = new JButton(i);
        j56 = new JButton(i);
        j57 = new JButton(i);
        j58 = new JButton(i);
        j59 = new JButton(i);
        j60 = new JButton(i);
        j61 = new JButton(i);
        j62 = new JButton(i);
        j63 = new JButton(i);
        j64 = new JButton(i);
        j65 = new JButton(i);
        j66 = new JButton(i);
        j67 = new JButton(i);
        j68 = new JButton(i);
        j69 = new JButton(i);
        j70 = new JButton(i);
        j71 = new JButton(i);
        j72 = new JButton(i);
        j73 = new JButton(i);
        j74 = new JButton(i);
        j75 = new JButton(i);
        j76 = new JButton(i);
        j77 = new JButton(i);
        j78 = new JButton(i);
        j79 = new JButton(i);
        j80 = new JButton(i);
        j81 = new JButton(i);
        j82 = new JButton(i);
        j83 = new JButton(i);
        j84 = new JButton(i);
        j85 = new JButton(i);
        j86 = new JButton(i);
        j87 = new JButton(i);
        j88 = new JButton(i);
        j89 = new JButton(i);
        j90 = new JButton(i);
        j91 = new JButton(i);
        j92 = new JButton(i);
        j93 = new JButton(i);
        j94 = new JButton(i);
        j95 = new JButton(i);
        j96 = new JButton(i);
        j97 = new JButton(i);
        j98 = new JButton(i);
        j99 = new JButton(i);
        j100 = new JButton(i);
        j1.setBounds(150,40,50,50);
        j2.setBounds(200,40,50,50);
        j3.setBounds(250,40,50,50);
        j4.setBounds(300,40,50,50);
        j5.setBounds(350,40,50,50);
        j6.setBounds(400,40,50,50);
        j7.setBounds(450,40,50,50);
        j8.setBounds(500,40,50,50);
        j9.setBounds(550,40,50,50);
        j10.setBounds(600,40,50,50);
        j11.setBounds(150,90,50,50);
        j12.setBounds(200,90,50,50);
        j13.setBounds(250,90,50,50);
        j14.setBounds(300,90,50,50);
        j15.setBounds(350,90,50,50);
        j16.setBounds(400,90,50,50);
        j17.setBounds(450,90,50,50);
        j18.setBounds(500,90,50,50);
        j19.setBounds(550,90,50,50);
        j20.setBounds(600,90,50,50);
        j21.setBounds(150,140,50,50);
        j22.setBounds(200,140,50,50);
        j23.setBounds(250,140,50,50);
        j24.setBounds(300,140,50,50);
        j25.setBounds(350,140,50,50);
        j26.setBounds(400,140,50,50);
        j27.setBounds(450,140,50,50);
        j28.setBounds(500,140,50,50);
        j29.setBounds(550,140,50,50);
        j30.setBounds(600,140,50,50);
        j31.setBounds(150,190,50,50);
        j32.setBounds(200,190,50,50);
        j33.setBounds(250,190,50,50);
        j34.setBounds(300,190,50,50);
        j35.setBounds(350,190,50,50);
        j36.setBounds(400,190,50,50);
        j37.setBounds(450,190,50,50);
        j38.setBounds(500,190,50,50);
        j39.setBounds(550,190,50,50);
        j40.setBounds(600,190,50,50);
        j41.setBounds(150,240,50,50);
        j42.setBounds(200,240,50,50);
        j43.setBounds(250,240,50,50);
        j44.setBounds(300,240,50,50);
        j45.setBounds(350,240,50,50);
        j46.setBounds(400,240,50,50);
        j47.setBounds(450,240,50,50);
        j48.setBounds(500,240,50,50);
        j49.setBounds(550,240,50,50);
        j50.setBounds(600,240,50,50);
        j51.setBounds(150,290,50,50);
        j52.setBounds(200,290,50,50);
        j53.setBounds(250,290,50,50);
        j54.setBounds(300,290,50,50);
        j55.setBounds(350,290,50,50);
        j56.setBounds(400,290,50,50);
        j57.setBounds(450,290,50,50);
        j58.setBounds(500,290,50,50);
        j59.setBounds(550,290,50,50);
        j60.setBounds(600,290,50,50);
        j61.setBounds(150,340,50,50);
        j62.setBounds(200,340,50,50);
        j63.setBounds(250,340,50,50);
        j64.setBounds(300,340,50,50);
        j65.setBounds(350,340,50,50);
        j66.setBounds(400,340,50,50);
        j67.setBounds(450,340,50,50);
        j68.setBounds(500,340,50,50);
        j69.setBounds(550,340,50,50);
        j70.setBounds(600,340,50,50);
        j71.setBounds(150,390,50,50);
        j72.setBounds(200,390,50,50);
        j73.setBounds(250,390,50,50);
        j74.setBounds(300,390,50,50);
        j75.setBounds(350,390,50,50);
        j76.setBounds(400,390,50,50);
        j77.setBounds(450,390,50,50);
        j78.setBounds(500,390,50,50);
        j79.setBounds(550,390,50,50);
        j80.setBounds(600,390,50,50);
        j81.setBounds(150,440,50,50);
        j82.setBounds(200,440,50,50);
        j83.setBounds(250,440,50,50);
        j84.setBounds(300,440,50,50);
        j85.setBounds(350,440,50,50);
        j86.setBounds(400,440,50,50);
        j87.setBounds(450,440,50,50);
        j88.setBounds(500,440,50,50);
        j89.setBounds(550,440,50,50);
        j90.setBounds(600,440,50,50);
        j91.setBounds(150,490,50,50);
        j92.setBounds(200,490,50,50);
        j93.setBounds(250,490,50,50);
        j94.setBounds(300,490,50,50);
        j95.setBounds(350,490,50,50);
        j96.setBounds(400,490,50,50);
        j97.setBounds(450,490,50,50);
        j98.setBounds(500,490,50,50);
        j99.setBounds(550,490,50,50);
        j100.setBounds(600,490,50,50);
        j1.setBorderPainted(false);
        j2.setBorderPainted(false);
        j3.setBorderPainted(false);
        j4.setBorderPainted(false);
        j5.setBorderPainted(false);
        j6.setBorderPainted(false);
        j7.setBorderPainted(false);
        j8.setBorderPainted(false);
        j9.setBorderPainted(false);
        j10.setBorderPainted(false);
        j11.setBorderPainted(false);
        j12.setBorderPainted(false);
        j13.setBorderPainted(false);
        j14.setBorderPainted(false);
        j15.setBorderPainted(false);
        j16.setBorderPainted(false);
        j17.setBorderPainted(false);
        j18.setBorderPainted(false);
        j19.setBorderPainted(false);
        j20.setBorderPainted(false);
        j21.setBorderPainted(false);
        j22.setBorderPainted(false);
        j23.setBorderPainted(false);
        j24.setBorderPainted(false);
        j25.setBorderPainted(false);
        j26.setBorderPainted(false);
        j27.setBorderPainted(false);
        j28.setBorderPainted(false);
        j29.setBorderPainted(false);
        j30.setBorderPainted(false);
        j31.setBorderPainted(false);
        j32.setBorderPainted(false);
        j33.setBorderPainted(false);
        j34.setBorderPainted(false);
        j35.setBorderPainted(false);
        j36.setBorderPainted(false);
        j37.setBorderPainted(false);
        j38.setBorderPainted(false);
        j39.setBorderPainted(false);
        j40.setBorderPainted(false);
        j41.setBorderPainted(false);
        j42.setBorderPainted(false);
        j43.setBorderPainted(false);
        j44.setBorderPainted(false);
        j45.setBorderPainted(false);
        j46.setBorderPainted(false);
        j47.setBorderPainted(false);
        j48.setBorderPainted(false);
        j49.setBorderPainted(false);
        j50.setBorderPainted(false);
        j51.setBorderPainted(false);
        j52.setBorderPainted(false);
        j53.setBorderPainted(false);
        j54.setBorderPainted(false);
        j55.setBorderPainted(false);
        j56.setBorderPainted(false);
        j57.setBorderPainted(false);
        j58.setBorderPainted(false);
        j59.setBorderPainted(false);
        j60.setBorderPainted(false);
        j61.setBorderPainted(false);
        j62.setBorderPainted(false);
        j63.setBorderPainted(false);
        j64.setBorderPainted(false);
        j65.setBorderPainted(false);
        j66.setBorderPainted(false);
        j67.setBorderPainted(false);
        j68.setBorderPainted(false);
        j69.setBorderPainted(false);
        j70.setBorderPainted(false);
        j71.setBorderPainted(false);
        j72.setBorderPainted(false);
        j73.setBorderPainted(false);
        j74.setBorderPainted(false);
        j75.setBorderPainted(false);
        j76.setBorderPainted(false);
        j77.setBorderPainted(false);
        j78.setBorderPainted(false);
        j79.setBorderPainted(false);
        j80.setBorderPainted(false);
        j81.setBorderPainted(false);
        j82.setBorderPainted(false);
        j83.setBorderPainted(false);
        j84.setBorderPainted(false);
        j85.setBorderPainted(false);
        j86.setBorderPainted(false);
        j87.setBorderPainted(false);
        j88.setBorderPainted(false);
        j89.setBorderPainted(false);
        j90.setBorderPainted(false);
        j91.setBorderPainted(false);
        j92.setBorderPainted(false);
        j93.setBorderPainted(false);
        j94.setBorderPainted(false);
        j95.setBorderPainted(false);
        j96.setBorderPainted(false);
        j97.setBorderPainted(false);
        j98.setBorderPainted(false);
        j99.setBorderPainted(false);
        j100.setBorderPainted(false);
        this.j.add(j1);
        this.j.add(j2);
        this.j.add(j3);
        this.j.add(j4);
        this.j.add(j5);
        this.j.add(j6);
        this.j.add(j7);
        this.j.add(j8);
        this.j.add(j9);
        this.j.add(j10);
        this.j.add(j11);
        this.j.add(j12);
        this.j.add(j13);
        this.j.add(j14);
        this.j.add(j15);
        this.j.add(j16);
        this.j.add(j17);
        this.j.add(j18);
        this.j.add(j19);
        this.j.add(j20);
        this.j.add(j21);
        this.j.add(j22);
        this.j.add(j23);
        this.j.add(j24);
        this.j.add(j25);
        this.j.add(j26);
        this.j.add(j27);
        this.j.add(j28);
        this.j.add(j29);
        this.j.add(j30);
        this.j.add(j31);
        this.j.add(j32);
        this.j.add(j33);
        this.j.add(j34);
        this.j.add(j35);
        this.j.add(j36);
        this.j.add(j37);
        this.j.add(j38);
        this.j.add(j39);
        this.j.add(j40);
        this.j.add(j41);
        this.j.add(j42);
        this.j.add(j43);
        this.j.add(j44);
        this.j.add(j45);
        this.j.add(j46);
        this.j.add(j47);
        this.j.add(j48);
        this.j.add(j49);
        this.j.add(j50);
        this.j.add(j51);
        this.j.add(j52);
        this.j.add(j53);
        this.j.add(j54);
        this.j.add(j55);
        this.j.add(j56);
        this.j.add(j57);
        this.j.add(j58);
        this.j.add(j59);
        this.j.add(j60);
        this.j.add(j61);
        this.j.add(j62);
        this.j.add(j63);
        this.j.add(j64);
        this.j.add(j65);
        this.j.add(j66);
        this.j.add(j67);
        this.j.add(j68);
        this.j.add(j69);
        this.j.add(j70);
        this.j.add(j71);
        this.j.add(j72);
        this.j.add(j73);
        this.j.add(j74);
        this.j.add(j75);
        this.j.add(j76);
        this.j.add(j77);
        this.j.add(j78);
        this.j.add(j79);
        this.j.add(j80);
        this.j.add(j81);
        this.j.add(j82);
        this.j.add(j83);
        this.j.add(j84);
        this.j.add(j85);
        this.j.add(j86);
        this.j.add(j87);
        this.j.add(j88);
        this.j.add(j89);
        this.j.add(j90);
        this.j.add(j91);
        this.j.add(j92);
        this.j.add(j93);
        this.j.add(j94);
        this.j.add(j95);
        this.j.add(j96);
        this.j.add(j97);
        this.j.add(j98);
        this.j.add(j99);
        this.j.add(j100);
        this.j.getContentPane().revalidate();
        this.j.getContentPane().repaint();
        play_ship_place();
    }
    public void play_ship_place()
    {
        j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(path_v).getImage(), new Point(0,0), "custom cursor"));
        //I have to copy and paste the below code a hundred times and rewrite the JButton names. Hope I don't go insane before this ends
        j1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j1.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j1.setBorderPainted(false);
            }
        });
        j2.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j2.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j2.setBorderPainted(false);
            }
        });
        j3.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j3.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j3.setBorderPainted(false);
            }
        });
        j4.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j4.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j4.setBorderPainted(false);
            }
        });
        j5.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j5.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j5.setBorderPainted(false);
            }
        });
        j6.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j6.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j6.setBorderPainted(false);
            }
        });
        j7.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j7.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j7.setBorderPainted(false);
            }
        });
        j8.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j8.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j8.setBorderPainted(false);
            }
        });
        j9.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j9.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j9.setBorderPainted(false);
            }
        });
        j10.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j10.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j10.setBorderPainted(false);
            }
        });
        j11.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j11.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j11.setBorderPainted(false);
            }
        });
        j12.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j12.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j12.setBorderPainted(false);
            }
        });
        j13.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j13.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j13.setBorderPainted(false);
            }
        });
        j14.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j14.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j14.setBorderPainted(false);
            }
        });
        j15.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j15.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j15.setBorderPainted(false);
            }
        });
        j16.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j16.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j16.setBorderPainted(false);
            }
        });
        j17.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j17.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j17.setBorderPainted(false);
            }
        });
        j18.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j18.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j18.setBorderPainted(false);
            }
        });
        j19.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j19.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j19.setBorderPainted(false);
            }
        });
        j20.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j20.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j20.setBorderPainted(false);
            }
        });
        j21.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j21.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j21.setBorderPainted(false);
            }
        });
        j22.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j22.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j22.setBorderPainted(false);
            }
        });
        j22.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j22.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j22.setBorderPainted(false);
            }
        });
        j23.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j23.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j23.setBorderPainted(false);
            }
        });
        j24.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j24.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j24.setBorderPainted(false);
            }
        });
        j25.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j25.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j25.setBorderPainted(false);
            }
        });
        j26.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j26.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j26.setBorderPainted(false);
            }
        });
        j27.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j27.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j27.setBorderPainted(false);
            }
        });
        j28.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j28.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j28.setBorderPainted(false);
            }
        });
        j29.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j29.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j29.setBorderPainted(false);
            }
        });
        j30.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j30.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j30.setBorderPainted(false);
            }
        });
        j31.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j31.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j31.setBorderPainted(false);
            }
        });
        j32.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j32.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j32.setBorderPainted(false);
            }
        });

        j33.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j33.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j33.setBorderPainted(false);
            }
        });
        j34.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j34.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j34.setBorderPainted(false);
            }
        });
        j35.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j35.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j35.setBorderPainted(false);
            }
        });
        j36.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j36.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j36.setBorderPainted(false);
            }
        });
        j37.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j37.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j37.setBorderPainted(false);
            }
        });
        j38.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j38.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j38.setBorderPainted(false);
            }
        });
        j39.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j39.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j39.setBorderPainted(false);
            }
        });
        j40.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j40.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j40.setBorderPainted(false);
            }
        });
        j41.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j41.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j41.setBorderPainted(false);
            }
        });
        j42.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j42.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j42.setBorderPainted(false);
            }
        });
        j43.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j43.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j43.setBorderPainted(false);
            }
        });
        j44.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j44.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j44.setBorderPainted(false);
            }
        });
        j45.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j45.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j45.setBorderPainted(false);
            }
        });
        j46.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j46.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j46.setBorderPainted(false);
            }
        });
        j47.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j47.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j47.setBorderPainted(false);
            }
        });
        j48.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j48.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j48.setBorderPainted(false);
            }
        });
        j49.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j49.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j49.setBorderPainted(false);
            }
        });
        j50.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j50.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j50.setBorderPainted(false);
            }
        });
        j51.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j51.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j51.setBorderPainted(false);
            }
        });
        j52.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j52.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j52.setBorderPainted(false);
            }
        });
        j53.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j53.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j53.setBorderPainted(false);
            }
        });
        j54.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j54.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j54.setBorderPainted(false);
            }
        });
        j55.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j55.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j55.setBorderPainted(false);
            }
        });
        j56.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j56.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j56.setBorderPainted(false);
            }
        });
        j57.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j57.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j57.setBorderPainted(false);
            }
        });
        j58.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j58.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j58.setBorderPainted(false);
            }
        });
        j59.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j59.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j59.setBorderPainted(false);
            }
        });
        j60.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j60.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j60.setBorderPainted(false);
            }
        });
        j61.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j61.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j61.setBorderPainted(false);
            }
        });
        j62.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j62.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j62.setBorderPainted(false);
            }
        });
        j63.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j63.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j63.setBorderPainted(false);
            }
        });
        j64.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j64.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j64.setBorderPainted(false);
            }
        });
        j65.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j65.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j65.setBorderPainted(false);
            }
        });
        j66.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j66.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j66.setBorderPainted(false);
            }
        });
        j67.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j67.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j67.setBorderPainted(false);
            }
        });
        j68.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j68.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j68.setBorderPainted(false);
            }
        });
        j69.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j69.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j69.setBorderPainted(false);
            }
        });
        j70.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j70.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j70.setBorderPainted(false);
            }
        });
        j71.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j71.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j71.setBorderPainted(false);
            }
        });
        j72.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j72.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j72.setBorderPainted(false);
            }
        });
        j73.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j73.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j73.setBorderPainted(false);
            }
        });
        j74.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j74.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j74.setBorderPainted(false);
            }
        });
        j75.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j75.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j75.setBorderPainted(false);
            }
        });
        j76.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j76.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j76.setBorderPainted(false);
            }
        });
        j77.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j77.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j77.setBorderPainted(false);
            }
        });
        j78.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j78.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j78.setBorderPainted(false);
            }
        });
        j79.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j79.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j79.setBorderPainted(false);
            }
        });
        j80.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j80.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j80.setBorderPainted(false);
            }
        });
        j81.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j81.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j81.setBorderPainted(false);
            }
        });
        j82.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j82.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j82.setBorderPainted(false);
            }
        });
        j83.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j83.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j83.setBorderPainted(false);
            }
        });
        j84.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j84.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j84.setBorderPainted(false);
            }
        });
        j85.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j85.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j85.setBorderPainted(false);
            }
        });
        j86.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j86.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j86.setBorderPainted(false);
            }
        });
        j87.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j87.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j87.setBorderPainted(false);
            }
        });
        j88.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j88.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j88.setBorderPainted(false);
            }
        });
        j89.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j89.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j89.setBorderPainted(false);
            }
        });
        j90.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j90.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j90.setBorderPainted(false);
            }
        });
        j91.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j91.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j91.setBorderPainted(false);
            }
        });
        j92.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j92.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j92.setBorderPainted(false);
            }
        });
        j93.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j93.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j93.setBorderPainted(false);
            }
        });
        j94.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j94.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j94.setBorderPainted(false);
            }
        });
        j95.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j95.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j95.setBorderPainted(false);
            }
        });
        j96.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j96.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j96.setBorderPainted(false);
            }
        });
        j97.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j97.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j97.setBorderPainted(false);
            }
        });
        j98.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j98.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j98.setBorderPainted(false);
            }
        });
        j99.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j99.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j99.setBorderPainted(false);
            }
        });
        j100.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                j100.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                j100.setBorderPainted(false);
            }
        });
        KeyListener k = new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                if(e.getKeyChar() == 'r' || e.getKeyChar() == 'R')
                {
                    if(flag == 0)
                    {
                        j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(path_h).getImage(), new Point(0, 0), "custom cursor"));
                        flag = 1;
                    }
                    else
                    {
                        j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(path_v).getImage(), new Point(0, 0), "custom cursor"));
                        flag = 0;
                    }
                }
            }
        };
        j1.addKeyListener(k);
        j1.setFocusable(true);
        j2.addKeyListener(k);
        j2.setFocusable(true);
        j3.addKeyListener(k);
        j3.setFocusable(true);
        j4.addKeyListener(k);
        j4.setFocusable(true);
        j5.addKeyListener(k);
        j5.setFocusable(true);
        j6.addKeyListener(k);
        j6.setFocusable(true);
        j7.addKeyListener(k);
        j7.setFocusable(true);
        j8.addKeyListener(k);
        j8.setFocusable(true);
        j9.addKeyListener(k);
        j9.setFocusable(true);
        j10.addKeyListener(k);
        j10.setFocusable(true);
        j11.addKeyListener(k);
        j11.setFocusable(true);
        j12.addKeyListener(k);
        j12.setFocusable(true);
        j13.addKeyListener(k);
        j13.setFocusable(true);
        j14.addKeyListener(k);
        j14.setFocusable(true);
        j15.addKeyListener(k);
        j15.setFocusable(true);
        j16.addKeyListener(k);
        j16.setFocusable(true);
        j17.addKeyListener(k);
        j17.setFocusable(true);
        j18.addKeyListener(k);
        j18.setFocusable(true);
        j19.addKeyListener(k);
        j19.setFocusable(true);
        j20.addKeyListener(k);
        j20.setFocusable(true);
        j21.addKeyListener(k);
        j21.setFocusable(true);
        j22.addKeyListener(k);
        j22.setFocusable(true);
        j23.addKeyListener(k);
        j23.setFocusable(true);
        j24.addKeyListener(k);
        j24.setFocusable(true);
        j25.addKeyListener(k);
        j25.setFocusable(true);
        j26.addKeyListener(k);
        j26.setFocusable(true);
        j27.addKeyListener(k);
        j27.setFocusable(true);
        j28.addKeyListener(k);
        j28.setFocusable(true);
        j29.addKeyListener(k);
        j29.setFocusable(true);
        j30.addKeyListener(k);
        j30.setFocusable(true);
        j31.addKeyListener(k);
        j31.setFocusable(true);
        j32.addKeyListener(k);
        j32.setFocusable(true);
        j33.addKeyListener(k);
        j33.setFocusable(true);
        j34.addKeyListener(k);
        j34.setFocusable(true);
        j35.addKeyListener(k);
        j35.setFocusable(true);
        j36.addKeyListener(k);
        j36.setFocusable(true);
        j37.addKeyListener(k);
        j37.setFocusable(true);
        j38.addKeyListener(k);
        j38.setFocusable(true);
        j39.addKeyListener(k);
        j39.setFocusable(true);
        j40.addKeyListener(k);
        j40.setFocusable(true);
        j41.addKeyListener(k);
        j41.setFocusable(true);
        j42.addKeyListener(k);
        j42.setFocusable(true);
        j43.addKeyListener(k);
        j43.setFocusable(true);
        j44.addKeyListener(k);
        j44.setFocusable(true);
        j45.addKeyListener(k);
        j45.setFocusable(true);
        j46.addKeyListener(k);
        j46.setFocusable(true);
        j47.addKeyListener(k);
        j47.setFocusable(true);
        j48.addKeyListener(k);
        j48.setFocusable(true);
        j49.addKeyListener(k);
        j49.setFocusable(true);
        j50.addKeyListener(k);
        j50.setFocusable(true);
        j51.addKeyListener(k);
        j51.setFocusable(true);
        j52.addKeyListener(k);
        j52.setFocusable(true);
        j53.addKeyListener(k);
        j53.setFocusable(true);
        j54.addKeyListener(k);
        j54.setFocusable(true);
        j55.addKeyListener(k);
        j55.setFocusable(true);
        j56.addKeyListener(k);
        j56.setFocusable(true);
        j57.addKeyListener(k);
        j57.setFocusable(true);
        j58.addKeyListener(k);
        j58.setFocusable(true);
        j59.addKeyListener(k);
        j59.setFocusable(true);
        j60.addKeyListener(k);
        j60.setFocusable(true);
        j61.addKeyListener(k);
        j61.setFocusable(true);
        j62.addKeyListener(k);
        j62.setFocusable(true);
        j63.addKeyListener(k);
        j63.setFocusable(true);
        j64.addKeyListener(k);
        j64.setFocusable(true);
        j65.addKeyListener(k);
        j65.setFocusable(true);
        j66.addKeyListener(k);
        j66.setFocusable(true);
        j67.addKeyListener(k);
        j67.setFocusable(true);
        j68.addKeyListener(k);
        j68.setFocusable(true);
        j69.addKeyListener(k);
        j69.setFocusable(true);
        j70.addKeyListener(k);
        j70.setFocusable(true);
        j71.addKeyListener(k);
        j71.setFocusable(true);
        j72.addKeyListener(k);
        j72.setFocusable(true);
        j73.addKeyListener(k);
        j73.setFocusable(true);
        j74.addKeyListener(k);
        j74.setFocusable(true);
        j75.addKeyListener(k);
        j75.setFocusable(true);
        j76.addKeyListener(k);
        j76.setFocusable(true);
        j77.addKeyListener(k);
        j77.setFocusable(true);
        j78.addKeyListener(k);
        j78.setFocusable(true);
        j79.addKeyListener(k);
        j79.setFocusable(true);
        j80.addKeyListener(k);
        j80.setFocusable(true);
        j81.addKeyListener(k);
        j81.setFocusable(true);
        j82.addKeyListener(k);
        j82.setFocusable(true);
        j83.addKeyListener(k);
        j83.setFocusable(true);
        j84.addKeyListener(k);
        j84.setFocusable(true);
        j85.addKeyListener(k);
        j85.setFocusable(true);
        j86.addKeyListener(k);
        j86.setFocusable(true);
        j87.addKeyListener(k);
        j87.setFocusable(true);
        j88.addKeyListener(k);
        j88.setFocusable(true);
        j89.addKeyListener(k);
        j89.setFocusable(true);
        j90.addKeyListener(k);
        j90.setFocusable(true);
        j91.addKeyListener(k);
        j91.setFocusable(true);
        j92.addKeyListener(k);
        j92.setFocusable(true);
        j93.addKeyListener(k);
        j93.setFocusable(true);
        j94.addKeyListener(k);
        j94.setFocusable(true);
        j95.addKeyListener(k);
        j95.setFocusable(true);
        j96.addKeyListener(k);
        j96.setFocusable(true);
        j97.addKeyListener(k);
        j97.setFocusable(true);
        j98.addKeyListener(k);
        j98.setFocusable(true);
        j99.addKeyListener(k);
        j99.setFocusable(true);
        j100.addKeyListener(k);
        j100.setFocusable(true);
        j.getContentPane().addKeyListener(k);
        j1.requestFocus();
        j1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 0 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j1.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j11.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    aircraft_pos[0] = "j1";
                    aircraft_pos[1] = "j11";
                    aircraft_pos[2] = "j21";
                    aircraft_pos[3] = "j31";
                    aircraft_pos[4] = "j41";
                    j1.setEnabled(false);
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j11.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j1.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j2.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j3.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j4.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j5.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j1";
                    aircraft_pos[1] = "j2";
                    aircraft_pos[2] = "j3";
                    aircraft_pos[3] = "j4";
                    aircraft_pos[4] = "j5";
                    j1.setEnabled(false);
                    j2.setEnabled(false);
                    j3.setEnabled(false);
                    j4.setEnabled(false);
                    j5.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j2.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j3.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j4.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j5.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 0 && cur_aircraft == "battleship" && j11.isEnabled() && j21.isEnabled() && j31.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j1.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j11.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j21.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j31.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    battleship_pos[0] = "j1";
                    battleship_pos[1] = "j11";
                    battleship_pos[2] = "j21";
                    battleship_pos[3] = "j31";
                    j1.setEnabled(false);
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j11.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j21.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j2.isEnabled() && j3.isEnabled() && j4.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j1.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j2.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j3.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j4.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j1";
                    battleship_pos[1] = "j2";
                    battleship_pos[2] = "j3";
                    battleship_pos[3] = "j4";
                    j1.setEnabled(false);
                    j2.setEnabled(false);
                    j3.setEnabled(false);
                    j4.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j2.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j3.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j4.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j11.isEnabled() && j21.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j1.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j11.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j21.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j1";
                    submarine_pos[1] = "j11";
                    submarine_pos[2] = "j21";
                    j1.setEnabled(false);
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j11.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j21.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j2.isEnabled() && j3.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j1.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j2.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j3.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j1";
                    submarine_pos[1] = "j2";
                    submarine_pos[2] = "j3";
                    j1.setEnabled(false);
                    j2.setEnabled(false);
                    j3.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j2.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j3.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j11.isEnabled() && j21.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j1.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j11.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j21.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j1";
                    cruiser_pos[1] = "j11";
                    cruiser_pos[2] = "j21";
                    j1.setEnabled(false);
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j11.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j2.isEnabled() && j3.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j1.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j2.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j3.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j1";
                    cruiser_pos[1] = "j2";
                    cruiser_pos[2] = "j3";
                    j1.setEnabled(false);
                    j2.setEnabled(false);
                    j3.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j2.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j3.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j11.isEnabled())
                {
                    cur_aircraft = "finished";
                    j1.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j11.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j1";
                    destroyer_pos[1] = "j11";
                    j1.setEnabled(false);
                    j11.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j11.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j2.isEnabled())
                {
                    cur_aircraft = "finished";
                    j1.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j2.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j1";
                    destroyer_pos[1] = "j2";
                    j1.setEnabled(false);
                    j2.setEnabled(false);
                    j1.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j2.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j11.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 0 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j11.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    aircraft_pos[0] = "j11";
                    aircraft_pos[1] = "j21";
                    aircraft_pos[2] = "j31";
                    aircraft_pos[3] = "j41";
                    aircraft_pos[4] = "j51";
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j11.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j12.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j13.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j14.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j11";
                    aircraft_pos[1] = "j12";
                    aircraft_pos[2] = "j13";
                    aircraft_pos[3] = "j14";
                    aircraft_pos[4] = "j15";
                    j11.setEnabled(false);
                    j12.setEnabled(false);
                    j13.setEnabled(false);
                    j14.setEnabled(false);
                    j15.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j12.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j13.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j14.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 0 && cur_aircraft == "battleship" && j21.isEnabled() && j31.isEnabled() && j41.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j11.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j21.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j31.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j41.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    battleship_pos[0] = "j11";
                    battleship_pos[1] = "j21";
                    battleship_pos[2] = "j31";
                    battleship_pos[3] = "j41";
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j21.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j12.isEnabled() && j13.isEnabled() && j14.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j11.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j12.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j13.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j14.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j11";
                    battleship_pos[1] = "j12";
                    battleship_pos[2] = "j13";
                    battleship_pos[3] = "j14";
                    j11.setEnabled(false);
                    j12.setEnabled(false);
                    j13.setEnabled(false);
                    j14.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j12.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j13.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j14.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j21.isEnabled() && j31.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j11.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j21.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j31.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j11";
                    submarine_pos[1] = "j21";
                    submarine_pos[2] = "j31";
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j21.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j31.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j12.isEnabled() && j13.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j11.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j12.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j13.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j11";
                    submarine_pos[1] = "j12";
                    submarine_pos[2] = "j13";
                    j11.setEnabled(false);
                    j12.setEnabled(false);
                    j13.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j12.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j13.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j21.isEnabled() && j31.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j11.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j21.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j31.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j11";
                    cruiser_pos[1] = "j21";
                    cruiser_pos[2] = "j31";
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j12.isEnabled() && j13.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j11.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j12.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j13.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j11";
                    cruiser_pos[1] = "j12";
                    cruiser_pos[2] = "j13";
                    j11.setEnabled(false);
                    j12.setEnabled(false);
                    j13.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j12.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j13.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j21.isEnabled())
                {
                    cur_aircraft = "finished";
                    j11.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j21.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j11";
                    destroyer_pos[1] = "j21";
                    j11.setEnabled(false);
                    j21.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j21.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j12.isEnabled())
                {
                    cur_aircraft = "finished";
                    j11.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j12.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j11";
                    destroyer_pos[1] = "j12";
                    j11.setEnabled(false);
                    j12.setEnabled(false);
                    j11.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j12.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j21.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 0 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    aircraft_pos[0] = "j21";
                    aircraft_pos[1] = "j31";
                    aircraft_pos[2] = "j41";
                    aircraft_pos[3] = "j51";
                    aircraft_pos[4] = "j61";
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j22.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j23.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j21";
                    aircraft_pos[1] = "j22";
                    aircraft_pos[2] = "j23";
                    aircraft_pos[3] = "j24";
                    aircraft_pos[4] = "j25";
                    j21.setEnabled(false);
                    j22.setEnabled(false);
                    j23.setEnabled(false);
                    j24.setEnabled(false);
                    j25.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j22.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j23.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 0 && cur_aircraft == "battleship" && j31.isEnabled() && j41.isEnabled() && j51.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j21.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j31.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j41.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j51.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    battleship_pos[0] = "j21";
                    battleship_pos[1] = "j31";
                    battleship_pos[2] = "j41";
                    battleship_pos[3] = "j51";
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j22.isEnabled() && j23.isEnabled() && j24.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j21.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j22.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j23.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j24.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j21";
                    battleship_pos[1] = "j22";
                    battleship_pos[2] = "j23";
                    battleship_pos[3] = "j24";
                    j21.setEnabled(false);
                    j22.setEnabled(false);
                    j23.setEnabled(false);
                    j24.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j22.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j23.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j24.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j31.isEnabled() && j41.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j21.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j31.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j41.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j21";
                    submarine_pos[1] = "j31";
                    submarine_pos[2] = "j41";
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j31.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j41.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j22.isEnabled() && j23.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j21.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j22.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j23.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j21";
                    submarine_pos[1] = "j22";
                    submarine_pos[2] = "j23";
                    j21.setEnabled(false);
                    j22.setEnabled(false);
                    j23.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j22.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j23.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j31.isEnabled() && j41.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j21.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j31.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j41.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j21";
                    cruiser_pos[1] = "j31";
                    cruiser_pos[2] = "j41";
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j22.isEnabled() && j23.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j21.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j22.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j23.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j21";
                    cruiser_pos[1] = "j22";
                    cruiser_pos[2] = "j23";
                    j21.setEnabled(false);
                    j22.setEnabled(false);
                    j23.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j22.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j23.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j31.isEnabled())
                {
                    cur_aircraft = "finished";
                    j21.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j31.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j21";
                    destroyer_pos[1] = "j31";
                    j21.setEnabled(false);
                    j31.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j31.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j22.isEnabled())
                {
                    cur_aircraft = "finished";
                    j21.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j22.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j21";
                    destroyer_pos[1] = "j22";
                    j21.setEnabled(false);
                    j22.setEnabled(false);
                    j21.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j22.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j31.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 0 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    aircraft_pos[0] = "j31";
                    aircraft_pos[1] = "j41";
                    aircraft_pos[2] = "j51";
                    aircraft_pos[3] = "j61";
                    aircraft_pos[4] = "j71";
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j32.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j31";
                    aircraft_pos[1] = "j32";
                    aircraft_pos[2] = "j33";
                    aircraft_pos[3] = "j34";
                    aircraft_pos[4] = "j35";
                    j31.setEnabled(false);
                    j32.setEnabled(false);
                    j33.setEnabled(false);
                    j34.setEnabled(false);
                    j35.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j32.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 0 && cur_aircraft == "battleship" && j41.isEnabled() && j51.isEnabled() && j61.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j31.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j41.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j51.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j61.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    battleship_pos[0] = "j31";
                    battleship_pos[1] = "j41";
                    battleship_pos[2] = "j51";
                    battleship_pos[3] = "j61";
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j32.isEnabled() && j33.isEnabled() && j34.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j31.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j32.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j33.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j34.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j31";
                    battleship_pos[1] = "j32";
                    battleship_pos[2] = "j33";
                    battleship_pos[3] = "j34";
                    j31.setEnabled(false);
                    j32.setEnabled(false);
                    j33.setEnabled(false);
                    j34.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j32.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j33.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j34.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j41.isEnabled() && j51.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j31.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j41.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j51.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j31";
                    submarine_pos[1] = "j41";
                    submarine_pos[2] = "j51";
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j41.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j51.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j32.isEnabled() && j33.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j31.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j32.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j33.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j31";
                    submarine_pos[1] = "j32";
                    submarine_pos[2] = "j33";
                    j31.setEnabled(false);
                    j32.setEnabled(false);
                    j33.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j32.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j33.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j41.isEnabled() && j51.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j31.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j41.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j51.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j31";
                    cruiser_pos[1] = "j41";
                    cruiser_pos[2] = "j51";
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j32.isEnabled() && j33.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j31.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j32.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j33.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j31";
                    cruiser_pos[1] = "j32";
                    cruiser_pos[2] = "j33";
                    j31.setEnabled(false);
                    j32.setEnabled(false);
                    j33.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j32.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j33.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j41.isEnabled())
                {
                    cur_aircraft = "finished";
                    j31.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j41.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j31";
                    destroyer_pos[1] = "j41";
                    j31.setEnabled(false);
                    j41.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j41.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j32.isEnabled())
                {
                    cur_aircraft = "finished";
                    j31.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j32.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j31";
                    destroyer_pos[1] = "j32";
                    j31.setEnabled(false);
                    j32.setEnabled(false);
                    j31.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j32.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j41.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 0 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j81.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    aircraft_pos[0] = "j41";
                    aircraft_pos[1] = "j51";
                    aircraft_pos[2] = "j61";
                    aircraft_pos[3] = "j71";
                    aircraft_pos[4] = "j81";
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j81.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j41";
                    aircraft_pos[1] = "j42";
                    aircraft_pos[2] = "j43";
                    aircraft_pos[3] = "j44";
                    aircraft_pos[4] = "j45";
                    j41.setEnabled(false);
                    j42.setEnabled(false);
                    j43.setEnabled(false);
                    j44.setEnabled(false);
                    j45.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 0 && cur_aircraft == "battleship" && j51.isEnabled() && j61.isEnabled() && j71.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j41.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j51.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j61.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j71.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    battleship_pos[0] = "j41";
                    battleship_pos[1] = "j51";
                    battleship_pos[2] = "j61";
                    battleship_pos[3] = "j71";
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j71.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j42.isEnabled() && j43.isEnabled() && j44.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j41.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j42.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j43.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j44.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j41";
                    battleship_pos[1] = "j42";
                    battleship_pos[2] = "j43";
                    battleship_pos[3] = "j44";
                    j41.setEnabled(false);
                    j42.setEnabled(false);
                    j43.setEnabled(false);
                    j44.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j42.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j43.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j44.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j51.isEnabled() && j61.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j41.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j51.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j61.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j41";
                    submarine_pos[1] = "j51";
                    submarine_pos[2] = "j61";
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j51.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j61.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j42.isEnabled() && j43.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j41.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j42.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j43.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j41";
                    submarine_pos[1] = "j42";
                    submarine_pos[2] = "j43";
                    j41.setEnabled(false);
                    j42.setEnabled(false);
                    j43.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j42.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j43.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j51.isEnabled() && j61.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j41.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j51.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j61.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j41";
                    cruiser_pos[1] = "j51";
                    cruiser_pos[2] = "j61";
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j42.isEnabled() && j43.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j41.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j42.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j43.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j41";
                    cruiser_pos[1] = "j42";
                    cruiser_pos[2] = "j43";
                    j41.setEnabled(false);
                    j42.setEnabled(false);
                    j43.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j42.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j43.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j51.isEnabled())
                {
                    cur_aircraft = "finished";
                    j41.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j51.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j41";
                    destroyer_pos[1] = "j51";
                    j41.setEnabled(false);
                    j51.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j51.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j42.isEnabled())
                {
                    cur_aircraft = "finished";
                    j41.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j42.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j41";
                    destroyer_pos[1] = "j42";
                    j41.setEnabled(false);
                    j42.setEnabled(false);
                    j41.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j42.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j51.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 0 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j81.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j91.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    aircraft_pos[0] = "j51";
                    aircraft_pos[1] = "j61";
                    aircraft_pos[2] = "j71";
                    aircraft_pos[3] = "j81";
                    aircraft_pos[4] = "j91";
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j91.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
                    j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
                    j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
                    j81.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
                    j91.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j51";
                    aircraft_pos[1] = "j52";
                    aircraft_pos[2] = "j53";
                    aircraft_pos[3] = "j54";
                    aircraft_pos[4] = "j55";
                    j51.setEnabled(false);
                    j52.setEnabled(false);
                    j53.setEnabled(false);
                    j54.setEnabled(false);
                    j55.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 0 && cur_aircraft == "battleship" && j61.isEnabled() && j71.isEnabled() && j81.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j51.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j61.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j71.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j81.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    battleship_pos[0] = "j51";
                    battleship_pos[1] = "j61";
                    battleship_pos[2] = "j71";
                    battleship_pos[3] = "j81";
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j71.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j81.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j52.isEnabled() && j53.isEnabled() && j54.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j51.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j52.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j53.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j54.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j51";
                    battleship_pos[1] = "j52";
                    battleship_pos[2] = "j53";
                    battleship_pos[3] = "j54";
                    j51.setEnabled(false);
                    j52.setEnabled(false);
                    j53.setEnabled(false);
                    j54.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j52.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j53.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j54.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j61.isEnabled() && j71.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j51.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j61.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j71.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j51";
                    submarine_pos[1] = "j61";
                    submarine_pos[2] = "j71";
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j61.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j71.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j52.isEnabled() && j53.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j51.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j52.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j53.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j51";
                    submarine_pos[1] = "j52";
                    submarine_pos[2] = "j53";
                    j51.setEnabled(false);
                    j52.setEnabled(false);
                    j53.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j52.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j53.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j61.isEnabled() && j71.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j51.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j61.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j71.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j51";
                    cruiser_pos[1] = "j61";
                    cruiser_pos[2] = "j71";
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j52.isEnabled() && j53.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j51.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j52.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j53.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j51";
                    cruiser_pos[1] = "j52";
                    cruiser_pos[2] = "j53";
                    j51.setEnabled(false);
                    j52.setEnabled(false);
                    j53.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j52.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j53.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j61.isEnabled())
                {
                    cur_aircraft = "finished";
                    j51.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j61.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j51";
                    destroyer_pos[1] = "j61";
                    j51.setEnabled(false);
                    j61.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j61.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j52.isEnabled())
                {
                    cur_aircraft = "finished";
                    j51.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j52.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j51";
                    destroyer_pos[1] = "j52";
                    j51.setEnabled(false);
                    j52.setEnabled(false);
                    j51.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j52.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j61.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j62.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j61";
                    aircraft_pos[1] = "j62";
                    aircraft_pos[2] = "j63";
                    aircraft_pos[3] = "j64";
                    aircraft_pos[4] = "j65";
                    j61.setEnabled(false);
                    j62.setEnabled(false);
                    j63.setEnabled(false);
                    j64.setEnabled(false);
                    j65.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j62.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 0 && cur_aircraft == "battleship" && j71.isEnabled() && j81.isEnabled() && j91.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j61.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j71.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j81.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j91.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    battleship_pos[0] = "j61";
                    battleship_pos[1] = "j71";
                    battleship_pos[2] = "j81";
                    battleship_pos[3] = "j91";
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j91.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
                    j71.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
                    j81.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
                    j91.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-v.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j62.isEnabled() && j63.isEnabled() && j64.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j61.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j62.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j63.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j64.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j61";
                    battleship_pos[1] = "j62";
                    battleship_pos[2] = "j63";
                    battleship_pos[3] = "j64";
                    j61.setEnabled(false);
                    j62.setEnabled(false);
                    j63.setEnabled(false);
                    j64.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j62.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j63.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j64.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j71.isEnabled() && j81.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j61.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j71.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j81.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j61";
                    submarine_pos[1] = "j71";
                    submarine_pos[2] = "j81";
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j71.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j81.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j62.isEnabled() && j63.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j61.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j62.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j63.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j61";
                    submarine_pos[1] = "j62";
                    submarine_pos[2] = "j63";
                    j61.setEnabled(false);
                    j62.setEnabled(false);
                    j63.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j62.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j63.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j71.isEnabled() && j81.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j61.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j71.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j81.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j61";
                    cruiser_pos[1] = "j71";
                    cruiser_pos[2] = "j81";
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j81.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j62.isEnabled() && j63.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j61.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j62.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j63.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j61";
                    cruiser_pos[1] = "j62";
                    cruiser_pos[2] = "j63";
                    j61.setEnabled(false);
                    j62.setEnabled(false);
                    j63.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j62.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j63.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j71.isEnabled())
                {
                    cur_aircraft = "finished";
                    j61.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j71.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j61";
                    destroyer_pos[1] = "j71";
                    j61.setEnabled(false);
                    j71.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j71.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j62.isEnabled())
                {
                    cur_aircraft = "finished";
                    j61.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j62.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j61";
                    destroyer_pos[1] = "j62";
                    j61.setEnabled(false);
                    j62.setEnabled(false);
                    j61.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j62.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j71.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j72.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j73.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j71";
                    aircraft_pos[1] = "j72";
                    aircraft_pos[2] = "j73";
                    aircraft_pos[3] = "j74";
                    aircraft_pos[4] = "j75";
                    j71.setEnabled(false);
                    j72.setEnabled(false);
                    j73.setEnabled(false);
                    j74.setEnabled(false);
                    j75.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j72.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j73.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j72.isEnabled() && j73.isEnabled() && j74.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j71.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j72.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j73.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j74.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j71";
                    battleship_pos[1] = "j72";
                    battleship_pos[2] = "j73";
                    battleship_pos[3] = "j74";
                    j71.setEnabled(false);
                    j72.setEnabled(false);
                    j73.setEnabled(false);
                    j74.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j72.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j73.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j74.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0,0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 0 && cur_aircraft == "submarine" && j81.isEnabled() && j91.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j71.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j81.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j91.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    submarine_pos[0] = "j71";
                    submarine_pos[1] = "j81";
                    submarine_pos[2] = "j91";
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j91.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
                    j81.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
                    j91.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j72.isEnabled() && j73.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j71.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j72.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j73.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j71";
                    submarine_pos[1] = "j72";
                    submarine_pos[2] = "j73";
                    j71.setEnabled(false);
                    j72.setEnabled(false);
                    j73.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j72.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j73.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 0 && cur_aircraft == "cruiser" && j81.isEnabled() && j91.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j71.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j81.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j91.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    cruiser_pos[0] = "j71";
                    cruiser_pos[1] = "j81";
                    cruiser_pos[2] = "j91";
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j91.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
                    j81.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
                    j91.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-v.png").getImage(), new Point(0,0), "cruiser-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j72.isEnabled() && j73.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j71.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j72.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j73.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j71";
                    cruiser_pos[1] = "j72";
                    cruiser_pos[2] = "j73";
                    j71.setEnabled(false);
                    j72.setEnabled(false);
                    j73.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j72.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j73.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j81.isEnabled())
                {
                    cur_aircraft = "finished";
                    j71.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j81.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j71";
                    destroyer_pos[1] = "j81";
                    j71.setEnabled(false);
                    j81.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j81.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j72.isEnabled())
                {
                    cur_aircraft = "finished";
                    j71.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j72.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j71";
                    destroyer_pos[1] = "j72";
                    j71.setEnabled(false);
                    j72.setEnabled(false);
                    j71.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j72.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j81.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j81.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j82.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j83.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j84.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j81";
                    aircraft_pos[1] = "j82";
                    aircraft_pos[2] = "j83";
                    aircraft_pos[3] = "j84";
                    aircraft_pos[4] = "j85";
                    j81.setEnabled(false);
                    j82.setEnabled(false);
                    j83.setEnabled(false);
                    j84.setEnabled(false);
                    j85.setEnabled(false);
                    j81.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j82.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j83.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j84.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j82.isEnabled() && j83.isEnabled() && j84.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j81.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j82.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j83.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j84.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j81";
                    battleship_pos[1] = "j82";
                    battleship_pos[2] = "j83";
                    battleship_pos[3] = "j84";
                    j81.setEnabled(false);
                    j82.setEnabled(false);
                    j83.setEnabled(false);
                    j84.setEnabled(false);
                    j81.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j82.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j83.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j84.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0, 0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j82.isEnabled() && j83.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j81.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j82.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j83.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j81";
                    submarine_pos[1] = "j82";
                    submarine_pos[2] = "j83";
                    j81.setEnabled(false);
                    j82.setEnabled(false);
                    j83.setEnabled(false);
                    j81.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j82.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j83.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j82.isEnabled() && j83.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j81.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j82.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j83.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j81";
                    cruiser_pos[1] = "j82";
                    cruiser_pos[2] = "j83";
                    j81.setEnabled(false);
                    j82.setEnabled(false);
                    j83.setEnabled(false);
                    j81.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j82.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j83.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 0 && cur_aircraft == "destroyer" && j91.isEnabled())
                {
                    cur_aircraft = "finished";
                    j81.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j91.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    destroyer_pos[0] = "j81";
                    destroyer_pos[1] = "j91";
                    j81.setEnabled(false);
                    j91.setEnabled(false);
                    j81.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
                    j91.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j82.isEnabled())
                {
                    cur_aircraft = "finished";
                    j81.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j82.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j81";
                    destroyer_pos[1] = "j82";
                    j81.setEnabled(false);
                    j82.setEnabled(false);
                    j81.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j82.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
        j91.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                j.remove(l);
                j.getContentPane().revalidate();
                j.getContentPane().repaint();
                if (flag == 1 && cur_aircraft == "aircraft-carrier")
                {
                    cur_aircraft = "battleship";
                    j91.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j92.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j93.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j94.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j95.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("battleship/battleship-h.png").getImage(), new Point(0,0), "battleship-h"));
                    aircraft_pos[0] = "j91";
                    aircraft_pos[1] = "j92";
                    aircraft_pos[2] = "j93";
                    aircraft_pos[3] = "j94";
                    aircraft_pos[4] = "j95";
                    j91.setEnabled(false);
                    j92.setEnabled(false);
                    j93.setEnabled(false);
                    j94.setEnabled(false);
                    j95.setEnabled(false);
                    j91.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
                    j92.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
                    j93.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
                    j94.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
                    j95.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
                    path_v = "battleship/battleship-v.png";
                    path_h = "battleship/battleship-h.png";
                }
                else if (flag == 1 && cur_aircraft == "battleship" && j92.isEnabled() && j93.isEnabled() && j94.isEnabled())
                {
                    cur_aircraft = "submarine";
                    j91.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j92.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j93.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j94.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    battleship_pos[0] = "j91";
                    battleship_pos[1] = "j92";
                    battleship_pos[2] = "j93";
                    battleship_pos[3] = "j94";
                    j91.setEnabled(false);
                    j92.setEnabled(false);
                    j93.setEnabled(false);
                    j94.setEnabled(false);
                    j91.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
                    j92.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
                    j93.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
                    j94.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("submarine/submarine-h.png").getImage(), new Point(0, 0), "battleship-v"));
                    path_v = "submarine/submarine-v.png";
                    path_h = "submarine/submarine-h.png";
                }
                else if (flag == 1 && cur_aircraft == "submarine" && j92.isEnabled() && j93.isEnabled())
                {
                    cur_aircraft = "cruiser";
                    j91.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j92.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j93.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    submarine_pos[0] = "j91";
                    submarine_pos[1] = "j92";
                    submarine_pos[2] = "j93";
                    j91.setEnabled(false);
                    j92.setEnabled(false);
                    j93.setEnabled(false);
                    j91.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
                    j92.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
                    j93.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("cruiser/cruiser-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "cruiser/cruiser-v.png";
                    path_h = "cruiser/cruiser-h.png";
                }
                else if (flag == 1 && cur_aircraft == "cruiser" && j92.isEnabled() && j93.isEnabled())
                {
                    cur_aircraft = "destroyer";
                    j91.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j92.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j93.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    cruiser_pos[0] = "j91";
                    cruiser_pos[1] = "j92";
                    cruiser_pos[2] = "j93";
                    j91.setEnabled(false);
                    j92.setEnabled(false);
                    j93.setEnabled(false);
                    j91.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
                    j92.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
                    j93.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
                    j.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("destroyer/destroyer-h.png").getImage(), new Point(0,0), "submarine-v"));
                    path_v = "destroyer/destroyer-v.png";
                    path_h = "destroyer/destroyer-h.png";
                }
                else if (flag == 1 && cur_aircraft == "destroyer" && j92.isEnabled())
                {
                    cur_aircraft = "finished";
                    j91.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j92.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    destroyer_pos[0] = "j91";
                    destroyer_pos[1] = "j92";
                    j91.setEnabled(false);
                    j92.setEnabled(false);
                    j91.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
                    j92.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
                    j.setCursor(Cursor.getDefaultCursor());
                    ai_place();
                }
                else
                {
                    l.setBounds(200,540,600,50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.getContentPane().revalidate();
                    j.getContentPane().repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
                System.out.println("Aircraft Carrier : ");
                for(int i = 0 ; i < 5 ; i ++)
                {
                    System.out.println(aircraft_pos[i]);
                }
                System.out.println("Battleship : ");
                for(int i = 0 ; i < 4 ; i ++)
                {
                    System.out.println(battleship_pos[i]);
                }
                System.out.println("Submarine : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(submarine_pos[i]);
                }
                System.out.println("Cruiser : ");
                for(int i = 0 ; i < 3 ; i ++)
                {
                    System.out.println(cruiser_pos[i]);
                }
                System.out.println("Destroyer : ");
                for(int i = 0 ; i < 2 ; i ++)
                {
                    System.out.println(destroyer_pos[i]);
                }
            }
        });
    }
    public void ai_place()
    {
        j.getContentPane().revalidate();
        j.getContentPane().repaint();
        JOptionPane.showMessageDialog(j, "This is a placeholder. No functionality has been implemented so far", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args)
    {
        Main m = new Main();
        m.j.setLocation(533,86); //This line is present for a convoluted reason. I use i3-wm and I have modified my config to un-tile and float the application. But, I cannot figure out a way in the config to open it in the middle of the screen. So, I am currently doing it via the code. It will be removed once development is complete.
        m.j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.j.setLayout(null);
        m.j.setSize(800,600);
        m.welcome_screen();
        m.j.setVisible(true);
    }
}