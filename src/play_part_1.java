import javax.swing.*;

public class play_part_1 extends com_moves
{
    public void l1Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 1)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 1)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 1)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 1)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 1)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l1.setIcon(new ImageIcon("water_ship_hit.png"));
            l1.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l1.setIcon(new ImageIcon("water_ship_miss.png"));
            l1.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l1.setEnabled(false);
        who_is_playing();
    }

    public void l2Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 2)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 2)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 2)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 2)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 2)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l2.setIcon(new ImageIcon("water_ship_hit.png"));
            l2.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l2.setIcon(new ImageIcon("water_ship_miss.png"));
            l2.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l2.setEnabled(false);
        who_is_playing();
    }
    public void l3Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 3)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 3)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 3)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 3)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 3)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l3.setIcon(new ImageIcon("water_ship_hit.png"));
            l3.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l3.setIcon(new ImageIcon("water_ship_miss.png"));
            l3.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l3.setEnabled(false);
        who_is_playing();
    }
    public void l4Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 4)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 4)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 4)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 4)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 4)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l4.setIcon(new ImageIcon("water_ship_hit.png"));
            l4.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l4.setIcon(new ImageIcon("water_ship_miss.png"));
            l4.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l4.setEnabled(false);
        who_is_playing();
    }
    public void l5Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 5)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 5)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 5)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 5)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 5)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l5.setIcon(new ImageIcon("water_ship_hit.png"));
            l5.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l5.setIcon(new ImageIcon("water_ship_miss.png"));
            l5.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l5.setEnabled(false);
        who_is_playing();
    }
    public void l6Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 6)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 6)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 6)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 6)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 6)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l6.setIcon(new ImageIcon("water_ship_hit.png"));
            l6.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l6.setIcon(new ImageIcon("water_ship_miss.png"));
            l6.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l6.setEnabled(false);
        who_is_playing();
    }
    public void l7Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 7)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 7)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 7)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 7)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 7)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l7.setIcon(new ImageIcon("water_ship_hit.png"));
            l7.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l7.setIcon(new ImageIcon("water_ship_miss.png"));
            l7.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l7.setEnabled(false);
        who_is_playing();
    }
    public void l8Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 8)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 8)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 8)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 8)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 8)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l8.setIcon(new ImageIcon("water_ship_hit.png"));
            l8.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l8.setIcon(new ImageIcon("water_ship_miss.png"));
            l8.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l8.setEnabled(false);
        who_is_playing();
    }
    public void l9Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 9)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 9)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 9)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 9)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 9)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l9.setIcon(new ImageIcon("water_ship_hit.png"));
            l9.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l9.setIcon(new ImageIcon("water_ship_miss.png"));
            l9.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l9.setEnabled(false);
        who_is_playing();
    }
    public void l10Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 10)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 10)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 10)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 10)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 10)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l10.setIcon(new ImageIcon("water_ship_hit.png"));
            l10.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l10.setIcon(new ImageIcon("water_ship_miss.png"));
            l10.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l10.setEnabled(false);
        who_is_playing();
    }
    public void l11Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 11)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 11)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 11)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 11)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 11)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l11.setIcon(new ImageIcon("water_ship_hit.png"));
            l11.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l11.setIcon(new ImageIcon("water_ship_miss.png"));
            l11.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l11.setEnabled(false);
        who_is_playing();
    }

    public void l12Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 12)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 12)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 12)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 12)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 12)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l12.setIcon(new ImageIcon("water_ship_hit.png"));
            l12.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l12.setIcon(new ImageIcon("water_ship_miss.png"));
            l12.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l12.setEnabled(false);
        who_is_playing();
    }
    public void l13Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 13)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 13)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 13)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 13)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 13)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l13.setIcon(new ImageIcon("water_ship_hit.png"));
            l13.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l13.setIcon(new ImageIcon("water_ship_miss.png"));
            l13.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l13.setEnabled(false);
        who_is_playing();
    }
    public void l14Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 14)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 14)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 14)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 14)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 14)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l14.setIcon(new ImageIcon("water_ship_hit.png"));
            l14.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l14.setIcon(new ImageIcon("water_ship_miss.png"));
            l14.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l14.setEnabled(false);
        who_is_playing();
    }
    public void l15Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 15)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 15)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 15)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 15)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 15)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l15.setIcon(new ImageIcon("water_ship_hit.png"));
            l15.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l15.setIcon(new ImageIcon("water_ship_miss.png"));
            l15.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l15.setEnabled(false);
        who_is_playing();
    }
    public void l16Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 16)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 16)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 16)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 16)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 16)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l16.setIcon(new ImageIcon("water_ship_hit.png"));
            l16.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l16.setIcon(new ImageIcon("water_ship_miss.png"));
            l16.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l16.setEnabled(false);
        who_is_playing();
    }
    public void l17Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 17)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 17)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 17)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 17)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 17)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l17.setIcon(new ImageIcon("water_ship_hit.png"));
            l17.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l17.setIcon(new ImageIcon("water_ship_miss.png"));
            l17.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l17.setEnabled(false);
        who_is_playing();
    }
    public void l18Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 18)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 18)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 18)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 18)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 18)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l18.setIcon(new ImageIcon("water_ship_hit.png"));
            l18.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l18.setIcon(new ImageIcon("water_ship_miss.png"));
            l18.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l18.setEnabled(false);
        who_is_playing();
    }
    public void l19Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 19)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 19)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 19)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 19)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 19)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l19.setIcon(new ImageIcon("water_ship_hit.png"));
            l19.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l19.setIcon(new ImageIcon("water_ship_miss.png"));
            l19.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l19.setEnabled(false);
        who_is_playing();
    }
    public void l20Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 20)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 20)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 20)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 20)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 20)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l20.setIcon(new ImageIcon("water_ship_hit.png"));
            l20.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l20.setIcon(new ImageIcon("water_ship_miss.png"));
            l20.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l20.setEnabled(false);
        who_is_playing();
    }
    public void l21Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 21)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 21)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 21)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 21)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 21)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l21.setIcon(new ImageIcon("water_ship_hit.png"));
            l21.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l21.setIcon(new ImageIcon("water_ship_miss.png"));
            l21.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l21.setEnabled(false);
        who_is_playing();
    }

    public void l22Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 22)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 22)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 22)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 22)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 22)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l22.setIcon(new ImageIcon("water_ship_hit.png"));
            l22.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l22.setIcon(new ImageIcon("water_ship_miss.png"));
            l22.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l22.setEnabled(false);
        who_is_playing();
    }
    public void l23Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 23)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 23)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 23)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 23)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 23)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l23.setIcon(new ImageIcon("water_ship_hit.png"));
            l23.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l23.setIcon(new ImageIcon("water_ship_miss.png"));
            l23.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l23.setEnabled(false);
        who_is_playing();
    }
    public void l24Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 24)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 24)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 24)
            {
                play_sub_count++;
                flag = 1;
            }

        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 24)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 24)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l24.setIcon(new ImageIcon("water_ship_hit.png"));
            l24.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l24.setIcon(new ImageIcon("water_ship_miss.png"));
            l24.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l24.setEnabled(false);
        who_is_playing();
    }
    public void l25Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 25)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 25)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 25)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 25)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 25)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l25.setIcon(new ImageIcon("water_ship_hit.png"));
            l25.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l25.setIcon(new ImageIcon("water_ship_miss.png"));
            l25.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l25.setEnabled(false);
        who_is_playing();
    }
}
