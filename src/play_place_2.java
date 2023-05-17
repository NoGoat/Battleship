import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_2 extends play_place_1
{
    public void j2Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j2.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j12.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j22.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j32.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j2";
            aircraft_pos[1] = "j12";
            aircraft_pos[2] = "j22";
            aircraft_pos[3] = "j32";
            aircraft_pos[4] = "j42";
            j2.setEnabled(false);
            j12.setEnabled(false);
            j22.setEnabled(false);
            j32.setEnabled(false);
            j42.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j22.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j32.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j2.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j3.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j4.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j5.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j6.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j2";
            aircraft_pos[1] = "j3";
            aircraft_pos[2] = "j4";
            aircraft_pos[3] = "j5";
            aircraft_pos[4] = "j6";
            j2.setEnabled(false);
            j3.setEnabled(false);
            j4.setEnabled(false);
            j5.setEnabled(false);
            j6.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j3.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j4.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j5.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j6.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j12.isEnabled() && j22.isEnabled() && j32.isEnabled())
        {
            cur_aircraft = "submarine";
            j2.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j12.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j22.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j32.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j2";
            battleship_pos[1] = "j12";
            battleship_pos[2] = "j22";
            battleship_pos[3] = "j32";
            j2.setEnabled(false);
            j12.setEnabled(false);
            j22.setEnabled(false);
            j32.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j22.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j32.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j3.isEnabled() && j4.isEnabled() && j5.isEnabled())
        {
            cur_aircraft = "submarine";
            j2.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j3.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j4.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j5.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j2";
            battleship_pos[1] = "j3";
            battleship_pos[2] = "j4";
            battleship_pos[3] = "j5";
            j2.setEnabled(false);
            j3.setEnabled(false);
            j4.setEnabled(false);
            j5.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j3.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j4.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j5.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j12.isEnabled() && j22.isEnabled())
        {
            cur_aircraft = "cruiser";
            j2.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j12.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j22.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j2";
            submarine_pos[1] = "j12";
            submarine_pos[2] = "j22";
            j2.setEnabled(false);
            j12.setEnabled(false);
            j22.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j22.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j3.isEnabled() && j4.isEnabled())
        {
            cur_aircraft = "cruiser";
            j2.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j3.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j4.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j2";
            submarine_pos[1] = "j3";
            submarine_pos[2] = "j4";
            j2.setEnabled(false);
            j3.setEnabled(false);
            j4.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j3.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j4.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j12.isEnabled() && j22.isEnabled())
        {
            cur_aircraft = "destroyer";
            j2.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j12.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j22.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j2";
            cruiser_pos[1] = "j12";
            cruiser_pos[2] = "j22";
            j2.setEnabled(false);
            j12.setEnabled(false);
            j22.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j22.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j3.isEnabled() && j4.isEnabled())
        {
            cur_aircraft = "destroyer";
            j2.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j3.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j4.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j2";
            cruiser_pos[1] = "j3";
            cruiser_pos[2] = "j4";
            j2.setEnabled(false);
            j3.setEnabled(false);
            j4.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j3.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j4.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j12.isEnabled())
        {
            cur_aircraft = "finished";
            j2.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j12.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j2";
            destroyer_pos[1] = "j12";
            j2.setEnabled(false);
            j12.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j3.isEnabled())
        {
            cur_aircraft = "finished";
            j2.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j3.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j2";
            destroyer_pos[1] = "j3";
            j2.setEnabled(false);
            j3.setEnabled(false);
            j2.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j3.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j12Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j12.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j22.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j32.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j12";
            aircraft_pos[1] = "j22";
            aircraft_pos[2] = "j32";
            aircraft_pos[3] = "j42";
            aircraft_pos[4] = "j52";
            j12.setEnabled(false);
            j22.setEnabled(false);
            j32.setEnabled(false);
            j42.setEnabled(false);
            j52.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j32.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j12.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j13.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j14.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j16.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j12";
            aircraft_pos[1] = "j13";
            aircraft_pos[2] = "j14";
            aircraft_pos[3] = "j15";
            aircraft_pos[4] = "j16";
            j12.setEnabled(false);
            j13.setEnabled(false);
            j14.setEnabled(false);
            j15.setEnabled(false);
            j16.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j14.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j16.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j22.isEnabled() && j32.isEnabled() && j42.isEnabled())
        {
            cur_aircraft = "submarine";
            j12.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j22.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j32.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j42.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j12";
            battleship_pos[1] = "j22";
            battleship_pos[2] = "j32";
            battleship_pos[3] = "j42";
            j12.setEnabled(false);
            j22.setEnabled(false);
            j32.setEnabled(false);
            j42.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j32.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j42.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j13.isEnabled() && j14.isEnabled() && j15.isEnabled())
        {
            cur_aircraft = "submarine";
            j12.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j13.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j14.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j15.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j12";
            battleship_pos[1] = "j13";
            battleship_pos[2] = "j14";
            battleship_pos[3] = "j15";
            j12.setEnabled(false);
            j13.setEnabled(false);
            j14.setEnabled(false);
            j15.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j14.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j15.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j22.isEnabled() && j32.isEnabled())
        {
            cur_aircraft = "cruiser";
            j12.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j22.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j32.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j12";
            submarine_pos[1] = "j22";
            submarine_pos[2] = "j32";
            j12.setEnabled(false);
            j22.setEnabled(false);
            j32.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j32.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j13.isEnabled() && j14.isEnabled())
        {
            cur_aircraft = "cruiser";
            j12.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j13.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j14.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j12";
            submarine_pos[1] = "j13";
            submarine_pos[2] = "j14";
            j12.setEnabled(false);
            j13.setEnabled(false);
            j14.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j14.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j22.isEnabled() && j32.isEnabled())
        {
            cur_aircraft = "destroyer";
            j12.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j22.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j32.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j12";
            cruiser_pos[1] = "j22";
            cruiser_pos[2] = "j32";
            j12.setEnabled(false);
            j22.setEnabled(false);
            j32.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j32.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j13.isEnabled() && j14.isEnabled())
        {
            cur_aircraft = "destroyer";
            j12.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j13.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j14.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j12";
            cruiser_pos[1] = "j13";
            cruiser_pos[2] = "j14";
            j12.setEnabled(false);
            j13.setEnabled(false);
            j14.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j14.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j22.isEnabled())
        {
            cur_aircraft = "finished";
            j12.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j22.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j12";
            destroyer_pos[1] = "j22";
            j12.setEnabled(false);
            j22.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j13.isEnabled())
        {
            cur_aircraft = "finished";
            j12.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j13.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j12";
            destroyer_pos[1] = "j13";
            j12.setEnabled(false);
            j13.setEnabled(false);
            j12.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j22Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j22.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j32.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j62.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j22";
            aircraft_pos[1] = "j32";
            aircraft_pos[2] = "j42";
            aircraft_pos[3] = "j52";
            aircraft_pos[4] = "j62";
            j22.setEnabled(false);
            j32.setEnabled(false);
            j42.setEnabled(false);
            j52.setEnabled(false);
            j62.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j62.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j22.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j23.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j22";
            aircraft_pos[1] = "j23";
            aircraft_pos[2] = "j24";
            aircraft_pos[3] = "j25";
            aircraft_pos[4] = "j26";
            j22.setEnabled(false);
            j23.setEnabled(false);
            j24.setEnabled(false);
            j25.setEnabled(false);
            j26.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j32.isEnabled() && j42.isEnabled() && j52.isEnabled())
        {
            cur_aircraft = "submarine";
            j22.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j32.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j42.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j52.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j22";
            battleship_pos[1] = "j32";
            battleship_pos[2] = "j42";
            battleship_pos[3] = "j52";
            j22.setEnabled(false);
            j32.setEnabled(false);
            j42.setEnabled(false);
            j52.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j42.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j52.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j23.isEnabled() && j24.isEnabled() && j25.isEnabled())
        {
            cur_aircraft = "submarine";
            j22.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j23.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j24.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j25.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j22";
            battleship_pos[1] = "j23";
            battleship_pos[2] = "j24";
            battleship_pos[3] = "j25";
            j22.setEnabled(false);
            j23.setEnabled(false);
            j24.setEnabled(false);
            j25.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j25.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j32.isEnabled() && j42.isEnabled())
        {
            cur_aircraft = "cruiser";
            j22.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j32.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j42.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j22";
            submarine_pos[1] = "j32";
            submarine_pos[2] = "j42";
            j22.setEnabled(false);
            j32.setEnabled(false);
            j42.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j42.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j23.isEnabled() && j24.isEnabled())
        {
            cur_aircraft = "cruiser";
            j22.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j23.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j24.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j22";
            submarine_pos[1] = "j23";
            submarine_pos[2] = "j24";
            j22.setEnabled(false);
            j23.setEnabled(false);
            j24.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j32.isEnabled() && j42.isEnabled())
        {
            cur_aircraft = "destroyer";
            j22.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j32.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j42.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j22";
            cruiser_pos[1] = "j32";
            cruiser_pos[2] = "j42";
            j22.setEnabled(false);
            j32.setEnabled(false);
            j42.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j42.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j23.isEnabled() && j24.isEnabled())
        {
            cur_aircraft = "destroyer";
            j22.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j23.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j24.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j22";
            cruiser_pos[1] = "j23";
            cruiser_pos[2] = "j24";
            j22.setEnabled(false);
            j23.setEnabled(false);
            j24.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j32.isEnabled())
        {
            cur_aircraft = "finished";
            j22.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j32.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j22";
            destroyer_pos[1] = "j32";
            j22.setEnabled(false);
            j32.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j23.isEnabled())
        {
            cur_aircraft = "finished";
            j22.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j23.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j22";
            destroyer_pos[1] = "j23";
            j22.setEnabled(false);
            j23.setEnabled(false);
            j22.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j32Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j32.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j62.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j72.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j32";
            aircraft_pos[1] = "j42";
            aircraft_pos[2] = "j52";
            aircraft_pos[3] = "j62";
            aircraft_pos[4] = "j72";
            j32.setEnabled(false);
            j42.setEnabled(false);
            j52.setEnabled(false);
            j62.setEnabled(false);
            j72.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j62.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j72.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j32.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j32";
            aircraft_pos[1] = "j33";
            aircraft_pos[2] = "j34";
            aircraft_pos[3] = "j35";
            aircraft_pos[4] = "j36";
            j32.setEnabled(false);
            j33.setEnabled(false);
            j34.setEnabled(false);
            j35.setEnabled(false);
            j36.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j42.isEnabled() && j52.isEnabled() && j62.isEnabled())
        {
            cur_aircraft = "submarine";
            j32.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j42.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j52.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j62.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j32";
            battleship_pos[1] = "j42";
            battleship_pos[2] = "j52";
            battleship_pos[3] = "j62";
            j32.setEnabled(false);
            j42.setEnabled(false);
            j52.setEnabled(false);
            j62.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j52.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j62.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j33.isEnabled() && j34.isEnabled() && j35.isEnabled())
        {
            cur_aircraft = "submarine";
            j32.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j33.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j34.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j35.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j32";
            battleship_pos[1] = "j33";
            battleship_pos[2] = "j34";
            battleship_pos[3] = "j35";
            j32.setEnabled(false);
            j33.setEnabled(false);
            j34.setEnabled(false);
            j35.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j42.isEnabled() && j52.isEnabled())
        {
            cur_aircraft = "cruiser";
            j32.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j42.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j52.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j32";
            submarine_pos[1] = "j42";
            submarine_pos[2] = "j52";
            j32.setEnabled(false);
            j42.setEnabled(false);
            j52.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j52.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j33.isEnabled() && j34.isEnabled())
        {
            cur_aircraft = "cruiser";
            j32.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j33.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j34.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j32";
            submarine_pos[1] = "j33";
            submarine_pos[2] = "j34";
            j32.setEnabled(false);
            j33.setEnabled(false);
            j34.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j42.isEnabled() && j52.isEnabled())
        {
            cur_aircraft = "destroyer";
            j32.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j42.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j52.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j32";
            cruiser_pos[1] = "j42";
            cruiser_pos[2] = "j52";
            j32.setEnabled(false);
            j42.setEnabled(false);
            j52.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j52.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j33.isEnabled() && j34.isEnabled())
        {
            cur_aircraft = "destroyer";
            j32.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j33.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j34.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j32";
            cruiser_pos[1] = "j33";
            cruiser_pos[2] = "j34";
            j32.setEnabled(false);
            j33.setEnabled(false);
            j34.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j42.isEnabled())
        {
            cur_aircraft = "finished";
            j32.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j42.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j32";
            destroyer_pos[1] = "j42";
            j32.setEnabled(false);
            j42.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j32.isEnabled())
        {
            cur_aircraft = "finished";
            j32.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j33.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j32";
            destroyer_pos[1] = "j33";
            j32.setEnabled(false);
            j33.setEnabled(false);
            j32.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j42Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j62.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j72.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j82.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j42";
            aircraft_pos[1] = "j52";
            aircraft_pos[2] = "j62";
            aircraft_pos[3] = "j72";
            aircraft_pos[4] = "j82";
            j42.setEnabled(false);
            j52.setEnabled(false);
            j62.setEnabled(false);
            j72.setEnabled(false);
            j82.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j62.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j72.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j82.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j42";
            aircraft_pos[1] = "j43";
            aircraft_pos[2] = "j44";
            aircraft_pos[3] = "j45";
            aircraft_pos[4] = "j46";
            j42.setEnabled(false);
            j43.setEnabled(false);
            j44.setEnabled(false);
            j45.setEnabled(false);
            j46.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j52.isEnabled() && j62.isEnabled() && j72.isEnabled())
        {
            cur_aircraft = "submarine";
            j42.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j52.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j62.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j72.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j42";
            battleship_pos[1] = "j52";
            battleship_pos[2] = "j62";
            battleship_pos[3] = "j72";
            j42.setEnabled(false);
            j52.setEnabled(false);
            j62.setEnabled(false);
            j72.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j62.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j72.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j43.isEnabled() && j44.isEnabled() && j45.isEnabled())
        {
            cur_aircraft = "submarine";
            j42.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j43.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j44.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j45.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j42";
            battleship_pos[1] = "j43";
            battleship_pos[2] = "j44";
            battleship_pos[3] = "j45";
            j42.setEnabled(false);
            j43.setEnabled(false);
            j44.setEnabled(false);
            j45.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j52.isEnabled() && j62.isEnabled())
        {
            cur_aircraft = "cruiser";
            j42.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j52.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j62.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j42";
            submarine_pos[1] = "j52";
            submarine_pos[2] = "j62";
            j42.setEnabled(false);
            j52.setEnabled(false);
            j62.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j62.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j43.isEnabled() && j44.isEnabled())
        {
            cur_aircraft = "cruiser";
            j42.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j43.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j44.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j42";
            submarine_pos[1] = "j43";
            submarine_pos[2] = "j44";
            j42.setEnabled(false);
            j43.setEnabled(false);
            j44.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j52.isEnabled() && j62.isEnabled())
        {
            cur_aircraft = "destroyer";
            j42.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j52.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j62.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j42";
            cruiser_pos[1] = "j52";
            cruiser_pos[2] = "j62";
            j42.setEnabled(false);
            j52.setEnabled(false);
            j62.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j62.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j43.isEnabled() && j44.isEnabled())
        {
            cur_aircraft = "destroyer";
            j42.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j43.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j44.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j42";
            cruiser_pos[1] = "j43";
            cruiser_pos[2] = "j44";
            j42.setEnabled(false);
            j43.setEnabled(false);
            j44.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j52.isEnabled())
        {
            cur_aircraft = "finished";
            j42.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j52.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j42";
            destroyer_pos[1] = "j52";
            j42.setEnabled(false);
            j52.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j43.isEnabled())
        {
            cur_aircraft = "finished";
            j42.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j43.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j42";
            destroyer_pos[1] = "j43";
            j42.setEnabled(false);
            j43.setEnabled(false);
            j42.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j52Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j62.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j72.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j82.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j92.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j52";
            aircraft_pos[1] = "j62";
            aircraft_pos[2] = "j72";
            aircraft_pos[3] = "j82";
            aircraft_pos[4] = "j92";
            j52.setEnabled(false);
            j62.setEnabled(false);
            j72.setEnabled(false);
            j82.setEnabled(false);
            j92.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j72.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j82.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j92.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j52";
            aircraft_pos[1] = "j53";
            aircraft_pos[2] = "j54";
            aircraft_pos[3] = "j55";
            aircraft_pos[4] = "j56";
            j52.setEnabled(false);
            j53.setEnabled(false);
            j54.setEnabled(false);
            j55.setEnabled(false);
            j56.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j62.isEnabled() && j72.isEnabled() && j82.isEnabled())
        {
            cur_aircraft = "submarine";
            j52.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j62.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j72.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j82.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j52";
            battleship_pos[1] = "j62";
            battleship_pos[2] = "j72";
            battleship_pos[3] = "j82";
            j52.setEnabled(false);
            j62.setEnabled(false);
            j72.setEnabled(false);
            j82.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j72.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j82.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j53.isEnabled() && j54.isEnabled() && j55.isEnabled())
        {
            cur_aircraft = "submarine";
            j52.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j53.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j54.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j55.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j52";
            battleship_pos[1] = "j53";
            battleship_pos[2] = "j54";
            battleship_pos[3] = "j55";
            j52.setEnabled(false);
            j53.setEnabled(false);
            j54.setEnabled(false);
            j55.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j62.isEnabled() && j72.isEnabled())
        {
            cur_aircraft = "cruiser";
            j52.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j62.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j72.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j52";
            submarine_pos[1] = "j62";
            submarine_pos[2] = "j72";
            j52.setEnabled(false);
            j62.setEnabled(false);
            j72.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j72.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j53.isEnabled() && j54.isEnabled())
        {
            cur_aircraft = "cruiser";
            j52.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j53.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j54.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j52";
            submarine_pos[1] = "j53";
            submarine_pos[2] = "j54";
            j52.setEnabled(false);
            j53.setEnabled(false);
            j54.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j62.isEnabled() && j72.isEnabled())
        {
            cur_aircraft = "destroyer";
            j52.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j62.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j72.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j52";
            cruiser_pos[1] = "j62";
            cruiser_pos[2] = "j72";
            j52.setEnabled(false);
            j62.setEnabled(false);
            j72.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j72.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j53.isEnabled() && j54.isEnabled())
        {
            cur_aircraft = "destroyer";
            j52.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j53.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j54.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j52";
            cruiser_pos[1] = "j53";
            cruiser_pos[2] = "j54";
            j52.setEnabled(false);
            j53.setEnabled(false);
            j54.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j62.isEnabled())
        {
            cur_aircraft = "finished";
            j52.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j62.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j52";
            destroyer_pos[1] = "j62";
            j52.setEnabled(false);
            j62.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j53.isEnabled())
        {
            cur_aircraft = "finished";
            j52.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j53.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j52";
            destroyer_pos[1] = "j53";
            j52.setEnabled(false);
            j53.setEnabled(false);
            j52.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j62Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j62.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j62";
            aircraft_pos[1] = "j63";
            aircraft_pos[2] = "j64";
            aircraft_pos[3] = "j65";
            aircraft_pos[4] = "j66";
            j62.setEnabled(false);
            j63.setEnabled(false);
            j64.setEnabled(false);
            j65.setEnabled(false);
            j66.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j72.isEnabled() && j82.isEnabled() && j92.isEnabled())
        {
            cur_aircraft = "submarine";
            j62.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j72.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j82.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j92.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j62";
            battleship_pos[1] = "j72";
            battleship_pos[2] = "j82";
            battleship_pos[3] = "j92";
            j62.setEnabled(false);
            j72.setEnabled(false);
            j82.setEnabled(false);
            j92.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j82.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j92.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j63.isEnabled() && j64.isEnabled() && j65.isEnabled())
        {
            cur_aircraft = "submarine";
            j62.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j63.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j64.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j65.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j62";
            battleship_pos[1] = "j63";
            battleship_pos[2] = "j64";
            battleship_pos[3] = "j65";
            j62.setEnabled(false);
            j63.setEnabled(false);
            j64.setEnabled(false);
            j65.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j72.isEnabled() && j82.isEnabled())
        {
            cur_aircraft = "cruiser";
            j62.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j72.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j82.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j62";
            submarine_pos[1] = "j72";
            submarine_pos[2] = "j82";
            j62.setEnabled(false);
            j72.setEnabled(false);
            j82.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j82.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j63.isEnabled() && j64.isEnabled())
        {
            cur_aircraft = "cruiser";
            j62.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j63.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j64.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j62";
            submarine_pos[1] = "j63";
            submarine_pos[2] = "j64";
            j62.setEnabled(false);
            j63.setEnabled(false);
            j64.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j72.isEnabled() && j82.isEnabled())
        {
            cur_aircraft = "destroyer";
            j62.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j72.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j82.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j62";
            cruiser_pos[1] = "j72";
            cruiser_pos[2] = "j82";
            j62.setEnabled(false);
            j72.setEnabled(false);
            j82.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j82.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j63.isEnabled() && j64.isEnabled())
        {
            cur_aircraft = "destroyer";
            j62.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j63.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j64.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j62";
            cruiser_pos[1] = "j63";
            cruiser_pos[2] = "j64";
            j62.setEnabled(false);
            j63.setEnabled(false);
            j64.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j72.isEnabled())
        {
            cur_aircraft = "finished";
            j62.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j72.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j62";
            destroyer_pos[1] = "j72";
            j62.setEnabled(false);
            j72.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j63.isEnabled())
        {
            cur_aircraft = "finished";
            j62.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j63.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j62";
            destroyer_pos[1] = "j63";
            j62.setEnabled(false);
            j63.setEnabled(false);
            j62.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j72Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j72.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j73.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j72";
            aircraft_pos[1] = "j73";
            aircraft_pos[2] = "j74";
            aircraft_pos[3] = "j75";
            aircraft_pos[4] = "j76";
            j72.setEnabled(false);
            j73.setEnabled(false);
            j74.setEnabled(false);
            j75.setEnabled(false);
            j76.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j73.isEnabled() && j74.isEnabled() && j75.isEnabled())
        {
            cur_aircraft = "submarine";
            j72.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j73.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j74.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j75.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j72";
            battleship_pos[1] = "j73";
            battleship_pos[2] = "j74";
            battleship_pos[3] = "j75";
            j72.setEnabled(false);
            j73.setEnabled(false);
            j74.setEnabled(false);
            j75.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j75.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j82.isEnabled() && j92.isEnabled())
        {
            cur_aircraft = "cruiser";
            j72.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j82.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j92.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j72";
            submarine_pos[1] = "j82";
            submarine_pos[2] = "j92";
            j72.setEnabled(false);
            j82.setEnabled(false);
            j92.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j92.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j74.isEnabled() && j74.isEnabled())
        {
            cur_aircraft = "cruiser";
            j72.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j73.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j74.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j72";
            submarine_pos[1] = "j73";
            submarine_pos[2] = "j74";
            j72.setEnabled(false);
            j73.setEnabled(false);
            j74.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j82.isEnabled() && j92.isEnabled())
        {
            cur_aircraft = "destroyer";
            j72.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j82.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j92.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j72";
            cruiser_pos[1] = "j82";
            cruiser_pos[2] = "j92";
            j72.setEnabled(false);
            j82.setEnabled(false);
            j92.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j92.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j73.isEnabled() && j74.isEnabled())
        {
            cur_aircraft = "destroyer";
            j72.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j73.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j74.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j72";
            cruiser_pos[1] = "j73";
            cruiser_pos[2] = "j74";
            j72.setEnabled(false);
            j73.setEnabled(false);
            j74.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j82.isEnabled())
        {
            cur_aircraft = "finished";
            j72.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j82.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j72";
            destroyer_pos[1] = "j82";
            j72.setEnabled(false);
            j82.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j73.isEnabled())
        {
            cur_aircraft = "finished";
            j72.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j73.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j72";
            destroyer_pos[1] = "j73";
            j72.setEnabled(false);
            j73.setEnabled(false);
            j72.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j82Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j82.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j83.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j84.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j86.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j82";
            aircraft_pos[1] = "j83";
            aircraft_pos[2] = "j84";
            aircraft_pos[3] = "j85";
            aircraft_pos[4] = "j86";
            j82.setEnabled(false);
            j83.setEnabled(false);
            j84.setEnabled(false);
            j85.setEnabled(false);
            j86.setEnabled(false);
            j82.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j84.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j86.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j83.isEnabled() && j84.isEnabled() && j85.isEnabled())
        {
            cur_aircraft = "submarine";
            j82.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j83.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j84.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j85.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j82";
            battleship_pos[1] = "j83";
            battleship_pos[2] = "j84";
            battleship_pos[3] = "j85";
            j82.setEnabled(false);
            j83.setEnabled(false);
            j84.setEnabled(false);
            j85.setEnabled(false);
            j82.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j84.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j85.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j83.isEnabled() && j84.isEnabled())
        {
            cur_aircraft = "cruiser";
            j82.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j83.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j84.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j82";
            submarine_pos[1] = "j83";
            submarine_pos[2] = "j84";
            j82.setEnabled(false);
            j83.setEnabled(false);
            j84.setEnabled(false);
            j82.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j84.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j83.isEnabled() && j84.isEnabled())
        {
            cur_aircraft = "destroyer";
            j82.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j83.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j84.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j82";
            cruiser_pos[1] = "j83";
            cruiser_pos[2] = "j84";
            j82.setEnabled(false);
            j83.setEnabled(false);
            j84.setEnabled(false);
            j82.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j84.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j92.isEnabled())
        {
            cur_aircraft = "finished";
            j82.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j92.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j82";
            destroyer_pos[1] = "j92";
            j82.setEnabled(false);
            j92.setEnabled(false);
            j82.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j92.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j83.isEnabled())
        {
            cur_aircraft = "finished";
            j82.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j83.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j82";
            destroyer_pos[1] = "j83";
            j82.setEnabled(false);
            j83.setEnabled(false);
            j82.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
    public void j92Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j92.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j93.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j94.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j95.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j96.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j92";
            aircraft_pos[1] = "j93";
            aircraft_pos[2] = "j94";
            aircraft_pos[3] = "j95";
            aircraft_pos[4] = "j96";
            j92.setEnabled(false);
            j93.setEnabled(false);
            j94.setEnabled(false);
            j95.setEnabled(false);
            j96.setEnabled(false);
            j92.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j93.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j94.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j95.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j96.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j93.isEnabled() && j94.isEnabled() && j95.isEnabled())
        {
            cur_aircraft = "submarine";
            j92.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j93.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j94.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j95.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j92";
            battleship_pos[1] = "j93";
            battleship_pos[2] = "j94";
            battleship_pos[3] = "j95";
            j92.setEnabled(false);
            j93.setEnabled(false);
            j94.setEnabled(false);
            j95.setEnabled(false);
            j92.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j93.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j94.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j95.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j93.isEnabled() && j94.isEnabled())
        {
            cur_aircraft = "cruiser";
            j92.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j93.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j94.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j92";
            submarine_pos[1] = "j93";
            submarine_pos[2] = "j94";
            j92.setEnabled(false);
            j93.setEnabled(false);
            j94.setEnabled(false);
            j92.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j93.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j94.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j93.isEnabled() && j94.isEnabled())
        {
            cur_aircraft = "destroyer";
            j92.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j93.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j94.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j92";
            cruiser_pos[1] = "j93";
            cruiser_pos[2] = "j94";
            j92.setEnabled(false);
            j93.setEnabled(false);
            j94.setEnabled(false);
            j92.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j93.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j94.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j94.isEnabled())
        {
            cur_aircraft = "finished";
            j92.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j93.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j92";
            destroyer_pos[1] = "j93";
            j92.setEnabled(false);
            j93.setEnabled(false);
            j92.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j93.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else
        {
            l.setBounds(200,540,600,50);
            l.setForeground(Color.WHITE);
            j.add(l);
            j.revalidate();
            j.repaint();
            //JOptionPane.showMessageDialog(j, "That is an invalid move - Please try another move");
        }
        //System.out.println("Aircraft Carrier : ");
        for(int i = 0 ; i < 5 ; i ++)
        {
            //System.out.println(aircraft_pos[i]);
        }
        //System.out.println("Battleship : ");
        for(int i = 0 ; i < 4 ; i ++)
        {
            //System.out.println(battleship_pos[i]);
        }
        //System.out.println("Submarine : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(submarine_pos[i]);
        }
        //System.out.println("Cruiser : ");
        for(int i = 0 ; i < 3 ; i ++)
        {
            //System.out.println(cruiser_pos[i]);
        }
        //System.out.println("Destroyer : ");
        for(int i = 0 ; i < 2 ; i ++)
        {
            //System.out.println(destroyer_pos[i]);
        }
    }
}
