import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_8 extends play_place_7
{
    public void j8Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j8.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j18.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j28.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j38.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j8";
            aircraft_pos[1] = "j18";
            aircraft_pos[2] = "j28";
            aircraft_pos[3] = "j38";
            aircraft_pos[4] = "j48";
            j8.setEnabled(false);
            j18.setEnabled(false);
            j28.setEnabled(false);
            j38.setEnabled(false);
            j48.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j38.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j18.isEnabled() && j28.isEnabled() && j38.isEnabled())
        {
            cur_aircraft = "submarine";
            j8.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j18.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j28.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j38.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j8";
            battleship_pos[1] = "j18";
            battleship_pos[2] = "j28";
            battleship_pos[3] = "j38";
            j8.setEnabled(false);
            j18.setEnabled(false);
            j28.setEnabled(false);
            j38.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j38.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j18.isEnabled() && j28.isEnabled())
        {
            cur_aircraft = "cruiser";
            j8.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j18.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j28.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j8";
            submarine_pos[1] = "j18";
            submarine_pos[2] = "j28";
            j8.setEnabled(false);
            j18.setEnabled(false);
            j28.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j9.isEnabled() && j10.isEnabled())
        {
            cur_aircraft = "cruiser";
            j8.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j9.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j10.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j8";
            submarine_pos[1] = "j9";
            submarine_pos[2] = "j10";
            j8.setEnabled(false);
            j9.setEnabled(false);
            j10.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j9.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j10.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j18.isEnabled() && j28.isEnabled())
        {
            cur_aircraft = "destroyer";
            j8.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j18.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j28.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j8";
            cruiser_pos[1] = "j18";
            cruiser_pos[2] = "j28";
            j8.setEnabled(false);
            j18.setEnabled(false);
            j28.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j9.isEnabled() && j10.isEnabled())
        {
            cur_aircraft = "destroyer";
            j8.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j9.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j10.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j8";
            cruiser_pos[1] = "j9";
            cruiser_pos[2] = "j10";
            j8.setEnabled(false);
            j9.setEnabled(false);
            j10.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j9.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j10.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j18.isEnabled())
        {
            cur_aircraft = "finished";
            j8.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j18.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j8";
            destroyer_pos[1] = "j18";
            j8.setEnabled(false);
            j18.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j18.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j9.isEnabled())
        {
            cur_aircraft = "finished";
            j8.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j9.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j8";
            destroyer_pos[1] = "j9";
            j8.setEnabled(false);
            j9.setEnabled(false);
            j8.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j9.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j18Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j18.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j28.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j38.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j18";
            aircraft_pos[1] = "j28";
            aircraft_pos[2] = "j38";
            aircraft_pos[3] = "j48";
            aircraft_pos[4] = "j58";
            j18.setEnabled(false);
            j28.setEnabled(false);
            j38.setEnabled(false);
            j48.setEnabled(false);
            j58.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j28.isEnabled() && j38.isEnabled() && j48.isEnabled())
        {
            cur_aircraft = "submarine";
            j18.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j28.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j38.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j48.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j18";
            battleship_pos[1] = "j28";
            battleship_pos[2] = "j38";
            battleship_pos[3] = "j48";
            j18.setEnabled(false);
            j28.setEnabled(false);
            j38.setEnabled(false);
            j48.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j48.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j28.isEnabled() && j38.isEnabled())
        {
            cur_aircraft = "cruiser";
            j18.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j28.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j38.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j18";
            submarine_pos[1] = "j28";
            submarine_pos[2] = "j38";
            j18.setEnabled(false);
            j28.setEnabled(false);
            j38.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j19.isEnabled() && j20.isEnabled())
        {
            cur_aircraft = "cruiser";
            j18.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j19.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j20.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j18";
            submarine_pos[1] = "j19";
            submarine_pos[2] = "j20";
            j18.setEnabled(false);
            j19.setEnabled(false);
            j20.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j20.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j28.isEnabled() && j38.isEnabled())
        {
            cur_aircraft = "destroyer";
            j18.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j28.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j38.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j18";
            cruiser_pos[1] = "j28";
            cruiser_pos[2] = "j38";
            j18.setEnabled(false);
            j28.setEnabled(false);
            j38.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j19.isEnabled() && j20.isEnabled())
        {
            cur_aircraft = "destroyer";
            j18.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j19.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j20.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j18";
            cruiser_pos[1] = "j19";
            cruiser_pos[2] = "j20";
            j18.setEnabled(false);
            j19.setEnabled(false);
            j20.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j20.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j28.isEnabled())
        {
            cur_aircraft = "finished";
            j18.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j28.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j18";
            destroyer_pos[1] = "j28";
            j18.setEnabled(false);
            j28.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j28.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j19.isEnabled())
        {
            cur_aircraft = "finished";
            j18.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j19.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j18";
            destroyer_pos[1] = "j19";
            j18.setEnabled(false);
            j19.setEnabled(false);
            j18.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j19.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j28Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j28.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j38.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j68.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j28";
            aircraft_pos[1] = "j38";
            aircraft_pos[2] = "j48";
            aircraft_pos[3] = "j58";
            aircraft_pos[4] = "j68";
            j28.setEnabled(false);
            j38.setEnabled(false);
            j48.setEnabled(false);
            j58.setEnabled(false);
            j68.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j68.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j38.isEnabled() && j48.isEnabled() && j58.isEnabled())
        {
            cur_aircraft = "submarine";
            j28.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j38.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j48.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j58.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j28";
            battleship_pos[1] = "j38";
            battleship_pos[2] = "j48";
            battleship_pos[3] = "j58";
            j28.setEnabled(false);
            j38.setEnabled(false);
            j48.setEnabled(false);
            j58.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j58.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j38.isEnabled() && j48.isEnabled())
        {
            cur_aircraft = "cruiser";
            j28.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j38.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j48.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j28";
            submarine_pos[1] = "j38";
            submarine_pos[2] = "j48";
            j28.setEnabled(false);
            j38.setEnabled(false);
            j48.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j30.isEnabled() && j30.isEnabled())
        {
            cur_aircraft = "cruiser";
            j28.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j29.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j30.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j28";
            submarine_pos[1] = "j29";
            submarine_pos[2] = "j30";
            j28.setEnabled(false);
            j29.setEnabled(false);
            j30.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j30.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j38.isEnabled() && j48.isEnabled())
        {
            cur_aircraft = "destroyer";
            j28.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j38.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j48.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j28";
            cruiser_pos[1] = "j38";
            cruiser_pos[2] = "j48";
            j28.setEnabled(false);
            j38.setEnabled(false);
            j48.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j29.isEnabled() && j30.isEnabled())
        {
            cur_aircraft = "destroyer";
            j28.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j29.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j30.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j28";
            cruiser_pos[1] = "j29";
            cruiser_pos[2] = "j30";
            j28.setEnabled(false);
            j29.setEnabled(false);
            j30.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j30.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j38.isEnabled())
        {
            cur_aircraft = "finished";
            j28.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j38.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j28";
            destroyer_pos[1] = "j38";
            j28.setEnabled(false);
            j38.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j38.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
            j28.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j29.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j28";
            destroyer_pos[1] = "j29";
            j28.setEnabled(false);
            j29.setEnabled(false);
            j28.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j29.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j38Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j38.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j68.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j78.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j38";
            aircraft_pos[1] = "j48";
            aircraft_pos[2] = "j58";
            aircraft_pos[3] = "j68";
            aircraft_pos[4] = "j78";
            j38.setEnabled(false);
            j48.setEnabled(false);
            j58.setEnabled(false);
            j68.setEnabled(false);
            j78.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j68.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j78.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j48.isEnabled() && j58.isEnabled() && j68.isEnabled())
        {
            cur_aircraft = "submarine";
            j38.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j48.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j58.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j68.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j38";
            battleship_pos[1] = "j48";
            battleship_pos[2] = "j58";
            battleship_pos[3] = "j68";
            j38.setEnabled(false);
            j48.setEnabled(false);
            j58.setEnabled(false);
            j68.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j68.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j48.isEnabled() && j58.isEnabled())
        {
            cur_aircraft = "cruiser";
            j38.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j48.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j58.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j38";
            submarine_pos[1] = "j48";
            submarine_pos[2] = "j58";
            j38.setEnabled(false);
            j48.setEnabled(false);
            j58.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j39.isEnabled() && j40.isEnabled())
        {
            cur_aircraft = "cruiser";
            j38.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j39.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j40.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j38";
            submarine_pos[1] = "j39";
            submarine_pos[2] = "j40";
            j38.setEnabled(false);
            j39.setEnabled(false);
            j40.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j40.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j48.isEnabled() && j58.isEnabled())
        {
            cur_aircraft = "destroyer";
            j38.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j48.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j58.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j38";
            cruiser_pos[1] = "j48";
            cruiser_pos[2] = "j58";
            j38.setEnabled(false);
            j48.setEnabled(false);
            j58.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j39.isEnabled() && j40.isEnabled())
        {
            cur_aircraft = "destroyer";
            j38.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j39.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j40.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j38";
            cruiser_pos[1] = "j39";
            cruiser_pos[2] = "j40";
            j38.setEnabled(false);
            j39.setEnabled(false);
            j40.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j40.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j48.isEnabled())
        {
            cur_aircraft = "finished";
            j38.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j48.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j38";
            destroyer_pos[1] = "j48";
            j38.setEnabled(false);
            j48.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j48.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j39.isEnabled())
        {
            cur_aircraft = "finished";
            j38.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j39.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j38";
            destroyer_pos[1] = "j39";
            j38.setEnabled(false);
            j39.setEnabled(false);
            j38.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j39.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j48Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j68.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j78.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j88.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j48";
            aircraft_pos[1] = "j58";
            aircraft_pos[2] = "j68";
            aircraft_pos[3] = "j78";
            aircraft_pos[4] = "j88";
            j48.setEnabled(false);
            j58.setEnabled(false);
            j68.setEnabled(false);
            j78.setEnabled(false);
            j88.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j78.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j88.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j58.isEnabled() && j68.isEnabled() && j78.isEnabled())
        {
            cur_aircraft = "submarine";
            j48.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j58.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j68.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j78.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j48";
            battleship_pos[1] = "j58";
            battleship_pos[2] = "j68";
            battleship_pos[3] = "j78";
            j48.setEnabled(false);
            j58.setEnabled(false);
            j68.setEnabled(false);
            j78.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j78.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j58.isEnabled() && j68.isEnabled())
        {
            cur_aircraft = "cruiser";
            j48.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j58.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j68.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j48";
            submarine_pos[1] = "j58";
            submarine_pos[2] = "j68";
            j48.setEnabled(false);
            j58.setEnabled(false);
            j68.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j49.isEnabled() && j50.isEnabled())
        {
            cur_aircraft = "cruiser";
            j48.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j49.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j50.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j48";
            submarine_pos[1] = "j49";
            submarine_pos[2] = "j50";
            j48.setEnabled(false);
            j49.setEnabled(false);
            j50.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j50.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j58.isEnabled() && j68.isEnabled())
        {
            cur_aircraft = "destroyer";
            j48.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j58.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j68.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j48";
            cruiser_pos[1] = "j58";
            cruiser_pos[2] = "j68";
            j48.setEnabled(false);
            j58.setEnabled(false);
            j68.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j49.isEnabled() && j50.isEnabled())
        {
            cur_aircraft = "destroyer";
            j48.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j49.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j50.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j48";
            cruiser_pos[1] = "j49";
            cruiser_pos[2] = "j50";
            j48.setEnabled(false);
            j49.setEnabled(false);
            j50.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j50.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j58.isEnabled())
        {
            cur_aircraft = "finished";
            j48.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j58.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j48";
            destroyer_pos[1] = "j58";
            j48.setEnabled(false);
            j58.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j58.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j49.isEnabled())
        {
            cur_aircraft = "finished";
            j48.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j49.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j48";
            destroyer_pos[1] = "j49";
            j48.setEnabled(false);
            j49.setEnabled(false);
            j48.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j49.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j58Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j68.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j78.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j88.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j98.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j58";
            aircraft_pos[1] = "j68";
            aircraft_pos[2] = "j78";
            aircraft_pos[3] = "j88";
            aircraft_pos[4] = "j98";
            j58.setEnabled(false);
            j68.setEnabled(false);
            j78.setEnabled(false);
            j88.setEnabled(false);
            j98.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j88.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j98.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j68.isEnabled() && j78.isEnabled() && j88.isEnabled())
        {
            cur_aircraft = "submarine";
            j58.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j68.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j78.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j88.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j58";
            battleship_pos[1] = "j68";
            battleship_pos[2] = "j78";
            battleship_pos[3] = "j88";
            j58.setEnabled(false);
            j68.setEnabled(false);
            j78.setEnabled(false);
            j88.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j88.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j68.isEnabled() && j78.isEnabled())
        {
            cur_aircraft = "cruiser";
            j58.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j68.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j78.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j58";
            submarine_pos[1] = "j68";
            submarine_pos[2] = "j78";
            j58.setEnabled(false);
            j68.setEnabled(false);
            j78.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j59.isEnabled() && j60.isEnabled())
        {
            cur_aircraft = "cruiser";
            j58.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j59.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j60.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j58";
            submarine_pos[1] = "j59";
            submarine_pos[2] = "j60";
            j58.setEnabled(false);
            j59.setEnabled(false);
            j60.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j60.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j68.isEnabled() && j78.isEnabled())
        {
            cur_aircraft = "destroyer";
            j58.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j68.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j78.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j58";
            cruiser_pos[1] = "j68";
            cruiser_pos[2] = "j78";
            j58.setEnabled(false);
            j68.setEnabled(false);
            j78.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j59.isEnabled() && j60.isEnabled())
        {
            cur_aircraft = "destroyer";
            j58.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j59.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j60.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j58";
            cruiser_pos[1] = "j59";
            cruiser_pos[2] = "j60";
            j58.setEnabled(false);
            j59.setEnabled(false);
            j60.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j60.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j68.isEnabled())
        {
            cur_aircraft = "finished";
            j58.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j68.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j58";
            destroyer_pos[1] = "j68";
            j58.setEnabled(false);
            j68.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j68.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j59.isEnabled())
        {
            cur_aircraft = "finished";
            j58.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j59.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j58";
            destroyer_pos[1] = "j59";
            j58.setEnabled(false);
            j59.setEnabled(false);
            j58.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j59.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j68Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j78.isEnabled() && j88.isEnabled() && j98.isEnabled())
        {
            cur_aircraft = "submarine";
            j68.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j78.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j88.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j98.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j68";
            battleship_pos[1] = "j78";
            battleship_pos[2] = "j88";
            battleship_pos[3] = "j98";
            j68.setEnabled(false);
            j78.setEnabled(false);
            j88.setEnabled(false);
            j98.setEnabled(false);
            j68.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j88.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j98.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j78.isEnabled() && j88.isEnabled())
        {
            cur_aircraft = "cruiser";
            j68.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j78.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j88.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j68";
            submarine_pos[1] = "j78";
            submarine_pos[2] = "j88";
            j68.setEnabled(false);
            j78.setEnabled(false);
            j88.setEnabled(false);
            j68.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j88.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j67.isEnabled() && j70.isEnabled())
        {
            cur_aircraft = "cruiser";
            j68.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j69.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j70.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j68";
            submarine_pos[1] = "j69";
            submarine_pos[2] = "j70";
            j68.setEnabled(false);
            j69.setEnabled(false);
            j70.setEnabled(false);
            j68.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j70.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j78.isEnabled() && j88.isEnabled())
        {
            cur_aircraft = "destroyer";
            j68.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j78.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j88.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j68";
            cruiser_pos[1] = "j78";
            cruiser_pos[2] = "j88";
            j68.setEnabled(false);
            j78.setEnabled(false);
            j88.setEnabled(false);
            j68.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j88.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j69.isEnabled() && j70.isEnabled())
        {
            cur_aircraft = "destroyer";
            j68.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j69.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j70.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j68";
            cruiser_pos[1] = "j69";
            cruiser_pos[2] = "j70";
            j68.setEnabled(false);
            j69.setEnabled(false);
            j70.setEnabled(false);
            j68.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j70.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j78.isEnabled())
        {
            cur_aircraft = "finished";
            j68.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j78.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j68";
            destroyer_pos[1] = "j78";
            j68.setEnabled(false);
            j78.setEnabled(false);
            j68.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j78.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j69.isEnabled())
        {
            cur_aircraft = "finished";
            j68.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j69.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j68";
            destroyer_pos[1] = "j69";
            j68.setEnabled(false);
            j69.setEnabled(false);
            j68.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j69.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j78Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j88.isEnabled() && j98.isEnabled())
        {
            cur_aircraft = "cruiser";
            j78.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j88.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j98.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j78";
            submarine_pos[1] = "j88";
            submarine_pos[2] = "j98";
            j78.setEnabled(false);
            j88.setEnabled(false);
            j98.setEnabled(false);
            j78.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j88.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j98.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j79.isEnabled() && j80.isEnabled())
        {
            cur_aircraft = "cruiser";
            j78.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j79.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j80.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j78";
            submarine_pos[1] = "j79";
            submarine_pos[2] = "j80";
            j78.setEnabled(false);
            j79.setEnabled(false);
            j80.setEnabled(false);
            j78.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j79.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j80.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j88.isEnabled() && j98.isEnabled())
        {
            cur_aircraft = "destroyer";
            j78.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j88.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j98.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j78";
            cruiser_pos[1] = "j88";
            cruiser_pos[2] = "j98";
            j78.setEnabled(false);
            j88.setEnabled(false);
            j98.setEnabled(false);
            j78.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j88.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j98.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j79.isEnabled() && j80.isEnabled())
        {
            cur_aircraft = "destroyer";
            j78.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j79.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j80.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j78";
            cruiser_pos[1] = "j79";
            cruiser_pos[2] = "j80";
            j78.setEnabled(false);
            j79.setEnabled(false);
            j80.setEnabled(false);
            j78.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j79.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j80.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j88.isEnabled())
        {
            cur_aircraft = "finished";
            j78.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j88.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j78";
            destroyer_pos[1] = "j88";
            j78.setEnabled(false);
            j88.setEnabled(false);
            j78.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j88.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j79.isEnabled())
        {
            cur_aircraft = "finished";
            j78.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j79.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j78";
            destroyer_pos[1] = "j79";
            j78.setEnabled(false);
            j79.setEnabled(false);
            j78.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j79.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j88Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j89.isEnabled() && j90.isEnabled())
        {
            cur_aircraft = "cruiser";
            j88.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j89.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j90.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j88";
            submarine_pos[1] = "j89";
            submarine_pos[2] = "j90";
            j88.setEnabled(false);
            j89.setEnabled(false);
            j90.setEnabled(false);
            j88.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j89.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j90.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j89.isEnabled() && j90.isEnabled())
        {
            cur_aircraft = "destroyer";
            j88.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j89.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j90.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j88";
            cruiser_pos[1] = "j89";
            cruiser_pos[2] = "j90";
            j88.setEnabled(false);
            j89.setEnabled(false);
            j90.setEnabled(false);
            j88.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j89.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j90.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j98.isEnabled())
        {
            cur_aircraft = "finished";
            j88.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j98.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j88";
            destroyer_pos[1] = "j98";
            j88.setEnabled(false);
            j98.setEnabled(false);
            j88.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j98.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j89.isEnabled())
        {
            cur_aircraft = "finished";
            j88.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j89.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j88";
            destroyer_pos[1] = "j89";
            j88.setEnabled(false);
            j89.setEnabled(false);
            j88.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j89.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j98Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j99.isEnabled() && j100.isEnabled())
        {
            cur_aircraft = "cruiser";
            j98.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j99.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j100.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j98";
            submarine_pos[1] = "j99";
            submarine_pos[2] = "j100";
            j98.setEnabled(false);
            j99.setEnabled(false);
            j100.setEnabled(false);
            j98.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j99.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j100.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j99.isEnabled() && j100.isEnabled())
        {
            cur_aircraft = "destroyer";
            j98.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j99.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j100.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j98";
            cruiser_pos[1] = "j99";
            cruiser_pos[2] = "j100";
            j98.setEnabled(false);
            j99.setEnabled(false);
            j100.setEnabled(false);
            j98.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j99.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j100.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j99.isEnabled())
        {
            cur_aircraft = "finished";
            j98.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j99.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j98";
            destroyer_pos[1] = "j99";
            j98.setEnabled(false);
            j99.setEnabled(false);
            j98.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j99.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
