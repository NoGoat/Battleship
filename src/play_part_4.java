import javax.swing.*;

public class play_part_4 extends play_part_3
{
    public void l76Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 76)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 76)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 76)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 76)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 76)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l76.setIcon(new ImageIcon("water_ship_hit.png"));
            l76.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l76.setIcon(new ImageIcon("water_ship_miss.png"));
            l76.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l76.setEnabled(false);
        who_is_playing();
    }
    public void l77Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 77)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 77)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 77)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 77)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 77)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l77.setIcon(new ImageIcon("water_ship_hit.png"));
            l77.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l77.setIcon(new ImageIcon("water_ship_miss.png"));
            l77.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l77.setEnabled(false);
        who_is_playing();
    }
    public void l78Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 78)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 78)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 78)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 78)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 78)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l78.setIcon(new ImageIcon("water_ship_hit.png"));
            l78.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l78.setIcon(new ImageIcon("water_ship_miss.png"));
            l78.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l78.setEnabled(false);
        who_is_playing();
    }
    public void l79Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 79)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 79)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 79)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 79)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 79)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l79.setIcon(new ImageIcon("water_ship_hit.png"));
            l79.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l79.setIcon(new ImageIcon("water_ship_miss.png"));
            l79.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l79.setEnabled(false);
        who_is_playing();
    }
    public void l80Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 80)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 80)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 80)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 80)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 80)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l80.setIcon(new ImageIcon("water_ship_hit.png"));
            l80.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l80.setIcon(new ImageIcon("water_ship_miss.png"));
            l80.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l80.setEnabled(false);
        who_is_playing();
    }
    public void l81Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 81)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 81)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 81)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 81)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 81)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l81.setIcon(new ImageIcon("water_ship_hit.png"));
            l81.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l81.setIcon(new ImageIcon("water_ship_miss.png"));
            l81.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l81.setEnabled(false);
        who_is_playing();
    }

    public void l82Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 82)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 82)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 82)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 82)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 82)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l82.setIcon(new ImageIcon("water_ship_hit.png"));
            l82.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l82.setIcon(new ImageIcon("water_ship_miss.png"));
            l82.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l82.setEnabled(false);
        who_is_playing();
    }
    public void l83Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 83)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 83)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 83)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 83)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 83)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l83.setIcon(new ImageIcon("water_ship_hit.png"));
            l83.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l83.setIcon(new ImageIcon("water_ship_miss.png"));
            l83.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l83.setEnabled(false);
        who_is_playing();
    }
    public void l84Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 84)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 84)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 84)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 84)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 84)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l84.setIcon(new ImageIcon("water_ship_hit.png"));
            l84.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l84.setIcon(new ImageIcon("water_ship_miss.png"));
            l84.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l84.setEnabled(false);
        who_is_playing();
    }
    public void l85Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 85)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 85)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 85)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 85)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 85)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l85.setIcon(new ImageIcon("water_ship_hit.png"));
            l85.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l85.setIcon(new ImageIcon("water_ship_miss.png"));
            l85.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l85.setEnabled(false);
        who_is_playing();
    }
    public void l86Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 86)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 86)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 86)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 86)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 86)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l86.setIcon(new ImageIcon("water_ship_hit.png"));
            l86.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l86.setIcon(new ImageIcon("water_ship_miss.png"));
            l86.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l86.setEnabled(false);
        who_is_playing();
    }
    public void l87Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 87)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 87)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 87)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 87)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 87)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l87.setIcon(new ImageIcon("water_ship_hit.png"));
            l87.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l87.setIcon(new ImageIcon("water_ship_miss.png"));
            l87.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l87.setEnabled(false);
        who_is_playing();
    }
    public void l88Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 88)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 88)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 88)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 88)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 88)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l88.setIcon(new ImageIcon("water_ship_hit.png"));
            l88.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l88.setIcon(new ImageIcon("water_ship_miss.png"));
            l88.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l88.setEnabled(false);
        who_is_playing();
    }
    public void l89Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 89)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 89)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 89)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 89)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 89)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l89.setIcon(new ImageIcon("water_ship_hit.png"));
            l89.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l89.setIcon(new ImageIcon("water_ship_miss.png"));
            l89.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l89.setEnabled(false);
        who_is_playing();
    }
    public void l90Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 90)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 90)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 90)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 90)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 90)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l90.setIcon(new ImageIcon("water_ship_hit.png"));
            l90.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l90.setIcon(new ImageIcon("water_ship_miss.png"));
            l90.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l90.setEnabled(false);
        who_is_playing();
    }
    public void l91Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 91)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 91)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 91)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 91)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 91)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l91.setIcon(new ImageIcon("water_ship_hit.png"));
            l91.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l91.setIcon(new ImageIcon("water_ship_miss.png"));
            l91.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l91.setEnabled(false);
        who_is_playing();
    }

    public void l92Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 92)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 92)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 92)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 92)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 92)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l92.setIcon(new ImageIcon("water_ship_hit.png"));
            l92.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l92.setIcon(new ImageIcon("water_ship_miss.png"));
            l92.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l92.setEnabled(false);
        who_is_playing();
    }
    public void l93Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 93)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 93)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 93)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 93)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 93)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l93.setIcon(new ImageIcon("water_ship_hit.png"));
            l93.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l93.setIcon(new ImageIcon("water_ship_miss.png"));
            l93.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l93.setEnabled(false);
        who_is_playing();
    }
    public void l94Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 94)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 94)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 94)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 94)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 94)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l94.setIcon(new ImageIcon("water_ship_hit.png"));
            l94.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l94.setIcon(new ImageIcon("water_ship_miss.png"));
            l94.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l94.setEnabled(false);
        who_is_playing();
    }
    public void l95Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 95)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 95)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 95)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 95)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 95)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l95.setIcon(new ImageIcon("water_ship_hit.png"));
            l95.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l95.setIcon(new ImageIcon("water_ship_miss.png"));
            l95.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l95.setEnabled(false);
        who_is_playing();
    }
    public void l96Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 96)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 96)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 96)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 96)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 96)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l96.setIcon(new ImageIcon("water_ship_hit.png"));
            l96.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l96.setIcon(new ImageIcon("water_ship_miss.png"));
            l96.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l96.setEnabled(false);
        who_is_playing();
    }
    public void l97Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 97)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 97)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 97)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 97)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 97)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l97.setIcon(new ImageIcon("water_ship_hit.png"));
            l97.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l97.setIcon(new ImageIcon("water_ship_miss.png"));
            l97.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l97.setEnabled(false);
        who_is_playing();
    }
    public void l98Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 98)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 98)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 98)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 98)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 98)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l98.setIcon(new ImageIcon("water_ship_hit.png"));
            l98.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l98.setIcon(new ImageIcon("water_ship_miss.png"));
            l98.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l98.setEnabled(false);
        who_is_playing();
    }
    public void l99Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 99)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 99)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 99)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 99)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 99)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l99.setIcon(new ImageIcon("water_ship_hit.png"));
            l99.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l99.setIcon(new ImageIcon("water_ship_miss.png"));
            l99.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l99.setEnabled(false);
        who_is_playing();
    }
    public void l100Call()
    {
        int flag = 0;
        for(int i = 0 ; i < 5 ; i ++)
        {
            if(com_aircraft_pos[i] == 100)
            {
                play_ai_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(com_battleship_pos[i] == 100)
            {
                play_bat_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_submarine_pos[i] == 100)
            {
                play_sub_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 3 ; i ++)
        {
            if(com_cruiser_pos[i] == 100)
            {
                play_cru_count++;
                flag = 1;
            }
        }
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(com_destroyer_pos[i] == 100)
            {
                play_des_count++;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            l100.setIcon(new ImageIcon("water_ship_hit.png"));
            l100.setDisabledIcon(new ImageIcon("water_ship_hit.png"));
            turn_flag = 0;
            refresh_flag = 0;
            play_hit_count++;
        }
        else
        {
            l100.setIcon(new ImageIcon("water_ship_miss.png"));
            l100.setDisabledIcon(new ImageIcon("water_ship_miss.png"));
            turn_flag = 1;
            refresh_flag = 1;
            miss();
        }
        l100.setEnabled(false);
        who_is_playing();
    }
}
