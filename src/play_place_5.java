import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_5 extends play_place_4
{
    public void j5Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j5.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j5";
            aircraft_pos[1] = "j15";
            aircraft_pos[2] = "j25";
            aircraft_pos[3] = "j35";
            aircraft_pos[4] = "j45";
            j5.setEnabled(false);
            j15.setEnabled(false);
            j25.setEnabled(false);
            j35.setEnabled(false);
            j45.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j5.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j6.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j7.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j8.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j9.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j5";
            aircraft_pos[1] = "j6";
            aircraft_pos[2] = "j7";
            aircraft_pos[3] = "j8";
            aircraft_pos[4] = "j9";
            j5.setEnabled(false);
            j6.setEnabled(false);
            j7.setEnabled(false);
            j8.setEnabled(false);
            j9.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j6.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j7.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j8.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j9.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j15.isEnabled() && j25.isEnabled() && j35.isEnabled())
        {
            cur_aircraft = "submarine";
            j5.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j15.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j25.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j35.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j5";
            battleship_pos[1] = "j15";
            battleship_pos[2] = "j25";
            battleship_pos[3] = "j35";
            j5.setEnabled(false);
            j15.setEnabled(false);
            j25.setEnabled(false);
            j35.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j6.isEnabled() && j7.isEnabled() && j8.isEnabled())
        {
            cur_aircraft = "submarine";
            j5.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j6.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j7.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j8.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j5";
            battleship_pos[1] = "j6";
            battleship_pos[2] = "j7";
            battleship_pos[3] = "j8";
            j5.setEnabled(false);
            j6.setEnabled(false);
            j7.setEnabled(false);
            j8.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j6.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j7.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j8.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j15.isEnabled() && j25.isEnabled())
        {
            cur_aircraft = "cruiser";
            j5.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j15.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j25.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j5";
            submarine_pos[1] = "j15";
            submarine_pos[2] = "j25";
            j5.setEnabled(false);
            j15.setEnabled(false);
            j25.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j6.isEnabled() && j7.isEnabled())
        {
            cur_aircraft = "cruiser";
            j5.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j6.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j7.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j5";
            submarine_pos[1] = "j6";
            submarine_pos[2] = "j7";
            j5.setEnabled(false);
            j6.setEnabled(false);
            j7.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j6.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j7.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j15.isEnabled() && j25.isEnabled())
        {
            cur_aircraft = "destroyer";
            j5.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j15.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j25.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j5";
            cruiser_pos[1] = "j15";
            cruiser_pos[2] = "j25";
            j5.setEnabled(false);
            j15.setEnabled(false);
            j25.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j6.isEnabled() && j7.isEnabled())
        {
            cur_aircraft = "destroyer";
            j5.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j6.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j7.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j5";
            cruiser_pos[1] = "j6";
            cruiser_pos[2] = "j7";
            j5.setEnabled(false);
            j6.setEnabled(false);
            j7.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j6.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j7.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j15.isEnabled())
        {
            cur_aircraft = "finished";
            j5.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j15.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j5";
            destroyer_pos[1] = "j15";
            j5.setEnabled(false);
            j15.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j15.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j6.isEnabled())
        {
            cur_aircraft = "finished";
            j5.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j6.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j5";
            destroyer_pos[1] = "j6";
            j5.setEnabled(false);
            j6.setEnabled(false);
            j5.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j6.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j15Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j15";
            aircraft_pos[1] = "j25";
            aircraft_pos[2] = "j35";
            aircraft_pos[3] = "j45";
            aircraft_pos[4] = "j55";
            j15.setEnabled(false);
            j25.setEnabled(false);
            j35.setEnabled(false);
            j45.setEnabled(false);
            j55.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j16.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j17.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j18.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j19.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j15";
            aircraft_pos[1] = "j16";
            aircraft_pos[2] = "j17";
            aircraft_pos[3] = "j18";
            aircraft_pos[4] = "j19";
            j15.setEnabled(false);
            j16.setEnabled(false);
            j17.setEnabled(false);
            j18.setEnabled(false);
            j19.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j17.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j18.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j19.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j25.isEnabled() && j35.isEnabled() && j45.isEnabled())
        {
            cur_aircraft = "submarine";
            j15.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j25.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j35.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j45.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j15";
            battleship_pos[1] = "j25";
            battleship_pos[2] = "j35";
            battleship_pos[3] = "j45";
            j15.setEnabled(false);
            j25.setEnabled(false);
            j35.setEnabled(false);
            j45.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j16.isEnabled() && j17.isEnabled() && j18.isEnabled())
        {
            cur_aircraft = "submarine";
            j15.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j16.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j17.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j18.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j15";
            battleship_pos[1] = "j16";
            battleship_pos[2] = "j17";
            battleship_pos[3] = "j18";
            j15.setEnabled(false);
            j16.setEnabled(false);
            j17.setEnabled(false);
            j18.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j17.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j18.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j25.isEnabled() && j35.isEnabled())
        {
            cur_aircraft = "cruiser";
            j15.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j25.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j35.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j15";
            submarine_pos[1] = "j25";
            submarine_pos[2] = "j35";
            j15.setEnabled(false);
            j25.setEnabled(false);
            j35.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j16.isEnabled() && j17.isEnabled())
        {
            cur_aircraft = "cruiser";
            j15.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j16.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j17.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j15";
            submarine_pos[1] = "j16";
            submarine_pos[2] = "j17";
            j15.setEnabled(false);
            j16.setEnabled(false);
            j17.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j17.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j25.isEnabled() && j35.isEnabled())
        {
            cur_aircraft = "destroyer";
            j15.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j25.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j35.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j15";
            cruiser_pos[1] = "j25";
            cruiser_pos[2] = "j35";
            j15.setEnabled(false);
            j25.setEnabled(false);
            j35.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j16.isEnabled() && j17.isEnabled())
        {
            cur_aircraft = "destroyer";
            j15.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j16.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j17.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j15";
            cruiser_pos[1] = "j16";
            cruiser_pos[2] = "j17";
            j15.setEnabled(false);
            j16.setEnabled(false);
            j17.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j17.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j25.isEnabled())
        {
            cur_aircraft = "finished";
            j15.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j25.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j15";
            destroyer_pos[1] = "j25";
            j15.setEnabled(false);
            j25.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j25.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j16.isEnabled())
        {
            cur_aircraft = "finished";
            j15.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j16.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j15";
            destroyer_pos[1] = "j16";
            j15.setEnabled(false);
            j16.setEnabled(false);
            j15.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j25Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j25";
            aircraft_pos[1] = "j35";
            aircraft_pos[2] = "j45";
            aircraft_pos[3] = "j55";
            aircraft_pos[4] = "j65";
            j25.setEnabled(false);
            j35.setEnabled(false);
            j45.setEnabled(false);
            j55.setEnabled(false);
            j65.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j27.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j28.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j29.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j25";
            aircraft_pos[1] = "j26";
            aircraft_pos[2] = "j27";
            aircraft_pos[3] = "j28";
            aircraft_pos[4] = "j29";
            j25.setEnabled(false);
            j26.setEnabled(false);
            j27.setEnabled(false);
            j28.setEnabled(false);
            j29.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j28.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j29.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j35.isEnabled() && j45.isEnabled() && j55.isEnabled())
        {
            cur_aircraft = "submarine";
            j25.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j35.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j45.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j55.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j25";
            battleship_pos[1] = "j35";
            battleship_pos[2] = "j45";
            battleship_pos[3] = "j55";
            j25.setEnabled(false);
            j35.setEnabled(false);
            j45.setEnabled(false);
            j55.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j26.isEnabled() && j27.isEnabled() && j28.isEnabled())
        {
            cur_aircraft = "submarine";
            j25.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j26.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j27.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j28.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j25";
            battleship_pos[1] = "j26";
            battleship_pos[2] = "j27";
            battleship_pos[3] = "j28";
            j25.setEnabled(false);
            j26.setEnabled(false);
            j27.setEnabled(false);
            j28.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j28.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j35.isEnabled() && j45.isEnabled())
        {
            cur_aircraft = "cruiser";
            j25.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j35.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j45.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j25";
            submarine_pos[1] = "j35";
            submarine_pos[2] = "j45";
            j25.setEnabled(false);
            j35.setEnabled(false);
            j45.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j26.isEnabled() && j27.isEnabled())
        {
            cur_aircraft = "cruiser";
            j25.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j26.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j27.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j25";
            submarine_pos[1] = "j26";
            submarine_pos[2] = "j27";
            j25.setEnabled(false);
            j26.setEnabled(false);
            j27.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j35.isEnabled() && j45.isEnabled())
        {
            cur_aircraft = "destroyer";
            j25.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j35.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j45.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j25";
            cruiser_pos[1] = "j35";
            cruiser_pos[2] = "j45";
            j25.setEnabled(false);
            j35.setEnabled(false);
            j45.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j26.isEnabled() && j27.isEnabled())
        {
            cur_aircraft = "destroyer";
            j25.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j26.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j27.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j25";
            cruiser_pos[1] = "j26";
            cruiser_pos[2] = "j27";
            j25.setEnabled(false);
            j26.setEnabled(false);
            j27.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j35.isEnabled())
        {
            cur_aircraft = "finished";
            j25.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j35.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j25";
            destroyer_pos[1] = "j35";
            j25.setEnabled(false);
            j35.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j35.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j26.isEnabled())
        {
            cur_aircraft = "finished";
            j25.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j26.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j25";
            destroyer_pos[1] = "j26";
            j25.setEnabled(false);
            j26.setEnabled(false);
            j25.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j35Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j35";
            aircraft_pos[1] = "j45";
            aircraft_pos[2] = "j55";
            aircraft_pos[3] = "j65";
            aircraft_pos[4] = "j75";
            j35.setEnabled(false);
            j45.setEnabled(false);
            j55.setEnabled(false);
            j65.setEnabled(false);
            j75.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j38.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j39.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j35";
            aircraft_pos[1] = "j36";
            aircraft_pos[2] = "j37";
            aircraft_pos[3] = "j38";
            aircraft_pos[4] = "j39";
            j35.setEnabled(false);
            j36.setEnabled(false);
            j37.setEnabled(false);
            j38.setEnabled(false);
            j39.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j38.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j39.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j45.isEnabled() && j55.isEnabled() && j65.isEnabled())
        {
            cur_aircraft = "submarine";
            j35.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j45.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j55.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j65.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j35";
            battleship_pos[1] = "j45";
            battleship_pos[2] = "j55";
            battleship_pos[3] = "j65";
            j35.setEnabled(false);
            j45.setEnabled(false);
            j55.setEnabled(false);
            j65.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j36.isEnabled() && j37.isEnabled() && j38.isEnabled())
        {
            cur_aircraft = "submarine";
            j35.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j36.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j37.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j38.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j35";
            battleship_pos[1] = "j36";
            battleship_pos[2] = "j37";
            battleship_pos[3] = "j38";
            j35.setEnabled(false);
            j36.setEnabled(false);
            j37.setEnabled(false);
            j38.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j38.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j45.isEnabled() && j55.isEnabled())
        {
            cur_aircraft = "cruiser";
            j35.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j45.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j55.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j35";
            submarine_pos[1] = "j45";
            submarine_pos[2] = "j55";
            j35.setEnabled(false);
            j45.setEnabled(false);
            j55.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j36.isEnabled() && j37.isEnabled())
        {
            cur_aircraft = "cruiser";
            j35.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j36.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j37.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j35";
            submarine_pos[1] = "j36";
            submarine_pos[2] = "j37";
            j35.setEnabled(false);
            j36.setEnabled(false);
            j37.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j45.isEnabled() && j55.isEnabled())
        {
            cur_aircraft = "destroyer";
            j35.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j45.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j55.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j35";
            cruiser_pos[1] = "j45";
            cruiser_pos[2] = "j55";
            j35.setEnabled(false);
            j45.setEnabled(false);
            j55.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j36.isEnabled() && j37.isEnabled())
        {
            cur_aircraft = "destroyer";
            j35.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j36.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j37.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j35";
            cruiser_pos[1] = "j36";
            cruiser_pos[2] = "j37";
            j35.setEnabled(false);
            j36.setEnabled(false);
            j37.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j45.isEnabled())
        {
            cur_aircraft = "finished";
            j35.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j45.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j35";
            destroyer_pos[1] = "j45";
            j35.setEnabled(false);
            j45.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j45.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j36.isEnabled())
        {
            cur_aircraft = "finished";
            j35.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j36.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j35";
            destroyer_pos[1] = "j36";
            j35.setEnabled(false);
            j36.setEnabled(false);
            j35.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j45Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j45";
            aircraft_pos[1] = "j55";
            aircraft_pos[2] = "j65";
            aircraft_pos[3] = "j75";
            aircraft_pos[4] = "j85";
            j45.setEnabled(false);
            j55.setEnabled(false);
            j65.setEnabled(false);
            j75.setEnabled(false);
            j85.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j49.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j45";
            aircraft_pos[1] = "j46";
            aircraft_pos[2] = "j47";
            aircraft_pos[3] = "j48";
            aircraft_pos[4] = "j49";
            j45.setEnabled(false);
            j46.setEnabled(false);
            j47.setEnabled(false);
            j48.setEnabled(false);
            j49.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j49.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j55.isEnabled() && j65.isEnabled() && j75.isEnabled())
        {
            cur_aircraft = "submarine";
            j45.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j55.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j65.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j75.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j45";
            battleship_pos[1] = "j55";
            battleship_pos[2] = "j65";
            battleship_pos[3] = "j75";
            j45.setEnabled(false);
            j55.setEnabled(false);
            j65.setEnabled(false);
            j75.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j75.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j46.isEnabled() && j47.isEnabled() && j48.isEnabled())
        {
            cur_aircraft = "submarine";
            j45.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j46.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j47.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j48.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j45";
            battleship_pos[1] = "j46";
            battleship_pos[2] = "j47";
            battleship_pos[3] = "j48";
            j45.setEnabled(false);
            j46.setEnabled(false);
            j47.setEnabled(false);
            j48.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j48.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j55.isEnabled() && j65.isEnabled())
        {
            cur_aircraft = "cruiser";
            j45.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j55.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j65.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j45";
            submarine_pos[1] = "j55";
            submarine_pos[2] = "j65";
            j45.setEnabled(false);
            j55.setEnabled(false);
            j65.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j46.isEnabled() && j47.isEnabled())
        {
            cur_aircraft = "cruiser";
            j45.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j46.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j47.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j45";
            submarine_pos[1] = "j46";
            submarine_pos[2] = "j47";
            j45.setEnabled(false);
            j46.setEnabled(false);
            j47.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j55.isEnabled() && j65.isEnabled())
        {
            cur_aircraft = "destroyer";
            j45.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j55.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j65.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j45";
            cruiser_pos[1] = "j55";
            cruiser_pos[2] = "j65";
            j45.setEnabled(false);
            j55.setEnabled(false);
            j65.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j46.isEnabled() && j47.isEnabled())
        {
            cur_aircraft = "destroyer";
            j45.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j46.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j47.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j45";
            cruiser_pos[1] = "j46";
            cruiser_pos[2] = "j47";
            j45.setEnabled(false);
            j46.setEnabled(false);
            j47.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j55.isEnabled())
        {
            cur_aircraft = "finished";
            j45.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j55.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j45";
            destroyer_pos[1] = "j55";
            j45.setEnabled(false);
            j55.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j55.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j46.isEnabled())
        {
            cur_aircraft = "finished";
            j45.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j46.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j45";
            destroyer_pos[1] = "j46";
            j45.setEnabled(false);
            j46.setEnabled(false);
            j45.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j55Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j95.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j55";
            aircraft_pos[1] = "j65";
            aircraft_pos[2] = "j75";
            aircraft_pos[3] = "j85";
            aircraft_pos[4] = "j95";
            j55.setEnabled(false);
            j65.setEnabled(false);
            j75.setEnabled(false);
            j85.setEnabled(false);
            j95.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j95.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j59.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j55";
            aircraft_pos[1] = "j56";
            aircraft_pos[2] = "j57";
            aircraft_pos[3] = "j58";
            aircraft_pos[4] = "j59";
            j55.setEnabled(false);
            j56.setEnabled(false);
            j57.setEnabled(false);
            j58.setEnabled(false);
            j59.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j59.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j65.isEnabled() && j75.isEnabled() && j85.isEnabled())
        {
            cur_aircraft = "submarine";
            j55.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j65.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j75.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j85.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j55";
            battleship_pos[1] = "j65";
            battleship_pos[2] = "j75";
            battleship_pos[3] = "j85";
            j55.setEnabled(false);
            j65.setEnabled(false);
            j75.setEnabled(false);
            j85.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j85.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j56.isEnabled() && j57.isEnabled() && j58.isEnabled())
        {
            cur_aircraft = "submarine";
            j55.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j56.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j57.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j58.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j55";
            battleship_pos[1] = "j56";
            battleship_pos[2] = "j57";
            battleship_pos[3] = "j58";
            j55.setEnabled(false);
            j56.setEnabled(false);
            j57.setEnabled(false);
            j58.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j58.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j65.isEnabled() && j75.isEnabled())
        {
            cur_aircraft = "cruiser";
            j55.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j65.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j75.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j55";
            submarine_pos[1] = "j65";
            submarine_pos[2] = "j75";
            j55.setEnabled(false);
            j65.setEnabled(false);
            j75.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j56.isEnabled() && j57.isEnabled())
        {
            cur_aircraft = "cruiser";
            j55.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j56.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j57.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j55";
            submarine_pos[1] = "j56";
            submarine_pos[2] = "j57";
            j55.setEnabled(false);
            j56.setEnabled(false);
            j57.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j65.isEnabled() && j75.isEnabled())
        {
            cur_aircraft = "destroyer";
            j55.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j65.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j75.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j55";
            cruiser_pos[1] = "j65";
            cruiser_pos[2] = "j75";
            j55.setEnabled(false);
            j65.setEnabled(false);
            j75.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j56.isEnabled() && j57.isEnabled())
        {
            cur_aircraft = "destroyer";
            j55.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j56.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j57.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j55";
            cruiser_pos[1] = "j56";
            cruiser_pos[2] = "j57";
            j55.setEnabled(false);
            j56.setEnabled(false);
            j57.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j65.isEnabled())
        {
            cur_aircraft = "finished";
            j55.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j65.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j55";
            destroyer_pos[1] = "j65";
            j55.setEnabled(false);
            j65.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j65.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j56.isEnabled())
        {
            cur_aircraft = "finished";
            j55.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j56.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j55";
            destroyer_pos[1] = "j56";
            j55.setEnabled(false);
            j56.setEnabled(false);
            j55.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j65Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j68.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j69.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j65";
            aircraft_pos[1] = "j66";
            aircraft_pos[2] = "j67";
            aircraft_pos[3] = "j68";
            aircraft_pos[4] = "j69";
            j65.setEnabled(false);
            j66.setEnabled(false);
            j67.setEnabled(false);
            j68.setEnabled(false);
            j69.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j68.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j69.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j75.isEnabled() && j85.isEnabled() && j95.isEnabled())
        {
            cur_aircraft = "submarine";
            j65.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j75.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j85.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j95.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j65";
            battleship_pos[1] = "j75";
            battleship_pos[2] = "j85";
            battleship_pos[3] = "j95";
            j65.setEnabled(false);
            j75.setEnabled(false);
            j85.setEnabled(false);
            j95.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j85.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j95.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j66.isEnabled() && j67.isEnabled() && j68.isEnabled())
        {
            cur_aircraft = "submarine";
            j65.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j66.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j67.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j68.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j65";
            battleship_pos[1] = "j66";
            battleship_pos[2] = "j67";
            battleship_pos[3] = "j68";
            j65.setEnabled(false);
            j66.setEnabled(false);
            j67.setEnabled(false);
            j68.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j68.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j75.isEnabled() && j85.isEnabled())
        {
            cur_aircraft = "cruiser";
            j65.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j75.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j85.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j65";
            submarine_pos[1] = "j75";
            submarine_pos[2] = "j85";
            j65.setEnabled(false);
            j75.setEnabled(false);
            j85.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j85.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j66.isEnabled() && j67.isEnabled())
        {
            cur_aircraft = "cruiser";
            j65.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j66.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j67.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j65";
            submarine_pos[1] = "j66";
            submarine_pos[2] = "j67";
            j65.setEnabled(false);
            j66.setEnabled(false);
            j67.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j75.isEnabled() && j85.isEnabled())
        {
            cur_aircraft = "destroyer";
            j65.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j75.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j85.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j65";
            cruiser_pos[1] = "j75";
            cruiser_pos[2] = "j85";
            j65.setEnabled(false);
            j75.setEnabled(false);
            j85.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j85.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j65.isEnabled() && j66.isEnabled())
        {
            cur_aircraft = "destroyer";
            j65.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j66.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j67.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j65";
            cruiser_pos[1] = "j66";
            cruiser_pos[2] = "j67";
            j65.setEnabled(false);
            j66.setEnabled(false);
            j67.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j75.isEnabled())
        {
            cur_aircraft = "finished";
            j65.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j75.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j65";
            destroyer_pos[1] = "j75";
            j65.setEnabled(false);
            j75.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j75.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j66.isEnabled())
        {
            cur_aircraft = "finished";
            j65.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j66.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j65";
            destroyer_pos[1] = "j66";
            j65.setEnabled(false);
            j66.setEnabled(false);
            j65.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j75Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j77.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j78.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j79.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j75";
            aircraft_pos[1] = "j76";
            aircraft_pos[2] = "j77";
            aircraft_pos[3] = "j78";
            aircraft_pos[4] = "j79";
            j75.setEnabled(false);
            j76.setEnabled(false);
            j77.setEnabled(false);
            j78.setEnabled(false);
            j79.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j78.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j79.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j76.isEnabled() && j77.isEnabled() && j78.isEnabled())
        {
            cur_aircraft = "submarine";
            j75.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j76.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j77.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j78.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j75";
            battleship_pos[1] = "j76";
            battleship_pos[2] = "j77";
            battleship_pos[3] = "j78";
            j75.setEnabled(false);
            j76.setEnabled(false);
            j77.setEnabled(false);
            j78.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j78.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j85.isEnabled() && j95.isEnabled())
        {
            cur_aircraft = "cruiser";
            j75.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j85.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j95.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j75";
            submarine_pos[1] = "j85";
            submarine_pos[2] = "j95";
            j75.setEnabled(false);
            j85.setEnabled(false);
            j95.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j95.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j76.isEnabled() && j77.isEnabled())
        {
            cur_aircraft = "cruiser";
            j75.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j76.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j77.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j75";
            submarine_pos[1] = "j76";
            submarine_pos[2] = "j77";
            j75.setEnabled(false);
            j76.setEnabled(false);
            j77.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j85.isEnabled() && j95.isEnabled())
        {
            cur_aircraft = "destroyer";
            j75.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j85.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j95.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j75";
            cruiser_pos[1] = "j85";
            cruiser_pos[2] = "j95";
            j75.setEnabled(false);
            j85.setEnabled(false);
            j95.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j95.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j76.isEnabled() && j77.isEnabled())
        {
            cur_aircraft = "destroyer";
            j75.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j76.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j77.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j75";
            cruiser_pos[1] = "j76";
            cruiser_pos[2] = "j77";
            j75.setEnabled(false);
            j76.setEnabled(false);
            j77.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j85.isEnabled())
        {
            cur_aircraft = "finished";
            j75.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j85.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j75";
            destroyer_pos[1] = "j85";
            j75.setEnabled(false);
            j85.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j85.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j76.isEnabled())
        {
            cur_aircraft = "finished";
            j75.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j76.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j75";
            destroyer_pos[1] = "j76";
            j75.setEnabled(false);
            j76.setEnabled(false);
            j75.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j85Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j86.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j87.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j88.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j89.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j85";
            aircraft_pos[1] = "j86";
            aircraft_pos[2] = "j87";
            aircraft_pos[3] = "j88";
            aircraft_pos[4] = "j89";
            j85.setEnabled(false);
            j86.setEnabled(false);
            j87.setEnabled(false);
            j88.setEnabled(false);
            j89.setEnabled(false);
            j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j87.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j88.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j89.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j86.isEnabled() && j87.isEnabled() && j88.isEnabled())
        {
            cur_aircraft = "submarine";
            j85.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j86.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j87.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j88.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j85";
            battleship_pos[1] = "j86";
            battleship_pos[2] = "j87";
            battleship_pos[3] = "j88";
            j85.setEnabled(false);
            j86.setEnabled(false);
            j87.setEnabled(false);
            j88.setEnabled(false);
            j85.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j87.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j88.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j86.isEnabled() && j87.isEnabled())
        {
            cur_aircraft = "cruiser";
            j85.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j86.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j87.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j85";
            submarine_pos[1] = "j86";
            submarine_pos[2] = "j87";
            j85.setEnabled(false);
            j86.setEnabled(false);
            j87.setEnabled(false);
            j85.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j87.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j86.isEnabled() && j87.isEnabled())
        {
            cur_aircraft = "destroyer";
            j85.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j86.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j87.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j85";
            cruiser_pos[1] = "j86";
            cruiser_pos[2] = "j87";
            j85.setEnabled(false);
            j86.setEnabled(false);
            j87.setEnabled(false);
            j85.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j87.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j95.isEnabled())
        {
            cur_aircraft = "finished";
            j85.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j95.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j85";
            destroyer_pos[1] = "j95";
            j85.setEnabled(false);
            j95.setEnabled(false);
            j85.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j95.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j86.isEnabled())
        {
            cur_aircraft = "finished";
            j85.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j86.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j85";
            destroyer_pos[1] = "j86";
            j85.setEnabled(false);
            j86.setEnabled(false);
            j85.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j95Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j95.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j96.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j97.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j98.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j99.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j95";
            aircraft_pos[1] = "j96";
            aircraft_pos[2] = "j97";
            aircraft_pos[3] = "j98";
            aircraft_pos[4] = "j99";
            j95.setEnabled(false);
            j96.setEnabled(false);
            j97.setEnabled(false);
            j98.setEnabled(false);
            j99.setEnabled(false);
            j95.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j96.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j97.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j98.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j99.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j96.isEnabled() && j97.isEnabled() && j98.isEnabled())
        {
            cur_aircraft = "submarine";
            j95.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j96.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j97.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j98.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j95";
            battleship_pos[1] = "j96";
            battleship_pos[2] = "j97";
            battleship_pos[3] = "j98";
            j95.setEnabled(false);
            j96.setEnabled(false);
            j97.setEnabled(false);
            j98.setEnabled(false);
            j95.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j96.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j97.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j98.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j96.isEnabled() && j97.isEnabled())
        {
            cur_aircraft = "cruiser";
            j95.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j96.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j97.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j95";
            submarine_pos[1] = "j96";
            submarine_pos[2] = "j97";
            j95.setEnabled(false);
            j96.setEnabled(false);
            j97.setEnabled(false);
            j95.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j96.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j97.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j96.isEnabled() && j97.isEnabled())
        {
            cur_aircraft = "destroyer";
            j95.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j96.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j97.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j95";
            cruiser_pos[1] = "j96";
            cruiser_pos[2] = "j97";
            j95.setEnabled(false);
            j96.setEnabled(false);
            j97.setEnabled(false);
            j95.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j96.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j97.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j96.isEnabled())
        {
            cur_aircraft = "finished";
            j95.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j96.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j95";
            destroyer_pos[1] = "j96";
            j95.setEnabled(false);
            j96.setEnabled(false);
            j95.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j96.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
}
