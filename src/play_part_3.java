import javax.swing.*;

public class play_part_3 extends play_part_2
{
    public void l51Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 51)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 51)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 51)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 51)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 51)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l51.setIcon(new ImageIcon("water_ship_hit.png"));
            l51.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l51.setIcon(new ImageIcon("water_ship_miss.png"));
            l51.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l51.setEnabled(false);
        who_is_playing();
    }

    public void l52Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 52)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 52)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 52)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 52)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 52)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l52.setIcon(new ImageIcon("water_ship_hit.png"));
            l52.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l52.setIcon(new ImageIcon("water_ship_miss.png"));
            l52.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l52.setEnabled(false);
        who_is_playing();
    }
    public void l53Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 53)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 53)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 53)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 53)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 53)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l53.setIcon(new ImageIcon("water_ship_hit.png"));
            l53.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l53.setIcon(new ImageIcon("water_ship_miss.png"));
            l53.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l53.setEnabled(false);
        who_is_playing();
    }
    public void l54Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 54)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 54)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 54)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 54)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 54)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l54.setIcon(new ImageIcon("water_ship_hit.png"));
            l54.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l54.setIcon(new ImageIcon("water_ship_miss.png"));
            l54.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l54.setEnabled(false);
        who_is_playing();
    }
    public void l55Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 55)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 55)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 55)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 55)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 55)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l55.setIcon(new ImageIcon("water_ship_hit.png"));
            l55.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l55.setIcon(new ImageIcon("water_ship_miss.png"));
            l55.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l55.setEnabled(false);
        who_is_playing();
    }
    public void l56Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 56)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 56)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 56)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 56)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 56)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l56.setIcon(new ImageIcon("water_ship_hit.png"));
            l56.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l56.setIcon(new ImageIcon("water_ship_miss.png"));
            l56.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l56.setEnabled(false);
        who_is_playing();
    }
    public void l57Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 57)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 57)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 57)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 57)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 57)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l57.setIcon(new ImageIcon("water_ship_hit.png"));
            l57.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l57.setIcon(new ImageIcon("water_ship_miss.png"));
            l57.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l57.setEnabled(false);
        who_is_playing();
    }
    public void l58Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 58)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 58)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 58)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 58)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 58)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l58.setIcon(new ImageIcon("water_ship_hit.png"));
            l58.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l58.setIcon(new ImageIcon("water_ship_miss.png"));
            l58.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l58.setEnabled(false);
        who_is_playing();
    }
    public void l59Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 59)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 59)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 59)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 59)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 59)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l59.setIcon(new ImageIcon("water_ship_hit.png"));
            l59.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l59.setIcon(new ImageIcon("water_ship_miss.png"));
            l59.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l59.setEnabled(false);
        who_is_playing();
    }
    public void l60Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 60)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 60)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 60)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 60)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 60)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l60.setIcon(new ImageIcon("water_ship_hit.png"));
            l60.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l60.setIcon(new ImageIcon("water_ship_miss.png"));
            l60.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l60.setEnabled(false);
        who_is_playing();
    }
    public void l61Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 61)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 61)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 61)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 61)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 61)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l61.setIcon(new ImageIcon("water_ship_hit.png"));
            l61.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l61.setIcon(new ImageIcon("water_ship_miss.png"));
            l61.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l61.setEnabled(false);
        who_is_playing();
    }

    public void l62Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 62)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 62)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 62)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 62)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 62)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l62.setIcon(new ImageIcon("water_ship_hit.png"));
            l62.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l62.setIcon(new ImageIcon("water_ship_miss.png"));
            l62.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l62.setEnabled(false);
        who_is_playing();
    }
    public void l63Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 63)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 63)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 63)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 63)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 63)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l63.setIcon(new ImageIcon("water_ship_hit.png"));
            l63.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l63.setIcon(new ImageIcon("water_ship_miss.png"));
            l63.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l63.setEnabled(false);
        who_is_playing();
    }
    public void l64Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 64)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 64)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 64)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 64)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 64)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l64.setIcon(new ImageIcon("water_ship_hit.png"));
            l64.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l64.setIcon(new ImageIcon("water_ship_miss.png"));
            l64.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l64.setEnabled(false);
        who_is_playing();
    }
    public void l65Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 65)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 65)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 65)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 65)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 65)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l65.setIcon(new ImageIcon("water_ship_hit.png"));
            l65.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l65.setIcon(new ImageIcon("water_ship_miss.png"));
            l65.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l65.setEnabled(false);
        who_is_playing();
    }
    public void l66Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 66)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 66)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 66)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 66)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 66)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l66.setIcon(new ImageIcon("water_ship_hit.png"));
            l66.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l66.setIcon(new ImageIcon("water_ship_miss.png"));
            l66.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l66.setEnabled(false);
        who_is_playing();
    }
    public void l67Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 67)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 67)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 67)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 67)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 67)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l67.setIcon(new ImageIcon("water_ship_hit.png"));
            l67.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l67.setIcon(new ImageIcon("water_ship_miss.png"));
            l67.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l67.setEnabled(false);
        who_is_playing();
    }
    public void l68Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 68)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 68)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 68)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 68)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 68)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l68.setIcon(new ImageIcon("water_ship_hit.png"));
            l68.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l68.setIcon(new ImageIcon("water_ship_miss.png"));
            l68.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l68.setEnabled(false);
        who_is_playing();
    }
    public void l69Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 69)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 69)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 69)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 69)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 69)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l69.setIcon(new ImageIcon("water_ship_hit.png"));
            l69.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l69.setIcon(new ImageIcon("water_ship_miss.png"));
            l69.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l69.setEnabled(false);
        who_is_playing();
    }
    public void l70Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 70)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 70)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 70)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 70)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 70)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l70.setIcon(new ImageIcon("water_ship_hit.png"));
            l70.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l70.setIcon(new ImageIcon("water_ship_miss.png"));
            l70.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l70.setEnabled(false);
        who_is_playing();
    }
    public void l71Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 71)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 71)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 71)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 71)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 71)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l71.setIcon(new ImageIcon("water_ship_hit.png"));
            l71.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l71.setIcon(new ImageIcon("water_ship_miss.png"));
            l71.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l71.setEnabled(false);
        who_is_playing();
    }

    public void l72Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 72)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 72)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 72)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 72)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 72)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l72.setIcon(new ImageIcon("water_ship_hit.png"));
            l72.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l72.setIcon(new ImageIcon("water_ship_miss.png"));
            l72.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l72.setEnabled(false);
        who_is_playing();
    }
    public void l73Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 73)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 73)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 73)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 73)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 73)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l73.setIcon(new ImageIcon("water_ship_hit.png"));
            l73.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l73.setIcon(new ImageIcon("water_ship_miss.png"));
            l73.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l73.setEnabled(false);
        who_is_playing();
    }
    public void l74Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 74)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 74)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 74)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 74)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 74)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l74.setIcon(new ImageIcon("water_ship_hit.png"));
            l74.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l74.setIcon(new ImageIcon("water_ship_miss.png"));
            l74.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l74.setEnabled(false);
        who_is_playing();
    }
    public void l75Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 75)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 75)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 75)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 75)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 75)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l75.setIcon(new ImageIcon("water_ship_hit.png"));
            l75.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l75.setIcon(new ImageIcon("water_ship_miss.png"));
            l75.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss_p();
        }
        l75.setEnabled(false);
        who_is_playing();
    }
}
