import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_9 extends play_place_8
{
    public void j9Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j9.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j19.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j29.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j39.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j49.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j9";
            aircraft_pos[1] = "j19";
            aircraft_pos[2] = "j29";
            aircraft_pos[3] = "j39";
            aircraft_pos[4] = "j49";
            j9.setEnabled(false);
            j19.setEnabled(false);
            j29.setEnabled(false);
            j39.setEnabled(false);
            j49.setEnabled(false);
            j9.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j29.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j39.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j49.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j19.isEnabled() && j29.isEnabled() && j39.isEnabled())
        {
            cur_aircraft = "submarine";
            j9.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j19.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j29.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j39.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j9";
            battleship_pos[1] = "j19";
            battleship_pos[2] = "j29";
            battleship_pos[3] = "j39";
            j9.setEnabled(false);
            j19.setEnabled(false);
            j29.setEnabled(false);
            j39.setEnabled(false);
            j9.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j29.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j39.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j19.isEnabled() && j29.isEnabled())
        {
            cur_aircraft = "cruiser";
            j9.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j19.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j29.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j9";
            submarine_pos[1] = "j19";
            submarine_pos[2] = "j29";
            j9.setEnabled(false);
            j19.setEnabled(false);
            j29.setEnabled(false);
            j9.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j29.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j19.isEnabled() && j29.isEnabled())
        {
            cur_aircraft = "destroyer";
            j9.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j19.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j29.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j9";
            cruiser_pos[1] = "j19";
            cruiser_pos[2] = "j29";
            j9.setEnabled(false);
            j19.setEnabled(false);
            j29.setEnabled(false);
            j9.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j29.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j19.isEnabled())
        {
            cur_aircraft = "finished";
            j9.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j19.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j9";
            destroyer_pos[1] = "j19";
            j9.setEnabled(false);
            j19.setEnabled(false);
            j9.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j10.isEnabled())
        {
            cur_aircraft = "finished";
            j9.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j10.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j9";
            destroyer_pos[1] = "j10";
            j9.setEnabled(false);
            j10.setEnabled(false);
            j9.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j10.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j19Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j19.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j29.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j39.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j49.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j59.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j19";
            aircraft_pos[1] = "j29";
            aircraft_pos[2] = "j39";
            aircraft_pos[3] = "j49";
            aircraft_pos[4] = "j59";
            j19.setEnabled(false);
            j29.setEnabled(false);
            j39.setEnabled(false);
            j49.setEnabled(false);
            j59.setEnabled(false);
            j19.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j39.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j49.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j59.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j29.isEnabled() && j39.isEnabled() && j49.isEnabled())
        {
            cur_aircraft = "submarine";
            j19.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j29.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j39.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j49.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j19";
            battleship_pos[1] = "j29";
            battleship_pos[2] = "j39";
            battleship_pos[3] = "j49";
            j19.setEnabled(false);
            j29.setEnabled(false);
            j39.setEnabled(false);
            j49.setEnabled(false);
            j19.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j39.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j49.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j29.isEnabled() && j39.isEnabled())
        {
            cur_aircraft = "cruiser";
            j19.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j29.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j39.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j19";
            submarine_pos[1] = "j29";
            submarine_pos[2] = "j39";
            j19.setEnabled(false);
            j29.setEnabled(false);
            j39.setEnabled(false);
            j19.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j39.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j29.isEnabled() && j39.isEnabled())
        {
            cur_aircraft = "destroyer";
            j19.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j29.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j39.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j19";
            cruiser_pos[1] = "j29";
            cruiser_pos[2] = "j39";
            j19.setEnabled(false);
            j29.setEnabled(false);
            j39.setEnabled(false);
            j19.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j39.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j29.isEnabled())
        {
            cur_aircraft = "finished";
            j19.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j29.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j19";
            destroyer_pos[1] = "j29";
            j19.setEnabled(false);
            j29.setEnabled(false);
            j19.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j20.isEnabled())
        {
            cur_aircraft = "finished";
            j19.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j20.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j19";
            destroyer_pos[1] = "j20";
            j19.setEnabled(false);
            j20.setEnabled(false);
            j19.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j20.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j29Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j29.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j39.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j49.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j59.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j69.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j29";
            aircraft_pos[1] = "j39";
            aircraft_pos[2] = "j49";
            aircraft_pos[3] = "j59";
            aircraft_pos[4] = "j69";
            j29.setEnabled(false);
            j39.setEnabled(false);
            j49.setEnabled(false);
            j59.setEnabled(false);
            j69.setEnabled(false);
            j29.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j49.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j59.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j69.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j39.isEnabled() && j49.isEnabled() && j59.isEnabled())
        {
            cur_aircraft = "submarine";
            j29.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j39.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j49.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j59.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j29";
            battleship_pos[1] = "j39";
            battleship_pos[2] = "j49";
            battleship_pos[3] = "j59";
            j29.setEnabled(false);
            j39.setEnabled(false);
            j49.setEnabled(false);
            j59.setEnabled(false);
            j29.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j49.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j59.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j39.isEnabled() && j49.isEnabled())
        {
            cur_aircraft = "cruiser";
            j29.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j39.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j49.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j29";
            submarine_pos[1] = "j39";
            submarine_pos[2] = "j49";
            j29.setEnabled(false);
            j39.setEnabled(false);
            j49.setEnabled(false);
            j29.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j49.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j39.isEnabled() && j49.isEnabled())
        {
            cur_aircraft = "destroyer";
            j29.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j39.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j49.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j29";
            cruiser_pos[1] = "j39";
            cruiser_pos[2] = "j49";
            j29.setEnabled(false);
            j39.setEnabled(false);
            j49.setEnabled(false);
            j29.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j49.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j39.isEnabled())
        {
            cur_aircraft = "finished";
            j29.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j39.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j29";
            destroyer_pos[1] = "j39";
            j29.setEnabled(false);
            j39.setEnabled(false);
            j29.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j29.isEnabled())
        {
            cur_aircraft = "finished";
            j29.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j30.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j29";
            destroyer_pos[1] = "j30";
            j29.setEnabled(false);
            j30.setEnabled(false);
            j29.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j30.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j39Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j39.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j49.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j59.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j69.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j79.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j39";
            aircraft_pos[1] = "j49";
            aircraft_pos[2] = "j59";
            aircraft_pos[3] = "j69";
            aircraft_pos[4] = "j79";
            j39.setEnabled(false);
            j49.setEnabled(false);
            j59.setEnabled(false);
            j69.setEnabled(false);
            j79.setEnabled(false);
            j39.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j59.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j69.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j79.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j49.isEnabled() && j59.isEnabled() && j69.isEnabled())
        {
            cur_aircraft = "submarine";
            j39.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j49.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j59.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j69.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j39";
            battleship_pos[1] = "j49";
            battleship_pos[2] = "j59";
            battleship_pos[3] = "j69";
            j39.setEnabled(false);
            j49.setEnabled(false);
            j59.setEnabled(false);
            j69.setEnabled(false);
            j39.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j59.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j69.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j49.isEnabled() && j59.isEnabled())
        {
            cur_aircraft = "cruiser";
            j39.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j49.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j59.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j39";
            submarine_pos[1] = "j49";
            submarine_pos[2] = "j59";
            j39.setEnabled(false);
            j49.setEnabled(false);
            j59.setEnabled(false);
            j39.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j59.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j49.isEnabled() && j59.isEnabled())
        {
            cur_aircraft = "destroyer";
            j39.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j49.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j59.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j39";
            cruiser_pos[1] = "j49";
            cruiser_pos[2] = "j59";
            j39.setEnabled(false);
            j49.setEnabled(false);
            j59.setEnabled(false);
            j39.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j59.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j49.isEnabled())
        {
            cur_aircraft = "finished";
            j39.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j49.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j39";
            destroyer_pos[1] = "j49";
            j39.setEnabled(false);
            j49.setEnabled(false);
            j39.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j40.isEnabled())
        {
            cur_aircraft = "finished";
            j39.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j40.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j39";
            destroyer_pos[1] = "j40";
            j39.setEnabled(false);
            j40.setEnabled(false);
            j39.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j40.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j49Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j49.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j59.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j69.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j79.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j89.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j49";
            aircraft_pos[1] = "j59";
            aircraft_pos[2] = "j69";
            aircraft_pos[3] = "j79";
            aircraft_pos[4] = "j89";
            j49.setEnabled(false);
            j59.setEnabled(false);
            j69.setEnabled(false);
            j79.setEnabled(false);
            j89.setEnabled(false);
            j49.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j69.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j79.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j89.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j59.isEnabled() && j69.isEnabled() && j79.isEnabled())
        {
            cur_aircraft = "submarine";
            j49.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j59.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j69.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j79.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j49";
            battleship_pos[1] = "j59";
            battleship_pos[2] = "j69";
            battleship_pos[3] = "j79";
            j49.setEnabled(false);
            j59.setEnabled(false);
            j69.setEnabled(false);
            j79.setEnabled(false);
            j49.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j69.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j79.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j59.isEnabled() && j69.isEnabled())
        {
            cur_aircraft = "cruiser";
            j49.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j59.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j69.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j49";
            submarine_pos[1] = "j59";
            submarine_pos[2] = "j69";
            j49.setEnabled(false);
            j59.setEnabled(false);
            j69.setEnabled(false);
            j49.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j69.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j59.isEnabled() && j69.isEnabled())
        {
            cur_aircraft = "destroyer";
            j49.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j59.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j69.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j49";
            cruiser_pos[1] = "j59";
            cruiser_pos[2] = "j69";
            j49.setEnabled(false);
            j59.setEnabled(false);
            j69.setEnabled(false);
            j49.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j69.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j59.isEnabled())
        {
            cur_aircraft = "finished";
            j49.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j59.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j49";
            destroyer_pos[1] = "j59";
            j49.setEnabled(false);
            j59.setEnabled(false);
            j49.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j50.isEnabled())
        {
            cur_aircraft = "finished";
            j49.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j50.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j49";
            destroyer_pos[1] = "j50";
            j49.setEnabled(false);
            j50.setEnabled(false);
            j49.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j50.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j59Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j59.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j69.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j79.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j89.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j99.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j59";
            aircraft_pos[1] = "j69";
            aircraft_pos[2] = "j79";
            aircraft_pos[3] = "j89";
            aircraft_pos[4] = "j99";
            j59.setEnabled(false);
            j69.setEnabled(false);
            j79.setEnabled(false);
            j89.setEnabled(false);
            j99.setEnabled(false);
            j59.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j79.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j89.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j99.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j69.isEnabled() && j79.isEnabled() && j89.isEnabled())
        {
            cur_aircraft = "submarine";
            j59.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j69.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j79.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j89.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j59";
            battleship_pos[1] = "j69";
            battleship_pos[2] = "j79";
            battleship_pos[3] = "j89";
            j59.setEnabled(false);
            j69.setEnabled(false);
            j79.setEnabled(false);
            j89.setEnabled(false);
            j59.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j79.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j89.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j69.isEnabled() && j79.isEnabled())
        {
            cur_aircraft = "cruiser";
            j59.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j69.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j79.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j59";
            submarine_pos[1] = "j69";
            submarine_pos[2] = "j79";
            j59.setEnabled(false);
            j69.setEnabled(false);
            j79.setEnabled(false);
            j59.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j79.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j69.isEnabled() && j79.isEnabled())
        {
            cur_aircraft = "destroyer";
            j59.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j69.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j79.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j59";
            cruiser_pos[1] = "j69";
            cruiser_pos[2] = "j79";
            j59.setEnabled(false);
            j69.setEnabled(false);
            j79.setEnabled(false);
            j59.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j79.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j69.isEnabled())
        {
            cur_aircraft = "finished";
            j59.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j69.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j59";
            destroyer_pos[1] = "j69";
            j59.setEnabled(false);
            j69.setEnabled(false);
            j59.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j60.isEnabled())
        {
            cur_aircraft = "finished";
            j59.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j60.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j59";
            destroyer_pos[1] = "j60";
            j59.setEnabled(false);
            j60.setEnabled(false);
            j59.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j60.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j69Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j79.isEnabled() && j89.isEnabled() && j99.isEnabled())
        {
            cur_aircraft = "submarine";
            j69.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j79.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j89.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j99.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j69";
            battleship_pos[1] = "j79";
            battleship_pos[2] = "j89";
            battleship_pos[3] = "j99";
            j69.setEnabled(false);
            j79.setEnabled(false);
            j89.setEnabled(false);
            j99.setEnabled(false);
            j69.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j79.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j89.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j99.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j79.isEnabled() && j89.isEnabled())
        {
            cur_aircraft = "cruiser";
            j69.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j79.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j89.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j69";
            submarine_pos[1] = "j79";
            submarine_pos[2] = "j89";
            j69.setEnabled(false);
            j79.setEnabled(false);
            j89.setEnabled(false);
            j69.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j79.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j89.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j79.isEnabled() && j89.isEnabled())
        {
            cur_aircraft = "destroyer";
            j69.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j79.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j89.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j69";
            cruiser_pos[1] = "j79";
            cruiser_pos[2] = "j89";
            j69.setEnabled(false);
            j79.setEnabled(false);
            j89.setEnabled(false);
            j69.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j79.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j89.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j79.isEnabled())
        {
            cur_aircraft = "finished";
            j69.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j79.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j69";
            destroyer_pos[1] = "j79";
            j69.setEnabled(false);
            j79.setEnabled(false);
            j69.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j79.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j70.isEnabled())
        {
            cur_aircraft = "finished";
            j69.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j70.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j69";
            destroyer_pos[1] = "j70";
            j69.setEnabled(false);
            j70.setEnabled(false);
            j69.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j70.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j79Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j89.isEnabled() && j99.isEnabled())
        {
            cur_aircraft = "cruiser";
            j79.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j89.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j99.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j79";
            submarine_pos[1] = "j89";
            submarine_pos[2] = "j99";
            j79.setEnabled(false);
            j89.setEnabled(false);
            j99.setEnabled(false);
            j79.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j89.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j99.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j89.isEnabled() && j99.isEnabled())
        {
            cur_aircraft = "destroyer";
            j79.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j89.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j99.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j79";
            cruiser_pos[1] = "j89";
            cruiser_pos[2] = "j99";
            j79.setEnabled(false);
            j89.setEnabled(false);
            j99.setEnabled(false);
            j79.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j89.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j99.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j89.isEnabled())
        {
            cur_aircraft = "finished";
            j79.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j89.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j79";
            destroyer_pos[1] = "j89";
            j79.setEnabled(false);
            j89.setEnabled(false);
            j79.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j89.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j80.isEnabled())
        {
            cur_aircraft = "finished";
            j79.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j80.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j79";
            destroyer_pos[1] = "j80";
            j79.setEnabled(false);
            j80.setEnabled(false);
            j79.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j80.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j89Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j99.isEnabled())
        {
            cur_aircraft = "finished";
            j89.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j99.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j89";
            destroyer_pos[1] = "j99";
            j89.setEnabled(false);
            j99.setEnabled(false);
            j89.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j99.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j90.isEnabled())
        {
            cur_aircraft = "finished";
            j89.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j90.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j89";
            destroyer_pos[1] = "j90";
            j89.setEnabled(false);
            j90.setEnabled(false);
            j89.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j90.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j99Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j100.isEnabled())
        {
            cur_aircraft = "finished";
            j99.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j100.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j99";
            destroyer_pos[1] = "j100";
            j99.setEnabled(false);
            j100.setEnabled(false);
            j99.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j100.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
