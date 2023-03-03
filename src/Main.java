//import com.sun.javafx.geom.ConcentricShapePair;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Objects;

public class Main extends play_place_10
{

    MouseListener ml = new MouseListener()
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            if (!Objects.equals(cur_aircraft, "finished"))
            {
                if (c == j1 && j1.isEnabled())
                {
                    j1Call();
                } else if (c == j11 && j11.isEnabled())
                {
                    j11Call();
                } else if (c == j21 && j21.isEnabled())
                {
                    j21Call();
                } else if (c == j31 && j31.isEnabled())
                {
                    j31Call();
                } else if (c == j41 && j41.isEnabled())
                {
                    j41Call();
                } else if (c == j51 && j51.isEnabled())
                {
                    j51Call();
                } else if (c == j61 && j61.isEnabled())
                {
                    j61Call();
                } else if (c == j71 && j71.isEnabled())
                {
                    j71Call();
                } else if (c == j81 && j81.isEnabled())
                {
                    j81Call();
                } else if (c == j91 && j91.isEnabled())
                {
                    j91Call();
                } else if (c == j2 && j2.isEnabled())
                {
                    j2Call();
                } else if (c == j12 && j12.isEnabled())
                {
                    j12Call();
                } else if (c == j22 && j22.isEnabled())
                {
                    j22Call();
                } else if (c == j32 && j32.isEnabled())
                {
                    j32Call();
                } else if (c == j42 && j42.isEnabled())
                {
                    j42Call();
                } else if (c == j52 && j52.isEnabled())
                {
                    j52Call();
                } else if (c == j62 && j62.isEnabled())
                {
                    j62Call();
                } else if (c == j72 && j72.isEnabled())
                {
                    j72Call();
                } else if (c == j82 && j82.isEnabled())
                {
                    j82Call();
                } else if (c == j92 && j92.isEnabled())
                {
                    j92Call();
                } else if (c == j3 && j3.isEnabled())
                {
                    j3Call();
                } else if (c == j13 && j13.isEnabled())
                {
                    j13Call();
                } else if (c == j23 && j23.isEnabled())
                {
                    j23Call();
                } else if (c == j33 && j33.isEnabled())
                {
                    j33Call();
                } else if (c == j43 && j43.isEnabled())
                {
                    j43Call();
                } else if (c == j53 && j53.isEnabled())
                {
                    j53Call();
                } else if (c == j63 && j63.isEnabled())
                {
                    j63Call();
                } else if (c == j73 && j73.isEnabled())
                {
                    j73Call();
                } else if (c == j83 && j83.isEnabled())
                {
                    j83Call();
                } else if (c == j93 && j93.isEnabled())
                {
                    j93Call();
                } else if (c == j4 && j4.isEnabled())
                {
                    j4Call();
                } else if (c == j14 && j14.isEnabled())
                {
                    j14Call();
                } else if (c == j24 && j24.isEnabled())
                {
                    j24Call();
                } else if (c == j34 && j34.isEnabled())
                {
                    j34Call();
                } else if (c == j44 && j44.isEnabled())
                {
                    j44Call();
                } else if (c == j54 && j54.isEnabled())
                {
                    j54Call();
                } else if (c == j64 && j64.isEnabled())
                {
                    j64Call();
                } else if (c == j74 && j74.isEnabled())
                {
                    j74Call();
                } else if (c == j84 && j84.isEnabled())
                {
                    j84Call();
                } else if (c == j94 && j94.isEnabled())
                {
                    j94Call();
                } else if (c == j5 && j5.isEnabled())
                {
                    j5Call();
                } else if (c == j15 && j15.isEnabled())
                {
                    j15Call();
                } else if (c == j25 && j25.isEnabled())
                {
                    j25Call();
                } else if (c == j35 && j35.isEnabled())
                {
                    j35Call();
                } else if (c == j45 && j45.isEnabled())
                {
                    j45Call();
                } else if (c == j55 && j55.isEnabled())
                {
                    j55Call();
                } else if (c == j65 && j65.isEnabled())
                {
                    j65Call();
                } else if (c == j75 && j75.isEnabled())
                {
                    j75Call();
                } else if (c == j85 && j85.isEnabled())
                {
                    j85Call();
                } else if (c == j95 && j95.isEnabled())
                {
                    j95Call();
                } else if (c == j6 && j6.isEnabled())
                {
                    j6Call();
                } else if (c == j16 && j16.isEnabled())
                {
                    j16Call();
                } else if (c == j26 && j26.isEnabled())
                {
                    j26Call();
                } else if (c == j36 && j36.isEnabled())
                {
                    j36Call();
                } else if (c == j46 && j46.isEnabled())
                {
                    j46Call();
                } else if (c == j56 && j56.isEnabled())
                {
                    j56Call();
                } else if (c == j66 && j66.isEnabled())
                {
                    j66Call();
                } else if (c == j76 && j76.isEnabled())
                {
                    j76Call();
                } else if (c == j86 && j86.isEnabled())
                {
                    j86Call();
                } else if (c == j96 && j96.isEnabled())
                {
                    j96Call();
                } else if (c == j7 && j7.isEnabled())
                {
                    j7Call();
                } else if (c == j17 && j17.isEnabled())
                {
                    j17Call();
                } else if (c == j27 && j27.isEnabled())
                {
                    j27Call();
                } else if (c == j37 && j37.isEnabled())
                {
                    j37Call();
                } else if (c == j47 && j47.isEnabled())
                {
                    j47Call();
                } else if (c == j57 && j57.isEnabled())
                {
                    j57Call();
                } else if (c == j67 && j67.isEnabled())
                {
                    j67Call();
                } else if (c == j77 && j77.isEnabled())
                {
                    j77Call();
                } else if (c == j87 && j87.isEnabled())
                {
                    j87Call();
                } else if (c == j97 && j97.isEnabled())
                {
                    j97Call();
                } else if (c == j8 && j8.isEnabled())
                {
                    j8Call();
                } else if (c == j18 && j17.isEnabled())
                {
                    j18Call();
                } else if (c == j28 && j28.isEnabled())
                {
                    j28Call();
                } else if (c == j38 && j38.isEnabled())
                {
                    j38Call();
                } else if (c == j48 && j48.isEnabled())
                {
                    j48Call();
                } else if (c == j58 && j58.isEnabled())
                {
                    j58Call();
                } else if (c == j68 && j68.isEnabled())
                {
                    j68Call();
                } else if (c == j78 && j78.isEnabled())
                {
                    j78Call();
                } else if (c == j88 && j88.isEnabled())
                {
                    j88Call();
                } else if (c == j98 && j98.isEnabled())
                {
                    j98Call();
                } else if (c == j9 && j9.isEnabled())
                {
                    j9Call();
                } else if (c == j19 && j19.isEnabled())
                {
                    j19Call();
                } else if (c == j29 && j29.isEnabled())
                {
                    j29Call();
                } else if (c == j39 && j39.isEnabled())
                {
                    j39Call();
                } else if (c == j49 && j49.isEnabled())
                {
                    j49Call();
                } else if (c == j59 && j59.isEnabled())
                {
                    j59Call();
                } else if (c == j69 && j69.isEnabled())
                {
                    j69Call();
                } else if (c == j79 && j79.isEnabled())
                {
                    j79Call();
                } else if (c == j89 && j89.isEnabled())
                {
                    j89Call();
                } else if (c == j99 && j99.isEnabled())
                {
                    j99Call();
                } else if (c == j10 && j10.isEnabled())
                {
                    j10Call();
                } else if (c == j20 && j20.isEnabled())
                {
                    j20Call();
                } else if (c == j30 && j30.isEnabled())
                {
                    j30Call();
                } else if (c == j40 && j40.isEnabled())
                {
                    j40Call();
                } else if (c == j50 && j50.isEnabled())
                {
                    j50Call();
                } else if (c == j60 && j60.isEnabled())
                {
                    j60Call();
                } else if (c == j70 && j70.isEnabled())
                {
                    j70Call();
                } else if (c == j80 && j80.isEnabled())
                {
                    j80Call();
                } else if (c == j90 && j90.isEnabled())
                {
                    j90Call();
                } else
                {
                    l.setBounds(200, 540, 600, 50);
                    l.setForeground(Color.WHITE);
                    j.add(l);
                    j.revalidate();
                    j.repaint();
                    //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
                }
            }
            if (turn_flag == 0 && who_has_control == 0)
            {
                if (com == l1 && l1.isEnabled())
                {
                    l1Call();
                } else if (com == l11 && l11.isEnabled())
                {
                    l11Call();
                } else if (com == l21 && l21.isEnabled())
                {
                    l21Call();
                } else if (com == l31 && l31.isEnabled())
                {
                    l31Call();
                } else if (com == l41 && l41.isEnabled())
                {
                    l41Call();
                } else if (com == l51 && l51.isEnabled())
                {
                    l51Call();
                } else if (com == l61 && l61.isEnabled())
                {
                    l61Call();
                } else if (com == l71 && l71.isEnabled())
                {
                    l71Call();
                } else if (com == l81 && l81.isEnabled())
                {
                    l81Call();
                } else if (com == l91 && l91.isEnabled())
                {
                    l91Call();
                } else if (com == l2 && l2.isEnabled())
                {
                    l2Call();
                } else if (com == l12 && l12.isEnabled())
                {
                    l12Call();
                } else if (com == l22 && l22.isEnabled())
                {
                    l22Call();
                } else if (com == l32 && l32.isEnabled())
                {
                    l32Call();
                } else if (com == l42 && l42.isEnabled())
                {
                    l42Call();
                } else if (com == l52 && l52.isEnabled())
                {
                    l52Call();
                } else if (com == l62 && l62.isEnabled())
                {
                    l62Call();
                } else if (com == l72 && l72.isEnabled())
                {
                    l72Call();
                } else if (com == l82 && l82.isEnabled())
                {
                    l82Call();
                } else if (com == l92 && l92.isEnabled())
                {
                    l92Call();
                } else if (com == l3 && l3.isEnabled())
                {
                    l3Call();
                } else if (com == l13 && l13.isEnabled())
                {
                    l13Call();
                } else if (com == l23 && l23.isEnabled())
                {
                    l23Call();
                } else if (com == l33 && l33.isEnabled())
                {
                    l33Call();
                } else if (com == l43 && l43.isEnabled())
                {
                    l43Call();
                } else if (com == l53 && l53.isEnabled())
                {
                    l53Call();
                } else if (com == l63 && l63.isEnabled())
                {
                    l63Call();
                } else if (com == l73 && l73.isEnabled())
                {
                    l73Call();
                } else if (com == l83 && l83.isEnabled())
                {
                    l83Call();
                } else if (com == l93 && l93.isEnabled())
                {
                    l93Call();
                } else if (com == l4 && l4.isEnabled())
                {
                    l4Call();
                } else if (com == l14 && l14.isEnabled())
                {
                    l14Call();
                } else if (com == l24 && l24.isEnabled())
                {
                    l24Call();
                } else if (com == l34 && l34.isEnabled())
                {
                    l34Call();
                } else if (com == l44 && l44.isEnabled())
                {
                    l44Call();
                } else if (com == l54 && l54.isEnabled())
                {
                    l54Call();
                } else if (com == l64 && l64.isEnabled())
                {
                    l64Call();
                } else if (com == l74 && l74.isEnabled())
                {
                    l74Call();
                } else if (com == l84 && l84.isEnabled())
                {
                    l84Call();
                } else if (com == l94 && l94.isEnabled())
                {
                    l94Call();
                } else if (com == l5 && l5.isEnabled())
                {
                    l5Call();
                } else if (com == l15 && l15.isEnabled())
                {
                    l15Call();
                } else if (com == l25 && l25.isEnabled())
                {
                    l25Call();
                } else if (com == l35 && l35.isEnabled())
                {
                    l35Call();
                } else if (com == l45 && l45.isEnabled())
                {
                    l45Call();
                } else if (com == l55 && l55.isEnabled())
                {
                    l55Call();
                } else if (com == l65 && l65.isEnabled())
                {
                    l65Call();
                } else if (com == l75 && l75.isEnabled())
                {
                    l75Call();
                } else if (com == l85 && l85.isEnabled())
                {
                    l85Call();
                } else if (com == l95 && l95.isEnabled())
                {
                    l95Call();
                } else if (com == l6 && l6.isEnabled())
                {
                    l6Call();
                } else if (com == l16 && l16.isEnabled())
                {
                    l16Call();
                } else if (com == l26 && l26.isEnabled())
                {
                    l26Call();
                } else if (com == l36 && l36.isEnabled())
                {
                    l36Call();
                } else if (com == l46 && l46.isEnabled())
                {
                    l46Call();
                } else if (com == l56 && l56.isEnabled())
                {
                    l56Call();
                } else if (com == l66 && l66.isEnabled())
                {
                    l66Call();
                } else if (com == l76 && l76.isEnabled())
                {
                    l76Call();
                } else if (com == l86 && l86.isEnabled())
                {
                    l86Call();
                } else if (com == l96 && l96.isEnabled())
                {
                    l96Call();
                } else if (com == l7 && l7.isEnabled())
                {
                    l7Call();
                } else if (com == l17 && l17.isEnabled())
                {
                    l17Call();
                } else if (com == l27 && l27.isEnabled())
                {
                    l27Call();
                } else if (com == l37 && l37.isEnabled())
                {
                    l37Call();
                } else if (com == l47 && l47.isEnabled())
                {
                    l47Call();
                } else if (com == l57 && l57.isEnabled())
                {
                    l57Call();
                } else if (com == l67 && l67.isEnabled())
                {
                    l67Call();
                } else if (com == l77 && l77.isEnabled())
                {
                    l77Call();
                } else if (com == l87 && l87.isEnabled())
                {
                    l87Call();
                } else if (com == l97 && l97.isEnabled())
                {
                    l97Call();
                } else if (com == l8 && l8.isEnabled())
                {
                    l8Call();
                } else if (com == l18 && l18.isEnabled())
                {
                    l18Call();
                } else if (com == l28 && l28.isEnabled())
                {
                    l28Call();
                } else if (com == l38 && l38.isEnabled())
                {
                    l38Call();
                } else if (com == l48 && l48.isEnabled())
                {
                    l48Call();
                } else if (com == l58 && l58.isEnabled())
                {
                    l58Call();
                } else if (com == l68 && l68.isEnabled())
                {
                    l68Call();
                } else if (com == l78 && l78.isEnabled())
                {
                    l78Call();
                } else if (com == l88 && l88.isEnabled())
                {
                    l88Call();
                } else if (com == l98 && l98.isEnabled())
                {
                    l98Call();
                } else if (com == l9 && l9.isEnabled())
                {
                    l9Call();
                } else if (com == l19 && l19.isEnabled())
                {
                    l19Call();
                } else if (com == l29 && l29.isEnabled())
                {
                    l29Call();
                } else if (com == l39 && l39.isEnabled())
                {
                    l39Call();
                } else if (com == l49 && l49.isEnabled())
                {
                    l49Call();
                } else if (com == l59 && l59.isEnabled())
                {
                    l59Call();
                } else if (com == l69 && l69.isEnabled())
                {
                    l69Call();
                } else if (com == l79 && l79.isEnabled())
                {
                    l79Call();
                } else if (com == l89 && l89.isEnabled())
                {
                    l89Call();
                } else if (com == l99 && l99.isEnabled())
                {
                    l99Call();
                } else if (com == l10 && l10.isEnabled())
                {
                    l10Call();
                } else if (com == l20 && l20.isEnabled())
                {
                    l20Call();
                } else if (com == l30 && l30.isEnabled())
                {
                    l30Call();
                } else if (com == l40 && l40.isEnabled())
                {
                    l40Call();
                } else if (com == l50 && l50.isEnabled())
                {
                    l50Call();
                } else if (com == l60 && l60.isEnabled())
                {
                    l60Call();
                } else if (com == l70 && l70.isEnabled())
                {
                    l70Call();
                } else if (com == l80 && l80.isEnabled())
                {
                    l80Call();
                } else if (com == l90 && l90.isEnabled())
                {
                    l90Call();
                } else if (com == l100 && l100.isEnabled())
                {
                    l100Call();
                }
            }
            if (turn_flag == 2)
            {
                if(load_screen == play_hits && screen_check == 0)
                {
                    crd.show(co, "CHA");
                    who_has_control = 1;
                    screen_check = 1;
                }
                else if(load_screen == com_hits && screen_check == 0)
                {
                    crd.show(co, "PHA");
                    who_has_control = 0;
                    screen_check = 1;
                }
                else if(c == back_c && screen_check == 1)
                {
                    crd.show(co, "LA");
                    who_has_control = 1;
                    screen_check = 0;
                }
                else if(com == back_p && screen_check == 1)
                {
                    crd.show(co, "LA");
                    who_has_control = 1;
                    screen_check = 0;
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e)
        {

        }

        @Override
        public void mouseReleased(MouseEvent e)
        {

        }

        @Override
        public void mouseEntered(MouseEvent e)
        {

        }

        @Override
        public void mouseExited(MouseEvent e)
        {

        }
    };

