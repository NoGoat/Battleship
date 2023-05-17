import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_7 extends play_place_6
{
    public void j7Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j7.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j17.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j27.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j7";
            aircraft_pos[1] = "j17";
            aircraft_pos[2] = "j27";
            aircraft_pos[3] = "j37";
            aircraft_pos[4] = "j47";
            j7.setEnabled(false);
            j17.setEnabled(false);
            j27.setEnabled(false);
            j37.setEnabled(false);
            j47.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j17.isEnabled() && j27.isEnabled() && j37.isEnabled())
        {
            cur_aircraft = "submarine";
            j7.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j17.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j27.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j37.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j7";
            battleship_pos[1] = "j17";
            battleship_pos[2] = "j27";
            battleship_pos[3] = "j37";
            j7.setEnabled(false);
            j17.setEnabled(false);
            j27.setEnabled(false);
            j37.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j8.isEnabled() && j9.isEnabled() && j10.isEnabled())
        {
            cur_aircraft = "submarine";
            j7.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j8.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j9.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j10.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j7";
            battleship_pos[1] = "j8";
            battleship_pos[2] = "j9";
            battleship_pos[3] = "j10";
            j7.setEnabled(false);
            j8.setEnabled(false);
            j9.setEnabled(false);
            j10.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j8.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j9.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j10.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j17.isEnabled() && j27.isEnabled())
        {
            cur_aircraft = "cruiser";
            j7.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j17.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j27.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j7";
            submarine_pos[1] = "j17";
            submarine_pos[2] = "j27";
            j7.setEnabled(false);
            j17.setEnabled(false);
            j27.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j8.isEnabled() && j9.isEnabled())
        {
            cur_aircraft = "cruiser";
            j7.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j8.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j9.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j7";
            submarine_pos[1] = "j8";
            submarine_pos[2] = "j9";
            j7.setEnabled(false);
            j8.setEnabled(false);
            j9.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j8.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j9.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j17.isEnabled() && j27.isEnabled())
        {
            cur_aircraft = "destroyer";
            j7.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j17.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j27.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j7";
            cruiser_pos[1] = "j17";
            cruiser_pos[2] = "j27";
            j7.setEnabled(false);
            j17.setEnabled(false);
            j27.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j27.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j8.isEnabled() && j9.isEnabled())
        {
            cur_aircraft = "destroyer";
            j7.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j8.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j9.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j7";
            cruiser_pos[1] = "j8";
            cruiser_pos[2] = "j9";
            j7.setEnabled(false);
            j8.setEnabled(false);
            j9.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j8.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j9.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j17.isEnabled())
        {
            cur_aircraft = "finished";
            j7.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j17.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j7";
            destroyer_pos[1] = "j17";
            j7.setEnabled(false);
            j17.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j8.isEnabled())
        {
            cur_aircraft = "finished";
            j7.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j8.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j7";
            destroyer_pos[1] = "j8";
            j7.setEnabled(false);
            j8.setEnabled(false);
            j7.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j8.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j17Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j17.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j27.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j17";
            aircraft_pos[1] = "j27";
            aircraft_pos[2] = "j37";
            aircraft_pos[3] = "j47";
            aircraft_pos[4] = "j57";
            j17.setEnabled(false);
            j27.setEnabled(false);
            j37.setEnabled(false);
            j47.setEnabled(false);
            j57.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j27.isEnabled() && j37.isEnabled() && j47.isEnabled())
        {
            cur_aircraft = "submarine";
            j17.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j27.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j37.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j47.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j17";
            battleship_pos[1] = "j27";
            battleship_pos[2] = "j37";
            battleship_pos[3] = "j47";
            j17.setEnabled(false);
            j27.setEnabled(false);
            j37.setEnabled(false);
            j47.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j18.isEnabled() && j19.isEnabled() && j20.isEnabled())
        {
            cur_aircraft = "submarine";
            j17.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j18.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j19.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j20.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j17";
            battleship_pos[1] = "j18";
            battleship_pos[2] = "j19";
            battleship_pos[3] = "j20";
            j17.setEnabled(false);
            j18.setEnabled(false);
            j19.setEnabled(false);
            j20.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j19.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j20.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j27.isEnabled() && j37.isEnabled())
        {
            cur_aircraft = "cruiser";
            j17.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j27.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j37.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j17";
            submarine_pos[1] = "j27";
            submarine_pos[2] = "j37";
            j17.setEnabled(false);
            j27.setEnabled(false);
            j37.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j18.isEnabled() && j19.isEnabled())
        {
            cur_aircraft = "cruiser";
            j17.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j18.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j19.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j17";
            submarine_pos[1] = "j18";
            submarine_pos[2] = "j19";
            j17.setEnabled(false);
            j18.setEnabled(false);
            j19.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j19.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j27.isEnabled() && j37.isEnabled())
        {
            cur_aircraft = "destroyer";
            j17.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j27.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j37.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j17";
            cruiser_pos[1] = "j27";
            cruiser_pos[2] = "j37";
            j17.setEnabled(false);
            j27.setEnabled(false);
            j37.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j37.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j18.isEnabled() && j19.isEnabled())
        {
            cur_aircraft = "destroyer";
            j17.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j18.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j19.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j17";
            cruiser_pos[1] = "j18";
            cruiser_pos[2] = "j19";
            j17.setEnabled(false);
            j18.setEnabled(false);
            j19.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j19.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j27.isEnabled())
        {
            cur_aircraft = "finished";
            j17.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j27.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j17";
            destroyer_pos[1] = "j27";
            j17.setEnabled(false);
            j27.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j18.isEnabled())
        {
            cur_aircraft = "finished";
            j17.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j18.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j17";
            destroyer_pos[1] = "j18";
            j17.setEnabled(false);
            j18.setEnabled(false);
            j17.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j27Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j27.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j27";
            aircraft_pos[1] = "j37";
            aircraft_pos[2] = "j47";
            aircraft_pos[3] = "j57";
            aircraft_pos[4] = "j67";
            j27.setEnabled(false);
            j37.setEnabled(false);
            j47.setEnabled(false);
            j57.setEnabled(false);
            j67.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j37.isEnabled() && j47.isEnabled() && j57.isEnabled())
        {
            cur_aircraft = "submarine";
            j27.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j37.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j47.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j57.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j27";
            battleship_pos[1] = "j37";
            battleship_pos[2] = "j47";
            battleship_pos[3] = "j57";
            j27.setEnabled(false);
            j37.setEnabled(false);
            j47.setEnabled(false);
            j57.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j28.isEnabled() && j29.isEnabled() && j30.isEnabled())
        {
            cur_aircraft = "submarine";
            j27.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j28.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j29.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j30.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j27";
            battleship_pos[1] = "j28";
            battleship_pos[2] = "j29";
            battleship_pos[3] = "j30";
            j27.setEnabled(false);
            j28.setEnabled(false);
            j29.setEnabled(false);
            j30.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j29.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j30.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j37.isEnabled() && j47.isEnabled())
        {
            cur_aircraft = "cruiser";
            j27.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j37.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j47.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j27";
            submarine_pos[1] = "j37";
            submarine_pos[2] = "j47";
            j27.setEnabled(false);
            j37.setEnabled(false);
            j47.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j28.isEnabled() && j29.isEnabled())
        {
            cur_aircraft = "cruiser";
            j27.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j28.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j29.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j27";
            submarine_pos[1] = "j28";
            submarine_pos[2] = "j29";
            j27.setEnabled(false);
            j28.setEnabled(false);
            j29.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j29.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j37.isEnabled() && j47.isEnabled())
        {
            cur_aircraft = "destroyer";
            j27.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j37.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j47.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j27";
            cruiser_pos[1] = "j37";
            cruiser_pos[2] = "j47";
            j27.setEnabled(false);
            j37.setEnabled(false);
            j47.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j47.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j28.isEnabled() && j29.isEnabled())
        {
            cur_aircraft = "destroyer";
            j27.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j28.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j29.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j27";
            cruiser_pos[1] = "j28";
            cruiser_pos[2] = "j29";
            j27.setEnabled(false);
            j28.setEnabled(false);
            j29.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j29.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j37.isEnabled())
        {
            cur_aircraft = "finished";
            j27.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j37.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j27";
            destroyer_pos[1] = "j37";
            j27.setEnabled(false);
            j37.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j28.isEnabled())
        {
            cur_aircraft = "finished";
            j27.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j28.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j27";
            destroyer_pos[1] = "j28";
            j27.setEnabled(false);
            j28.setEnabled(false);
            j27.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j37Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j77.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j37";
            aircraft_pos[1] = "j47";
            aircraft_pos[2] = "j57";
            aircraft_pos[3] = "j67";
            aircraft_pos[4] = "j77";
            j37.setEnabled(false);
            j47.setEnabled(false);
            j57.setEnabled(false);
            j67.setEnabled(false);
            j77.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j77.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j47.isEnabled() && j57.isEnabled() && j67.isEnabled())
        {
            cur_aircraft = "submarine";
            j37.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j47.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j57.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j67.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j37";
            battleship_pos[1] = "j47";
            battleship_pos[2] = "j57";
            battleship_pos[3] = "j67";
            j37.setEnabled(false);
            j47.setEnabled(false);
            j57.setEnabled(false);
            j67.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j38.isEnabled() && j39.isEnabled() && j40.isEnabled())
        {
            cur_aircraft = "submarine";
            j37.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j38.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j39.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j40.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j37";
            battleship_pos[1] = "j38";
            battleship_pos[2] = "j39";
            battleship_pos[3] = "j40";
            j37.setEnabled(false);
            j38.setEnabled(false);
            j39.setEnabled(false);
            j40.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j39.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j40.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j47.isEnabled() && j57.isEnabled())
        {
            cur_aircraft = "cruiser";
            j37.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j47.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j57.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j37";
            submarine_pos[1] = "j47";
            submarine_pos[2] = "j57";
            j37.setEnabled(false);
            j47.setEnabled(false);
            j57.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j38.isEnabled() && j39.isEnabled())
        {
            cur_aircraft = "cruiser";
            j37.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j38.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j39.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j37";
            submarine_pos[1] = "j38";
            submarine_pos[2] = "j39";
            j37.setEnabled(false);
            j38.setEnabled(false);
            j39.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j39.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j47.isEnabled() && j57.isEnabled())
        {
            cur_aircraft = "destroyer";
            j37.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j47.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j57.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j37";
            cruiser_pos[1] = "j47";
            cruiser_pos[2] = "j57";
            j37.setEnabled(false);
            j47.setEnabled(false);
            j57.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j57.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j38.isEnabled() && j39.isEnabled())
        {
            cur_aircraft = "destroyer";
            j37.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j38.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j39.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j37";
            cruiser_pos[1] = "j38";
            cruiser_pos[2] = "j39";
            j37.setEnabled(false);
            j38.setEnabled(false);
            j39.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j39.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j47.isEnabled())
        {
            cur_aircraft = "finished";
            j37.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j47.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j37";
            destroyer_pos[1] = "j47";
            j37.setEnabled(false);
            j47.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j38.isEnabled())
        {
            cur_aircraft = "finished";
            j37.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j38.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j37";
            destroyer_pos[1] = "j38";
            j37.setEnabled(false);
            j38.setEnabled(false);
            j37.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j47Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j77.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j87.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j47";
            aircraft_pos[1] = "j57";
            aircraft_pos[2] = "j67";
            aircraft_pos[3] = "j77";
            aircraft_pos[4] = "j87";
            j47.setEnabled(false);
            j57.setEnabled(false);
            j67.setEnabled(false);
            j77.setEnabled(false);
            j87.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j77.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j87.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j57.isEnabled() && j67.isEnabled() && j77.isEnabled())
        {
            cur_aircraft = "submarine";
            j47.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j57.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j67.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j77.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j47";
            battleship_pos[1] = "j57";
            battleship_pos[2] = "j67";
            battleship_pos[3] = "j77";
            j47.setEnabled(false);
            j57.setEnabled(false);
            j67.setEnabled(false);
            j77.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j77.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j48.isEnabled() && j49.isEnabled() && j50.isEnabled())
        {
            cur_aircraft = "submarine";
            j47.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j48.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j49.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j50.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j47";
            battleship_pos[1] = "j48";
            battleship_pos[2] = "j49";
            battleship_pos[3] = "j50";
            j47.setEnabled(false);
            j48.setEnabled(false);
            j49.setEnabled(false);
            j50.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j49.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j50.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j57.isEnabled() && j67.isEnabled())
        {
            cur_aircraft = "cruiser";
            j47.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j57.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j67.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j47";
            submarine_pos[1] = "j57";
            submarine_pos[2] = "j67";
            j47.setEnabled(false);
            j57.setEnabled(false);
            j67.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j48.isEnabled() && j49.isEnabled())
        {
            cur_aircraft = "cruiser";
            j47.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j48.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j49.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j47";
            submarine_pos[1] = "j48";
            submarine_pos[2] = "j49";
            j47.setEnabled(false);
            j48.setEnabled(false);
            j49.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j49.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j57.isEnabled() && j67.isEnabled())
        {
            cur_aircraft = "destroyer";
            j47.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j57.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j67.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j47";
            cruiser_pos[1] = "j57";
            cruiser_pos[2] = "j67";
            j47.setEnabled(false);
            j57.setEnabled(false);
            j67.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j67.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j48.isEnabled() && j49.isEnabled())
        {
            cur_aircraft = "destroyer";
            j47.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j48.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j49.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j47";
            cruiser_pos[1] = "j48";
            cruiser_pos[2] = "j49";
            j47.setEnabled(false);
            j48.setEnabled(false);
            j49.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j49.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j57.isEnabled())
        {
            cur_aircraft = "finished";
            j47.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j57.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j47";
            destroyer_pos[1] = "j57";
            j47.setEnabled(false);
            j57.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j48.isEnabled())
        {
            cur_aircraft = "finished";
            j47.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j48.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j47";
            destroyer_pos[1] = "j48";
            j47.setEnabled(false);
            j48.setEnabled(false);
            j47.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j57Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j77.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j87.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j97.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j57";
            aircraft_pos[1] = "j67";
            aircraft_pos[2] = "j77";
            aircraft_pos[3] = "j87";
            aircraft_pos[4] = "j97";
            j57.setEnabled(false);
            j67.setEnabled(false);
            j77.setEnabled(false);
            j87.setEnabled(false);
            j97.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j87.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j97.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j67.isEnabled() && j77.isEnabled() && j87.isEnabled())
        {
            cur_aircraft = "submarine";
            j57.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j67.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j77.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j87.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j57";
            battleship_pos[1] = "j67";
            battleship_pos[2] = "j77";
            battleship_pos[3] = "j87";
            j57.setEnabled(false);
            j67.setEnabled(false);
            j77.setEnabled(false);
            j87.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j87.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j58.isEnabled() && j59.isEnabled() && j60.isEnabled())
        {
            cur_aircraft = "submarine";
            j57.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j58.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j59.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j60.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j57";
            battleship_pos[1] = "j58";
            battleship_pos[2] = "j59";
            battleship_pos[3] = "j60";
            j57.setEnabled(false);
            j58.setEnabled(false);
            j59.setEnabled(false);
            j60.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j59.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j60.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j67.isEnabled() && j77.isEnabled())
        {
            cur_aircraft = "cruiser";
            j57.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j67.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j77.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j57";
            submarine_pos[1] = "j67";
            submarine_pos[2] = "j77";
            j57.setEnabled(false);
            j67.setEnabled(false);
            j77.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j58.isEnabled() && j59.isEnabled())
        {
            cur_aircraft = "cruiser";
            j57.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j58.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j59.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j57";
            submarine_pos[1] = "j58";
            submarine_pos[2] = "j59";
            j57.setEnabled(false);
            j58.setEnabled(false);
            j59.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j59.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j67.isEnabled() && j77.isEnabled())
        {
            cur_aircraft = "destroyer";
            j57.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j67.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j77.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j57";
            cruiser_pos[1] = "j67";
            cruiser_pos[2] = "j77";
            j57.setEnabled(false);
            j67.setEnabled(false);
            j77.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j77.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j58.isEnabled() && j59.isEnabled())
        {
            cur_aircraft = "destroyer";
            j57.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j58.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j59.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j57";
            cruiser_pos[1] = "j58";
            cruiser_pos[2] = "j59";
            j57.setEnabled(false);
            j58.setEnabled(false);
            j59.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j59.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j67.isEnabled())
        {
            cur_aircraft = "finished";
            j57.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j67.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j57";
            destroyer_pos[1] = "j67";
            j57.setEnabled(false);
            j67.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j58.isEnabled())
        {
            cur_aircraft = "finished";
            j57.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j58.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j57";
            destroyer_pos[1] = "j58";
            j57.setEnabled(false);
            j58.setEnabled(false);
            j57.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j67Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j77.isEnabled() && j87.isEnabled() && j97.isEnabled())
        {
            cur_aircraft = "submarine";
            j67.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j77.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j87.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j97.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j67";
            battleship_pos[1] = "j77";
            battleship_pos[2] = "j87";
            battleship_pos[3] = "j97";
            j67.setEnabled(false);
            j77.setEnabled(false);
            j87.setEnabled(false);
            j97.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j87.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j97.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j68.isEnabled() && j69.isEnabled() && j70.isEnabled())
        {
            cur_aircraft = "submarine";
            j67.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j68.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j69.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j70.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j67";
            battleship_pos[1] = "j68";
            battleship_pos[2] = "j69";
            battleship_pos[3] = "j70";
            j67.setEnabled(false);
            j68.setEnabled(false);
            j69.setEnabled(false);
            j70.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j69.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j70.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j77.isEnabled() && j87.isEnabled())
        {
            cur_aircraft = "cruiser";
            j67.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j77.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j87.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j67";
            submarine_pos[1] = "j77";
            submarine_pos[2] = "j87";
            j67.setEnabled(false);
            j77.setEnabled(false);
            j87.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j87.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j68.isEnabled() && j69.isEnabled())
        {
            cur_aircraft = "cruiser";
            j67.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j68.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j69.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j67";
            submarine_pos[1] = "j68";
            submarine_pos[2] = "j69";
            j67.setEnabled(false);
            j68.setEnabled(false);
            j69.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j69.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j77.isEnabled() && j87.isEnabled())
        {
            cur_aircraft = "destroyer";
            j67.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j77.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j87.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j67";
            cruiser_pos[1] = "j77";
            cruiser_pos[2] = "j87";
            j67.setEnabled(false);
            j77.setEnabled(false);
            j87.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j87.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j68.isEnabled() && j69.isEnabled())
        {
            cur_aircraft = "destroyer";
            j67.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j68.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j69.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j67";
            cruiser_pos[1] = "j68";
            cruiser_pos[2] = "j69";
            j67.setEnabled(false);
            j68.setEnabled(false);
            j69.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j69.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j77.isEnabled())
        {
            cur_aircraft = "finished";
            j67.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j77.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j67";
            destroyer_pos[1] = "j77";
            j67.setEnabled(false);
            j77.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j68.isEnabled())
        {
            cur_aircraft = "finished";
            j67.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j68.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j67";
            destroyer_pos[1] = "j68";
            j67.setEnabled(false);
            j68.setEnabled(false);
            j67.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j77Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j78.isEnabled() && j79.isEnabled() && j80.isEnabled())
        {
            cur_aircraft = "submarine";
            j77.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j78.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j79.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j80.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j77";
            battleship_pos[1] = "j78";
            battleship_pos[2] = "j79";
            battleship_pos[3] = "j80";
            j77.setEnabled(false);
            j78.setEnabled(false);
            j79.setEnabled(false);
            j80.setEnabled(false);
            j77.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j79.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j80.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j87.isEnabled() && j97.isEnabled())
        {
            cur_aircraft = "cruiser";
            j77.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j87.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j97.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j77";
            submarine_pos[1] = "j87";
            submarine_pos[2] = "j97";
            j77.setEnabled(false);
            j87.setEnabled(false);
            j97.setEnabled(false);
            j77.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j97.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j78.isEnabled() && j79.isEnabled())
        {
            cur_aircraft = "cruiser";
            j77.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j78.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j79.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j77";
            submarine_pos[1] = "j78";
            submarine_pos[2] = "j79";
            j77.setEnabled(false);
            j78.setEnabled(false);
            j79.setEnabled(false);
            j77.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j79.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j87.isEnabled() && j97.isEnabled())
        {
            cur_aircraft = "destroyer";
            j77.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j87.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j97.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j77";
            cruiser_pos[1] = "j87";
            cruiser_pos[2] = "j97";
            j77.setEnabled(false);
            j87.setEnabled(false);
            j97.setEnabled(false);
            j77.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j97.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j78.isEnabled() && j79.isEnabled())
        {
            cur_aircraft = "destroyer";
            j77.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j78.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j79.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j77";
            cruiser_pos[1] = "j78";
            cruiser_pos[2] = "j79";
            j77.setEnabled(false);
            j78.setEnabled(false);
            j79.setEnabled(false);
            j77.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j79.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j87.isEnabled())
        {
            cur_aircraft = "finished";
            j77.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j87.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j77";
            destroyer_pos[1] = "j87";
            j77.setEnabled(false);
            j87.setEnabled(false);
            j77.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j78.isEnabled())
        {
            cur_aircraft = "finished";
            j77.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j78.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j77";
            destroyer_pos[1] = "j78";
            j77.setEnabled(false);
            j78.setEnabled(false);
            j77.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j87Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j87.isEnabled() && j88.isEnabled() && j89.isEnabled())
        {
            cur_aircraft = "submarine";
            j87.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j88.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j89.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j90.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j87";
            battleship_pos[1] = "j88";
            battleship_pos[2] = "j89";
            battleship_pos[3] = "j90";
            j87.setEnabled(false);
            j88.setEnabled(false);
            j89.setEnabled(false);
            j90.setEnabled(false);
            j87.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j88.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j89.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j90.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j88.isEnabled() && j89.isEnabled())
        {
            cur_aircraft = "cruiser";
            j87.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j88.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j89.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j87";
            submarine_pos[1] = "j88";
            submarine_pos[2] = "j89";
            j87.setEnabled(false);
            j88.setEnabled(false);
            j89.setEnabled(false);
            j87.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j88.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j89.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j88.isEnabled() && j89.isEnabled())
        {
            cur_aircraft = "destroyer";
            j87.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j88.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j89.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j87";
            cruiser_pos[1] = "j88";
            cruiser_pos[2] = "j89";
            j87.setEnabled(false);
            j88.setEnabled(false);
            j89.setEnabled(false);
            j87.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j88.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j89.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j97.isEnabled())
        {
            cur_aircraft = "finished";
            j87.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j97.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j87";
            destroyer_pos[1] = "j97";
            j87.setEnabled(false);
            j97.setEnabled(false);
            j87.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j97.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j88.isEnabled())
        {
            cur_aircraft = "finished";
            j87.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j88.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j87";
            destroyer_pos[1] = "j88";
            j87.setEnabled(false);
            j88.setEnabled(false);
            j87.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j88.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j97Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j98.isEnabled() && j99.isEnabled() && j100.isEnabled())
        {
            cur_aircraft = "submarine";
            j97.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j98.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j99.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j100.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j97";
            battleship_pos[1] = "j98";
            battleship_pos[2] = "j99";
            battleship_pos[3] = "j100";
            j97.setEnabled(false);
            j98.setEnabled(false);
            j99.setEnabled(false);
            j100.setEnabled(false);
            j97.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j98.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j99.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j100.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j98.isEnabled() && j99.isEnabled())
        {
            cur_aircraft = "cruiser";
            j97.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j98.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j99.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j97";
            submarine_pos[1] = "j98";
            submarine_pos[2] = "j99";
            j97.setEnabled(false);
            j98.setEnabled(false);
            j99.setEnabled(false);
            j97.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j98.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j99.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j98.isEnabled() && j99.isEnabled())
        {
            cur_aircraft = "destroyer";
            j97.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j98.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j99.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j97";
            cruiser_pos[1] = "j98";
            cruiser_pos[2] = "j99";
            j97.setEnabled(false);
            j98.setEnabled(false);
            j99.setEnabled(false);
            j97.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j98.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j99.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j98.isEnabled())
        {
            cur_aircraft = "finished";
            j97.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j98.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j97";
            destroyer_pos[1] = "j98";
            j97.setEnabled(false);
            j98.setEnabled(false);
            j97.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j98.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
