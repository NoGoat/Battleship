import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class play_place_1 extends play_part_4
{
    public void j1Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j1.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j11.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j1";
            aircraft_pos[1] = "j11";
            aircraft_pos[2] = "j21";
            aircraft_pos[3] = "j31";
            aircraft_pos[4] = "j41";
            j1.setEnabled(false);
            j11.setEnabled(false);
            j21.setEnabled(false);
            j31.setEnabled(false);
            j41.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j11.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j1.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j2.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j3.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j4.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j5.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            aircraft_pos[0] = "j1";
            aircraft_pos[1] = "j2";
            aircraft_pos[2] = "j3";
            aircraft_pos[3] = "j4";
            aircraft_pos[4] = "j5";
            j1.setEnabled(false);
            j2.setEnabled(false);
            j3.setEnabled(false);
            j4.setEnabled(false);
            j5.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j2.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j3.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j4.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j5.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j11.isEnabled() && j21.isEnabled() && j31.isEnabled())
        {
            cur_aircraft = "submarine";
            j1.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j11.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j21.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j31.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j1";
            battleship_pos[1] = "j11";
            battleship_pos[2] = "j21";
            battleship_pos[3] = "j31";
            j1.setEnabled(false);
            j11.setEnabled(false);
            j21.setEnabled(false);
            j31.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j11.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j21.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j2.isEnabled() && j3.isEnabled() && j4.isEnabled())
        {
            cur_aircraft = "submarine";
            j1.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j2.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j3.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j4.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j1";
            battleship_pos[1] = "j2";
            battleship_pos[2] = "j3";
            battleship_pos[3] = "j4";
            j1.setEnabled(false);
            j2.setEnabled(false);
            j3.setEnabled(false);
            j4.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j2.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j3.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j4.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j11.isEnabled() && j21.isEnabled())
        {
            cur_aircraft = "cruiser";
            j1.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j11.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j21.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j1";
            submarine_pos[1] = "j11";
            submarine_pos[2] = "j21";
            j1.setEnabled(false);
            j11.setEnabled(false);
            j21.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j11.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j21.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j2.isEnabled() && j3.isEnabled())
        {
            cur_aircraft = "cruiser";
            j1.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j2.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j3.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j1";
            submarine_pos[1] = "j2";
            submarine_pos[2] = "j3";
            j1.setEnabled(false);
            j2.setEnabled(false);
            j3.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j2.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j3.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j11.isEnabled() && j21.isEnabled())
        {
            cur_aircraft = "destroyer";
            j1.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j11.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j21.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j1";
            cruiser_pos[1] = "j11";
            cruiser_pos[2] = "j21";
            j1.setEnabled(false);
            j11.setEnabled(false);
            j21.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j11.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j2.isEnabled() && j3.isEnabled())
        {
            cur_aircraft = "destroyer";
            j1.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j2.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j3.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j1";
            cruiser_pos[1] = "j2";
            cruiser_pos[2] = "j3";
            j1.setEnabled(false);
            j2.setEnabled(false);
            j3.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j2.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j3.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j11.isEnabled())
        {
            cur_aircraft = "finished";
            j1.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j11.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j1";
            destroyer_pos[1] = "j11";
            j1.setEnabled(false);
            j11.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j11.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j2.isEnabled())
        {
            cur_aircraft = "finished";
            j1.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j2.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j1";
            destroyer_pos[1] = "j2";
            j1.setEnabled(false);
            j2.setEnabled(false);
            j1.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j2.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j11Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j11.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j11";
            aircraft_pos[1] = "j21";
            aircraft_pos[2] = "j31";
            aircraft_pos[3] = "j41";
            aircraft_pos[4] = "j51";
            j11.setEnabled(false);
            j21.setEnabled(false);
            j31.setEnabled(false);
            j41.setEnabled(false);
            j51.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j11.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j12.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j13.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j14.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j15.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j11";
            aircraft_pos[1] = "j12";
            aircraft_pos[2] = "j13";
            aircraft_pos[3] = "j14";
            aircraft_pos[4] = "j15";
            j11.setEnabled(false);
            j12.setEnabled(false);
            j13.setEnabled(false);
            j14.setEnabled(false);
            j15.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j13.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j14.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j15.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j21.isEnabled() && j31.isEnabled() && j41.isEnabled())
        {
            cur_aircraft = "submarine";
            j11.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j21.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j31.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j41.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j11";
            battleship_pos[1] = "j21";
            battleship_pos[2] = "j31";
            battleship_pos[3] = "j41";
            j11.setEnabled(false);
            j21.setEnabled(false);
            j31.setEnabled(false);
            j41.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j21.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j12.isEnabled() && j13.isEnabled() && j14.isEnabled())
        {
            cur_aircraft = "submarine";
            j11.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j12.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j13.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j14.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j11";
            battleship_pos[1] = "j12";
            battleship_pos[2] = "j13";
            battleship_pos[3] = "j14";
            j11.setEnabled(false);
            j12.setEnabled(false);
            j13.setEnabled(false);
            j14.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j13.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j14.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j21.isEnabled() && j31.isEnabled())
        {
            cur_aircraft = "cruiser";
            j11.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j21.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j31.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j11";
            submarine_pos[1] = "j21";
            submarine_pos[2] = "j31";
            j11.setEnabled(false);
            j21.setEnabled(false);
            j31.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j21.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j31.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j12.isEnabled() && j13.isEnabled())
        {
            cur_aircraft = "cruiser";
            j11.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j12.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j13.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j11";
            submarine_pos[1] = "j12";
            submarine_pos[2] = "j13";
            j11.setEnabled(false);
            j12.setEnabled(false);
            j13.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j13.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j21.isEnabled() && j31.isEnabled())
        {
            cur_aircraft = "destroyer";
            j11.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j21.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j31.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j11";
            cruiser_pos[1] = "j21";
            cruiser_pos[2] = "j31";
            j11.setEnabled(false);
            j21.setEnabled(false);
            j31.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j12.isEnabled() && j13.isEnabled())
        {
            cur_aircraft = "destroyer";
            j11.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j12.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j13.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j11";
            cruiser_pos[1] = "j12";
            cruiser_pos[2] = "j13";
            j11.setEnabled(false);
            j12.setEnabled(false);
            j13.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j13.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j21.isEnabled())
        {
            cur_aircraft = "finished";
            j11.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j21.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j11";
            destroyer_pos[1] = "j21";
            j11.setEnabled(false);
            j21.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j21.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j12.isEnabled())
        {
            cur_aircraft = "finished";
            j11.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j12.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j11";
            destroyer_pos[1] = "j12";
            j11.setEnabled(false);
            j12.setEnabled(false);
            j11.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j12.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j21Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j21";
            aircraft_pos[1] = "j31";
            aircraft_pos[2] = "j41";
            aircraft_pos[3] = "j51";
            aircraft_pos[4] = "j61";
            j21.setEnabled(false);
            j31.setEnabled(false);
            j41.setEnabled(false);
            j51.setEnabled(false);
            j61.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j21.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j22.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j23.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j24.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j25.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j21";
            aircraft_pos[1] = "j22";
            aircraft_pos[2] = "j23";
            aircraft_pos[3] = "j24";
            aircraft_pos[4] = "j25";
            j21.setEnabled(false);
            j22.setEnabled(false);
            j23.setEnabled(false);
            j24.setEnabled(false);
            j25.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j24.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j25.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j31.isEnabled() && j41.isEnabled() && j51.isEnabled())
        {
            cur_aircraft = "submarine";
            j21.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j31.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j41.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j51.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j21";
            battleship_pos[1] = "j31";
            battleship_pos[2] = "j41";
            battleship_pos[3] = "j51";
            j21.setEnabled(false);
            j31.setEnabled(false);
            j41.setEnabled(false);
            j51.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j22.isEnabled() && j23.isEnabled() && j24.isEnabled())
        {
            cur_aircraft = "submarine";
            j21.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j22.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j23.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j24.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j21";
            battleship_pos[1] = "j22";
            battleship_pos[2] = "j23";
            battleship_pos[3] = "j24";
            j21.setEnabled(false);
            j22.setEnabled(false);
            j23.setEnabled(false);
            j24.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j24.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j31.isEnabled() && j41.isEnabled())
        {
            cur_aircraft = "cruiser";
            j21.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j31.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j41.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j21";
            submarine_pos[1] = "j31";
            submarine_pos[2] = "j41";
            j21.setEnabled(false);
            j31.setEnabled(false);
            j41.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j31.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j41.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j22.isEnabled() && j23.isEnabled())
        {
            cur_aircraft = "cruiser";
            j21.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j22.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j23.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j21";
            submarine_pos[1] = "j22";
            submarine_pos[2] = "j23";
            j21.setEnabled(false);
            j22.setEnabled(false);
            j23.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j31.isEnabled() && j41.isEnabled())
        {
            cur_aircraft = "destroyer";
            j21.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j31.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j41.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j21";
            cruiser_pos[1] = "j31";
            cruiser_pos[2] = "j41";
            j21.setEnabled(false);
            j31.setEnabled(false);
            j41.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j22.isEnabled() && j23.isEnabled())
        {
            cur_aircraft = "destroyer";
            j21.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j22.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j23.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j21";
            cruiser_pos[1] = "j22";
            cruiser_pos[2] = "j23";
            j21.setEnabled(false);
            j22.setEnabled(false);
            j23.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j23.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j31.isEnabled())
        {
            cur_aircraft = "finished";
            j21.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j31.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j21";
            destroyer_pos[1] = "j31";
            j21.setEnabled(false);
            j31.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j31.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j22.isEnabled())
        {
            cur_aircraft = "finished";
            j21.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j22.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j21";
            destroyer_pos[1] = "j22";
            j21.setEnabled(false);
            j22.setEnabled(false);
            j21.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j22.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j31Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j31";
            aircraft_pos[1] = "j41";
            aircraft_pos[2] = "j51";
            aircraft_pos[3] = "j61";
            aircraft_pos[4] = "j71";
            j31.setEnabled(false);
            j41.setEnabled(false);
            j51.setEnabled(false);
            j61.setEnabled(false);
            j71.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j31.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j32.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j33.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j34.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j35.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j31";
            aircraft_pos[1] = "j32";
            aircraft_pos[2] = "j33";
            aircraft_pos[3] = "j34";
            aircraft_pos[4] = "j35";
            j31.setEnabled(false);
            j32.setEnabled(false);
            j33.setEnabled(false);
            j34.setEnabled(false);
            j35.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j34.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j35.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j41.isEnabled() && j51.isEnabled() && j61.isEnabled())
        {
            cur_aircraft = "submarine";
            j31.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j41.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j51.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j61.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j31";
            battleship_pos[1] = "j41";
            battleship_pos[2] = "j51";
            battleship_pos[3] = "j61";
            j31.setEnabled(false);
            j41.setEnabled(false);
            j51.setEnabled(false);
            j61.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j32.isEnabled() && j33.isEnabled() && j34.isEnabled())
        {
            cur_aircraft = "submarine";
            j31.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j32.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j33.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j34.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j31";
            battleship_pos[1] = "j32";
            battleship_pos[2] = "j33";
            battleship_pos[3] = "j34";
            j31.setEnabled(false);
            j32.setEnabled(false);
            j33.setEnabled(false);
            j34.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j34.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j41.isEnabled() && j51.isEnabled())
        {
            cur_aircraft = "cruiser";
            j31.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j41.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j51.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j31";
            submarine_pos[1] = "j41";
            submarine_pos[2] = "j51";
            j31.setEnabled(false);
            j41.setEnabled(false);
            j51.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j41.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j51.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j32.isEnabled() && j33.isEnabled())
        {
            cur_aircraft = "cruiser";
            j31.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j32.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j33.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j31";
            submarine_pos[1] = "j32";
            submarine_pos[2] = "j33";
            j31.setEnabled(false);
            j32.setEnabled(false);
            j33.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j41.isEnabled() && j51.isEnabled())
        {
            cur_aircraft = "destroyer";
            j31.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j41.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j51.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j31";
            cruiser_pos[1] = "j41";
            cruiser_pos[2] = "j51";
            j31.setEnabled(false);
            j41.setEnabled(false);
            j51.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j32.isEnabled() && j33.isEnabled())
        {
            cur_aircraft = "destroyer";
            j31.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j32.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j33.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j31";
            cruiser_pos[1] = "j32";
            cruiser_pos[2] = "j33";
            j31.setEnabled(false);
            j32.setEnabled(false);
            j33.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j33.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j41.isEnabled())
        {
            cur_aircraft = "finished";
            j31.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j41.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j31";
            destroyer_pos[1] = "j41";
            j31.setEnabled(false);
            j41.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j41.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
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
            j31.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j32.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j31";
            destroyer_pos[1] = "j32";
            j31.setEnabled(false);
            j32.setEnabled(false);
            j31.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j32.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j41Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j81.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j41";
            aircraft_pos[1] = "j51";
            aircraft_pos[2] = "j61";
            aircraft_pos[3] = "j71";
            aircraft_pos[4] = "j81";
            j41.setEnabled(false);
            j51.setEnabled(false);
            j61.setEnabled(false);
            j71.setEnabled(false);
            j81.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j81.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j41.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j42.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j43.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j44.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j45.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j41";
            aircraft_pos[1] = "j42";
            aircraft_pos[2] = "j43";
            aircraft_pos[3] = "j44";
            aircraft_pos[4] = "j45";
            j41.setEnabled(false);
            j42.setEnabled(false);
            j43.setEnabled(false);
            j44.setEnabled(false);
            j45.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j44.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j45.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j51.isEnabled() && j61.isEnabled() && j71.isEnabled())
        {
            cur_aircraft = "submarine";
            j41.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j51.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j61.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j71.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j41";
            battleship_pos[1] = "j51";
            battleship_pos[2] = "j61";
            battleship_pos[3] = "j71";
            j41.setEnabled(false);
            j51.setEnabled(false);
            j61.setEnabled(false);
            j71.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j71.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j42.isEnabled() && j43.isEnabled() && j44.isEnabled())
        {
            cur_aircraft = "submarine";
            j41.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j42.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j43.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j44.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j41";
            battleship_pos[1] = "j42";
            battleship_pos[2] = "j43";
            battleship_pos[3] = "j44";
            j41.setEnabled(false);
            j42.setEnabled(false);
            j43.setEnabled(false);
            j44.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j44.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j51.isEnabled() && j61.isEnabled())
        {
            cur_aircraft = "cruiser";
            j41.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j51.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j61.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j41";
            submarine_pos[1] = "j51";
            submarine_pos[2] = "j61";
            j41.setEnabled(false);
            j51.setEnabled(false);
            j61.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j51.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j61.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j42.isEnabled() && j43.isEnabled())
        {
            cur_aircraft = "cruiser";
            j41.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j42.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j43.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j41";
            submarine_pos[1] = "j42";
            submarine_pos[2] = "j43";
            j41.setEnabled(false);
            j42.setEnabled(false);
            j43.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j51.isEnabled() && j61.isEnabled())
        {
            cur_aircraft = "destroyer";
            j41.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j51.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j61.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j41";
            cruiser_pos[1] = "j51";
            cruiser_pos[2] = "j61";
            j41.setEnabled(false);
            j51.setEnabled(false);
            j61.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j42.isEnabled() && j43.isEnabled())
        {
            cur_aircraft = "destroyer";
            j41.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j42.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j43.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j41";
            cruiser_pos[1] = "j42";
            cruiser_pos[2] = "j43";
            j41.setEnabled(false);
            j42.setEnabled(false);
            j43.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j43.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j51.isEnabled())
        {
            cur_aircraft = "finished";
            j41.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j51.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j41";
            destroyer_pos[1] = "j51";
            j41.setEnabled(false);
            j51.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j51.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j42.isEnabled())
        {
            cur_aircraft = "finished";
            j41.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j42.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j41";
            destroyer_pos[1] = "j42";
            j41.setEnabled(false);
            j42.setEnabled(false);
            j41.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j42.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j51Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 0 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j81.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j91.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));
            aircraft_pos[0] = "j51";
            aircraft_pos[1] = "j61";
            aircraft_pos[2] = "j71";
            aircraft_pos[3] = "j81";
            aircraft_pos[4] = "j91";
            j51.setEnabled(false);
            j61.setEnabled(false);
            j71.setEnabled(false);
            j81.setEnabled(false);
            j91.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-1.png"));
            j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-2.png"));
            j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-3.png"));
            j81.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-4.png"));
            j91.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-5.png"));

            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j51.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j52.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j53.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j54.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j55.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j51";
            aircraft_pos[1] = "j52";
            aircraft_pos[2] = "j53";
            aircraft_pos[3] = "j54";
            aircraft_pos[4] = "j55";
            j51.setEnabled(false);
            j52.setEnabled(false);
            j53.setEnabled(false);
            j54.setEnabled(false);
            j55.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j54.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j55.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j61.isEnabled() && j71.isEnabled() && j81.isEnabled())
        {
            cur_aircraft = "submarine";
            j51.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j61.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j71.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j81.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j51";
            battleship_pos[1] = "j61";
            battleship_pos[2] = "j71";
            battleship_pos[3] = "j81";
            j51.setEnabled(false);
            j61.setEnabled(false);
            j71.setEnabled(false);
            j81.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j71.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j81.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j52.isEnabled() && j53.isEnabled() && j54.isEnabled())
        {
            cur_aircraft = "submarine";
            j51.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j52.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j53.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j54.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j51";
            battleship_pos[1] = "j52";
            battleship_pos[2] = "j53";
            battleship_pos[3] = "j54";
            j51.setEnabled(false);
            j52.setEnabled(false);
            j53.setEnabled(false);
            j54.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j54.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j61.isEnabled() && j71.isEnabled())
        {
            cur_aircraft = "cruiser";
            j51.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j61.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j71.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j51";
            submarine_pos[1] = "j61";
            submarine_pos[2] = "j71";
            j51.setEnabled(false);
            j61.setEnabled(false);
            j71.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j61.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j71.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j52.isEnabled() && j53.isEnabled())
        {
            cur_aircraft = "cruiser";
            j51.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j52.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j53.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j51";
            submarine_pos[1] = "j52";
            submarine_pos[2] = "j53";
            j51.setEnabled(false);
            j52.setEnabled(false);
            j53.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j61.isEnabled() && j71.isEnabled())
        {
            cur_aircraft = "destroyer";
            j51.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j61.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j71.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j51";
            cruiser_pos[1] = "j61";
            cruiser_pos[2] = "j71";
            j51.setEnabled(false);
            j61.setEnabled(false);
            j71.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j52.isEnabled() && j53.isEnabled())
        {
            cur_aircraft = "destroyer";
            j51.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j52.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j53.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j51";
            cruiser_pos[1] = "j52";
            cruiser_pos[2] = "j53";
            j51.setEnabled(false);
            j52.setEnabled(false);
            j53.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j53.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j61.isEnabled())
        {
            cur_aircraft = "finished";
            j51.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j61.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j51";
            destroyer_pos[1] = "j61";
            j51.setEnabled(false);
            j61.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j61.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j52.isEnabled())
        {
            cur_aircraft = "finished";
            j51.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j52.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j51";
            destroyer_pos[1] = "j52";
            j51.setEnabled(false);
            j52.setEnabled(false);
            j51.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j52.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j61Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j61.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j62.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j63.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j64.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j65.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j61";
            aircraft_pos[1] = "j62";
            aircraft_pos[2] = "j63";
            aircraft_pos[3] = "j64";
            aircraft_pos[4] = "j65";
            j61.setEnabled(false);
            j62.setEnabled(false);
            j63.setEnabled(false);
            j64.setEnabled(false);
            j65.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j64.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j65.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "battleship") && j71.isEnabled() && j81.isEnabled() && j91.isEnabled())
        {
            cur_aircraft = "submarine";
            j61.setIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j71.setIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j81.setIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j91.setIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));
            battleship_pos[0] = "j61";
            battleship_pos[1] = "j71";
            battleship_pos[2] = "j81";
            battleship_pos[3] = "j91";
            j61.setEnabled(false);
            j71.setEnabled(false);
            j81.setEnabled(false);
            j91.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-1.png"));
            j71.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-2.png"));
            j81.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-3.png"));
            j91.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j62.isEnabled() && j63.isEnabled() && j64.isEnabled())
        {
            cur_aircraft = "submarine";
            j61.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j62.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j63.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j64.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j61";
            battleship_pos[1] = "j62";
            battleship_pos[2] = "j63";
            battleship_pos[3] = "j64";
            j61.setEnabled(false);
            j62.setEnabled(false);
            j63.setEnabled(false);
            j64.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j64.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j71.isEnabled() && j81.isEnabled())
        {
            cur_aircraft = "cruiser";
            j61.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j71.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j81.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j61";
            submarine_pos[1] = "j71";
            submarine_pos[2] = "j81";
            j61.setEnabled(false);
            j71.setEnabled(false);
            j81.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j71.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j81.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j62.isEnabled() && j63.isEnabled())
        {
            cur_aircraft = "cruiser";
            j61.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j62.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j63.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j61";
            submarine_pos[1] = "j62";
            submarine_pos[2] = "j63";
            j61.setEnabled(false);
            j62.setEnabled(false);
            j63.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j71.isEnabled() && j81.isEnabled())
        {
            cur_aircraft = "destroyer";
            j61.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j71.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j81.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j61";
            cruiser_pos[1] = "j71";
            cruiser_pos[2] = "j81";
            j61.setEnabled(false);
            j71.setEnabled(false);
            j81.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j81.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j62.isEnabled() && j63.isEnabled())
        {
            cur_aircraft = "destroyer";
            j61.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j62.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j63.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j61";
            cruiser_pos[1] = "j62";
            cruiser_pos[2] = "j63";
            j61.setEnabled(false);
            j62.setEnabled(false);
            j63.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j63.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j71.isEnabled())
        {
            cur_aircraft = "finished";
            j61.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j71.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j61";
            destroyer_pos[1] = "j71";
            j61.setEnabled(false);
            j71.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j71.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j62.isEnabled())
        {
            cur_aircraft = "finished";
            j61.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j62.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j61";
            destroyer_pos[1] = "j62";
            j61.setEnabled(false);
            j62.setEnabled(false);
            j61.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j62.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j71Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j71.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j72.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j73.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j74.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j75.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j71";
            aircraft_pos[1] = "j72";
            aircraft_pos[2] = "j73";
            aircraft_pos[3] = "j74";
            aircraft_pos[4] = "j75";
            j71.setEnabled(false);
            j72.setEnabled(false);
            j73.setEnabled(false);
            j74.setEnabled(false);
            j75.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j74.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j75.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j72.isEnabled() && j73.isEnabled() && j74.isEnabled())
        {
            cur_aircraft = "submarine";
            j71.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j72.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j73.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j74.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j71";
            battleship_pos[1] = "j72";
            battleship_pos[2] = "j73";
            battleship_pos[3] = "j74";
            j71.setEnabled(false);
            j72.setEnabled(false);
            j73.setEnabled(false);
            j74.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j74.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "submarine") && j81.isEnabled() && j91.isEnabled())
        {
            cur_aircraft = "cruiser";
            j71.setIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j81.setIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j91.setIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));
            submarine_pos[0] = "j71";
            submarine_pos[1] = "j81";
            submarine_pos[2] = "j91";
            j71.setEnabled(false);
            j81.setEnabled(false);
            j91.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-1.png"));
            j81.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-2.png"));
            j91.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j72.isEnabled() && j73.isEnabled())
        {
            cur_aircraft = "cruiser";
            j71.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j72.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j73.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j71";
            submarine_pos[1] = "j72";
            submarine_pos[2] = "j73";
            j71.setEnabled(false);
            j72.setEnabled(false);
            j73.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "cruiser") && j81.isEnabled() && j91.isEnabled())
        {
            cur_aircraft = "destroyer";
            j71.setIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j81.setIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j91.setIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));
            cruiser_pos[0] = "j71";
            cruiser_pos[1] = "j81";
            cruiser_pos[2] = "j91";
            j71.setEnabled(false);
            j81.setEnabled(false);
            j91.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-1.png"));
            j81.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-2.png"));
            j91.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_v));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j72.isEnabled() && j73.isEnabled())
        {
            cur_aircraft = "destroyer";
            j71.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j72.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j73.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j71";
            cruiser_pos[1] = "j72";
            cruiser_pos[2] = "j73";
            j71.setEnabled(false);
            j72.setEnabled(false);
            j73.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j73.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j81.isEnabled())
        {
            cur_aircraft = "finished";
            j71.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j81.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j71";
            destroyer_pos[1] = "j81";
            j71.setEnabled(false);
            j81.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j81.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j72.isEnabled())
        {
            cur_aircraft = "finished";
            j71.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j72.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j71";
            destroyer_pos[1] = "j72";
            j71.setEnabled(false);
            j72.setEnabled(false);
            j71.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j72.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j81Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j81.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j82.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j83.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j84.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j85.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j81";
            aircraft_pos[1] = "j82";
            aircraft_pos[2] = "j83";
            aircraft_pos[3] = "j84";
            aircraft_pos[4] = "j85";
            j81.setEnabled(false);
            j82.setEnabled(false);
            j83.setEnabled(false);
            j84.setEnabled(false);
            j85.setEnabled(false);
            j81.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j83.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j84.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j85.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j82.isEnabled() && j83.isEnabled() && j84.isEnabled())
        {
            cur_aircraft = "submarine";
            j81.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j82.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j83.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j84.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j81";
            battleship_pos[1] = "j82";
            battleship_pos[2] = "j83";
            battleship_pos[3] = "j84";
            j81.setEnabled(false);
            j82.setEnabled(false);
            j83.setEnabled(false);
            j84.setEnabled(false);
            j81.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j83.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j84.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j82.isEnabled() && j83.isEnabled())
        {
            cur_aircraft = "cruiser";
            j81.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j82.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j83.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j81";
            submarine_pos[1] = "j82";
            submarine_pos[2] = "j83";
            j81.setEnabled(false);
            j82.setEnabled(false);
            j83.setEnabled(false);
            j81.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j83.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j82.isEnabled() && j83.isEnabled())
        {
            cur_aircraft = "destroyer";
            j81.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j82.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j83.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j81";
            cruiser_pos[1] = "j82";
            cruiser_pos[2] = "j83";
            j81.setEnabled(false);
            j82.setEnabled(false);
            j83.setEnabled(false);
            j81.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j83.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 0 && Objects.equals(cur_aircraft, "destroyer") && j91.isEnabled())
        {
            cur_aircraft = "finished";
            j81.setIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j91.setIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            destroyer_pos[0] = "j81";
            destroyer_pos[1] = "j91";
            j81.setEnabled(false);
            j91.setEnabled(false);
            j81.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-1.png"));
            j91.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-2.png"));
            cur.setIcon(new ImageIcon("crosshair.png"));
            cur.setPreferredSize(new Dimension(50, 50));
            xoffset = 25;
            yoffset = 25;
            p.setCursor(blankCursor);
            crd.next(co);
            loadscreen();
            com_place();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j82.isEnabled())
        {
            cur_aircraft = "finished";
            j81.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j82.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j81";
            destroyer_pos[1] = "j82";
            j81.setEnabled(false);
            j82.setEnabled(false);
            j81.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j82.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
    public void j91Call()
    {
        j.remove(l);
        j.revalidate();
        j.repaint();
        if (flag == 1 && Objects.equals(cur_aircraft, "aircraft-carrier"))
        {
            cur_aircraft = "battleship";
            j91.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j92.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j93.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j94.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j95.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));

            aircraft_pos[0] = "j91";
            aircraft_pos[1] = "j92";
            aircraft_pos[2] = "j93";
            aircraft_pos[3] = "j94";
            aircraft_pos[4] = "j95";
            j91.setEnabled(false);
            j92.setEnabled(false);
            j93.setEnabled(false);
            j94.setEnabled(false);
            j95.setEnabled(false);
            j91.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-1.png"));
            j92.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-2.png"));
            j93.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-3.png"));
            j94.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-4.png"));
            j95.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-5.png"));
            path_v = "battleship/battleship-v.png";
            path_h = "battleship/battleship-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "battleship") && j92.isEnabled() && j93.isEnabled() && j94.isEnabled())
        {
            cur_aircraft = "submarine";
            j91.setIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j92.setIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j93.setIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j94.setIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));
            battleship_pos[0] = "j91";
            battleship_pos[1] = "j92";
            battleship_pos[2] = "j93";
            battleship_pos[3] = "j94";
            j91.setEnabled(false);
            j92.setEnabled(false);
            j93.setEnabled(false);
            j94.setEnabled(false);
            j91.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-1.png"));
            j92.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-2.png"));
            j93.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-3.png"));
            j94.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-4.png"));

            path_v = "submarine/submarine-v.png";
            path_h = "submarine/submarine-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "submarine") && j92.isEnabled() && j93.isEnabled())
        {
            cur_aircraft = "cruiser";
            j91.setIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j92.setIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j93.setIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));
            submarine_pos[0] = "j91";
            submarine_pos[1] = "j92";
            submarine_pos[2] = "j93";
            j91.setEnabled(false);
            j92.setEnabled(false);
            j93.setEnabled(false);
            j91.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-1.png"));
            j92.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-2.png"));
            j93.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-3.png"));

            path_v = "cruiser/cruiser-v.png";
            path_h = "cruiser/cruiser-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "cruiser") && j92.isEnabled() && j93.isEnabled())
        {
            cur_aircraft = "destroyer";
            j91.setIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j92.setIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j93.setIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));
            cruiser_pos[0] = "j91";
            cruiser_pos[1] = "j92";
            cruiser_pos[2] = "j93";
            j91.setEnabled(false);
            j92.setEnabled(false);
            j93.setEnabled(false);
            j91.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-1.png"));
            j92.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-2.png"));
            j93.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-3.png"));

            path_v = "destroyer/destroyer-v.png";
            path_h = "destroyer/destroyer-h.png";
            cur.setIcon(new ImageIcon(path_h));
            cur.setBounds(xpos, ypos, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
            cur.repaint();
        }
        else if (flag == 1 && Objects.equals(cur_aircraft, "destroyer") && j92.isEnabled())
        {
            cur_aircraft = "finished";
            j91.setIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j92.setIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
            destroyer_pos[0] = "j91";
            destroyer_pos[1] = "j92";
            j91.setEnabled(false);
            j92.setEnabled(false);
            j91.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-1.png"));
            j92.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-2.png"));
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
