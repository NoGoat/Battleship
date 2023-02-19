import javax.swing.*;

public class play_part_2 extends play_part_1
{
    public void l26Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 26)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 26)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 26)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 26)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 26)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l26.setIcon(new ImageIcon("water_ship_hit.png"));
            l26.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l26.setIcon(new ImageIcon("water_ship_miss.png"));
            l26.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l26.setEnabled(false);
        who_is_playing();
    }
    public void l27Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 27)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 27)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 27)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 27)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 27)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l27.setIcon(new ImageIcon("water_ship_hit.png"));
            l27.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l27.setIcon(new ImageIcon("water_ship_miss.png"));
            l27.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l27.setEnabled(false);
        who_is_playing();
    }
    public void l28Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 28)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 28)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 28)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 28)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 28)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l28.setIcon(new ImageIcon("water_ship_hit.png"));
            l28.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l28.setIcon(new ImageIcon("water_ship_miss.png"));
            l28.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l28.setEnabled(false);
        who_is_playing();
    }
    public void l29Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 29)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 29)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 29)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 29)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 29)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l29.setIcon(new ImageIcon("water_ship_hit.png"));
            l29.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l29.setIcon(new ImageIcon("water_ship_miss.png"));
            l29.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l29.setEnabled(false);
        who_is_playing();
    }
    public void l30Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 30)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 30)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 30)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 30)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 30)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l30.setIcon(new ImageIcon("water_ship_hit.png"));
            l30.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l30.setIcon(new ImageIcon("water_ship_miss.png"));
            l30.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l30.setEnabled(false);
        who_is_playing();
    }
    public void l31Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 31)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 31)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 31)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 31)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 31)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l31.setIcon(new ImageIcon("water_ship_hit.png"));
            l31.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l31.setIcon(new ImageIcon("water_ship_miss.png"));
            l31.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l31.setEnabled(false);
        who_is_playing();
    }

    public void l32Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 32)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 32)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 32)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 32)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 32)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l32.setIcon(new ImageIcon("water_ship_hit.png"));
            l32.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l32.setIcon(new ImageIcon("water_ship_miss.png"));
            l32.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l32.setEnabled(false);
        who_is_playing();
    }
    public void l33Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 33)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 33)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 33)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 33)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 33)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l33.setIcon(new ImageIcon("water_ship_hit.png"));
            l33.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l33.setIcon(new ImageIcon("water_ship_miss.png"));
            l33.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l33.setEnabled(false);
        who_is_playing();
    }
    public void l34Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 34)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 34)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 34)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 34)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 34)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l34.setIcon(new ImageIcon("water_ship_hit.png"));
            l34.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l34.setIcon(new ImageIcon("water_ship_miss.png"));
            l34.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l34.setEnabled(false);
        who_is_playing();
    }
    public void l35Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 35)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 35)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 35)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 35)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 35)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l35.setIcon(new ImageIcon("water_ship_hit.png"));
            l35.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l35.setIcon(new ImageIcon("water_ship_miss.png"));
            l35.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l35.setEnabled(false);
        who_is_playing();
    }
    public void l36Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 36)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 36)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 36)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 36)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 36)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l36.setIcon(new ImageIcon("water_ship_hit.png"));
            l36.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l36.setIcon(new ImageIcon("water_ship_miss.png"));
            l36.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l36.setEnabled(false);
        who_is_playing();
    }
    public void l37Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 37)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 37)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 37)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 37)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 37)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l37.setIcon(new ImageIcon("water_ship_hit.png"));
            l37.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l37.setIcon(new ImageIcon("water_ship_miss.png"));
            l37.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l37.setEnabled(false);
        who_is_playing();
    }
    public void l38Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 38)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 38)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 38)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 38)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 38)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l38.setIcon(new ImageIcon("water_ship_hit.png"));
            l38.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l38.setIcon(new ImageIcon("water_ship_miss.png"));
            l38.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l38.setEnabled(false);
        who_is_playing();
    }
    public void l39Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 39)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 39)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 39)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 39)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 39)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l39.setIcon(new ImageIcon("water_ship_hit.png"));
            l39.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l39.setIcon(new ImageIcon("water_ship_miss.png"));
            l39.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l39.setEnabled(false);
        who_is_playing();
    }
    public void l40Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 40)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 40)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 40)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 40)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 40)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l40.setIcon(new ImageIcon("water_ship_hit.png"));
            l40.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l40.setIcon(new ImageIcon("water_ship_miss.png"));
            l40.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l40.setEnabled(false);
        who_is_playing();
    }
    public void l41Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 41)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 41)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 41)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 41)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 41)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l41.setIcon(new ImageIcon("water_ship_hit.png"));
            l41.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l41.setIcon(new ImageIcon("water_ship_miss.png"));
            l41.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l41.setEnabled(false);
        who_is_playing();
    }

    public void l42Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 42)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 42)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 42)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 42)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 42)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l42.setIcon(new ImageIcon("water_ship_hit.png"));
            l42.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l42.setIcon(new ImageIcon("water_ship_miss.png"));
            l42.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l42.setEnabled(false);
        who_is_playing();
    }
    public void l43Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 43)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 43)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 43)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 43)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 43)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l43.setIcon(new ImageIcon("water_ship_hit.png"));
            l43.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l43.setIcon(new ImageIcon("water_ship_miss.png"));
            l43.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l43.setEnabled(false);
        who_is_playing();
    }
    public void l44Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 44)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 44)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 44)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 44)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 44)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l44.setIcon(new ImageIcon("water_ship_hit.png"));
            l44.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l44.setIcon(new ImageIcon("water_ship_miss.png"));
            l44.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l44.setEnabled(false);
        who_is_playing();
    }
    public void l45Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 45)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 45)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 45)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 45)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 45)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l45.setIcon(new ImageIcon("water_ship_hit.png"));
            l45.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l45.setIcon(new ImageIcon("water_ship_miss.png"));
            l45.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l45.setEnabled(false);
        who_is_playing();
    }
    public void l46Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 46)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 46)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 46)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 46)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 46)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l46.setIcon(new ImageIcon("water_ship_hit.png"));
            l46.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l46.setIcon(new ImageIcon("water_ship_miss.png"));
            l46.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l46.setEnabled(false);
        who_is_playing();
    }
    public void l47Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 47)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 47)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 47)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 47)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 47)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l47.setIcon(new ImageIcon("water_ship_hit.png"));
            l47.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l47.setIcon(new ImageIcon("water_ship_miss.png"));
            l47.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l47.setEnabled(false);
        who_is_playing();
    }
    public void l48Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 48)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 48)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 48)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 48)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 48)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l48.setIcon(new ImageIcon("water_ship_hit.png"));
            l48.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l48.setIcon(new ImageIcon("water_ship_miss.png"));
            l48.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l48.setEnabled(false);
        who_is_playing();
    }
    public void l49Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 49)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 49)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 49)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 49)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 49)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l49.setIcon(new ImageIcon("water_ship_hit.png"));
            l49.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l49.setIcon(new ImageIcon("water_ship_miss.png"));
            l49.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l49.setEnabled(false);
        who_is_playing();
    }
    public void l50Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 50)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 50)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 50)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 50)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 50)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l50.setIcon(new ImageIcon("water_ship_hit.png"));
            l50.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l50.setIcon(new ImageIcon("water_ship_miss.png"));
            l50.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l50.setEnabled(false);
        who_is_playing();
    }
}
