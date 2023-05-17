import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_3 extends play_place_2
{
    public void j3Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j3.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j13.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j23.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j3";
            aircraft_pos[1] = "j13";
            aircraft_pos[2] = "j23";
            aircraft_pos[3] = "j33";
            aircraft_pos[4] = "j43";
            j3.setEnabled(false);
            j13.setEnabled(false);
            j23.setEnabled(false);
            j33.setEnabled(false);
            j43.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j3.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j4.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j5.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j6.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j7.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j3";
            aircraft_pos[1] = "j4";
            aircraft_pos[2] = "j5";
            aircraft_pos[3] = "j6";
            aircraft_pos[4] = "j7";
            j3.setEnabled(false);
            j4.setEnabled(false);
            j5.setEnabled(false);
            j6.setEnabled(false);
            j7.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j4.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j5.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j6.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j7.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j13.isEnabled() && j23.isEnabled() && j33.isEnabled())
        {
            cur_aircraft = "submarine";
            j3.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j13.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j23.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j33.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j3";
            battleship_pos[1] = "j13";
            battleship_pos[2] = "j23";
            battleship_pos[3] = "j33";
            j3.setEnabled(false);
            j13.setEnabled(false);
            j23.setEnabled(false);
            j33.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j33.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j4.isEnabled() && j5.isEnabled() && j6.isEnabled())
        {
            cur_aircraft = "submarine";
            j3.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j4.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j5.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j6.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j3";
            battleship_pos[1] = "j4";
            battleship_pos[2] = "j5";
            battleship_pos[3] = "j6";
            j3.setEnabled(false);
            j4.setEnabled(false);
            j5.setEnabled(false);
            j6.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j4.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j5.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j6.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j13.isEnabled() && j23.isEnabled())
        {
            cur_aircraft = "cruiser";
            j3.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j13.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j23.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j3";
            submarine_pos[1] = "j13";
            submarine_pos[2] = "j23";
            j3.setEnabled(false);
            j13.setEnabled(false);
            j23.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j4.isEnabled() && j5.isEnabled())
        {
            cur_aircraft = "cruiser";
            j3.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j4.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j5.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j3";
            submarine_pos[1] = "j4";
            submarine_pos[2] = "j5";
            j3.setEnabled(false);
            j4.setEnabled(false);
            j5.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j4.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j5.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j13.isEnabled() && j23.isEnabled())
        {
            cur_aircraft = "destroyer";
            j3.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j13.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j23.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j3";
            cruiser_pos[1] = "j13";
            cruiser_pos[2] = "j23";
            j3.setEnabled(false);
            j13.setEnabled(false);
            j23.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j4.isEnabled() && j5.isEnabled())
        {
            cur_aircraft = "destroyer";
            j3.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j4.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j5.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j3";
            cruiser_pos[1] = "j4";
            cruiser_pos[2] = "j5";
            j3.setEnabled(false);
            j4.setEnabled(false);
            j5.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j4.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j5.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j13.isEnabled())
        {
            cur_aircraft = "finished";
            j3.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j13.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j3";
            destroyer_pos[1] = "j13";
            j3.setEnabled(false);
            j13.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j13.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j4.isEnabled())
        {
            cur_aircraft = "finished";
            j3.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j4.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j3";
            destroyer_pos[1] = "j4";
            j3.setEnabled(false);
            j4.setEnabled(false);
            j3.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j4.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j13Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j13.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j23.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j13";
            aircraft_pos[1] = "j23";
            aircraft_pos[2] = "j33";
            aircraft_pos[3] = "j43";
            aircraft_pos[4] = "j53";
            j13.setEnabled(false);
            j23.setEnabled(false);
            j33.setEnabled(false);
            j43.setEnabled(false);
            j53.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j13.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j14.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j16.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j17.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j13";
            aircraft_pos[1] = "j14";
            aircraft_pos[2] = "j15";
            aircraft_pos[3] = "j16";
            aircraft_pos[4] = "j17";
            j13.setEnabled(false);
            j14.setEnabled(false);
            j15.setEnabled(false);
            j16.setEnabled(false);
            j17.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j16.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j17.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j23.isEnabled() && j33.isEnabled() && j43.isEnabled())
        {
            cur_aircraft = "submarine";
            j13.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j23.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j33.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j43.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j13";
            battleship_pos[1] = "j23";
            battleship_pos[2] = "j33";
            battleship_pos[3] = "j43";
            j13.setEnabled(false);
            j23.setEnabled(false);
            j33.setEnabled(false);
            j43.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j43.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j14.isEnabled() && j15.isEnabled() && j16.isEnabled())
        {
            cur_aircraft = "submarine";
            j13.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j14.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j15.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j16.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j13";
            battleship_pos[1] = "j14";
            battleship_pos[2] = "j15";
            battleship_pos[3] = "j16";
            j13.setEnabled(false);
            j14.setEnabled(false);
            j15.setEnabled(false);
            j16.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j15.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j16.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j23.isEnabled() && j33.isEnabled())
        {
            cur_aircraft = "cruiser";
            j13.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j23.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j33.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j13";
            submarine_pos[1] = "j23";
            submarine_pos[2] = "j33";
            j13.setEnabled(false);
            j23.setEnabled(false);
            j33.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j14.isEnabled() && j15.isEnabled())
        {
            cur_aircraft = "cruiser";
            j13.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j14.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j15.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j13";
            submarine_pos[1] = "j14";
            submarine_pos[2] = "j15";
            j13.setEnabled(false);
            j14.setEnabled(false);
            j15.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j15.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j23.isEnabled() && j33.isEnabled())
        {
            cur_aircraft = "destroyer";
            j13.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j23.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j33.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j13";
            cruiser_pos[1] = "j23";
            cruiser_pos[2] = "j33";
            j13.setEnabled(false);
            j23.setEnabled(false);
            j33.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j14.isEnabled() && j15.isEnabled())
        {
            cur_aircraft = "destroyer";
            j13.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j14.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j15.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j13";
            cruiser_pos[1] = "j14";
            cruiser_pos[2] = "j15";
            j13.setEnabled(false);
            j14.setEnabled(false);
            j15.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j15.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j23.isEnabled())
        {
            cur_aircraft = "finished";
            j13.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j23.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j13";
            destroyer_pos[1] = "j23";
            j13.setEnabled(false);
            j23.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j23.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j14.isEnabled())
        {
            cur_aircraft = "finished";
            j13.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j14.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j13";
            destroyer_pos[1] = "j14";
            j13.setEnabled(false);
            j14.setEnabled(false);
            j13.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j14.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j23Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j23.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j23";
            aircraft_pos[1] = "j33";
            aircraft_pos[2] = "j43";
            aircraft_pos[3] = "j53";
            aircraft_pos[4] = "j63";
            j23.setEnabled(false);
            j33.setEnabled(false);
            j43.setEnabled(false);
            j53.setEnabled(false);
            j63.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j23.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j27.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j23";
            aircraft_pos[1] = "j24";
            aircraft_pos[2] = "j25";
            aircraft_pos[3] = "j26";
            aircraft_pos[4] = "j27";
            j23.setEnabled(false);
            j24.setEnabled(false);
            j25.setEnabled(false);
            j26.setEnabled(false);
            j27.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j27.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j33.isEnabled() && j43.isEnabled() && j53.isEnabled())
        {
            cur_aircraft = "submarine";
            j23.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j33.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j43.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j53.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j23";
            battleship_pos[1] = "j33";
            battleship_pos[2] = "j43";
            battleship_pos[3] = "j53";
            j23.setEnabled(false);
            j33.setEnabled(false);
            j43.setEnabled(false);
            j53.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j53.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j24.isEnabled() && j25.isEnabled() && j26.isEnabled())
        {
            cur_aircraft = "submarine";
            j23.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j24.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j25.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j26.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j23";
            battleship_pos[1] = "j24";
            battleship_pos[2] = "j25";
            battleship_pos[3] = "j26";
            j23.setEnabled(false);
            j24.setEnabled(false);
            j25.setEnabled(false);
            j26.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j26.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j33.isEnabled() && j43.isEnabled())
        {
            cur_aircraft = "cruiser";
            j23.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j33.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j43.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j23";
            submarine_pos[1] = "j33";
            submarine_pos[2] = "j43";
            j23.setEnabled(false);
            j33.setEnabled(false);
            j43.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j24.isEnabled() && j25.isEnabled())
        {
            cur_aircraft = "cruiser";
            j23.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j24.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j25.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j23";
            submarine_pos[1] = "j24";
            submarine_pos[2] = "j25";
            j23.setEnabled(false);
            j24.setEnabled(false);
            j25.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j33.isEnabled() && j43.isEnabled())
        {
            cur_aircraft = "destroyer";
            j23.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j33.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j43.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j23";
            cruiser_pos[1] = "j33";
            cruiser_pos[2] = "j43";
            j23.setEnabled(false);
            j33.setEnabled(false);
            j43.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j24.isEnabled() && j25.isEnabled())
        {
            cur_aircraft = "destroyer";
            j23.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j24.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j25.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j23";
            cruiser_pos[1] = "j24";
            cruiser_pos[2] = "j25";
            j23.setEnabled(false);
            j24.setEnabled(false);
            j25.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j25.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j33.isEnabled())
        {
            cur_aircraft = "finished";
            j23.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j33.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j23";
            destroyer_pos[1] = "j33";
            j23.setEnabled(false);
            j33.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j33.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j24.isEnabled())
        {
            cur_aircraft = "finished";
            j23.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j24.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j23";
            destroyer_pos[1] = "j24";
            j23.setEnabled(false);
            j24.setEnabled(false);
            j23.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j24.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j33Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j73.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j33";
            aircraft_pos[1] = "j43";
            aircraft_pos[2] = "j53";
            aircraft_pos[3] = "j63";
            aircraft_pos[4] = "j73";
            j33.setEnabled(false);
            j43.setEnabled(false);
            j53.setEnabled(false);
            j63.setEnabled(false);
            j73.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j73.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j33";
            aircraft_pos[1] = "j34";
            aircraft_pos[2] = "j35";
            aircraft_pos[3] = "j36";
            aircraft_pos[4] = "j37";
            j33.setEnabled(false);
            j34.setEnabled(false);
            j35.setEnabled(false);
            j36.setEnabled(false);
            j37.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j43.isEnabled() && j53.isEnabled() && j63.isEnabled())
        {
            cur_aircraft = "submarine";
            j33.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j43.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j53.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j63.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j33";
            battleship_pos[1] = "j43";
            battleship_pos[2] = "j53";
            battleship_pos[3] = "j63";
            j33.setEnabled(false);
            j43.setEnabled(false);
            j53.setEnabled(false);
            j63.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j63.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j34.isEnabled() && j35.isEnabled() && j36.isEnabled())
        {
            cur_aircraft = "submarine";
            j33.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j34.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j35.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j36.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j33";
            battleship_pos[1] = "j34";
            battleship_pos[2] = "j35";
            battleship_pos[3] = "j36";
            j33.setEnabled(false);
            j34.setEnabled(false);
            j35.setEnabled(false);
            j36.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j43.isEnabled() && j53.isEnabled())
        {
            cur_aircraft = "cruiser";
            j33.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j43.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j53.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j33";
            submarine_pos[1] = "j43";
            submarine_pos[2] = "j53";
            j33.setEnabled(false);
            j43.setEnabled(false);
            j53.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j34.isEnabled() && j35.isEnabled())
        {
            cur_aircraft = "cruiser";
            j33.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j34.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j35.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j33";
            submarine_pos[1] = "j34";
            submarine_pos[2] = "j35";
            j33.setEnabled(false);
            j34.setEnabled(false);
            j35.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j43.isEnabled() && j53.isEnabled())
        {
            cur_aircraft = "destroyer";
            j33.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j43.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j53.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j33";
            cruiser_pos[1] = "j43";
            cruiser_pos[2] = "j53";
            j33.setEnabled(false);
            j43.setEnabled(false);
            j53.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j35.isEnabled() && j36.isEnabled())
        {
            cur_aircraft = "destroyer";
            j33.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j34.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j35.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j33";
            cruiser_pos[1] = "j34";
            cruiser_pos[2] = "j35";
            j33.setEnabled(false);
            j34.setEnabled(false);
            j35.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j35.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j43.isEnabled())
        {
            cur_aircraft = "finished";
            j33.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j43.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j33";
            destroyer_pos[1] = "j43";
            j33.setEnabled(false);
            j43.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j43.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j34.isEnabled())
        {
            cur_aircraft = "finished";
            j33.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j34.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j33";
            destroyer_pos[1] = "j34";
            j33.setEnabled(false);
            j34.setEnabled(false);
            j33.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j34.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j43Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j73.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j83.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j43";
            aircraft_pos[1] = "j53";
            aircraft_pos[2] = "j63";
            aircraft_pos[3] = "j73";
            aircraft_pos[4] = "j83";
            j43.setEnabled(false);
            j53.setEnabled(false);
            j63.setEnabled(false);
            j73.setEnabled(false);
            j83.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j73.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j83.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j43";
            aircraft_pos[1] = "j44";
            aircraft_pos[2] = "j45";
            aircraft_pos[3] = "j46";
            aircraft_pos[4] = "j47";
            j43.setEnabled(false);
            j44.setEnabled(false);
            j45.setEnabled(false);
            j46.setEnabled(false);
            j47.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j53.isEnabled() && j63.isEnabled() && j73.isEnabled())
        {
            cur_aircraft = "submarine";
            j43.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j53.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j63.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j73.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j43";
            battleship_pos[1] = "j53";
            battleship_pos[2] = "j63";
            battleship_pos[3] = "j73";
            j43.setEnabled(false);
            j53.setEnabled(false);
            j63.setEnabled(false);
            j73.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j73.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j44.isEnabled() && j45.isEnabled() && j46.isEnabled())
        {
            cur_aircraft = "submarine";
            j43.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j44.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j45.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j46.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j43";
            battleship_pos[1] = "j44";
            battleship_pos[2] = "j45";
            battleship_pos[3] = "j46";
            j43.setEnabled(false);
            j44.setEnabled(false);
            j45.setEnabled(false);
            j46.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j53.isEnabled() && j63.isEnabled())
        {
            cur_aircraft = "cruiser";
            j43.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j53.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j63.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j43";
            submarine_pos[1] = "j53";
            submarine_pos[2] = "j63";
            j43.setEnabled(false);
            j53.setEnabled(false);
            j63.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j44.isEnabled() && j45.isEnabled())
        {
            cur_aircraft = "cruiser";
            j43.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j44.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j45.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j43";
            submarine_pos[1] = "j44";
            submarine_pos[2] = "j45";
            j43.setEnabled(false);
            j44.setEnabled(false);
            j45.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j53.isEnabled() && j63.isEnabled())
        {
            cur_aircraft = "destroyer";
            j43.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j53.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j63.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j43";
            cruiser_pos[1] = "j53";
            cruiser_pos[2] = "j63";
            j43.setEnabled(false);
            j53.setEnabled(false);
            j63.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j44.isEnabled() && j45.isEnabled())
        {
            cur_aircraft = "destroyer";
            j43.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j44.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j45.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j43";
            cruiser_pos[1] = "j44";
            cruiser_pos[2] = "j45";
            j43.setEnabled(false);
            j44.setEnabled(false);
            j45.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j45.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j53.isEnabled())
        {
            cur_aircraft = "finished";
            j43.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j53.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j43";
            destroyer_pos[1] = "j53";
            j43.setEnabled(false);
            j53.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j53.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j44.isEnabled())
        {
            cur_aircraft = "finished";
            j43.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j44.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j43";
            destroyer_pos[1] = "j44";
            j43.setEnabled(false);
            j44.setEnabled(false);
            j43.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j44.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j53Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j73.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j83.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j93.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j53";
            aircraft_pos[1] = "j63";
            aircraft_pos[2] = "j73";
            aircraft_pos[3] = "j83";
            aircraft_pos[4] = "j93";
            j53.setEnabled(false);
            j63.setEnabled(false);
            j73.setEnabled(false);
            j83.setEnabled(false);
            j93.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j83.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j93.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j53";
            aircraft_pos[1] = "j54";
            aircraft_pos[2] = "j55";
            aircraft_pos[3] = "j56";
            aircraft_pos[4] = "j57";
            j53.setEnabled(false);
            j54.setEnabled(false);
            j55.setEnabled(false);
            j56.setEnabled(false);
            j57.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j63.isEnabled() && j73.isEnabled() && j83.isEnabled())
        {
            cur_aircraft = "submarine";
            j53.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j63.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j73.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j83.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j53";
            battleship_pos[1] = "j63";
            battleship_pos[2] = "j73";
            battleship_pos[3] = "j83";
            j53.setEnabled(false);
            j63.setEnabled(false);
            j73.setEnabled(false);
            j83.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j83.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j54.isEnabled() && j55.isEnabled() && j56.isEnabled())
        {
            cur_aircraft = "submarine";
            j53.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j54.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j55.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j56.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j53";
            battleship_pos[1] = "j54";
            battleship_pos[2] = "j55";
            battleship_pos[3] = "j56";
            j53.setEnabled(false);
            j54.setEnabled(false);
            j55.setEnabled(false);
            j56.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j63.isEnabled() && j73.isEnabled())
        {
            cur_aircraft = "cruiser";
            j53.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j63.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j73.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j53";
            submarine_pos[1] = "j63";
            submarine_pos[2] = "j73";
            j53.setEnabled(false);
            j63.setEnabled(false);
            j73.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j54.isEnabled() && j55.isEnabled())
        {
            cur_aircraft = "cruiser";
            j53.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j54.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j55.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j53";
            submarine_pos[1] = "j54";
            submarine_pos[2] = "j55";
            j53.setEnabled(false);
            j54.setEnabled(false);
            j55.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j63.isEnabled() && j73.isEnabled())
        {
            cur_aircraft = "destroyer";
            j53.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j63.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j73.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j53";
            cruiser_pos[1] = "j63";
            cruiser_pos[2] = "j73";
            j53.setEnabled(false);
            j63.setEnabled(false);
            j73.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j54.isEnabled() && j55.isEnabled())
        {
            cur_aircraft = "destroyer";
            j53.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j54.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j55.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j53";
            cruiser_pos[1] = "j54";
            cruiser_pos[2] = "j55";
            j53.setEnabled(false);
            j54.setEnabled(false);
            j55.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j55.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j63.isEnabled())
        {
            cur_aircraft = "finished";
            j53.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j63.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j53";
            destroyer_pos[1] = "j63";
            j53.setEnabled(false);
            j63.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j63.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j54.isEnabled())
        {
            cur_aircraft = "finished";
            j53.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j54.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j53";
            destroyer_pos[1] = "j54";
            j53.setEnabled(false);
            j54.setEnabled(false);
            j53.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j54.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j63Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j63";
            aircraft_pos[1] = "j64";
            aircraft_pos[2] = "j65";
            aircraft_pos[3] = "j66";
            aircraft_pos[4] = "j67";
            j63.setEnabled(false);
            j64.setEnabled(false);
            j65.setEnabled(false);
            j66.setEnabled(false);
            j67.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j73.isEnabled() && j83.isEnabled() && j93.isEnabled())
        {
            cur_aircraft = "submarine";
            j63.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j73.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j83.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j93.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j63";
            battleship_pos[1] = "j73";
            battleship_pos[2] = "j83";
            battleship_pos[3] = "j93";
            j63.setEnabled(false);
            j73.setEnabled(false);
            j83.setEnabled(false);
            j93.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j83.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j93.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j64.isEnabled() && j65.isEnabled() && j66.isEnabled())
        {
            cur_aircraft = "submarine";
            j63.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j64.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j65.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j66.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j63";
            battleship_pos[1] = "j64";
            battleship_pos[2] = "j65";
            battleship_pos[3] = "j66";
            j63.setEnabled(false);
            j64.setEnabled(false);
            j65.setEnabled(false);
            j66.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j73.isEnabled() && j83.isEnabled())
        {
            cur_aircraft = "cruiser";
            j63.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j73.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j83.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j63";
            submarine_pos[1] = "j73";
            submarine_pos[2] = "j83";
            j63.setEnabled(false);
            j73.setEnabled(false);
            j83.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j83.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j64.isEnabled() && j65.isEnabled())
        {
            cur_aircraft = "cruiser";
            j63.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j64.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j65.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j63";
            submarine_pos[1] = "j64";
            submarine_pos[2] = "j65";
            j63.setEnabled(false);
            j64.setEnabled(false);
            j65.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j73.isEnabled() && j83.isEnabled())
        {
            cur_aircraft = "destroyer";
            j63.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j73.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j83.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j63";
            cruiser_pos[1] = "j73";
            cruiser_pos[2] = "j83";
            j63.setEnabled(false);
            j73.setEnabled(false);
            j83.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j83.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j63.isEnabled() && j64.isEnabled())
        {
            cur_aircraft = "destroyer";
            j63.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j64.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j65.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j63";
            cruiser_pos[1] = "j64";
            cruiser_pos[2] = "j65";
            j63.setEnabled(false);
            j64.setEnabled(false);
            j65.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j65.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j73.isEnabled())
        {
            cur_aircraft = "finished";
            j63.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j73.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j63";
            destroyer_pos[1] = "j73";
            j63.setEnabled(false);
            j73.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j73.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j64.isEnabled())
        {
            cur_aircraft = "finished";
            j63.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j64.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j63";
            destroyer_pos[1] = "j64";
            j63.setEnabled(false);
            j64.setEnabled(false);
            j63.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j64.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j73Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j73.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j77.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j73";
            aircraft_pos[1] = "j74";
            aircraft_pos[2] = "j75";
            aircraft_pos[3] = "j76";
            aircraft_pos[4] = "j77";
            j73.setEnabled(false);
            j74.setEnabled(false);
            j75.setEnabled(false);
            j76.setEnabled(false);
            j77.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j77.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j74.isEnabled() && j75.isEnabled() && j76.isEnabled())
        {
            cur_aircraft = "submarine";
            j73.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j74.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j75.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j76.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j73";
            battleship_pos[1] = "j74";
            battleship_pos[2] = "j75";
            battleship_pos[3] = "j76";
            j73.setEnabled(false);
            j74.setEnabled(false);
            j75.setEnabled(false);
            j76.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j76.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j83.isEnabled() && j93.isEnabled())
        {
            cur_aircraft = "cruiser";
            j73.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j83.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j93.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j73";
            submarine_pos[1] = "j83";
            submarine_pos[2] = "j93";
            j73.setEnabled(false);
            j83.setEnabled(false);
            j93.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j93.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j74.isEnabled() && j75.isEnabled())
        {
            cur_aircraft = "cruiser";
            j73.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j74.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j75.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j73";
            submarine_pos[1] = "j74";
            submarine_pos[2] = "j75";
            j73.setEnabled(false);
            j74.setEnabled(false);
            j75.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j83.isEnabled() && j93.isEnabled())
        {
            cur_aircraft = "destroyer";
            j73.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j83.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j93.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j73";
            cruiser_pos[1] = "j83";
            cruiser_pos[2] = "j93";
            j73.setEnabled(false);
            j83.setEnabled(false);
            j93.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j93.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j74.isEnabled() && j75.isEnabled())
        {
            cur_aircraft = "destroyer";
            j73.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j74.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j75.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j73";
            cruiser_pos[1] = "j74";
            cruiser_pos[2] = "j75";
            j73.setEnabled(false);
            j74.setEnabled(false);
            j75.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j75.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j83.isEnabled())
        {
            cur_aircraft = "finished";
            j73.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j83.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j73";
            destroyer_pos[1] = "j83";
            j73.setEnabled(false);
            j83.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j83.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j74.isEnabled())
        {
            cur_aircraft = "finished";
            j73.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j74.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j73";
            destroyer_pos[1] = "j74";
            j73.setEnabled(false);
            j74.setEnabled(false);
            j73.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j74.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j83Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j83.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j84.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j86.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j87.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j83";
            aircraft_pos[1] = "j84";
            aircraft_pos[2] = "j85";
            aircraft_pos[3] = "j86";
            aircraft_pos[4] = "j87";
            j83.setEnabled(false);
            j84.setEnabled(false);
            j85.setEnabled(false);
            j86.setEnabled(false);
            j87.setEnabled(false);
            j83.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j86.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j87.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j84.isEnabled() && j85.isEnabled() && j86.isEnabled())
        {
            cur_aircraft = "submarine";
            j83.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j84.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j85.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j86.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j83";
            battleship_pos[1] = "j84";
            battleship_pos[2] = "j85";
            battleship_pos[3] = "j86";
            j83.setEnabled(false);
            j84.setEnabled(false);
            j85.setEnabled(false);
            j86.setEnabled(false);
            j83.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j85.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j86.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j84.isEnabled() && j85.isEnabled())
        {
            cur_aircraft = "cruiser";
            j83.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j84.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j85.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j83";
            submarine_pos[1] = "j84";
            submarine_pos[2] = "j85";
            j83.setEnabled(false);
            j84.setEnabled(false);
            j85.setEnabled(false);
            j83.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j85.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j84.isEnabled() && j85.isEnabled())
        {
            cur_aircraft = "destroyer";
            j83.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j84.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j83.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j83";
            cruiser_pos[1] = "j84";
            cruiser_pos[2] = "j85";
            j83.setEnabled(false);
            j84.setEnabled(false);
            j85.setEnabled(false);
            j83.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j85.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j93.isEnabled())
        {
            cur_aircraft = "finished";
            j83.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j93.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j83";
            destroyer_pos[1] = "j93";
            j83.setEnabled(false);
            j93.setEnabled(false);
            j83.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j93.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j84.isEnabled())
        {
            cur_aircraft = "finished";
            j83.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j84.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j83";
            destroyer_pos[1] = "j84";
            j83.setEnabled(false);
            j84.setEnabled(false);
            j83.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j84.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j93Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j93.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j94.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j95.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j96.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j97.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j93";
            aircraft_pos[1] = "j94";
            aircraft_pos[2] = "j95";
            aircraft_pos[3] = "j96";
            aircraft_pos[4] = "j97";
            j93.setEnabled(false);
            j94.setEnabled(false);
            j95.setEnabled(false);
            j96.setEnabled(false);
            j97.setEnabled(false);
            j93.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j94.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j95.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j96.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j97.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j94.isEnabled() && j95.isEnabled() && j96.isEnabled())
        {
            cur_aircraft = "submarine";
            j93.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j94.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j95.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j96.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j93";
            battleship_pos[1] = "j94";
            battleship_pos[2] = "j95";
            battleship_pos[3] = "j96";
            j93.setEnabled(false);
            j94.setEnabled(false);
            j95.setEnabled(false);
            j96.setEnabled(false);
            j93.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j94.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j95.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j96.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j94.isEnabled() && j95.isEnabled())
        {
            cur_aircraft = "cruiser";
            j93.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j94.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j95.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j93";
            submarine_pos[1] = "j94";
            submarine_pos[2] = "j95";
            j93.setEnabled(false);
            j94.setEnabled(false);
            j95.setEnabled(false);
            j93.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j94.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j95.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j94.isEnabled() && j95.isEnabled())
        {
            cur_aircraft = "destroyer";
            j93.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j94.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j95.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j93";
            cruiser_pos[1] = "j94";
            cruiser_pos[2] = "j95";
            j93.setEnabled(false);
            j94.setEnabled(false);
            j95.setEnabled(false);
            j93.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j94.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j95.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j93.isEnabled())
        {
            cur_aircraft = "finished";
            j93.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j94.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j93";
            destroyer_pos[1] = "j94";
            j93.setEnabled(false);
            j94.setEnabled(false);
            j93.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j94.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