    public void welcome_screen()
    {
        Icon logo = new ImageIcon("logo.png");
        JLabel l = new JLabel(logo);
        l.setBounds(65,100,666,122);
        j.add(l);
        JButton start = new JButton();
        j.setBackground(Color.BLACK);
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
                j.revalidate();
                j.repaint();
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
        j1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j10.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j12.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j13.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j14.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j15.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j16.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j17.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j18.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j19.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j20.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j21.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j22.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j23.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j24.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j25.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j26.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j27.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j28.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j29.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j30.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j31.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j32.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j33.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j34.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j35.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j36.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j37.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j38.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j39.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j40.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j41.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j42.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j43.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j44.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j45.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j46.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j47.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j48.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j49.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j50.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j51.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j52.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j53.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j54.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j55.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j56.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j57.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j58.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j59.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j60.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j61.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j62.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j63.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j64.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j65.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j66.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j67.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j68.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j69.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j70.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j71.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j72.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j73.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j74.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j75.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j76.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j77.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j78.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j79.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j80.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j81.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j82.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j83.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j84.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j85.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j86.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j87.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j88.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j89.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j90.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j91.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j92.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j93.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j94.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j95.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j96.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j97.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j98.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j99.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        j100.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        this.j.add(tip);
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
        this.PlayArea.setGlassPane(p);
        p.addMouseMotionListener(this);
        p.setLayout(null);
        p.setOpaque(false);
        p.setVisible(true);
        p.setFocusable(true);
        p.add(cur);
        p.grabFocus();
        p.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                System.out.println("Hello");
                if (e.getKeyChar() == 'r' || e.getKeyChar() == 'R')
                {
                    System.out.println("Hello again");
                    if (flag == 0)
                    {
                        xoffset = 10;
                        yoffset = 25;
                        System.out.println("X Offset : "+xoffset);
                        System.out.println("Y Offset : "+yoffset);
                        System.out.println("Hello for the third time");
                        switch (cur_aircraft)
                        {
                            case "aircraft-carrier":
                                System.out.println("Hello for the final time");
                                cur.setIcon(new ImageIcon("aircraft-carrier/aircraft-h.png"));
                                flag = 1;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "battleship":
                                System.out.println("Hello for the final time");
                                cur.setIcon(new ImageIcon("battleship/battleship-h.png"));
                                flag = 1;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "submarine":
                                System.out.println("Hello for the final time");
                                cur.setIcon(new ImageIcon("submarine/submarine-h.png"));
                                flag = 1;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "cruiser":
                                System.out.println("Hello for the final time");
                                cur.setIcon(new ImageIcon("cruiser/cruiser-h.png"));
                                flag = 1;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "destroyer":
                                System.out.println("Hello for the final time");
                                cur.setIcon(new ImageIcon("destroyer/destroyer-h.png"));
                                flag = 1;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                        }
                    }
                    else
                    {
                        xoffset = 25;
                        yoffset = 10;
                        System.out.println("X Offset : "+xoffset);
                        System.out.println("Y Offset : "+yoffset);
                        switch (cur_aircraft)
                        {
                            case "aircraft-carrier":
                                cur.setIcon(new ImageIcon("aircraft-carrier/aircraft-v.png"));
                                flag = 0;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "battleship":
                                cur.setIcon(new ImageIcon("battleship/battleship-v.png"));
                                flag = 0;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "submarine":
                                cur.setIcon(new ImageIcon("submarine/submarine-v.png"));
                                flag = 0;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "cruiser":
                                cur.setIcon(new ImageIcon("cruiser/cruiser-v.png"));
                                flag = 0;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                            case "destroyer":
                                cur.setIcon(new ImageIcon("destroyer/destroyer-v.png"));
                                flag = 0;
                                System.out.println("XPOS : " + xpos);
                                System.out.println("YPOS : " + ypos);
                                cur.setBounds(po.x - xoffset, po.y - yoffset, (int) cur.getPreferredSize().getWidth(), (int) cur.getPreferredSize().getHeight());
                                p.repaint();
                                break;
                        }
                    }
                }
            }
        });
        this.j.revalidate();
        this.j.repaint();
        play_ship_place();
    }

    public void play_ship_place()
    {
        p.addMouseListener(ml);
    }


    public static void main(String[] args)
    {
        Main m = new Main();
        try
        {
            new File("logs/").mkdirs();
        }
        catch (Exception ex)
        {

        }
        try
        {
            FileWriter f = new FileWriter("logs/logfile.txt");
            f.write("");
            f.close();
            m.audiofile = new File("audio/ship_explosion.wav");
            m.as = AudioSystem.getAudioInputStream(m.audiofile);
            m.f = m.as.getFormat();
            m.in = new DataLine.Info(Clip.class, m.f);
            m.ac = (Clip) AudioSystem.getLine(m.in);
            m.ac.open(m.as);
            m.audiofilem = new File("audio/ship_miss.wav");
            m.asm = AudioSystem.getAudioInputStream(m.audiofilem);
            m.fm = m.asm.getFormat();
            m.inm = new DataLine.Info(Clip.class, m.fm);
            m.acm = (Clip) AudioSystem.getLine(m.inm);
            m.acm.open(m.asm);
            m.audiofile_p = new File("audio/ship_explosion.wav");
            m.as_p = AudioSystem.getAudioInputStream(m.audiofile_p);
            m.f_p = m.as_p.getFormat();
            m.in_p = new DataLine.Info(Clip.class, m.f_p);
            m.ac_p = (Clip) AudioSystem.getLine(m.in);
            m.ac_p.open(m.as_p);
            m.audiofilem_p = new File("audio/ship_miss.wav");
            m.asm_p = AudioSystem.getAudioInputStream(m.audiofilem_p);
            m.fm_p = m.asm_p.getFormat();
            m.inm_p = new DataLine.Info(Clip.class, m.fm_p);
            m.acm_p = (Clip) AudioSystem.getLine(m.inm_p);
            m.acm_p.open(m.asm_p);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        m.safe = new ImageIcon("hud/ship-sunk.png");
        m.found = new ImageIcon("hud/ship-found.png");
        m.hit = new ImageIcon("hud/ship-not-found.png");
        System.out.println("Huh. You are running this from a console. Be prepared to see all the stuff that I was using to test the game left in here.\n BTW I'm not dumb enough to leave in the Computer's moves in here. So, you can't cheat :).\n P.S. There is a way to enable it, but you will need to look at the Source Code to figure it out");
        m.co.setLayout(m.crd);
        m.co.add(m.j, "CHA");
        m.co.add(m.loading, "LA");
        m.co.add(m.play_hit, "PHA");
        m.play_hit.setLayout(null);
        m.play_hit.setBackground(Color.BLACK);
        m.PlayArea.setLocation(533,66); //This line is present for a convoluted reason. I use i3-wm and I have modified my config to un-tile and float the application. But, I cannot figure out a way in the config to open it in the middle of the screen. So, I am currently doing it via the code. It will be removed once development is complete.
        m.PlayArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.tip.setBounds(5,5, 3000, 30);
        m.tip.setForeground(Color.WHITE);
        m.j.setLayout(null);
        m.PlayArea.add(m.co);
        m.PlayArea.setSize(800,675);
        m.welcome_screen();
        m.PlayArea.setVisible(true);
    }
}