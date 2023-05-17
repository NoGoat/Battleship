import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_4 extends play_place_3
{
    public void j4Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j4.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j14.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j4";
            aircraft_pos[1] = "j14";
            aircraft_pos[2] = "j24";
            aircraft_pos[3] = "j34";
            aircraft_pos[4] = "j44";
            j4.setEnabled(false);
            j14.setEnabled(false);
            j24.setEnabled(false);
            j34.setEnabled(false);
            j44.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j4.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j5.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j6.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j7.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j8.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j4";
            aircraft_pos[1] = "j5";
            aircraft_pos[2] = "j6";
            aircraft_pos[3] = "j7";
            aircraft_pos[4] = "j8";
            j4.setEnabled(false);
            j5.setEnabled(false);
            j6.setEnabled(false);
            j7.setEnabled(false);
            j8.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j5.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j6.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j7.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j8.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j14.isEnabled() && j24.isEnabled() && j34.isEnabled())
        {
            cur_aircraft = "submarine";
            j4.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j14.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j24.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j34.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j4";
            battleship_pos[1] = "j14";
            battleship_pos[2] = "j24";
            battleship_pos[3] = "j34";
            j4.setEnabled(false);
            j14.setEnabled(false);
            j24.setEnabled(false);
            j34.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j5.isEnabled() && j6.isEnabled() && j7.isEnabled())
        {
            cur_aircraft = "submarine";
            j4.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j5.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j6.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j7.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j4";
            battleship_pos[1] = "j5";
            battleship_pos[2] = "j6";
            battleship_pos[3] = "j7";
            j4.setEnabled(false);
            j5.setEnabled(false);
            j6.setEnabled(false);
            j7.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j5.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j6.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j7.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j14.isEnabled() && j24.isEnabled())
        {
            cur_aircraft = "cruiser";
            j4.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j14.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j24.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j4";
            submarine_pos[1] = "j14";
            submarine_pos[2] = "j24";
            j4.setEnabled(false);
            j14.setEnabled(false);
            j24.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j5.isEnabled() && j6.isEnabled())
        {
            cur_aircraft = "cruiser";
            j4.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j5.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j6.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j4";
            submarine_pos[1] = "j5";
            submarine_pos[2] = "j6";
            j4.setEnabled(false);
            j5.setEnabled(false);
            j6.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j5.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j6.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j14.isEnabled() && j24.isEnabled())
        {
            cur_aircraft = "destroyer";
            j4.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j14.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j24.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j4";
            cruiser_pos[1] = "j14";
            cruiser_pos[2] = "j24";
            j4.setEnabled(false);
            j14.setEnabled(false);
            j24.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j24.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j5.isEnabled() && j6.isEnabled())
        {
            cur_aircraft = "destroyer";
            j4.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j5.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j6.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j4";
            cruiser_pos[1] = "j5";
            cruiser_pos[2] = "j6";
            j4.setEnabled(false);
            j5.setEnabled(false);
            j6.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j5.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j6.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j14.isEnabled())
        {
            cur_aircraft = "finished";
            j4.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j14.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j4";
            destroyer_pos[1] = "j14";
            j4.setEnabled(false);
            j14.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j5.isEnabled())
        {
            cur_aircraft = "finished";
            j4.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j5.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j4";
            destroyer_pos[1] = "j5";
            j4.setEnabled(false);
            j5.setEnabled(false);
            j4.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j5.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j14Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j14.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j14";
            aircraft_pos[1] = "j24";
            aircraft_pos[2] = "j34";
            aircraft_pos[3] = "j44";
            aircraft_pos[4] = "j54";
            j14.setEnabled(false);
            j24.setEnabled(false);
            j34.setEnabled(false);
            j44.setEnabled(false);
            j54.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j14.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j16.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j17.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j18.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j14";
            aircraft_pos[1] = "j15";
            aircraft_pos[2] = "j16";
            aircraft_pos[3] = "j17";
            aircraft_pos[4] = "j18";
            j14.setEnabled(false);
            j15.setEnabled(false);
            j16.setEnabled(false);
            j17.setEnabled(false);
            j18.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j16.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j17.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j18.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j24.isEnabled() && j34.isEnabled() && j44.isEnabled())
        {
            cur_aircraft = "submarine";
            j14.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j24.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j34.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j44.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j14";
            battleship_pos[1] = "j24";
            battleship_pos[2] = "j34";
            battleship_pos[3] = "j44";
            j14.setEnabled(false);
            j24.setEnabled(false);
            j34.setEnabled(false);
            j44.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j15.isEnabled() && j16.isEnabled() && j17.isEnabled())
        {
            cur_aircraft = "submarine";
            j14.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j15.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j16.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j17.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j14";
            battleship_pos[1] = "j15";
            battleship_pos[2] = "j16";
            battleship_pos[3] = "j17";
            j14.setEnabled(false);
            j15.setEnabled(false);
            j16.setEnabled(false);
            j17.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j16.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j17.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j24.isEnabled() && j34.isEnabled())
        {
            cur_aircraft = "cruiser";
            j14.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j24.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j34.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j14";
            submarine_pos[1] = "j24";
            submarine_pos[2] = "j34";
            j14.setEnabled(false);
            j24.setEnabled(false);
            j34.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j15.isEnabled() && j16.isEnabled())
        {
            cur_aircraft = "cruiser";
            j14.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j15.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j16.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j14";
            submarine_pos[1] = "j15";
            submarine_pos[2] = "j16";
            j14.setEnabled(false);
            j15.setEnabled(false);
            j16.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j16.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j24.isEnabled() && j34.isEnabled())
        {
            cur_aircraft = "destroyer";
            j14.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j24.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j34.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j14";
            cruiser_pos[1] = "j24";
            cruiser_pos[2] = "j34";
            j14.setEnabled(false);
            j24.setEnabled(false);
            j34.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j34.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j15.isEnabled() && j16.isEnabled())
        {
            cur_aircraft = "destroyer";
            j14.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j15.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j16.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j14";
            cruiser_pos[1] = "j15";
            cruiser_pos[2] = "j16";
            j14.setEnabled(false);
            j15.setEnabled(false);
            j16.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j16.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j24.isEnabled())
        {
            cur_aircraft = "finished";
            j14.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j24.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j14";
            destroyer_pos[1] = "j24";
            j14.setEnabled(false);
            j24.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j15.isEnabled())
        {
            cur_aircraft = "finished";
            j14.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j15.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j14";
            destroyer_pos[1] = "j15";
            j14.setEnabled(false);
            j15.setEnabled(false);
            j14.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j24Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j24";
            aircraft_pos[1] = "j34";
            aircraft_pos[2] = "j44";
            aircraft_pos[3] = "j54";
            aircraft_pos[4] = "j64";
            j24.setEnabled(false);
            j34.setEnabled(false);
            j44.setEnabled(false);
            j54.setEnabled(false);
            j64.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j27.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j28.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j24";
            aircraft_pos[1] = "j25";
            aircraft_pos[2] = "j26";
            aircraft_pos[3] = "j27";
            aircraft_pos[4] = "j28";
            j24.setEnabled(false);
            j25.setEnabled(false);
            j26.setEnabled(false);
            j27.setEnabled(false);
            j28.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j27.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j28.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j34.isEnabled() && j44.isEnabled() && j54.isEnabled())
        {
            cur_aircraft = "submarine";
            j24.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j34.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j44.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j54.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j24";
            battleship_pos[1] = "j34";
            battleship_pos[2] = "j44";
            battleship_pos[3] = "j54";
            j24.setEnabled(false);
            j34.setEnabled(false);
            j44.setEnabled(false);
            j54.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j25.isEnabled() && j26.isEnabled() && j27.isEnabled())
        {
            cur_aircraft = "submarine";
            j24.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j25.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j26.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j27.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j24";
            battleship_pos[1] = "j25";
            battleship_pos[2] = "j26";
            battleship_pos[3] = "j27";
            j24.setEnabled(false);
            j25.setEnabled(false);
            j26.setEnabled(false);
            j27.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j27.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j34.isEnabled() && j44.isEnabled())
        {
            cur_aircraft = "cruiser";
            j24.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j34.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j44.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j24";
            submarine_pos[1] = "j34";
            submarine_pos[2] = "j44";
            j24.setEnabled(false);
            j34.setEnabled(false);
            j44.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j25.isEnabled() && j26.isEnabled())
        {
            cur_aircraft = "cruiser";
            j24.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j25.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j26.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j24";
            submarine_pos[1] = "j25";
            submarine_pos[2] = "j26";
            j24.setEnabled(false);
            j25.setEnabled(false);
            j26.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j34.isEnabled() && j44.isEnabled())
        {
            cur_aircraft = "destroyer";
            j24.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j34.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j44.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j24";
            cruiser_pos[1] = "j34";
            cruiser_pos[2] = "j44";
            j24.setEnabled(false);
            j34.setEnabled(false);
            j44.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j44.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j25.isEnabled() && j26.isEnabled())
        {
            cur_aircraft = "destroyer";
            j24.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j25.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j26.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j24";
            cruiser_pos[1] = "j25";
            cruiser_pos[2] = "j26";
            j24.setEnabled(false);
            j25.setEnabled(false);
            j26.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j34.isEnabled())
        {
            cur_aircraft = "finished";
            j24.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j34.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j24";
            destroyer_pos[1] = "j34";
            j24.setEnabled(false);
            j34.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j25.isEnabled())
        {
            cur_aircraft = "finished";
            j24.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j25.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j24";
            destroyer_pos[1] = "j25";
            j24.setEnabled(false);
            j25.setEnabled(false);
            j24.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j34Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j34";
            aircraft_pos[1] = "j44";
            aircraft_pos[2] = "j54";
            aircraft_pos[3] = "j64";
            aircraft_pos[4] = "j74";
            j34.setEnabled(false);
            j44.setEnabled(false);
            j54.setEnabled(false);
            j64.setEnabled(false);
            j74.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j38.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j34";
            aircraft_pos[1] = "j35";
            aircraft_pos[2] = "j36";
            aircraft_pos[3] = "j37";
            aircraft_pos[4] = "j38";
            j34.setEnabled(false);
            j35.setEnabled(false);
            j36.setEnabled(false);
            j37.setEnabled(false);
            j38.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j38.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j44.isEnabled() && j54.isEnabled() && j64.isEnabled())
        {
            cur_aircraft = "submarine";
            j34.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j44.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j54.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j64.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j34";
            battleship_pos[1] = "j44";
            battleship_pos[2] = "j54";
            battleship_pos[3] = "j64";
            j34.setEnabled(false);
            j44.setEnabled(false);
            j54.setEnabled(false);
            j64.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j35.isEnabled() && j36.isEnabled() && j37.isEnabled())
        {
            cur_aircraft = "submarine";
            j34.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j35.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j36.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j37.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j34";
            battleship_pos[1] = "j35";
            battleship_pos[2] = "j36";
            battleship_pos[3] = "j37";
            j34.setEnabled(false);
            j35.setEnabled(false);
            j36.setEnabled(false);
            j37.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j44.isEnabled() && j54.isEnabled())
        {
            cur_aircraft = "cruiser";
            j34.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j44.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j54.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j34";
            submarine_pos[1] = "j44";
            submarine_pos[2] = "j54";
            j34.setEnabled(false);
            j44.setEnabled(false);
            j54.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j35.isEnabled() && j36.isEnabled())
        {
            cur_aircraft = "cruiser";
            j34.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j35.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j36.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j34";
            submarine_pos[1] = "j35";
            submarine_pos[2] = "j36";
            j34.setEnabled(false);
            j35.setEnabled(false);
            j36.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j44.isEnabled() && j54.isEnabled())
        {
            cur_aircraft = "destroyer";
            j34.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j44.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j54.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j34";
            cruiser_pos[1] = "j44";
            cruiser_pos[2] = "j54";
            j34.setEnabled(false);
            j44.setEnabled(false);
            j54.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j54.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j34.isEnabled() && j35.isEnabled())
        {
            cur_aircraft = "destroyer";
            j34.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j35.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j36.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j34";
            cruiser_pos[1] = "j35";
            cruiser_pos[2] = "j36";
            j34.setEnabled(false);
            j35.setEnabled(false);
            j36.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j44.isEnabled())
        {
            cur_aircraft = "finished";
            j34.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j44.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j34";
            destroyer_pos[1] = "j44";
            j34.setEnabled(false);
            j44.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j35.isEnabled())
        {
            cur_aircraft = "finished";
            j34.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j35.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j34";
            destroyer_pos[1] = "j35";
            j34.setEnabled(false);
            j35.setEnabled(false);
            j34.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j44Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j84.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j44";
            aircraft_pos[1] = "j54";
            aircraft_pos[2] = "j64";
            aircraft_pos[3] = "j74";
            aircraft_pos[4] = "j84";
            j44.setEnabled(false);
            j54.setEnabled(false);
            j64.setEnabled(false);
            j74.setEnabled(false);
            j84.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j84.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j44";
            aircraft_pos[1] = "j45";
            aircraft_pos[2] = "j46";
            aircraft_pos[3] = "j47";
            aircraft_pos[4] = "j48";
            j44.setEnabled(false);
            j45.setEnabled(false);
            j46.setEnabled(false);
            j47.setEnabled(false);
            j48.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j54.isEnabled() && j64.isEnabled() && j74.isEnabled())
        {
            cur_aircraft = "submarine";
            j44.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j54.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j64.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j74.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j44";
            battleship_pos[1] = "j54";
            battleship_pos[2] = "j64";
            battleship_pos[3] = "j74";
            j44.setEnabled(false);
            j54.setEnabled(false);
            j64.setEnabled(false);
            j74.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j74.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j45.isEnabled() && j46.isEnabled() && j47.isEnabled())
        {
            cur_aircraft = "submarine";
            j44.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j45.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j46.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j47.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j44";
            battleship_pos[1] = "j45";
            battleship_pos[2] = "j46";
            battleship_pos[3] = "j47";
            j44.setEnabled(false);
            j45.setEnabled(false);
            j46.setEnabled(false);
            j47.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j54.isEnabled() && j64.isEnabled())
        {
            cur_aircraft = "cruiser";
            j44.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j54.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j64.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j44";
            submarine_pos[1] = "j54";
            submarine_pos[2] = "j64";
            j44.setEnabled(false);
            j54.setEnabled(false);
            j64.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j45.isEnabled() && j46.isEnabled())
        {
            cur_aircraft = "cruiser";
            j44.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j45.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j46.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j44";
            submarine_pos[1] = "j45";
            submarine_pos[2] = "j46";
            j44.setEnabled(false);
            j45.setEnabled(false);
            j46.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j54.isEnabled() && j64.isEnabled())
        {
            cur_aircraft = "destroyer";
            j44.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j54.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j64.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j44";
            cruiser_pos[1] = "j54";
            cruiser_pos[2] = "j64";
            j44.setEnabled(false);
            j54.setEnabled(false);
            j64.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j64.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j45.isEnabled() && j46.isEnabled())
        {
            cur_aircraft = "destroyer";
            j44.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j45.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j46.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j44";
            cruiser_pos[1] = "j45";
            cruiser_pos[2] = "j46";
            j44.setEnabled(false);
            j45.setEnabled(false);
            j46.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j54.isEnabled())
        {
            cur_aircraft = "finished";
            j44.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j54.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j44";
            destroyer_pos[1] = "j54";
            j44.setEnabled(false);
            j54.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j45.isEnabled())
        {
            cur_aircraft = "finished";
            j44.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j45.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j44";
            destroyer_pos[1] = "j45";
            j44.setEnabled(false);
            j45.setEnabled(false);
            j44.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j54Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j84.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j94.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j54";
            aircraft_pos[1] = "j64";
            aircraft_pos[2] = "j74";
            aircraft_pos[3] = "j84";
            aircraft_pos[4] = "j94";
            j54.setEnabled(false);
            j64.setEnabled(false);
            j74.setEnabled(false);
            j84.setEnabled(false);
            j94.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j84.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j94.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j54";
            aircraft_pos[1] = "j55";
            aircraft_pos[2] = "j56";
            aircraft_pos[3] = "j57";
            aircraft_pos[4] = "j58";
            j54.setEnabled(false);
            j55.setEnabled(false);
            j56.setEnabled(false);
            j57.setEnabled(false);
            j58.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j64.isEnabled() && j74.isEnabled() && j84.isEnabled())
        {
            cur_aircraft = "submarine";
            j54.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j64.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j74.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j84.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j54";
            battleship_pos[1] = "j64";
            battleship_pos[2] = "j74";
            battleship_pos[3] = "j84";
            j54.setEnabled(false);
            j64.setEnabled(false);
            j74.setEnabled(false);
            j84.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j84.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j55.isEnabled() && j56.isEnabled() && j57.isEnabled())
        {
            cur_aircraft = "submarine";
            j54.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j55.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j56.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j57.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j54";
            battleship_pos[1] = "j55";
            battleship_pos[2] = "j56";
            battleship_pos[3] = "j57";
            j54.setEnabled(false);
            j55.setEnabled(false);
            j56.setEnabled(false);
            j57.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j64.isEnabled() && j74.isEnabled())
        {
            cur_aircraft = "cruiser";
            j54.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j64.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j74.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j54";
            submarine_pos[1] = "j64";
            submarine_pos[2] = "j74";
            j54.setEnabled(false);
            j64.setEnabled(false);
            j74.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j55.isEnabled() && j56.isEnabled())
        {
            cur_aircraft = "cruiser";
            j54.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j55.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j56.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j54";
            submarine_pos[1] = "j55";
            submarine_pos[2] = "j56";
            j54.setEnabled(false);
            j55.setEnabled(false);
            j56.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j64.isEnabled() && j74.isEnabled())
        {
            cur_aircraft = "destroyer";
            j54.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j64.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j74.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j54";
            cruiser_pos[1] = "j64";
            cruiser_pos[2] = "j74";
            j54.setEnabled(false);
            j64.setEnabled(false);
            j74.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j74.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j55.isEnabled() && j56.isEnabled())
        {
            cur_aircraft = "destroyer";
            j54.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j55.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j56.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j54";
            cruiser_pos[1] = "j55";
            cruiser_pos[2] = "j56";
            j54.setEnabled(false);
            j55.setEnabled(false);
            j56.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j64.isEnabled())
        {
            cur_aircraft = "finished";
            j54.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j64.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j54";
            destroyer_pos[1] = "j64";
            j54.setEnabled(false);
            j64.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j55.isEnabled())
        {
            cur_aircraft = "finished";
            j54.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j55.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j54";
            destroyer_pos[1] = "j55";
            j54.setEnabled(false);
            j55.setEnabled(false);
            j54.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j64Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j68.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j64";
            aircraft_pos[1] = "j65";
            aircraft_pos[2] = "j66";
            aircraft_pos[3] = "j67";
            aircraft_pos[4] = "j68";
            j64.setEnabled(false);
            j65.setEnabled(false);
            j66.setEnabled(false);
            j67.setEnabled(false);
            j68.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j68.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j74.isEnabled() && j84.isEnabled() && j94.isEnabled())
        {
            cur_aircraft = "submarine";
            j64.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j74.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j84.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j94.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j64";
            battleship_pos[1] = "j74";
            battleship_pos[2] = "j84";
            battleship_pos[3] = "j94";
            j64.setEnabled(false);
            j74.setEnabled(false);
            j84.setEnabled(false);
            j94.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j84.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j94.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j65.isEnabled() && j66.isEnabled() && j67.isEnabled())
        {
            cur_aircraft = "submarine";
            j64.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j65.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j66.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j67.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j64";
            battleship_pos[1] = "j65";
            battleship_pos[2] = "j66";
            battleship_pos[3] = "j67";
            j64.setEnabled(false);
            j65.setEnabled(false);
            j66.setEnabled(false);
            j67.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j74.isEnabled() && j84.isEnabled())
        {
            cur_aircraft = "cruiser";
            j64.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j74.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j84.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j64";
            submarine_pos[1] = "j74";
            submarine_pos[2] = "j84";
            j64.setEnabled(false);
            j74.setEnabled(false);
            j84.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j84.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j65.isEnabled() && j66.isEnabled())
        {
            cur_aircraft = "cruiser";
            j64.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j65.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j66.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j64";
            submarine_pos[1] = "j65";
            submarine_pos[2] = "j66";
            j64.setEnabled(false);
            j65.setEnabled(false);
            j66.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j74.isEnabled() && j84.isEnabled())
        {
            cur_aircraft = "destroyer";
            j64.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j74.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j84.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j64";
            cruiser_pos[1] = "j74";
            cruiser_pos[2] = "j84";
            j64.setEnabled(false);
            j74.setEnabled(false);
            j84.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j84.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j64.isEnabled() && j65.isEnabled())
        {
            cur_aircraft = "destroyer";
            j64.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j65.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j66.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j64";
            cruiser_pos[1] = "j65";
            cruiser_pos[2] = "j66";
            j64.setEnabled(false);
            j65.setEnabled(false);
            j66.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j74.isEnabled())
        {
            cur_aircraft = "finished";
            j64.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j74.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j64";
            destroyer_pos[1] = "j74";
            j64.setEnabled(false);
            j74.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j65.isEnabled())
        {
            cur_aircraft = "finished";
            j64.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j65.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j64";
            destroyer_pos[1] = "j65";
            j64.setEnabled(false);
            j65.setEnabled(false);
            j64.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j74Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j77.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j78.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j74";
            aircraft_pos[1] = "j75";
            aircraft_pos[2] = "j76";
            aircraft_pos[3] = "j77";
            aircraft_pos[4] = "j78";
            j74.setEnabled(false);
            j75.setEnabled(false);
            j76.setEnabled(false);
            j77.setEnabled(false);
            j78.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j77.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j78.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j75.isEnabled() && j76.isEnabled() && j77.isEnabled())
        {
            cur_aircraft = "submarine";
            j74.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j75.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j76.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j77.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j74";
            battleship_pos[1] = "j75";
            battleship_pos[2] = "j76";
            battleship_pos[3] = "j77";
            j74.setEnabled(false);
            j75.setEnabled(false);
            j76.setEnabled(false);
            j77.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j77.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j84.isEnabled() && j94.isEnabled())
        {
            cur_aircraft = "cruiser";
            j74.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j84.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j94.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j74";
            submarine_pos[1] = "j84";
            submarine_pos[2] = "j94";
            j74.setEnabled(false);
            j84.setEnabled(false);
            j94.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j94.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j75.isEnabled() && j76.isEnabled())
        {
            cur_aircraft = "cruiser";
            j74.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j75.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j76.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j74";
            submarine_pos[1] = "j75";
            submarine_pos[2] = "j76";
            j74.setEnabled(false);
            j75.setEnabled(false);
            j76.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j84.isEnabled() && j94.isEnabled())
        {
            cur_aircraft = "destroyer";
            j74.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j84.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j94.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j74";
            cruiser_pos[1] = "j84";
            cruiser_pos[2] = "j94";
            j74.setEnabled(false);
            j84.setEnabled(false);
            j94.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j94.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j75.isEnabled() && j76.isEnabled())
        {
            cur_aircraft = "destroyer";
            j74.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j75.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j76.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j74";
            cruiser_pos[1] = "j75";
            cruiser_pos[2] = "j75";
            j74.setEnabled(false);
            j75.setEnabled(false);
            j76.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j84.isEnabled())
        {
            cur_aircraft = "finished";
            j74.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j84.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j74";
            destroyer_pos[1] = "j84";
            j74.setEnabled(false);
            j84.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j75.isEnabled())
        {
            cur_aircraft = "finished";
            j74.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j75.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j74";
            destroyer_pos[1] = "j75";
            j74.setEnabled(false);
            j75.setEnabled(false);
            j74.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j84Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j84.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j86.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j87.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j88.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j84";
            aircraft_pos[1] = "j85";
            aircraft_pos[2] = "j86";
            aircraft_pos[3] = "j87";
            aircraft_pos[4] = "j88";
            j84.setEnabled(false);
            j85.setEnabled(false);
            j86.setEnabled(false);
            j87.setEnabled(false);
            j88.setEnabled(false);
            j84.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j86.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j87.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j88.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j85.isEnabled() && j86.isEnabled() && j87.isEnabled())
        {
            cur_aircraft = "submarine";
            j84.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j85.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j86.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j87.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j84";
            battleship_pos[1] = "j85";
            battleship_pos[2] = "j86";
            battleship_pos[3] = "j87";
            j84.setEnabled(false);
            j85.setEnabled(false);
            j86.setEnabled(false);
            j87.setEnabled(false);
            j84.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j86.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j87.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j85.isEnabled() && j86.isEnabled())
        {
            cur_aircraft = "cruiser";
            j84.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j85.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j86.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j84";
            submarine_pos[1] = "j85";
            submarine_pos[2] = "j86";
            j84.setEnabled(false);
            j85.setEnabled(false);
            j86.setEnabled(false);
            j84.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j86.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j85.isEnabled() && j86.isEnabled())
        {
            cur_aircraft = "destroyer";
            j84.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j85.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j86.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j84";
            cruiser_pos[1] = "j85";
            cruiser_pos[2] = "j86";
            j84.setEnabled(false);
            j85.setEnabled(false);
            j86.setEnabled(false);
            j84.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j86.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j94.isEnabled())
        {
            cur_aircraft = "finished";
            j84.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j94.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j84";
            destroyer_pos[1] = "j94";
            j84.setEnabled(false);
            j94.setEnabled(false);
            j84.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j94.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j85.isEnabled())
        {
            cur_aircraft = "finished";
            j84.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j85.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j84";
            destroyer_pos[1] = "j85";
            j84.setEnabled(false);
            j85.setEnabled(false);
            j84.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j94Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j94.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j95.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j96.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j97.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j98.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j94";
            aircraft_pos[1] = "j95";
            aircraft_pos[2] = "j96";
            aircraft_pos[3] = "j97";
            aircraft_pos[4] = "j98";
            j94.setEnabled(false);
            j95.setEnabled(false);
            j96.setEnabled(false);
            j97.setEnabled(false);
            j98.setEnabled(false);
            j94.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j95.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j96.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j97.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j98.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j95.isEnabled() && j96.isEnabled() && j97.isEnabled())
        {
            cur_aircraft = "submarine";
            j94.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j95.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j96.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j97.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j94";
            battleship_pos[1] = "j95";
            battleship_pos[2] = "j96";
            battleship_pos[3] = "j97";
            j94.setEnabled(false);
            j95.setEnabled(false);
            j96.setEnabled(false);
            j97.setEnabled(false);
            j94.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j95.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j96.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j97.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j95.isEnabled() && j96.isEnabled())
        {
            cur_aircraft = "cruiser";
            j94.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j95.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j96.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j94";
            submarine_pos[1] = "j95";
            submarine_pos[2] = "j96";
            j94.setEnabled(false);
            j95.setEnabled(false);
            j96.setEnabled(false);
            j94.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j95.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j96.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j95.isEnabled() && j96.isEnabled())
        {
            cur_aircraft = "destroyer";
            j94.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j95.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j96.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j94";
            cruiser_pos[1] = "j95";
            cruiser_pos[2] = "j96";
            j94.setEnabled(false);
            j95.setEnabled(false);
            j96.setEnabled(false);
            j94.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j95.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j96.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j95.isEnabled())
        {
            cur_aircraft = "finished";
            j94.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j95.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j94";
            destroyer_pos[1] = "j95";
            j94.setEnabled(false);
            j95.setEnabled(false);
            j94.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j95.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
