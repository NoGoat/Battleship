import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_6 extends play_place_5
{
    public void j6Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j6.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j16.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j6";
            aircraft_pos[1] = "j16";
            aircraft_pos[2] = "j26";
            aircraft_pos[3] = "j36";
            aircraft_pos[4] = "j46";
            j6.setEnabled(false);
            j16.setEnabled(false);
            j26.setEnabled(false);
            j36.setEnabled(false);
            j46.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j6.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j7.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j8.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j9.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j10.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j6";
            aircraft_pos[1] = "j7";
            aircraft_pos[2] = "j8";
            aircraft_pos[3] = "j9";
            aircraft_pos[4] = "j10";
            j6.setEnabled(false);
            j7.setEnabled(false);
            j8.setEnabled(false);
            j9.setEnabled(false);
            j10.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j7.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j8.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j9.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j10.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j16.isEnabled() && j26.isEnabled() && j36.isEnabled())
        {
            cur_aircraft = "submarine";
            j6.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j16.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j26.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j36.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j6";
            battleship_pos[1] = "j16";
            battleship_pos[2] = "j26";
            battleship_pos[3] = "j36";
            j6.setEnabled(false);
            j16.setEnabled(false);
            j26.setEnabled(false);
            j36.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j7.isEnabled() && j8.isEnabled() && j9.isEnabled())
        {
            cur_aircraft = "submarine";
            j6.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j7.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j8.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j9.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j6";
            battleship_pos[1] = "j7";
            battleship_pos[2] = "j8";
            battleship_pos[3] = "j9";
            j6.setEnabled(false);
            j7.setEnabled(false);
            j8.setEnabled(false);
            j9.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j7.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j8.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j9.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j16.isEnabled() && j26.isEnabled())
        {
            cur_aircraft = "cruiser";
            j6.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j16.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j26.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j6";
            submarine_pos[1] = "j16";
            submarine_pos[2] = "j26";
            j6.setEnabled(false);
            j16.setEnabled(false);
            j26.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j7.isEnabled() && j8.isEnabled())
        {
            cur_aircraft = "cruiser";
            j6.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j7.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j8.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j6";
            submarine_pos[1] = "j7";
            submarine_pos[2] = "j8";
            j6.setEnabled(false);
            j7.setEnabled(false);
            j8.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j7.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j8.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j16.isEnabled() && j26.isEnabled())
        {
            cur_aircraft = "destroyer";
            j6.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j16.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j26.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j6";
            cruiser_pos[1] = "j16";
            cruiser_pos[2] = "j26";
            j6.setEnabled(false);
            j16.setEnabled(false);
            j26.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j26.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j7.isEnabled() && j8.isEnabled())
        {
            cur_aircraft = "destroyer";
            j6.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j7.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j8.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j6";
            cruiser_pos[1] = "j7";
            cruiser_pos[2] = "j8";
            j6.setEnabled(false);
            j7.setEnabled(false);
            j8.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j7.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j8.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j16.isEnabled())
        {
            cur_aircraft = "finished";
            j6.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j16.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j6";
            destroyer_pos[1] = "j16";
            j6.setEnabled(false);
            j16.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j16.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j7.isEnabled())
        {
            cur_aircraft = "finished";
            j6.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j7.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j6";
            destroyer_pos[1] = "j7";
            j6.setEnabled(false);
            j7.setEnabled(false);
            j6.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j7.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j16Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j16.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j16";
            aircraft_pos[1] = "j26";
            aircraft_pos[2] = "j36";
            aircraft_pos[3] = "j46";
            aircraft_pos[4] = "j56";
            j16.setEnabled(false);
            j26.setEnabled(false);
            j36.setEnabled(false);
            j46.setEnabled(false);
            j56.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j16.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j17.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j18.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j19.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j20.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j16";
            aircraft_pos[1] = "j17";
            aircraft_pos[2] = "j18";
            aircraft_pos[3] = "j19";
            aircraft_pos[4] = "j20";
            j16.setEnabled(false);
            j17.setEnabled(false);
            j18.setEnabled(false);
            j19.setEnabled(false);
            j20.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j18.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j19.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j20.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j26.isEnabled() && j36.isEnabled() && j46.isEnabled())
        {
            cur_aircraft = "submarine";
            j16.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j26.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j36.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j46.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j16";
            battleship_pos[1] = "j26";
            battleship_pos[2] = "j36";
            battleship_pos[3] = "j46";
            j16.setEnabled(false);
            j26.setEnabled(false);
            j36.setEnabled(false);
            j46.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j17.isEnabled() && j18.isEnabled() && j19.isEnabled())
        {
            cur_aircraft = "submarine";
            j16.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j17.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j18.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j19.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j16";
            battleship_pos[1] = "j17";
            battleship_pos[2] = "j18";
            battleship_pos[3] = "j19";
            j16.setEnabled(false);
            j17.setEnabled(false);
            j18.setEnabled(false);
            j19.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j18.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j19.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j26.isEnabled() && j36.isEnabled())
        {
            cur_aircraft = "cruiser";
            j16.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j26.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j36.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j16";
            submarine_pos[1] = "j26";
            submarine_pos[2] = "j36";
            j16.setEnabled(false);
            j26.setEnabled(false);
            j36.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j17.isEnabled() && j18.isEnabled())
        {
            cur_aircraft = "cruiser";
            j16.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j17.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j18.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j16";
            submarine_pos[1] = "j17";
            submarine_pos[2] = "j18";
            j16.setEnabled(false);
            j17.setEnabled(false);
            j18.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j18.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j26.isEnabled() && j36.isEnabled())
        {
            cur_aircraft = "destroyer";
            j16.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j26.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j36.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j16";
            cruiser_pos[1] = "j26";
            cruiser_pos[2] = "j36";
            j16.setEnabled(false);
            j26.setEnabled(false);
            j36.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j36.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j17.isEnabled() && j18.isEnabled())
        {
            cur_aircraft = "destroyer";
            j16.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j17.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j18.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j16";
            cruiser_pos[1] = "j17";
            cruiser_pos[2] = "j18";
            j16.setEnabled(false);
            j17.setEnabled(false);
            j18.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j18.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j26.isEnabled())
        {
            cur_aircraft = "finished";
            j16.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j26.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j16";
            destroyer_pos[1] = "j26";
            j16.setEnabled(false);
            j26.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j26.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j17.isEnabled())
        {
            cur_aircraft = "finished";
            j16.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j17.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j16";
            destroyer_pos[1] = "j17";
            j16.setEnabled(false);
            j17.setEnabled(false);
            j16.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j17.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j26Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j26";
            aircraft_pos[1] = "j36";
            aircraft_pos[2] = "j46";
            aircraft_pos[3] = "j56";
            aircraft_pos[4] = "j66";
            j26.setEnabled(false);
            j36.setEnabled(false);
            j46.setEnabled(false);
            j56.setEnabled(false);
            j66.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j26.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j27.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j28.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j29.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j30.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j26";
            aircraft_pos[1] = "j27";
            aircraft_pos[2] = "j28";
            aircraft_pos[3] = "j29";
            aircraft_pos[4] = "j30";
            j26.setEnabled(false);
            j27.setEnabled(false);
            j28.setEnabled(false);
            j29.setEnabled(false);
            j30.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j29.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j30.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j36.isEnabled() && j46.isEnabled() && j56.isEnabled())
        {
            cur_aircraft = "submarine";
            j26.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j36.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j46.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j56.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j26";
            battleship_pos[1] = "j36";
            battleship_pos[2] = "j46";
            battleship_pos[3] = "j56";
            j26.setEnabled(false);
            j36.setEnabled(false);
            j46.setEnabled(false);
            j56.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j27.isEnabled() && j28.isEnabled() && j29.isEnabled())
        {
            cur_aircraft = "submarine";
            j26.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j27.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j28.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j29.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j26";
            battleship_pos[1] = "j27";
            battleship_pos[2] = "j28";
            battleship_pos[3] = "j29";
            j26.setEnabled(false);
            j27.setEnabled(false);
            j28.setEnabled(false);
            j29.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j29.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j36.isEnabled() && j46.isEnabled())
        {
            cur_aircraft = "cruiser";
            j26.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j36.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j46.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j26";
            submarine_pos[1] = "j36";
            submarine_pos[2] = "j46";
            j26.setEnabled(false);
            j36.setEnabled(false);
            j46.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j27.isEnabled() && j28.isEnabled())
        {
            cur_aircraft = "cruiser";
            j26.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j27.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j28.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j26";
            submarine_pos[1] = "j27";
            submarine_pos[2] = "j28";
            j26.setEnabled(false);
            j27.setEnabled(false);
            j28.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j36.isEnabled() && j46.isEnabled())
        {
            cur_aircraft = "destroyer";
            j26.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j36.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j46.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j26";
            cruiser_pos[1] = "j36";
            cruiser_pos[2] = "j46";
            j26.setEnabled(false);
            j36.setEnabled(false);
            j46.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j46.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j27.isEnabled() && j28.isEnabled())
        {
            cur_aircraft = "destroyer";
            j26.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j27.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j28.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j26";
            cruiser_pos[1] = "j27";
            cruiser_pos[2] = "j28";
            j26.setEnabled(false);
            j27.setEnabled(false);
            j28.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j28.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j36.isEnabled())
        {
            cur_aircraft = "finished";
            j26.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j36.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j26";
            destroyer_pos[1] = "j36";
            j26.setEnabled(false);
            j36.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j36.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j27.isEnabled())
        {
            cur_aircraft = "finished";
            j26.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j27.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j26";
            destroyer_pos[1] = "j27";
            j26.setEnabled(false);
            j27.setEnabled(false);
            j26.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j27.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j36Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j36";
            aircraft_pos[1] = "j46";
            aircraft_pos[2] = "j56";
            aircraft_pos[3] = "j66";
            aircraft_pos[4] = "j76";
            j36.setEnabled(false);
            j46.setEnabled(false);
            j56.setEnabled(false);
            j66.setEnabled(false);
            j76.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j36.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j37.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j38.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j39.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j40.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j36";
            aircraft_pos[1] = "j37";
            aircraft_pos[2] = "j38";
            aircraft_pos[3] = "j39";
            aircraft_pos[4] = "j40";
            j36.setEnabled(false);
            j37.setEnabled(false);
            j38.setEnabled(false);
            j39.setEnabled(false);
            j40.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j39.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j40.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j46.isEnabled() && j56.isEnabled() && j66.isEnabled())
        {
            cur_aircraft = "submarine";
            j36.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j46.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j56.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j66.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j36";
            battleship_pos[1] = "j46";
            battleship_pos[2] = "j56";
            battleship_pos[3] = "j66";
            j36.setEnabled(false);
            j46.setEnabled(false);
            j56.setEnabled(false);
            j66.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j37.isEnabled() && j38.isEnabled() && j39.isEnabled())
        {
            cur_aircraft = "submarine";
            j36.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j37.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j38.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j39.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j36";
            battleship_pos[1] = "j37";
            battleship_pos[2] = "j38";
            battleship_pos[3] = "j39";
            j36.setEnabled(false);
            j37.setEnabled(false);
            j38.setEnabled(false);
            j39.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j39.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j46.isEnabled() && j56.isEnabled())
        {
            cur_aircraft = "cruiser";
            j36.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j46.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j56.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j36";
            submarine_pos[1] = "j46";
            submarine_pos[2] = "j56";
            j36.setEnabled(false);
            j46.setEnabled(false);
            j56.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j37.isEnabled() && j38.isEnabled())
        {
            cur_aircraft = "cruiser";
            j36.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j37.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j38.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j36";
            submarine_pos[1] = "j37";
            submarine_pos[2] = "j38";
            j36.setEnabled(false);
            j37.setEnabled(false);
            j38.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j46.isEnabled() && j56.isEnabled())
        {
            cur_aircraft = "destroyer";
            j36.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j46.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j56.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j36";
            cruiser_pos[1] = "j46";
            cruiser_pos[2] = "j56";
            j36.setEnabled(false);
            j46.setEnabled(false);
            j56.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j56.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j37.isEnabled() && j38.isEnabled())
        {
            cur_aircraft = "destroyer";
            j36.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j37.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j38.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j36";
            cruiser_pos[1] = "j37";
            cruiser_pos[2] = "j38";
            j36.setEnabled(false);
            j37.setEnabled(false);
            j38.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j38.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j46.isEnabled())
        {
            cur_aircraft = "finished";
            j36.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j46.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j36";
            destroyer_pos[1] = "j46";
            j36.setEnabled(false);
            j46.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j46.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j37.isEnabled())
        {
            cur_aircraft = "finished";
            j36.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j37.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j36";
            destroyer_pos[1] = "j37";
            j36.setEnabled(false);
            j37.setEnabled(false);
            j36.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j37.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j46Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j86.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j46";
            aircraft_pos[1] = "j56";
            aircraft_pos[2] = "j66";
            aircraft_pos[3] = "j76";
            aircraft_pos[4] = "j86";
            j46.setEnabled(false);
            j56.setEnabled(false);
            j66.setEnabled(false);
            j76.setEnabled(false);
            j86.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j86.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j46.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j47.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j48.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j49.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j50.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j46";
            aircraft_pos[1] = "j47";
            aircraft_pos[2] = "j48";
            aircraft_pos[3] = "j49";
            aircraft_pos[4] = "j50";
            j46.setEnabled(false);
            j47.setEnabled(false);
            j48.setEnabled(false);
            j49.setEnabled(false);
            j50.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j49.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j50.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j56.isEnabled() && j66.isEnabled() && j76.isEnabled())
        {
            cur_aircraft = "submarine";
            j46.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j56.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j66.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j76.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j46";
            battleship_pos[1] = "j56";
            battleship_pos[2] = "j66";
            battleship_pos[3] = "j76";
            j46.setEnabled(false);
            j56.setEnabled(false);
            j66.setEnabled(false);
            j76.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j76.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j47.isEnabled() && j48.isEnabled() && j49.isEnabled())
        {
            cur_aircraft = "submarine";
            j46.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j47.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j48.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j49.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j46";
            battleship_pos[1] = "j47";
            battleship_pos[2] = "j48";
            battleship_pos[3] = "j49";
            j46.setEnabled(false);
            j47.setEnabled(false);
            j48.setEnabled(false);
            j49.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j49.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j56.isEnabled() && j66.isEnabled())
        {
            cur_aircraft = "cruiser";
            j46.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j56.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j66.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j46";
            submarine_pos[1] = "j56";
            submarine_pos[2] = "j66";
            j46.setEnabled(false);
            j56.setEnabled(false);
            j66.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j47.isEnabled() && j48.isEnabled())
        {
            cur_aircraft = "cruiser";
            j46.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j47.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j48.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j46";
            submarine_pos[1] = "j47";
            submarine_pos[2] = "j48";
            j46.setEnabled(false);
            j47.setEnabled(false);
            j48.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j56.isEnabled() && j66.isEnabled())
        {
            cur_aircraft = "destroyer";
            j46.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j56.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j66.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j46";
            cruiser_pos[1] = "j56";
            cruiser_pos[2] = "j66";
            j46.setEnabled(false);
            j56.setEnabled(false);
            j66.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j66.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j47.isEnabled() && j48.isEnabled())
        {
            cur_aircraft = "destroyer";
            j46.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j47.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j48.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j46";
            cruiser_pos[1] = "j47";
            cruiser_pos[2] = "j48";
            j46.setEnabled(false);
            j47.setEnabled(false);
            j48.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j48.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j56.isEnabled())
        {
            cur_aircraft = "finished";
            j46.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j56.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j46";
            destroyer_pos[1] = "j56";
            j46.setEnabled(false);
            j56.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j56.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j47.isEnabled())
        {
            cur_aircraft = "finished";
            j46.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j47.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j46";
            destroyer_pos[1] = "j47";
            j46.setEnabled(false);
            j47.setEnabled(false);
            j46.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j47.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j56Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j86.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j96.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j56";
            aircraft_pos[1] = "j66";
            aircraft_pos[2] = "j76";
            aircraft_pos[3] = "j86";
            aircraft_pos[4] = "j96";
            j56.setEnabled(false);
            j66.setEnabled(false);
            j76.setEnabled(false);
            j86.setEnabled(false);
            j96.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j86.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j96.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j56.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j57.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j58.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j59.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j60.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j56";
            aircraft_pos[1] = "j57";
            aircraft_pos[2] = "j58";
            aircraft_pos[3] = "j59";
            aircraft_pos[4] = "j60";
            j56.setEnabled(false);
            j57.setEnabled(false);
            j58.setEnabled(false);
            j59.setEnabled(false);
            j60.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j59.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j60.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j66.isEnabled() && j76.isEnabled() && j86.isEnabled())
        {
            cur_aircraft = "submarine";
            j56.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j66.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j76.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j86.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j56";
            battleship_pos[1] = "j66";
            battleship_pos[2] = "j76";
            battleship_pos[3] = "j86";
            j56.setEnabled(false);
            j66.setEnabled(false);
            j76.setEnabled(false);
            j86.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j86.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j57.isEnabled() && j58.isEnabled() && j59.isEnabled())
        {
            cur_aircraft = "submarine";
            j56.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j57.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j58.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j59.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j56";
            battleship_pos[1] = "j57";
            battleship_pos[2] = "j58";
            battleship_pos[3] = "j59";
            j56.setEnabled(false);
            j57.setEnabled(false);
            j58.setEnabled(false);
            j59.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j59.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j66.isEnabled() && j76.isEnabled())
        {
            cur_aircraft = "cruiser";
            j56.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j66.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j76.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j56";
            submarine_pos[1] = "j66";
            submarine_pos[2] = "j76";
            j56.setEnabled(false);
            j66.setEnabled(false);
            j76.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j57.isEnabled() && j58.isEnabled())
        {
            cur_aircraft = "cruiser";
            j56.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j57.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j58.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j56";
            submarine_pos[1] = "j57";
            submarine_pos[2] = "j58";
            j56.setEnabled(false);
            j57.setEnabled(false);
            j58.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j66.isEnabled() && j76.isEnabled())
        {
            cur_aircraft = "destroyer";
            j56.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j66.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j76.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j56";
            cruiser_pos[1] = "j66";
            cruiser_pos[2] = "j76";
            j56.setEnabled(false);
            j66.setEnabled(false);
            j76.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j76.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j57.isEnabled() && j58.isEnabled())
        {
            cur_aircraft = "destroyer";
            j56.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j57.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j58.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j56";
            cruiser_pos[1] = "j57";
            cruiser_pos[2] = "j58";
            j56.setEnabled(false);
            j57.setEnabled(false);
            j58.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j58.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j66.isEnabled())
        {
            cur_aircraft = "finished";
            j56.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j66.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j56";
            destroyer_pos[1] = "j66";
            j56.setEnabled(false);
            j66.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j66.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j57.isEnabled())
        {
            cur_aircraft = "finished";
            j56.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j57.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j56";
            destroyer_pos[1] = "j57";
            j56.setEnabled(false);
            j57.setEnabled(false);
            j56.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j57.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j66Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j66.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j67.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j68.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j69.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j70.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j66";
            aircraft_pos[1] = "j67";
            aircraft_pos[2] = "j68";
            aircraft_pos[3] = "j69";
            aircraft_pos[4] = "j70";
            j66.setEnabled(false);
            j67.setEnabled(false);
            j68.setEnabled(false);
            j69.setEnabled(false);
            j70.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j69.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j70.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j76.isEnabled() && j86.isEnabled() && j96.isEnabled())
        {
            cur_aircraft = "submarine";
            j66.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j76.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j86.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j96.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j66";
            battleship_pos[1] = "j76";
            battleship_pos[2] = "j86";
            battleship_pos[3] = "j96";
            j66.setEnabled(false);
            j76.setEnabled(false);
            j86.setEnabled(false);
            j96.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j86.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j96.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j67.isEnabled() && j68.isEnabled() && j69.isEnabled())
        {
            cur_aircraft = "submarine";
            j66.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j67.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j68.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j69.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j66";
            battleship_pos[1] = "j67";
            battleship_pos[2] = "j68";
            battleship_pos[3] = "j69";
            j66.setEnabled(false);
            j67.setEnabled(false);
            j68.setEnabled(false);
            j69.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j69.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j76.isEnabled() && j86.isEnabled())
        {
            cur_aircraft = "cruiser";
            j66.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j76.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j86.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j66";
            submarine_pos[1] = "j76";
            submarine_pos[2] = "j86";
            j66.setEnabled(false);
            j76.setEnabled(false);
            j86.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j86.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j67.isEnabled() && j68.isEnabled())
        {
            cur_aircraft = "cruiser";
            j66.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j67.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j68.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j66";
            submarine_pos[1] = "j67";
            submarine_pos[2] = "j68";
            j66.setEnabled(false);
            j67.setEnabled(false);
            j68.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j76.isEnabled() && j86.isEnabled())
        {
            cur_aircraft = "destroyer";
            j66.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j76.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j86.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j66";
            cruiser_pos[1] = "j76";
            cruiser_pos[2] = "j86";
            j66.setEnabled(false);
            j76.setEnabled(false);
            j86.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j86.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j67.isEnabled() && j68.isEnabled())
        {
            cur_aircraft = "destroyer";
            j66.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j67.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j68.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j66";
            cruiser_pos[1] = "j67";
            cruiser_pos[2] = "j68";
            j66.setEnabled(false);
            j67.setEnabled(false);
            j68.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j68.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j76.isEnabled())
        {
            cur_aircraft = "finished";
            j66.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j76.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j66";
            destroyer_pos[1] = "j76";
            j66.setEnabled(false);
            j76.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j76.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j67.isEnabled())
        {
            cur_aircraft = "finished";
            j66.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j67.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j66";
            destroyer_pos[1] = "j67";
            j66.setEnabled(false);
            j67.setEnabled(false);
            j66.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j67.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j76Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j76.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j77.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j78.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j79.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j80.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j76";
            aircraft_pos[1] = "j77";
            aircraft_pos[2] = "j78";
            aircraft_pos[3] = "j79";
            aircraft_pos[4] = "j80";
            j76.setEnabled(false);
            j77.setEnabled(false);
            j78.setEnabled(false);
            j79.setEnabled(false);
            j80.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j79.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j80.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j77.isEnabled() && j78.isEnabled() && j79.isEnabled())
        {
            cur_aircraft = "submarine";
            j76.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j77.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j78.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j79.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j76";
            battleship_pos[1] = "j77";
            battleship_pos[2] = "j78";
            battleship_pos[3] = "j79";
            j76.setEnabled(false);
            j77.setEnabled(false);
            j78.setEnabled(false);
            j79.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j79.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j86.isEnabled() && j96.isEnabled())
        {
            cur_aircraft = "cruiser";
            j76.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j86.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j96.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j76";
            submarine_pos[1] = "j86";
            submarine_pos[2] = "j96";
            j76.setEnabled(false);
            j86.setEnabled(false);
            j96.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j96.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j77.isEnabled() && j78.isEnabled())
        {
            cur_aircraft = "cruiser";
            j76.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j77.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j78.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j76";
            submarine_pos[1] = "j77";
            submarine_pos[2] = "j78";
            j76.setEnabled(false);
            j77.setEnabled(false);
            j78.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j86.isEnabled() && j96.isEnabled())
        {
            cur_aircraft = "destroyer";
            j76.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j86.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j96.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j76";
            cruiser_pos[1] = "j86";
            cruiser_pos[2] = "j96";
            j76.setEnabled(false);
            j86.setEnabled(false);
            j96.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j96.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j77.isEnabled() && j78.isEnabled())
        {
            cur_aircraft = "destroyer";
            j76.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j77.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j78.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j76";
            cruiser_pos[1] = "j77";
            cruiser_pos[2] = "j78";
            j76.setEnabled(false);
            j77.setEnabled(false);
            j78.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j78.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j86.isEnabled())
        {
            cur_aircraft = "finished";
            j76.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j86.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j76";
            destroyer_pos[1] = "j86";
            j76.setEnabled(false);
            j86.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j86.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j77.isEnabled())
        {
            cur_aircraft = "finished";
            j76.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j77.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j76";
            destroyer_pos[1] = "j77";
            j76.setEnabled(false);
            j77.setEnabled(false);
            j76.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j77.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j86Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j86.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j87.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j88.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j89.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j90.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j86";
            aircraft_pos[1] = "j87";
            aircraft_pos[2] = "j88";
            aircraft_pos[3] = "j89";
            aircraft_pos[4] = "j90";
            j86.setEnabled(false);
            j87.setEnabled(false);
            j88.setEnabled(false);
            j89.setEnabled(false);
            j90.setEnabled(false);
            j86.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j88.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j89.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j90.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j87.isEnabled() && j88.isEnabled() && j89.isEnabled())
        {
            cur_aircraft = "submarine";
            j86.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j87.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j88.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j89.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j86";
            battleship_pos[1] = "j87";
            battleship_pos[2] = "j88";
            battleship_pos[3] = "j89";
            j86.setEnabled(false);
            j87.setEnabled(false);
            j88.setEnabled(false);
            j89.setEnabled(false);
            j86.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j88.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j89.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j87.isEnabled() && j88.isEnabled())
        {
            cur_aircraft = "cruiser";
            j86.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j87.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j88.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j86";
            submarine_pos[1] = "j87";
            submarine_pos[2] = "j88";
            j86.setEnabled(false);
            j87.setEnabled(false);
            j88.setEnabled(false);
            j86.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j88.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j87.isEnabled() && j88.isEnabled())
        {
            cur_aircraft = "destroyer";
            j86.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j87.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j88.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j86";
            cruiser_pos[1] = "j87";
            cruiser_pos[2] = "j88";
            j86.setEnabled(false);
            j87.setEnabled(false);
            j88.setEnabled(false);
            j86.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j88.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j96.isEnabled())
        {
            cur_aircraft = "finished";
            j86.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j96.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j86";
            destroyer_pos[1] = "j96";
            j86.setEnabled(false);
            j96.setEnabled(false);
            j86.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j96.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j87.isEnabled())
        {
            cur_aircraft = "finished";
            j86.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j87.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j86";
            destroyer_pos[1] = "j87";
            j86.setEnabled(false);
            j87.setEnabled(false);
            j86.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j87.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j96Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j96.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j97.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j98.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j99.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j100.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j96";
            aircraft_pos[1] = "j97";
            aircraft_pos[2] = "j98";
            aircraft_pos[3] = "j99";
            aircraft_pos[4] = "j100";
            j96.setEnabled(false);
            j97.setEnabled(false);
            j98.setEnabled(false);
            j99.setEnabled(false);
            j100.setEnabled(false);
            j96.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j97.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j98.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j99.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j100.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j97.isEnabled() && j98.isEnabled() && j99.isEnabled())
        {
            cur_aircraft = "submarine";
            j96.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j97.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j98.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j99.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j96";
            battleship_pos[1] = "j97";
            battleship_pos[2] = "j98";
            battleship_pos[3] = "j99";
            j96.setEnabled(false);
            j97.setEnabled(false);
            j98.setEnabled(false);
            j99.setEnabled(false);
            j96.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j97.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j98.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j99.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j97.isEnabled() && j98.isEnabled())
        {
            cur_aircraft = "cruiser";
            j96.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j97.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j98.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j96";
            submarine_pos[1] = "j97";
            submarine_pos[2] = "j98";
            j96.setEnabled(false);
            j97.setEnabled(false);
            j98.setEnabled(false);
            j96.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j97.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j98.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j97.isEnabled() && j98.isEnabled())
        {
            cur_aircraft = "destroyer";
            j96.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j97.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j98.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j96";
            cruiser_pos[1] = "j97";
            cruiser_pos[2] = "j98";
            j96.setEnabled(false);
            j97.setEnabled(false);
            j98.setEnabled(false);
            j96.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j97.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j98.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j97.isEnabled())
        {
            cur_aircraft = "finished";
            j96.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j97.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j96";
            destroyer_pos[1] = "j97";
            j96.setEnabled(false);
            j97.setEnabled(false);
            j96.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j97.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
