import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_10 extends play_place_9
{
    public void j10Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j10.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j20.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j30.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j40.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j50.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j10";
            aircraft_pos[1] = "j20";
            aircraft_pos[2] = "j30";
            aircraft_pos[3] = "j40";
            aircraft_pos[4] = "j50";
            j10.setEnabled(false);
            j20.setEnabled(false);
            j30.setEnabled(false);
            j40.setEnabled(false);
            j50.setEnabled(false);
            j10.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j20.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j30.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j40.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j50.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j20.isEnabled() && j30.isEnabled() && j40.isEnabled())
        {
            cur_aircraft = "submarine";
            j10.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j20.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j30.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j40.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j10";
            battleship_pos[1] = "j20";
            battleship_pos[2] = "j30";
            battleship_pos[3] = "j40";
            j10.setEnabled(false);
            j20.setEnabled(false);
            j30.setEnabled(false);
            j40.setEnabled(false);
            j10.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j20.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j30.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j40.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j20.isEnabled() && j30.isEnabled())
        {
            cur_aircraft = "cruiser";
            j10.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j20.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j30.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j10";
            submarine_pos[1] = "j20";
            submarine_pos[2] = "j30";
            j10.setEnabled(false);
            j20.setEnabled(false);
            j30.setEnabled(false);
            j10.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j20.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j30.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j20.isEnabled() && j30.isEnabled())
        {
            cur_aircraft = "destroyer";
            j10.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j20.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j30.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j10";
            cruiser_pos[1] = "j20";
            cruiser_pos[2] = "j30";
            j10.setEnabled(false);
            j20.setEnabled(false);
            j30.setEnabled(false);
            j10.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j20.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j30.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j20.isEnabled())
        {
            cur_aircraft = "finished";
            j10.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j20.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j10";
            destroyer_pos[1] = "j20";
            j10.setEnabled(false);
            j20.setEnabled(false);
            j10.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j20.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j20Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j20.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j30.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j40.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j50.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j60.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j20";
            aircraft_pos[1] = "j30";
            aircraft_pos[2] = "j40";
            aircraft_pos[3] = "j50";
            aircraft_pos[4] = "j60";
            j20.setEnabled(false);
            j30.setEnabled(false);
            j40.setEnabled(false);
            j50.setEnabled(false);
            j60.setEnabled(false);
            j20.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j30.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j40.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j50.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j60.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j30.isEnabled() && j40.isEnabled() && j50.isEnabled())
        {
            cur_aircraft = "submarine";
            j20.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j30.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j40.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j50.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j20";
            battleship_pos[1] = "j30";
            battleship_pos[2] = "j40";
            battleship_pos[3] = "j50";
            j20.setEnabled(false);
            j30.setEnabled(false);
            j40.setEnabled(false);
            j50.setEnabled(false);
            j20.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j30.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j40.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j50.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j30.isEnabled() && j40.isEnabled())
        {
            cur_aircraft = "cruiser";
            j20.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j30.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j40.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j20";
            submarine_pos[1] = "j30";
            submarine_pos[2] = "j40";
            j20.setEnabled(false);
            j30.setEnabled(false);
            j40.setEnabled(false);
            j20.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j30.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j40.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j30.isEnabled() && j40.isEnabled())
        {
            cur_aircraft = "destroyer";
            j20.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j30.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j40.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j20";
            cruiser_pos[1] = "j30";
            cruiser_pos[2] = "j40";
            j20.setEnabled(false);
            j30.setEnabled(false);
            j40.setEnabled(false);
            j20.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j30.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j40.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j30.isEnabled())
        {
            cur_aircraft = "finished";
            j20.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j30.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j20";
            destroyer_pos[1] = "j30";
            j20.setEnabled(false);
            j30.setEnabled(false);
            j20.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j30.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j30Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j30.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j40.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j50.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j60.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j70.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j30";
            aircraft_pos[1] = "j40";
            aircraft_pos[2] = "j50";
            aircraft_pos[3] = "j60";
            aircraft_pos[4] = "j70";
            j30.setEnabled(false);
            j40.setEnabled(false);
            j50.setEnabled(false);
            j60.setEnabled(false);
            j70.setEnabled(false);
            j30.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j40.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j50.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j60.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j70.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j40.isEnabled() && j50.isEnabled() && j60.isEnabled())
        {
            cur_aircraft = "submarine";
            j30.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j40.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j50.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j60.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j30";
            battleship_pos[1] = "j40";
            battleship_pos[2] = "j50";
            battleship_pos[3] = "j60";
            j30.setEnabled(false);
            j40.setEnabled(false);
            j50.setEnabled(false);
            j60.setEnabled(false);
            j30.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j40.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j50.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j60.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j60.isEnabled() && j50.isEnabled())
        {
            cur_aircraft = "cruiser";
            j30.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j40.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j50.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j30";
            submarine_pos[1] = "j40";
            submarine_pos[2] = "j50";
            j30.setEnabled(false);
            j40.setEnabled(false);
            j50.setEnabled(false);
            j30.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j40.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j50.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j40.isEnabled() && j50.isEnabled())
        {
            cur_aircraft = "destroyer";
            j30.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j40.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j50.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j30";
            cruiser_pos[1] = "j40";
            cruiser_pos[2] = "j50";
            j30.setEnabled(false);
            j40.setEnabled(false);
            j50.setEnabled(false);
            j30.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j40.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j50.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j40.isEnabled())
        {
            cur_aircraft = "finished";
            j30.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j40.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j30";
            destroyer_pos[1] = "j40";
            j30.setEnabled(false);
            j40.setEnabled(false);
            j30.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j40.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j40Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j40.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j50.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j60.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j70.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j80.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j40";
            aircraft_pos[1] = "j50";
            aircraft_pos[2] = "j60";
            aircraft_pos[3] = "j70";
            aircraft_pos[4] = "j80";
            j40.setEnabled(false);
            j50.setEnabled(false);
            j60.setEnabled(false);
            j70.setEnabled(false);
            j80.setEnabled(false);
            j40.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j50.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j60.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j70.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j80.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j50.isEnabled() && j60.isEnabled() && j70.isEnabled())
        {
            cur_aircraft = "submarine";
            j40.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j50.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j60.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j70.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j40";
            battleship_pos[1] = "j50";
            battleship_pos[2] = "j60";
            battleship_pos[3] = "j70";
            j40.setEnabled(false);
            j50.setEnabled(false);
            j60.setEnabled(false);
            j70.setEnabled(false);
            j40.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j50.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j60.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j70.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j50.isEnabled() && j60.isEnabled())
        {
            cur_aircraft = "cruiser";
            j40.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j50.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j60.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j40";
            submarine_pos[1] = "j50";
            submarine_pos[2] = "j60";
            j40.setEnabled(false);
            j50.setEnabled(false);
            j60.setEnabled(false);
            j40.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j50.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j60.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j50.isEnabled() && j60.isEnabled())
        {
            cur_aircraft = "destroyer";
            j40.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j50.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j60.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j40";
            cruiser_pos[1] = "j50";
            cruiser_pos[2] = "j60";
            j40.setEnabled(false);
            j50.setEnabled(false);
            j60.setEnabled(false);
            j40.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j50.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j60.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j50.isEnabled())
        {
            cur_aircraft = "finished";
            j40.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j50.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j40";
            destroyer_pos[1] = "j50";
            j40.setEnabled(false);
            j50.setEnabled(false);
            j40.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j50.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j50Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j50.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j60.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j70.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j80.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j90.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j50";
            aircraft_pos[1] = "j60";
            aircraft_pos[2] = "j70";
            aircraft_pos[3] = "j80";
            aircraft_pos[4] = "j90";
            j50.setEnabled(false);
            j60.setEnabled(false);
            j70.setEnabled(false);
            j80.setEnabled(false);
            j90.setEnabled(false);
            j50.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j60.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j70.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j80.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j90.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j60.isEnabled() && j70.isEnabled() && j80.isEnabled())
        {
            cur_aircraft = "submarine";
            j50.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j60.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j70.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j80.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j50";
            battleship_pos[1] = "j60";
            battleship_pos[2] = "j70";
            battleship_pos[3] = "j80";
            j50.setEnabled(false);
            j60.setEnabled(false);
            j70.setEnabled(false);
            j80.setEnabled(false);
            j50.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j60.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j70.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j80.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j60.isEnabled() && j70.isEnabled())
        {
            cur_aircraft = "cruiser";
            j50.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j60.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j70.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j50";
            submarine_pos[1] = "j60";
            submarine_pos[2] = "j70";
            j50.setEnabled(false);
            j60.setEnabled(false);
            j70.setEnabled(false);
            j50.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j60.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j70.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j59.isEnabled() && j69.isEnabled())
        {
            cur_aircraft = "destroyer";
            j50.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j60.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j70.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j50";
            cruiser_pos[1] = "j60";
            cruiser_pos[2] = "j70";
            j50.setEnabled(false);
            j60.setEnabled(false);
            j70.setEnabled(false);
            j50.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j60.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j70.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j60.isEnabled())
        {
            cur_aircraft = "finished";
            j50.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j60.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j50";
            destroyer_pos[1] = "j60";
            j50.setEnabled(false);
            j60.setEnabled(false);
            j50.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j60.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j60Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j60.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j70.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j80.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j90.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j100.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j60";
            aircraft_pos[1] = "j70";
            aircraft_pos[2] = "j80";
            aircraft_pos[3] = "j90";
            aircraft_pos[4] = "j100";
            j60.setEnabled(false);
            j70.setEnabled(false);
            j80.setEnabled(false);
            j90.setEnabled(false);
            j100.setEnabled(false);
            j60.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j70.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j80.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j90.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j100.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j70.isEnabled() && j80.isEnabled() && j90.isEnabled())
        {
            cur_aircraft = "submarine";
            j60.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j70.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j80.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j90.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j60";
            battleship_pos[1] = "j70";
            battleship_pos[2] = "j80";
            battleship_pos[3] = "j90";
            j60.setEnabled(false);
            j70.setEnabled(false);
            j80.setEnabled(false);
            j90.setEnabled(false);
            j60.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j70.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j80.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j90.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j70.isEnabled() && j80.isEnabled())
        {
            cur_aircraft = "cruiser";
            j60.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j70.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j80.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j60";
            submarine_pos[1] = "j70";
            submarine_pos[2] = "j80";
            j60.setEnabled(false);
            j70.setEnabled(false);
            j80.setEnabled(false);
            j60.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j70.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j80.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j70.isEnabled() && j80.isEnabled())
        {
            cur_aircraft = "destroyer";
            j60.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j70.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j80.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j60";
            cruiser_pos[1] = "j70";
            cruiser_pos[2] = "j80";
            j60.setEnabled(false);
            j70.setEnabled(false);
            j80.setEnabled(false);
            j60.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j70.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j80.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j70.isEnabled())
        {
            cur_aircraft = "finished";
            j60.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j70.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j60";
            destroyer_pos[1] = "j70";
            j60.setEnabled(false);
            j70.setEnabled(false);
            j60.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j70.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j70Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j80.isEnabled() && j90.isEnabled() && j100.isEnabled())
        {
            cur_aircraft = "submarine";
            j70.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j80.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j90.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j100.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j70";
            battleship_pos[1] = "j80";
            battleship_pos[2] = "j90";
            battleship_pos[3] = "j100";
            j70.setEnabled(false);
            j80.setEnabled(false);
            j90.setEnabled(false);
            j100.setEnabled(false);
            j70.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j80.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j90.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j100.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j80.isEnabled() && j90.isEnabled())
        {
            cur_aircraft = "cruiser";
            j70.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j80.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j90.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j70";
            submarine_pos[1] = "j80";
            submarine_pos[2] = "j90";
            j70.setEnabled(false);
            j80.setEnabled(false);
            j90.setEnabled(false);
            j70.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j80.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j90.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j80.isEnabled() && j90.isEnabled())
        {
            cur_aircraft = "destroyer";
            j70.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j80.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j90.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j70";
            cruiser_pos[1] = "j80";
            cruiser_pos[2] = "j90";
            j70.setEnabled(false);
            j80.setEnabled(false);
            j90.setEnabled(false);
            j70.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j80.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j90.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j80.isEnabled())
        {
            cur_aircraft = "finished";
            j70.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j80.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j70";
            destroyer_pos[1] = "j80";
            j70.setEnabled(false);
            j80.setEnabled(false);
            j70.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j80.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j80Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j90.isEnabled() && j100.isEnabled())
        {
            cur_aircraft = "cruiser";
            j80.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j90.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j100.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j80";
            submarine_pos[1] = "j90";
            submarine_pos[2] = "j100";
            j80.setEnabled(false);
            j90.setEnabled(false);
            j100.setEnabled(false);
            j80.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j90.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j100.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j90.isEnabled() && j100.isEnabled())
        {
            cur_aircraft = "destroyer";
            j80.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j90.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j100.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j80";
            cruiser_pos[1] = "j90";
            cruiser_pos[2] = "j100";
            j80.setEnabled(false);
            j90.setEnabled(false);
            j100.setEnabled(false);
            j80.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j90.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j100.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j90.isEnabled())
        {
            cur_aircraft = "finished";
            j80.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j90.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j80";
            destroyer_pos[1] = "j90";
            j80.setEnabled(false);
            j90.setEnabled(false);
            j80.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j90.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
    public void j90Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j100.isEnabled())
        {
            cur_aircraft = "finished";
            j90.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j100.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j90";
            destroyer_pos[1] = "j100";
            j90.setEnabled(false);
            j100.setEnabled(false);
            j90.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j100.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
