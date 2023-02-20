import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.util.Objects;

public class com_moves extends generation
{
    public void who_is_playing()
    {
        SwingWorker play_win = new SwingWorker()
        {
            @Override
            protected Object doInBackground() throws Exception
            {
                Thread.sleep(1000);
                load.setText("YOU WIN");
                loading.remove(pb);
                play_hits.setOpaque(true);
                play_hits.setFocusPainted(false);
                loading.add(play_hits);
                play_hits.setBounds(250, 400, 150, 50);
                play_hits.setText("Player's Board");
                com_hits.setOpaque(true);
                com_hits.setFocusPainted(false);
                loading.add(com_hits);
                com_hits.setBounds(410, 400, 150, 50);
                com_hits.setText("Computer's Board");
                back_p.setBorderPainted(false);
                back_c.setBorderPainted(false);
                play_hits.setBorderPainted(false);
                com_hits.setBorderPainted(false);
                back_p.setText("Back");
                back_c.setText("Back");
                back_p.setBounds(0, 0, 50, 50);
                back_c.setBounds(0, 0, 50, 50);
                play_hits.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                com_hits.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                back_p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                back_c.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                play_hit.add(back_p);
                j.add(back_c);
                play_render_call();
                crd.show(co, "LA");
                return null;
            }
        };
        SwingWorker com_win = new SwingWorker()
        {
            @Override
            protected Object doInBackground() throws Exception
            {
                Thread.sleep(1000);
                load.setText("YOU LOSE");
                loading.remove(pb);
                play_hits.setOpaque(true);
                play_hits.setFocusPainted(false);
                loading.add(play_hits);
                play_hits.setBounds(250, 400, 150, 50);
                play_hits.setText("Player's Board");
                com_hits.setOpaque(true);
                com_hits.setFocusPainted(false);
                loading.add(com_hits);
                com_hits.setBounds(410, 400, 150, 50);
                com_hits.setText("Computer's Board");
                back_p.setBorderPainted(false);
                back_c.setBorderPainted(false);
                play_hits.setBorderPainted(false);
                com_hits.setBorderPainted(false);
                back_p.setText("Back");
                back_c.setText("Back");
                back_p.setBounds(0, 0, 50, 50);
                back_c.setBounds(0, 0, 50, 50);
                play_hits.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                com_hits.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                back_p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                back_c.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
                play_hit.add(back_p);
                j.add(back_c);
                play_render_call();
                crd.show(co, "LA");
                return null;
            }
        };
        if(play_hit_count == 17)
        {
            refresh_flag = 2;
            turn_flag = 2;
            play_win.execute();
        }
        if(com_hit_count == 17)
        {
            refresh_flag = 2;
            turn_flag = 2;
            com_win.execute();
        }
        SwingWorker help = new SwingWorker()
        {
            @Override
            protected String doInBackground() throws Exception
            {
                pb.setMaximum(100);
                pb.setMinimum(0);
                crd.show(co, "LA");
                loading.revalidate();
                loading.repaint();
                for(int percent = 0 ; percent <= 100 ; percent++)
                {
                    pb.setValue(percent);
                    Thread.sleep(16);
                }
                return null;
            }
            @Override
            protected void done()
            {
                if(turn_flag == 0)
                {
                    crd.show(co, "PHA");
                }
                else
                {
                    crd.show(co, "CHA");
                    com_hit();
                }
            }
        };
        SwingWorker wait = new SwingWorker()
        {
            @Override
            protected Object doInBackground() throws Exception
            {
                Thread.sleep(2000);
                return null;
            }
            @Override
            protected void done()
            {
                help.execute();
            }
        };
        hud_change();
        if(refresh_flag == 1)
        {
            wait.execute();
        }
        if(refresh_flag == 0 && turn_flag == 1)
        {
            com_hit();
        }
    }
    public void com_place()
    {
        generate();
        SwingWorker s1 = new SwingWorker()
        {
            @Override
            protected String doInBackground()
            {
                try
                {
                    FileWriter fw = new FileWriter("logs/logfile.txt", true);
                    fw.write("Aircraft Carrier : \n");
                    for(int i = 0 ; i < 5 ; i ++)
                    {
                        fw.write(aircraft_pos[i] + "\n");
                    }
                    fw.write("Battleship : \n");
                    for(int i = 0 ; i < 4 ; i ++)
                    {
                        fw.write(battleship_pos[i] + "\n");
                    }
                    fw.write("Submarine : \n");
                    for(int i = 0 ; i < 3 ; i ++)
                    {
                        fw.write(submarine_pos[i] + "\n");
                    }
                    fw.write("Cruiser : \n");
                    for(int i = 0 ; i < 3 ; i ++)
                    {
                        fw.write(cruiser_pos[i] + "\n");
                    }
                    fw.write("Destroyer : \n");
                    for(int i = 0 ; i < 2 ; i ++)
                    {
                        fw.write(destroyer_pos[i] + "\n");
                    }
                    fw.close();
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(j, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                com_gen();
                while (true)
                {
                    SwingUtilities.invokeLater(new Runnable(){
                        public void run()
                        {
                            PlayArea.repaint();
                            j.repaint();
                            loading.repaint();
                        }
                    });
                    r.setSeed(seed);
                    int success = 0;
                    int or = Math.abs(r.nextInt());
                    or = or % 2;
                    if(or == 0)
                    {
                        int temp_flag = 0;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 60;
                        int pos1 = com_air_place_h[pos];
                        int pos2 = pos1 + 1;
                        int pos3 = pos2 + 1;
                        int pos4 = pos3 + 1;
                        int pos5 = pos4 + 1;
                        com_aircraft_pos[0] = pos1;
                        com_aircraft_pos[1] = pos2;
                        com_aircraft_pos[2] = pos3;
                        com_aircraft_pos[3] = pos4;
                        com_aircraft_pos[4] = pos5;
                        air_or_c = 0;
                        success = 1;
                        if (success == 1)
                        {
                            break;
                        }
                    }
                    else if (or == 1)
                    {
                        int temp_flag = 0;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 60;
                        int pos1 = com_air_place_v[pos];
                        int pos2 = pos1 + 10;
                        int pos3 = pos2 + 10;
                        int pos4 = pos3 + 10;
                        int pos5 = pos4 + 10;
                        com_aircraft_pos[0] = pos1;
                        com_aircraft_pos[1] = pos2;
                        com_aircraft_pos[2] = pos3;
                        com_aircraft_pos[3] = pos4;
                        com_aircraft_pos[4] = pos5;
                        air_or_c = 1;
                        success = 1;
                        if (success == 1)
                        {
                            break;
                        }
                    }
                }
                j.revalidate();
                j.repaint();
                int progress = 1;
                while(progress <= 20)
                {
                    try
                    {
                        pb.setValue(progress);
                        j.revalidate();
                        j.repaint();
                        Thread.sleep(50);
                        progress++;
                    }
                    catch (Exception ex)
                    {

                    }
                }
                while (true)
                {
                    int p_flag = 0;
                    int success = 0;
                    int or = Math.abs(r.nextInt());
                    or = or % 2;
                    if(or == 0)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 70;
                        int pos1 = com_bat_place_h[pos];
                        int pos2 = pos1 + 1;
                        int pos3 = pos2 + 1;
                        int pos4 = pos3 + 1;
                        for(int i = 0; i <= 4; i ++)
                        {
                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2 && com_aircraft_pos[i] != pos3 && com_aircraft_pos[i] != pos4)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 6)
                        {
                            com_battleship_pos[0] = pos1;
                            com_battleship_pos[1] = pos2;
                            com_battleship_pos[2] = pos3;
                            com_battleship_pos[3] = pos4;
                            bat_or_c = 0;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                    else if (or == 1)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 70;
                        int pos1 = com_bat_place_v[pos];
                        int pos2 = pos1 + 10;
                        int pos3 = pos2 + 10;
                        int pos4 = pos3 + 10;
                        for(int i = 0; i <= 4; i ++)
                        {


                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2 && com_aircraft_pos[i] != pos3 && com_aircraft_pos[i] != pos4)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 6)
                        {
                            com_battleship_pos[0] = pos1;
                            com_battleship_pos[1] = pos2;
                            com_battleship_pos[2] = pos3;
                            com_battleship_pos[3] = pos4;
                            bat_or_c = 1;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                }
                while(progress <= 40)
                {
                    try
                    {
                        pb.setValue(progress);
                        j.revalidate();
                        j.repaint();
                        Thread.sleep(50);
                        progress++;
                    }
                    catch (Exception ex)
                    {

                    }
                }
                while (true)
                {
                    int p_flag = 0;
                    int success = 0;
                    int or = Math.abs(r.nextInt());
                    or = or % 2;
                    if(or == 0)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 80;
                        int pos1 = com_sub_place_h[pos];
                        int pos2 = pos1 + 1;
                        int pos3 = pos2 + 1;
                        for(int i = 0; i <= 4; i ++)
                        {

                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2 && com_aircraft_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 3; i ++)
                        {

                            if(com_battleship_pos[i] != pos1 && com_battleship_pos[i] != pos2 && com_battleship_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 10)
                        {
                            com_submarine_pos[0] = pos1;
                            com_submarine_pos[1] = pos2;
                            com_submarine_pos[2] = pos3;
                            sub_or_c = 0;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                    else if (or == 1)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 80;
                        int pos1 = com_sub_place_v[pos];
                        int pos2 = pos1 + 10;
                        int pos3 = pos2 + 10;
                        for(int i = 0; i <= 4; i ++)
                        {

                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2 && com_aircraft_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 3; i ++)
                        {

                            if(com_battleship_pos[i] != pos1 && com_battleship_pos[i] != pos2 && com_battleship_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 10)
                        {
                            com_submarine_pos[0] = pos1;
                            com_submarine_pos[1] = pos2;
                            com_submarine_pos[2] = pos3;
                            sub_or_c = 1;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                }
                while(progress <= 60)
                {
                    try
                    {
                        pb.setValue(progress);
                        j.revalidate();
                        j.repaint();
                        Thread.sleep(50);
                        progress++;
                    }
                    catch (Exception ex)
                    {

                    }
                }
                while (true)
                {
                    int p_flag = 0;
                    int success = 0;
                    int or = Math.abs(r.nextInt());
                    or = or % 2;
                    if(or == 0)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 80;
                        int pos1 = com_cru_place_h[pos];
                        int pos2 = pos1 + 1;
                        int pos3 = pos2 + 1;
                        for(int i = 0; i <= 4; i ++)
                        {

                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2 && com_aircraft_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 3; i ++)
                        {

                            if(com_battleship_pos[i] != pos1 && com_battleship_pos[i] != pos2 && com_battleship_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 2; i ++)
                        {

                            if(com_submarine_pos[i] != pos1 && com_submarine_pos[i] != pos2 && com_submarine_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 13)
                        {
                            com_cruiser_pos[0] = pos1;
                            com_cruiser_pos[1] = pos2;
                            com_cruiser_pos[2] = pos3;
                            cru_or_c = 0;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                    else if (or == 1)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 80;
                        int pos1 = com_cru_place_v[pos];
                        int pos2 = pos1 + 10;
                        int pos3 = pos2 + 10;
                        for(int i = 0; i <= 4; i ++)
                        {

                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2 && com_aircraft_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 3; i ++)
                        {

                            if(com_battleship_pos[i] != pos1 && com_battleship_pos[i] != pos2 && com_battleship_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 2; i ++)
                        {

                            if(com_submarine_pos[i] != pos1 && com_submarine_pos[i] != pos2 && com_submarine_pos[i] != pos3)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 13)
                        {
                            com_cruiser_pos[0] = pos1;
                            com_cruiser_pos[1] = pos2;
                            com_cruiser_pos[2] = pos3;
                            cru_or_c = 1;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                }
                while(progress <= 80)
                {
                    try
                    {
                        pb.setValue(progress);
                        j.revalidate();
                        j.repaint();
                        Thread.sleep(50);
                        progress++;
                    }
                    catch (Exception ex)
                    {

                    }
                }
                while (true)
                {
                    int p_flag = 0;
                    int success = 0;
                    int or = Math.abs(r.nextInt());
                    or = or % 2;
                    if(or == 0)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 90;
                        int pos1 = com_des_place_h[pos];
                        int pos2 = pos1 + 1;
                        for(int i = 0; i <= 4; i ++)
                        {

                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 3; i ++)
                        {

                            if(com_battleship_pos[i] != pos1 && com_battleship_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 2; i ++)
                        {

                            if(com_submarine_pos[i] != pos1 && com_submarine_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 2; i ++)
                        {

                            if(com_cruiser_pos[i] != pos1 && com_cruiser_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 16)
                        {
                            com_destroyer_pos[0] = pos1;
                            com_destroyer_pos[1] = pos2;
                            des_or_c = 0;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                    else if (or == 1)
                    {
                        int temp_flag = 1;
                        int pos = Math.abs(r.nextInt());
                        pos = pos % 90;
                        int pos1 = com_des_place_v[pos];
                        int pos2 = pos1 + 10;
                        for(int i = 0; i <= 4; i ++)
                        {

                            if(com_aircraft_pos[i] != pos1 && com_aircraft_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 3; i ++)
                        {

                            if(com_battleship_pos[i] != pos1 && com_battleship_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 2; i ++)
                        {

                            if(com_submarine_pos[i] != pos1 && com_submarine_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        for(int i = 0; i <= 2; i ++)
                        {

                            if(com_cruiser_pos[i] != pos1 && com_cruiser_pos[i] != pos2)
                            {
                                temp_flag++;
                            }
                        }
                        System.out.println(temp_flag);
                        if(temp_flag == 16)
                        {
                            com_destroyer_pos[0] = pos1;
                            com_destroyer_pos[1] = pos2;
                            des_or_c = 1;
                            success = 1;
                        }
                        if (success == 1)
                        {
                            break;
                        }
                    }
                }
                while(progress <= 100)
                {
                    try
                    {
                        pb.setValue(progress);
                        j.revalidate();
                        j.repaint();
                        Thread.sleep(50);
                        progress++;
                    }
                    catch (Exception ex)
                    {

                    }
                }
//                System.out.println("Computer Positions:\nAircraft Carrier: " + air_or_c);
//                System.out.println(com_aircraft_pos[0]);
//                System.out.println(com_aircraft_pos[1]);
//                System.out.println(com_aircraft_pos[2]);
//                System.out.println(com_aircraft_pos[3]);
//                System.out.println(com_aircraft_pos[4]);
//                System.out.println("Battleship: " + bat_or_c);
//                System.out.println(com_battleship_pos[0]);
//                System.out.println(com_battleship_pos[1]);
//                System.out.println(com_battleship_pos[2]);
//                System.out.println(com_battleship_pos[3]);
//                System.out.println("Submarine: " + sub_or_c);
//                System.out.println(com_submarine_pos[0]);
//                System.out.println(com_submarine_pos[1]);
//                System.out.println(com_submarine_pos[2]);
//                System.out.println("Cruiser: " + cru_or_c);
//                System.out.println(com_cruiser_pos[0]);
//                System.out.println(com_cruiser_pos[1]);
//                System.out.println(com_cruiser_pos[2]);
//                System.out.println("Destroyer: " + des_or_c);
//                System.out.println(com_destroyer_pos[0]);
//                System.out.println(com_destroyer_pos[1]);
                load.setText("Switching between bases");
                return null;
            }
            @Override
            protected void done()
            {
                who_is_playing();
            }
        };
        s1.execute();
    }
    void com_gen()
    {
        for(int i = 0, j = 1 ; i < 60; i++)
        {
            com_air_place_h[i] = j;
            System.out.println(com_air_place_h[i]);
            if (j == 6)
            {
                j = 11;
            }
            else if (j == 16)
            {
                j = 21;
            }
            else if (j == 26)
            {
                j = 31;
            }
            else if (j == 36)
            {
                j = 41;
            }
            else if (j == 46)
            {
                j = 51;
            }
            else if (j == 56)
            {
                j = 61;
            }
            else if (j == 66)
            {
                j = 71;
            }
            else if (j == 76)
            {
                j = 81;
            }
            else if (j == 86)
            {
                j = 91;
            }
            else if (j == 96)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 60; i++)
        {
            com_air_place_v[i] = j;
            System.out.println(com_air_place_v[i]);
            if (j == 60)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 70; i++)
        {
            com_bat_place_h[i] = j;
            System.out.println(com_bat_place_h[i]);
            if (j == 7)
            {
                j = 11;
            }
            else if (j == 17)
            {
                j = 21;
            }
            else if (j == 27)
            {
                j = 31;
            }
            else if (j == 37)
            {
                j = 41;
            }
            else if (j == 47)
            {
                j = 51;
            }
            else if (j == 57)
            {
                j = 61;
            }
            else if (j == 67)
            {
                j = 71;
            }
            else if (j == 77)
            {
                j = 81;
            }
            else if (j == 87)
            {
                j = 91;
            }
            else if (j == 97)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 70; i++)
        {
            com_bat_place_v[i] = j;
            System.out.println(com_bat_place_v[i]);
            if (j == 70)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 80; i++)
        {
            com_sub_place_h[i] = j;
            System.out.println(com_sub_place_h[i]);
            if (j == 8)
            {
                j = 11;
            }
            else if (j == 18)
            {
                j = 21;
            }
            else if (j == 28)
            {
                j = 31;
            }
            else if (j == 38)
            {
                j = 41;
            }
            else if (j == 48)
            {
                j = 51;
            }
            else if (j == 58)
            {
                j = 61;
            }
            else if (j == 68)
            {
                j = 71;
            }
            else if (j == 78)
            {
                j = 81;
            }
            else if (j == 88)
            {
                j = 91;
            }
            else if (j == 98)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 80; i++)
        {
            com_sub_place_v[i] = j;
            System.out.println(com_sub_place_v[i]);
            if (j == 80)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 80; i++)
        {
            com_cru_place_h[i] = j;
            System.out.println(com_cru_place_h[i]);
            if (j == 8)
            {
                j = 11;
            }
            else if (j == 18)
            {
                j = 21;
            }
            else if (j == 28)
            {
                j = 31;
            }
            else if (j == 38)
            {
                j = 41;
            }
            else if (j == 48)
            {
                j = 51;
            }
            else if (j == 58)
            {
                j = 61;
            }
            else if (j == 68)
            {
                j = 71;
            }
            else if (j == 78)
            {
                j = 81;
            }
            else if (j == 88)
            {
                j = 91;
            }
            else if (j == 98)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 80; i++)
        {
            com_cru_place_v[i] = j;
            System.out.println(com_cru_place_v[i]);
            if (j == 80)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 90; i++)
        {
            com_des_place_h[i] = j;
            System.out.println(com_des_place_h[i]);
            if (j == 9)
            {
                j = 11;
            }
            else if (j == 19)
            {
                j = 21;
            }
            else if (j == 29)
            {
                j = 31;
            }
            else if (j == 39)
            {
                j = 41;
            }
            else if (j == 49)
            {
                j = 51;
            }
            else if (j == 59)
            {
                j = 61;
            }
            else if (j == 69)
            {
                j = 71;
            }
            else if (j == 79)
            {
                j = 81;
            }
            else if (j == 89)
            {
                j = 91;
            }
            else if (j == 99)
            {
                break;
            }
            else
            {
                j++;
            }
        }
        for(int i = 0, j = 1 ; i < 90; i++)
        {
            com_des_place_v[i] = j;
            System.out.println(com_des_place_v[i]);
            if (j == 90)
            {
                break;
            }
            else
            {
                j++;
            }
        }
    }
    public void hud_change()
    {
        if(play_ai_count > 0 && play_ai_count < 5)
        {
            p_air.setIcon(found);
            if(play_ai_count != air_temp_c)
            {
                air_temp_c = play_ai_count;
                explosion_p();
            }
        }
        if(play_ai_count == 5)
        {
            p_air.setIcon(hit);
            if(play_ai_count != air_temp_c)
            {
                air_temp_c = play_ai_count;
                explosion_p();
            }
        }
        if(play_bat_count > 0 && play_bat_count < 4)
        {
            p_bat.setIcon(found);
            if(play_bat_count != bat_temp_c)
            {
                bat_temp_c = play_bat_count;
                explosion_p();
            }
        }
        if(play_bat_count == 4)
        {
            p_bat.setIcon(hit);
            if(play_bat_count != bat_temp_c)
            {
                bat_temp_c = play_bat_count;
                explosion_p();
            }
        }
        if(play_sub_count > 0 && play_sub_count < 3)
        {
            p_sub.setIcon(found);
            if(play_sub_count != sub_temp_c)
            {
                sub_temp_c = play_sub_count;
                explosion_p();
            }
        }
        if(play_sub_count == 3)
        {
            p_sub.setIcon(hit);
            if(play_sub_count != sub_temp_c)
            {
                sub_temp_c = play_sub_count;
                explosion_p();
            }
        }
        if(play_cru_count > 0 && play_cru_count < 3)
        {
            p_cru.setIcon(found);
            if(play_cru_count != cru_temp_c)
            {
                cru_temp_c = play_cru_count;
                explosion_p();
            }
        }
        if(play_cru_count == 3)
        {
            p_cru.setIcon(hit);
            if(play_cru_count != cru_temp_c)
            {
                cru_temp_c = play_cru_count;
                explosion_p();
            }
        }
        if(play_des_count > 0 && play_des_count < 2)
        {
            p_des.setIcon(found);
            if(play_des_count != des_temp_c)
            {
                des_temp_c = play_des_count;
                explosion_p();
            }
        }
        if(play_des_count == 2)
        {
            p_des.setIcon(hit);
            if(play_des_count != des_temp_c)
            {
                des_temp_c = play_des_count;
                explosion_p();
            }
        }
        if(com_ai_count > 0 && com_ai_count < 5)
        {
            c_air.setIcon(found);
            if(com_ai_count != air_temp_p)
            {
                air_temp_p = com_ai_count;
                explosion();
            }
        }
        if(com_ai_count == 5)
        {
            c_air.setIcon(safe);
            if(com_ai_count != air_temp_p)
            {
                air_temp_p = com_ai_count;
                explosion();
            }
        }
        if(com_bat_count > 0 && com_bat_count < 4)
        {
            c_bat.setIcon(found);
            if(com_bat_count != bat_temp_p)
            {
                bat_temp_p = com_bat_count;
                explosion();
            }
        }
        if(com_bat_count == 4)
        {
            c_bat.setIcon(safe);
            if(com_bat_count != bat_temp_p)
            {
                bat_temp_p = com_bat_count;
                explosion();
            }
        }
        if(com_sub_count > 0 && com_sub_count < 3)
        {
            c_sub.setIcon(found);
            if(com_sub_count != sub_temp_p)
            {
                sub_temp_p = com_sub_count;
                explosion();
            }
        }
        if(com_sub_count == 3)
        {
            c_sub.setIcon(safe);
            if(com_sub_count != sub_temp_p)
            {
                sub_temp_p = com_sub_count;
                explosion();
            }
        }
        if(com_cru_count > 0 && com_cru_count < 3)
        {
            c_cru.setIcon(found);
            if(com_cru_count != cru_temp_p)
            {
                cru_temp_p = com_cru_count;
                explosion();
            }
        }
        if(com_cru_count == 3)
        {
            c_cru.setIcon(safe);
            if(com_cru_count != cru_temp_p)
            {
                cru_temp_p = com_cru_count;
                explosion();
            }
        }
        if(com_des_count > 0 && com_des_count < 2)
        {
            c_des.setIcon(found);
            if(com_des_count != des_temp_p)
            {
                des_temp_p = com_des_count;
                explosion();
            }
        }
        if(com_des_count == 2)
        {
            c_des.setIcon(safe);
            if(com_des_count != des_temp_p)
            {
                des_temp_p = com_des_count;
                explosion();
            }
        }
    }

    public void com_hit()
    {
        SwingWorker com_hitter = new SwingWorker()
        {
            @Override
            protected Object doInBackground() throws Exception
            {
                int loop_count = 0;
                while(true)
                {
                    int hit_pos_index;
                    if(next_move == -1)
                    {
                        hit_pos_index = Math.abs(r.nextInt());
                        hit_pos_index = hit_pos_index % 100;
                    }
                    else
                    {
                        hit_pos_index = next_move;
                    }
                    System.out.println(hit_pos_index);
                    if(com_hit_grid[hit_pos_index] != 6000)
                    {
                        com_hit_grid[hit_pos_index] = 6000;
                        if(hit_pos_index == 0)
                        {
                            j1 = com_render(j1, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 1)
                        {
                            j2 = com_render(j2, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 2)
                        {
                            j3 = com_render(j3, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 3)
                        {
                            j4 = com_render(j4, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 4)
                        {
                            j5 = com_render(j5, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 5)
                        {
                            j6 = com_render(j6, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 6)
                        {
                            j7 = com_render(j7, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 7)
                        {
                            j8 = com_render(j8, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 8)
                        {
                            j9 = com_render(j9, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 9)
                        {
                            j10 = com_render(j10, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 10)
                        {
                            j11 = com_render(j11, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 11)
                        {
                            j12 = com_render(j12, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 12)
                        {
                            j13 = com_render(j13, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 13)
                        {
                            j14 = com_render(j14, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 14)
                        {
                            j15 = com_render(j15, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 15)
                        {
                            j16 = com_render(j16, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 16)
                        {
                            j17 = com_render(j17, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 17)
                        {
                            j18 = com_render(j18, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 18)
                        {
                            j19 = com_render(j19, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 19)
                        {
                            j20 = com_render(j20, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 20)
                        {
                            j21 = com_render(j21, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 21)
                        {
                            j22 = com_render(j22, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 22)
                        {
                            j23 = com_render(j23, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 23)
                        {
                            j24 = com_render(j24, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 24)
                        {
                            j25 = com_render(j25, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 25)
                        {
                            j26 = com_render(j26, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 26)
                        {
                            j27 = com_render(j27, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 27)
                        {
                            j28 = com_render(j28, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 28)
                        {
                            j29 = com_render(j29, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 29)
                        {
                            j30 = com_render(j30, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 30)
                        {
                            j31 = com_render(j31, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 31)
                        {
                            j32 = com_render(j32, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 32)
                        {
                            j33 = com_render(j33, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 33)
                        {
                            j34 = com_render(j34, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 34)
                        {
                            j35 = com_render(j35, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 35)
                        {
                            j36 = com_render(j36, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 36)
                        {
                            j37 = com_render(j37, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 37)
                        {
                            j38 = com_render(j38, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 38)
                        {
                            j39 = com_render(j39, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 39)
                        {
                            j40 = com_render(j40, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 40)
                        {
                            j41 = com_render(j41, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 41)
                        {
                            j42 = com_render(j42, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 42)
                        {
                            j43 = com_render(j43, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 43)
                        {
                            j44 = com_render(j44, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 44)
                        {
                            j45 = com_render(j45, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 45)
                        {
                            j46 = com_render(j46, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 46)
                        {
                            j47 = com_render(j47, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 47)
                        {
                            j48 = com_render(j48, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 48)
                        {
                            j49 = com_render(j49, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 49)
                        {
                            j50 = com_render(j50, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 50)
                        {
                            j51 = com_render(j51, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 51)
                        {
                            j52 = com_render(j52, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 52)
                        {
                            j53 = com_render(j53, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 53)
                        {
                            j54 = com_render(j54, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 54)
                        {
                            j55 = com_render(j55, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 55)
                        {
                            j56 = com_render(j56, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 56)
                        {
                            j57 = com_render(j57, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 57)
                        {
                            j58 = com_render(j58, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 58)
                        {
                            j59 = com_render(j59, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 59)
                        {
                            j60 = com_render(j60, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 60)
                        {
                            j61 = com_render(j61, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 61)
                        {
                            j62 = com_render(j62, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 62)
                        {
                            j63 = com_render(j63, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 63)
                        {
                            j64 = com_render(j64, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 64)
                        {
                            j65 = com_render(j65, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 65)
                        {
                            j66 = com_render(j66, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 66)
                        {
                            j67 = com_render(j67, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 67)
                        {
                            j68 = com_render(j68, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 68)
                        {
                            j69 = com_render(j69, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 69)
                        {
                            j70 = com_render(j70, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 70)
                        {
                            j71 = com_render(j71, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 71)
                        {
                            j72 = com_render(j72, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 72)
                        {
                            j73 = com_render(j73, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 73)
                        {
                            j74 = com_render(j74, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 74)
                        {
                            j75 = com_render(j75, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 75)
                        {
                            j76 = com_render(j76, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 76)
                        {
                            j77 = com_render(j77, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 77)
                        {
                            j78 = com_render(j78, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 78)
                        {
                            j79 = com_render(j79, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 79)
                        {
                            j80 = com_render(j80, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 80)
                        {
                            j81 = com_render(j81, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 81)
                        {
                            j82 = com_render(j82, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 82)
                        {
                            j83 = com_render(j83, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 83)
                        {
                            j84 = com_render(j84, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 84)
                        {
                            j85 = com_render(j85, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 85)
                        {
                            j86 = com_render(j86, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 86)
                        {
                            j87 = com_render(j87, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 87)
                        {
                            j88 = com_render(j88, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 88)
                        {
                            j89 = com_render(j89, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 89)
                        {
                            j90 = com_render(j90, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 90)
                        {
                            j91 = com_render(j91, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 91)
                        {
                            j92 = com_render(j92, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 92)
                        {
                            j93 = com_render(j93, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 93)
                        {
                            j94 = com_render(j94, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 94)
                        {
                            j95 = com_render(j95, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 95)
                        {
                            j96 = com_render(j96, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 96)
                        {
                            j97 = com_render(j97, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 97)
                        {
                            j98 = com_render(j98, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 98)
                        {
                            j99 = com_render(j99, hit_pos_index+1);
                        }
                        else if(hit_pos_index == 99)
                        {
                            j100 = com_render(j100, hit_pos_index+1);
                        }
                        j.revalidate();
                        j.repaint();
                        if(com_is_hit_or_not == 0)
                        {
                            refresh_flag = 1;
                            turn_flag = 0;
                        }
                        else
                        {
                            refresh_flag = 0;
                            turn_flag = 1;
                        }
                        if(Objects.equals(next_move_flag, "aircraft-carrier"))
                        {
                            if(com_ai_count == 1)
                            {
                                if (air_already_assigned == 0)
                                {
                                    System.out.println("hit_pos_index = " + hit_pos_index);
                                    air_already_assigned = 1;
                                    up_move = hit_pos_index - 10;
                                    down_move = hit_pos_index + 10;
                                    left_move = hit_pos_index - 1;
                                    right_move = hit_pos_index + 1;
                                    if (up_move < 0 || com_hit_grid[up_move] == 6000)
                                    {
                                        up_move = -1;
                                    }
                                    if (down_move >= 100 || com_hit_grid[down_move] == 6000)
                                    {
                                        down_move = -1;
                                    }
                                    if ((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000)
                                    {
                                        left_move = -1;
                                    }
                                    if (right_move % 10 == 0 || com_hit_grid[right_move] == 6000)
                                    {
                                        right_move = -1;
                                    }
                                }
                                if(up_move != -1)
                                {
                                    next_move = up_move;
                                    air_calculated_orientation = "up";
                                    up_move = -1;
                                }
                                else if(down_move != -1)
                                {
                                    next_move = down_move;
                                    air_calculated_orientation = "down";
                                    down_move = -1;
                                }
                                else if(left_move != -1)
                                {
                                    next_move = left_move;
                                    air_calculated_orientation = "left";
                                    left_move = -1;
                                }
                                else if(right_move != -1)
                                {
                                    next_move = right_move;
                                    air_calculated_orientation = "right";
                                    right_move = -1;
                                }
                            }
                            if(com_ai_count == 2)
                            {
                                if(Objects.equals(air_calculated_orientation, "up"))
                                {
                                    if(air_up_assigned_1 == 0)
                                    {
                                        air_up_assigned_1 = 1;
                                        up_move = next_move - 10;
                                        other_move = down_move;
                                    }
                                    if(up_move < 0 || com_hit_grid[up_move] == 6000 || up_move == -1)
                                    {
                                        up_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        air_calculated_orientation = "down";
                                    }
                                    else
                                    {
                                        next_move = up_move;
                                        up_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "down"))
                                {
                                    if(air_down_assigned_1 == 0)
                                    {
                                        air_down_assigned_1 = 1;
                                        down_move = next_move + 10;
                                    }
                                    if(down_move >= 100 || com_hit_grid[down_move] == 6000 || down_move == -1)
                                    {
                                        down_move = -1;
                                        next_move = down_move;
                                        air_calculated_orientation = "up";
                                    }
                                    else
                                    {
                                        next_move = down_move;
                                        down_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "left"))
                                {
                                    if(air_left_assigned_1 == 0)
                                    {
                                        air_left_assigned_1 = 1;
                                        left_move = next_move - 1;
                                        other_move = right_move;
                                    }
                                    if((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000 || left_move  == -1)
                                    {
                                        left_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        air_calculated_orientation = "right";
                                    }
                                    else
                                    {
                                        next_move = left_move;
                                        left_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "right"))
                                {
                                    if(air_right_assigned_1 == 0)
                                    {
                                        air_right_assigned_1 = 1;
                                        right_move = next_move + 1;
                                    }
                                    if(right_move % 10 == 0 || com_hit_grid[right_move] == 6000 || right_move == -1)
                                    {
                                        right_move = -1;
                                        next_move = right_move;
                                        air_calculated_orientation = "left";
                                    }
                                    else
                                    {
                                        next_move = right_move;
                                        right_move = -1;
                                    }
                                }
                            }
                            if(com_ai_count == 3)
                            {
                                if(Objects.equals(air_calculated_orientation, "up"))
                                {
                                    if(air_up_assigned_2 == 0)
                                    {
                                        air_up_assigned_2 = 1;
                                        up_move = next_move - 10;
                                    }
                                    if(up_move < 0 || com_hit_grid[up_move] == 6000 || up_move == -1)
                                    {
                                        up_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        air_calculated_orientation = "down";
                                    }
                                    else
                                    {
                                        next_move = up_move;
                                        up_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "down"))
                                {
                                    if(air_down_assigned_2 == 0)
                                    {
                                        air_down_assigned_2 = 1;
                                        down_move = next_move + 10;
                                    }
                                    if(down_move >= 100 || com_hit_grid[down_move] == 6000 || down_move == -1)
                                    {
                                        down_move = -1;
                                        next_move = down_move;
                                        air_calculated_orientation = "up";
                                    }
                                    else
                                    {
                                        next_move = down_move;
                                        down_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "left"))
                                {
                                    if(air_left_assigned_2 == 0)
                                    {
                                        air_left_assigned_2 = 1;
                                        left_move = next_move - 1;
                                    }
                                    if((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000 || left_move  == -1)
                                    {
                                        left_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        air_calculated_orientation = "right";
                                    }
                                    else
                                    {
                                        next_move = left_move;
                                        left_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "right"))
                                {
                                    if(air_right_assigned_2 == 0)
                                    {
                                        air_right_assigned_2 = 1;
                                        right_move = next_move + 1;
                                    }
                                    if(right_move % 10 == 0 || com_hit_grid[right_move] == 6000 || right_move == -1)
                                    {
                                        right_move = -1;
                                        next_move = right_move;
                                        air_calculated_orientation = "left";
                                    }
                                    else
                                    {
                                        next_move = right_move;
                                        right_move = -1;
                                    }
                                }
                            }
                            if(com_ai_count == 4)
                            {
                                if(Objects.equals(air_calculated_orientation, "up"))
                                {
                                    if(air_up_assigned_3 == 0)
                                    {
                                        air_up_assigned_3 = 1;
                                        up_move = next_move - 10;
                                    }
                                    if(up_move < 0 || com_hit_grid[up_move] == 6000 || up_move == -1)
                                    {
                                        up_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        air_calculated_orientation = "down";
                                    }
                                    else
                                    {
                                        next_move = up_move;
                                        up_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "down"))
                                {
                                    if(air_down_assigned_3 == 0)
                                    {
                                        air_down_assigned_3 = 1;
                                        down_move = next_move + 10;
                                    }
                                    if(down_move >= 100 || com_hit_grid[down_move] == 6000 || down_move == -1)
                                    {
                                        down_move = -1;
                                        next_move = down_move;
                                        air_calculated_orientation = "up";
                                    }
                                    else
                                    {
                                        next_move = down_move;
                                        down_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "left"))
                                {
                                    if(air_left_assigned_3 == 0)
                                    {
                                        air_left_assigned_3 = 1;
                                        left_move = next_move - 1;
                                    }
                                    if((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000 || left_move  == -1)
                                    {
                                        left_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        air_calculated_orientation = "right";
                                    }
                                    else
                                    {
                                        next_move = left_move;
                                        left_move = -1;
                                    }
                                }
                                else if(Objects.equals(air_calculated_orientation, "right"))
                                {
                                    if(air_right_assigned_3 == 0)
                                    {
                                        air_right_assigned_3 = 1;
                                        right_move = next_move + 1;
                                    }
                                    if(right_move % 10 == 0 || com_hit_grid[right_move] == 6000 || right_move == -1)
                                    {
                                        right_move = -1;
                                        next_move = right_move;
                                        air_calculated_orientation = "left";
                                    }
                                    else
                                    {
                                        next_move = right_move;
                                        right_move = -1;
                                    }
                                }
                            }
                            if(com_ai_count == 5)
                            {
                                next_move_flag = "none";
                                next_move = -1;
                            }
                        }
                        else if(Objects.equals(next_move_flag, "battleship"))
                        {
                            if(com_bat_count == 1)
                            {
                                if (bat_already_assigned == 0)
                                {
                                    System.out.println("hit_pos_index = " + hit_pos_index);
                                    bat_already_assigned = 1;
                                    up_move = hit_pos_index - 10;
                                    down_move = hit_pos_index + 10;
                                    left_move = hit_pos_index - 1;
                                    right_move = hit_pos_index + 1;
                                    if (up_move < 0 || com_hit_grid[up_move] == 6000)
                                    {
                                        up_move = -1;
                                    }
                                    if (down_move >= 100 || com_hit_grid[down_move] == 6000)
                                    {
                                        down_move = -1;
                                    }
                                    if ((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000)
                                    {
                                        left_move = -1;
                                    }
                                    if (right_move % 10 == 0 || com_hit_grid[right_move] == 6000)
                                    {
                                        right_move = -1;
                                    }
                                }
                                if(up_move != -1)
                                {
                                    next_move = up_move;
                                    bat_calculated_orientation = "up";
                                    up_move = -1;
                                }
                                else if(down_move != -1)
                                {
                                    next_move = down_move;
                                    bat_calculated_orientation = "down";
                                    down_move = -1;
                                }
                                else if(left_move != -1)
                                {
                                    next_move = left_move;
                                    bat_calculated_orientation = "left";
                                    left_move = -1;
                                }
                                else if(right_move != -1)
                                {
                                    next_move = right_move;
                                    bat_calculated_orientation = "right";
                                    right_move = -1;
                                }
                            }
                            if(com_bat_count == 2)
                            {
                                if(Objects.equals(bat_calculated_orientation, "up"))
                                {
                                    if(bat_up_assigned_1 == 0)
                                    {
                                        bat_up_assigned_1 = 1;
                                        up_move = next_move - 10;
                                        other_move = down_move;
                                    }
                                    if(up_move < 0 || com_hit_grid[up_move] == 6000 || up_move == -1)
                                    {
                                        up_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        bat_calculated_orientation = "down";
                                    }
                                    else
                                    {
                                        next_move = up_move;
                                        up_move = -1;
                                    }
                                }
                                else if(Objects.equals(bat_calculated_orientation, "down"))
                                {
                                    if(bat_down_assigned_1 == 0)
                                    {
                                        bat_down_assigned_1 = 1;
                                        down_move = next_move + 10;
                                    }
                                    if(down_move >= 100 || com_hit_grid[down_move] == 6000 || down_move == -1)
                                    {
                                        down_move = -1;
                                        next_move = down_move;
                                        bat_calculated_orientation = "up";
                                    }
                                    else
                                    {
                                        next_move = down_move;
                                        down_move = -1;
                                    }
                                }
                                else if(Objects.equals(bat_calculated_orientation, "left"))
                                {
                                    if(bat_left_assigned_1 == 0)
                                    {
                                        bat_left_assigned_1 = 1;
                                        left_move = next_move - 1;
                                        other_move = right_move;
                                    }
                                    if((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000 || left_move  == -1)
                                    {
                                        left_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        bat_calculated_orientation = "right";
                                    }
                                    else
                                    {
                                        next_move = left_move;
                                        left_move = -1;
                                    }
                                }
                                else if(Objects.equals(bat_calculated_orientation, "right"))
                                {
                                    if(bat_right_assigned_1 == 0)
                                    {
                                        bat_right_assigned_1 = 1;
                                        right_move = next_move + 1;
                                    }
                                    if(right_move % 10 == 0 || com_hit_grid[right_move] == 6000 || right_move == -1)
                                    {
                                        right_move = -1;
                                        next_move = right_move;
                                        bat_calculated_orientation = "left";
                                    }
                                    else
                                    {
                                        next_move = right_move;
                                        right_move = -1;
                                    }
                                }
                            }
                            if(com_bat_count == 3)
                            {
                                if(Objects.equals(bat_calculated_orientation, "up"))
                                {
                                    if(bat_up_assigned_2 == 0)
                                    {
                                        bat_up_assigned_2 = 1;
                                        up_move = next_move - 10;
                                    }
                                    if(up_move < 0 || com_hit_grid[up_move] == 6000 || up_move == -1)
                                    {
                                        up_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        bat_calculated_orientation = "down";
                                    }
                                    else
                                    {
                                        next_move = up_move;
                                        up_move = -1;
                                    }
                                }
                                else if(Objects.equals(bat_calculated_orientation, "down"))
                                {
                                    if(bat_down_assigned_2 == 0)
                                    {
                                        bat_down_assigned_2 = 1;
                                        down_move = next_move + 10;
                                    }
                                    if(down_move >= 100 || com_hit_grid[down_move] == 6000 || down_move == -1)
                                    {
                                        down_move = -1;
                                        next_move = down_move;
                                        bat_calculated_orientation = "up";
                                    }
                                    else
                                    {
                                        next_move = down_move;
                                        down_move = -1;
                                    }
                                }
                                else if(Objects.equals(bat_calculated_orientation, "left"))
                                {
                                    if(bat_left_assigned_2 == 0)
                                    {
                                        bat_left_assigned_2 = 1;
                                        left_move = next_move - 1;
                                    }
                                    if((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000 || left_move  == -1)
                                    {
                                        left_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        bat_calculated_orientation = "right";
                                    }
                                    else
                                    {
                                        next_move = left_move;
                                        left_move = -1;
                                    }
                                }
                                else if(Objects.equals(bat_calculated_orientation, "right"))
                                {
                                    if(bat_right_assigned_2 == 0)
                                    {
                                        bat_right_assigned_2 = 1;
                                        right_move = next_move + 1;
                                    }
                                    if(right_move % 10 == 0 || com_hit_grid[right_move] == 6000 || right_move == -1)
                                    {
                                        right_move = -1;
                                        next_move = right_move;
                                        bat_calculated_orientation = "left";
                                    }
                                    else
                                    {
                                        next_move = right_move;
                                        right_move = -1;
                                    }
                                }
                            }
                            if(com_bat_count == 4)
                            {
                                next_move_flag = "none";
                                next_move = -1;
                            }
                        }
                        else if(Objects.equals(next_move_flag, "submarine"))
                        {
                            if(com_sub_count == 1)
                            {
                                if (sub_already_assigned == 0)
                                {
                                    sub_already_assigned = 1;
                                    up_move = hit_pos_index - 10;
                                    down_move = hit_pos_index + 10;
                                    left_move = hit_pos_index - 1;
                                    right_move = hit_pos_index + 1;
                                    if (up_move < 0 || com_hit_grid[up_move] == 6000)
                                    {
                                        up_move = -1;
                                    }
                                    if (down_move >= 100 || com_hit_grid[down_move] == 6000)
                                    {
                                        down_move = -1;
                                    }
                                    if ((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000)
                                    {
                                        left_move = -1;
                                    }
                                    if (right_move % 10 == 0 || com_hit_grid[right_move] == 6000)
                                    {
                                        right_move = -1;
                                    }
                                }
                                if(up_move != -1)
                                {
                                    next_move = up_move;
                                    sub_calculated_orientation = "up";
                                    up_move = -1;
                                }
                                else if(down_move != -1)
                                {
                                    next_move = down_move;
                                    sub_calculated_orientation = "down";
                                    down_move = -1;
                                }
                                else if(left_move != -1)
                                {
                                    next_move = left_move;
                                    sub_calculated_orientation = "left";
                                    left_move = -1;
                                }
                                else if(right_move != -1)
                                {
                                    next_move = right_move;
                                    sub_calculated_orientation = "right";
                                    right_move = -1;
                                }
                            }
                            if(com_sub_count == 2)
                            {
                                if(Objects.equals(sub_calculated_orientation, "up"))
                                {
                                    if(sub_up_assigned_1 == 0)
                                    {
                                        sub_up_assigned_1 = 1;
                                        up_move = next_move - 10;
                                        other_move = down_move;
                                        System.out.println("Other Move = " + other_move);
                                    }
                                    if(up_move < 0 || com_hit_grid[up_move] == 6000 || up_move == -1)
                                    {
                                        up_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        sub_calculated_orientation = "down";
                                    }
                                    else
                                    {
                                        next_move = up_move;
                                        up_move = -1;
                                    }
                                }
                                else if(Objects.equals(sub_calculated_orientation, "down"))
                                {
                                    if(sub_down_assigned_1 == 0)
                                    {
                                        sub_down_assigned_1 = 1;
                                        down_move = next_move + 10;
                                    }
                                    if(down_move >= 100 || com_hit_grid[down_move] == 6000 || down_move == -1)
                                    {
                                        down_move = -1;
                                        next_move = down_move;
                                        sub_calculated_orientation = "up";
                                    }
                                    else
                                    {
                                        next_move = down_move;
                                        down_move = -1;
                                    }
                                }
                                else if(Objects.equals(sub_calculated_orientation, "left"))
                                {
                                    if(sub_left_assigned_1 == 0)
                                    {
                                        sub_left_assigned_1 = 1;
                                        left_move = next_move - 1;
                                        other_move = right_move;
                                        System.out.println("Other Move = " + other_move);
                                    }
                                    if((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000 || left_move  == -1)
                                    {
                                        left_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        sub_calculated_orientation = "right";
                                    }
                                    else
                                    {
                                        next_move = left_move;
                                        left_move = -1;
                                    }
                                }
                                else if(Objects.equals(sub_calculated_orientation, "right"))
                                {
                                    if(sub_right_assigned_1 == 0)
                                    {
                                        sub_right_assigned_1 = 1;
                                        right_move = next_move + 1;
                                    }
                                    if(right_move % 10 == 0 || com_hit_grid[right_move] == 6000 || right_move == -1)
                                    {
                                        right_move = -1;
                                        next_move = right_move;
                                        sub_calculated_orientation = "left";
                                    }
                                    else
                                    {
                                        next_move = right_move;
                                        right_move = -1;
                                    }
                                }
                            }
                            if(com_sub_count == 3)
                            {
                                next_move_flag = "none";
                                next_move = -1;
                            }
                        }
                        else if(Objects.equals(next_move_flag, "cruiser"))
                        {
                            if(com_cru_count == 1)
                            {
                                if (cru_already_assigned == 0)
                                {
                                    cru_already_assigned = 1;
                                    up_move = hit_pos_index - 10;
                                    down_move = hit_pos_index + 10;
                                    left_move = hit_pos_index - 1;
                                    right_move = hit_pos_index + 1;
                                    if (up_move < 0 || com_hit_grid[up_move] == 6000)
                                    {
                                        up_move = -1;
                                    }
                                    if (down_move >= 100 || com_hit_grid[down_move] == 6000)
                                    {
                                        down_move = -1;
                                    }
                                    if ((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000)
                                    {
                                        left_move = -1;
                                    }
                                    if (right_move % 10 == 0 || com_hit_grid[right_move] == 6000)
                                    {
                                        right_move = -1;
                                    }
                                }
                                if(up_move != -1)
                                {
                                    next_move = up_move;
                                    cru_calculated_orientation = "up";
                                    up_move = -1;
                                }
                                else if(down_move != -1)
                                {
                                    next_move = down_move;
                                    cru_calculated_orientation = "down";
                                    down_move = -1;
                                }
                                else if(left_move != -1)
                                {
                                    next_move = left_move;
                                    cru_calculated_orientation = "left";
                                    left_move = -1;
                                }
                                else if(right_move != -1)
                                {
                                    next_move = right_move;
                                    cru_calculated_orientation = "right";
                                    right_move = -1;
                                }
                            }
                            if(com_cru_count == 2)
                            {
                                if(Objects.equals(cru_calculated_orientation, "up"))
                                {
                                    if(cru_up_assigned_1 == 0)
                                    {
                                        cru_up_assigned_1 = 1;
                                        up_move = next_move - 10;
                                        other_move = down_move;
                                    }
                                    if(up_move < 0 || com_hit_grid[up_move] == 6000 || up_move == -1)
                                    {
                                        up_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        cru_calculated_orientation = "down";
                                    }
                                    else
                                    {
                                        next_move = up_move;
                                        up_move = -1;
                                    }
                                }
                                else if(Objects.equals(cru_calculated_orientation, "down"))
                                {
                                    if(cru_down_assigned_1 == 0)
                                    {
                                        cru_down_assigned_1 = 1;
                                        down_move = next_move + 10;
                                    }
                                    if(down_move >= 100 || com_hit_grid[down_move] == 6000 || down_move == -1)
                                    {
                                        down_move = -1;
                                        next_move = down_move;
                                        cru_calculated_orientation = "up";
                                    }
                                    else
                                    {
                                        next_move = down_move;
                                        down_move = -1;
                                    }
                                }
                                else if(Objects.equals(cru_calculated_orientation, "left"))
                                {
                                    if(cru_left_assigned_1 == 0)
                                    {
                                        cru_left_assigned_1 = 1;
                                        left_move = next_move - 1;
                                        other_move = right_move;
                                    }
                                    if((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000 || left_move  == -1)
                                    {
                                        left_move = -1;
                                        next_move = other_move;
                                        other_move = -1;
                                        cru_calculated_orientation = "right";
                                    }
                                    else
                                    {
                                        next_move = left_move;
                                        left_move = -1;
                                    }
                                }
                                else if(Objects.equals(cru_calculated_orientation, "right"))
                                {
                                    if(cru_right_assigned_1 == 0)
                                    {
                                        cru_right_assigned_1 = 1;
                                        right_move = next_move + 1;
                                    }
                                    if(right_move % 10 == 0 || com_hit_grid[right_move] == 6000 || right_move == -1)
                                    {
                                        right_move = -1;
                                        next_move = right_move;
                                        cru_calculated_orientation = "left";
                                    }
                                    else
                                    {
                                        next_move = right_move;
                                        right_move = -1;
                                    }
                                }
                            }
                            if(com_cru_count == 3)
                            {
                                next_move_flag = "none";
                                next_move = -1;
                            }
                        }
                        else if(Objects.equals(next_move_flag, "destroyer"))
                        {
                            if(des_already_assigned == 0)
                            {
                                des_already_assigned = 1;
                                up_move = hit_pos_index - 10;
                                down_move = hit_pos_index + 10;
                                left_move = hit_pos_index - 1;
                                right_move = hit_pos_index + 1;
                                if (up_move < 0 || com_hit_grid[up_move] == 6000)
                                {
                                    up_move = -1;
                                }
                                if (down_move >= 100 || com_hit_grid[down_move] == 6000)
                                {
                                    down_move = -1;
                                }
                                if ((left_move + 1) % 10 == 0 || com_hit_grid[left_move] == 6000)
                                {
                                    left_move = -1;
                                }
                                if (right_move % 10 == 0 || com_hit_grid[right_move] == 6000)
                                {
                                    right_move = -1;
                                }
                            }
                            if(up_move != -1)
                            {
                                next_move = up_move;
                                up_move = -1;
                            }
                            else if(down_move != -1)
                            {
                                next_move = down_move;
                                down_move = -1;
                            }
                            else if(left_move != -1)
                            {
                                next_move = left_move;
                                left_move = -1;
                            }
                            else if(right_move != -1)
                            {
                                next_move = right_move;
                                right_move = -1;
                            }
                            if(com_des_count == 2)
                            {
                                next_move_flag = "none";
                                next_move = -1;
                            }
                        }
                        break;
                    }
                    loop_count++;
                    if(loop_count == 200)
                    {
                        next_move = -1;
                        next_move_flag = "none";
                    }
                }
                return null;
            }
            @Override
            protected void done()
            {
                who_is_playing();
            }
        };
        SwingWorker com_delay = new SwingWorker()
        {
            @Override
            protected Object doInBackground() throws Exception
            {
                Thread.sleep(1000);
                return null;
            }
            @Override
            protected void done()
            {
                com_hitter.execute();
            }
        };
        com_delay.execute();
    }
    public JButton com_render(JButton b, int pos)
    {
        int no_hits = 0;
        if(air_or == 0)
        {
            System.out.println("In Aircraft 0");
            for(int i = 0 ; i < 5 ; i ++)
            {
                if(play_aircraft_pos[i] == pos)
                {
                    next_move_flag = "aircraft-carrier";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-destroyed-tile-"+iconpos+".png"));
                    com_hit_count++;
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_ai_count++;
                    no_hits = 1;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(air_or == 1)
        {
            System.out.println("In Aircraft 1");
            for(int i = 0 ; i < 5 ; i ++)
            {
                if(play_aircraft_pos[i] == pos)
                {
                    next_move_flag = "aircraft-carrier";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_ai_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(bat_or == 0)
        {
            System.out.println("In Battleship 0");
            for(int i = 0 ; i < 4 ; i ++)
            {
                if(play_battleship_pos[i] == pos)
                {
                    next_move_flag = "battleship";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("battleship/battleship-h-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("battleship/battleship-h-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_bat_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(bat_or == 1)
        {
            System.out.println("In Battleship 1");
            for(int i = 0 ; i < 4 ; i ++)
            {
                if(play_battleship_pos[i] == pos)
                {
                    next_move_flag = "battleship";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("battleship/battleship-v-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("battleship/battleship-v-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_bat_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(sub_or == 0)
        {
            System.out.println("In Submarine 0");
            for(int i = 0 ; i < 3 ; i ++)
            {
                if(play_submarine_pos[i] == pos)
                {
                    next_move_flag = "submarine";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("submarine/submarine-h-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("submarine/submarine-h-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_sub_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(sub_or == 1)
        {
            System.out.println("In Submarine 1");
            for(int i = 0 ; i < 3 ; i ++)
            {
                if(play_submarine_pos[i] == pos)
                {
                    next_move_flag = "submarine";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("submarine/submarine-v-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("submarine/submarine-v-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_sub_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(cru_or == 0)
        {
            System.out.println("In Cruiser 0");
            for(int i = 0 ; i < 3 ; i ++)
            {
                if(play_cruiser_pos[i] == pos)
                {
                    next_move_flag = "cruiser";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("cruiser/cruiser-h-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_cru_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(cru_or == 1)
        {
            System.out.println("In Cruiser 1");
            for(int i = 0 ; i < 3 ; i ++)
            {
                if(play_cruiser_pos[i] == pos)
                {
                    next_move_flag = "cruiser";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("cruiser/cruiser-v-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_cru_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(des_or == 0)
        {
            System.out.println("In Destroyer 0");
            for(int i = 0 ; i < 2 ; i ++)
            {
                if(play_destroyer_pos[i] == pos)
                {
                    next_move_flag = "destroyer";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("destroyer/destroyer-h-destroyed-tile"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-destroyed-tile"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_des_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(des_or == 1)
        {
            System.out.println("In Destroyer 1");
            for(int i = 0 ; i < 2 ; i ++)
            {
                if(play_destroyer_pos[i] == pos)
                {
                    next_move_flag = "destroyer";
                    int iconpos = i + 1;
                    com_is_hit_or_not = 1;
                    b.setIcon(new ImageIcon("destroyer/destroyer-v-destroyed-tile-"+iconpos+".png"));
                    b.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-destroyed-tile-"+iconpos+".png"));
                    System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-"+iconpos+".png");
                    com_des_count++;
                    no_hits = 1;
                    com_hit_count++;
                    j.revalidate();
                    j.repaint();
                    return b;
                }
            }
        }
        if(no_hits == 0)
        {
            com_is_hit_or_not = 0;
            b.setIcon(new ImageIcon("water_ship_miss.png"));
            miss();
            j.revalidate();
            j.repaint();
            return b;
        }
        return b;
    }
}
