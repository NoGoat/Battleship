import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class data extends JFrame implements MouseMotionListener
{
    File audiofile;
    AudioInputStream as;
    AudioFormat f;
    DataLine.Info in;
    Clip ac;
    File audiofilem;
    AudioInputStream asm;
    AudioFormat fm;
    DataLine.Info inm;
    Clip acm;
    File audiofile_p;
    AudioInputStream as_p;
    AudioFormat f_p;
    DataLine.Info in_p;
    Clip ac_p;
    File audiofilem_p;
    AudioInputStream asm_p;
    AudioFormat fm_p;
    DataLine.Info inm_p;
    Clip acm_p;
    int air_temp_c = 0;
    int bat_temp_c = 0;
    int sub_temp_c = 0;
    int cru_temp_c = 0;
    int des_temp_c = 0;
    int air_temp_p = 0;
    int bat_temp_p = 0;
    int sub_temp_p = 0;
    int cru_temp_p = 0;
    int des_temp_p = 0;
    int air_up_assigned_1 = 0;
    int air_down_assigned_1 = 0;
    int air_left_assigned_1 = 0;
    int air_right_assigned_1 = 0;
    int air_up_assigned_2 = 0;
    int air_down_assigned_2 = 0;
    int air_left_assigned_2 = 0;
    int air_right_assigned_2 = 0;
    int air_up_assigned_3 = 0;
    int air_down_assigned_3 = 0;
    int air_left_assigned_3 = 0;
    int air_right_assigned_3 = 0;
    int bat_up_assigned_1 = 0;
    int bat_down_assigned_1 = 0;
    int bat_left_assigned_1 = 0;
    int bat_right_assigned_1 = 0;
    int bat_up_assigned_2 = 0;
    int bat_down_assigned_2 = 0;
    int bat_left_assigned_2 = 0;
    int bat_right_assigned_2 = 0;
    int sub_up_assigned_1 = 0;
    int sub_down_assigned_1 = 0;
    int sub_left_assigned_1 = 0;
    int sub_right_assigned_1 = 0;
    int cru_up_assigned_1 = 0;
    int cru_down_assigned_1 = 0;
    int cru_left_assigned_1 = 0;
    int cru_right_assigned_1 = 0;
    String next_move_flag = "none";
    int air_already_assigned = 0;
    int bat_already_assigned = 0;
    int sub_already_assigned = 0;
    int cru_already_assigned = 0;
    int des_already_assigned = 0;
    String air_calculated_orientation;
    String bat_calculated_orientation;
    String sub_calculated_orientation;
    String cru_calculated_orientation;
    int next_move = -1;
    int up_move = -1;
    int down_move = -1;
    int left_move = -1;
    int right_move = -1;
    int other_move = -1;
    Icon safe, found, hit;
    int com_is_hit_or_not;
    int air_or, bat_or, sub_or, cru_or, des_or;
    int air_or_c, bat_or_c, sub_or_c, cru_or_c, des_or_c;
    int play_hit_count = 0;
    int com_hit_count = 0;
    int play_ai_count = 0, play_bat_count = 0, play_sub_count = 0, play_cru_count = 0, play_des_count = 0;
    int com_ai_count = 0, com_bat_count = 0, com_sub_count = 0, com_cru_count = 0, com_des_count = 0;
    int turn_flag = 0, refresh_flag = 1;
    JLabel load = new JLabel("Please wait while the computer places its ships");
    JLabel p_air, p_bat, p_sub, p_cru, p_des, tp_air, tp_bat, tp_sub, tp_cru, tp_des;
    JLabel c_air, c_bat, c_sub, c_cru, c_des, tc_air, tc_bat, tc_sub, tc_cru, tc_des;
    Component com;
    JPanel play_hit = new JPanel();
    JButton l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37, l38, l39, l40, l41, l42, l43, l44, l45, l46, l47, l48, l49, l50, l51, l52, l53, l54, l55, l56, l57, l58, l59, l60, l61, l62, l63, l64, l65, l66, l67, l68, l69, l70, l71, l72, l73, l74, l75, l76, l77, l78, l79, l80, l81, l82, l83, l84, l85, l86, l87, l88, l89, l90, l91, l92, l93, l94, l95, l96, l97, l98, l99, l100;
    CardLayout crd = new CardLayout();
    Container co = getContentPane();
    JPanel j = new JPanel();
    JPanel loading = new JPanel();
    JProgressBar pb = new JProgressBar();
    Random r = new Random();
    long seed = r.nextInt();
    BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
    Point po;
    Component c;
    Component load_screen;
    JLabel cur = new JLabel(new ImageIcon("aircraft-carrier/aircraft-v.png"));
    JLabel tip = new JLabel("Press r to rotate the ship and place the ships by clicking at the desired location");
    JPanel p = new JPanel();
    int flag = 0;
    int xpos = 0 , ypos = 0 , xoffset = 25, yoffset = 10;
    int[] com_hit_grid = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89,90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
    int[] com_air_place_h = new int[60];
    int[] com_air_place_v = new int[60];
    int[] com_bat_place_h = new int[70];
    int[] com_bat_place_v = new int[70];
    int[] com_sub_place_h = new int[80];
    int[] com_sub_place_v = new int[80];
    int[] com_cru_place_h = new int[80];
    int[] com_cru_place_v = new int[80];
    int[] com_des_place_h = new int[90];
    int[] com_des_place_v = new int[90];
    String[] aircraft_pos = new String[5];
    String[] battleship_pos = new String[4];
    String[] submarine_pos = new String[3];
    String[] cruiser_pos = new String[3];
    String[] destroyer_pos = new String[2];
    int[] com_aircraft_pos = new int[5];
    int[] com_battleship_pos = new int[4];
    int[] com_submarine_pos = new int[3];
    int[] com_cruiser_pos = new int[3];
    int[] com_destroyer_pos = new int[2];
    int[] play_aircraft_pos = new int[5];
    int[] play_battleship_pos = new int[4];
    int[] play_submarine_pos = new int[3];
    int[] play_cruiser_pos = new int[3];
    int[] play_destroyer_pos = new int[2];
    JLabel l = new JLabel("That is an invalid move - Please try another move");
    int who_has_control = 0;
    int screen_check = 0;
    String path_h = "aircraft-carrier/aircraft-h.png";
    String path_v = "aircraft-carrier/aircraft-v.png";
    String cur_aircraft = "aircraft-carrier";
    JFrame PlayArea = new JFrame("Battleship");
    JButton j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, j75, j76, j77, j78, j79, j80, j81, j82, j83, j84, j85, j86, j87, j88, j89, j90, j91, j92, j93, j94, j95, j96, j97, j98, j99, j100;
    JButton play_hits, com_hits, back_p, back_c;
    JLabel logo;
    public void button_highlight()
    {
        j1.setBorderPainted(false);
        j2.setBorderPainted(false);
        j3.setBorderPainted(false);
        j4.setBorderPainted(false);
        j5.setBorderPainted(false);
        j6.setBorderPainted(false);
        j7.setBorderPainted(false);
        j8.setBorderPainted(false);
        j9.setBorderPainted(false);
        j10.setBorderPainted(false);
        j11.setBorderPainted(false);
        j12.setBorderPainted(false);
        j13.setBorderPainted(false);
        j14.setBorderPainted(false);
        j15.setBorderPainted(false);
        j16.setBorderPainted(false);
        j17.setBorderPainted(false);
        j18.setBorderPainted(false);
        j19.setBorderPainted(false);
        j20.setBorderPainted(false);
        j21.setBorderPainted(false);
        j22.setBorderPainted(false);
        j23.setBorderPainted(false);
        j24.setBorderPainted(false);
        j25.setBorderPainted(false);
        j26.setBorderPainted(false);
        j27.setBorderPainted(false);
        j28.setBorderPainted(false);
        j29.setBorderPainted(false);
        j30.setBorderPainted(false);
        j31.setBorderPainted(false);
        j32.setBorderPainted(false);
        j33.setBorderPainted(false);
        j34.setBorderPainted(false);
        j35.setBorderPainted(false);
        j36.setBorderPainted(false);
        j37.setBorderPainted(false);
        j38.setBorderPainted(false);
        j39.setBorderPainted(false);
        j40.setBorderPainted(false);
        j41.setBorderPainted(false);
        j42.setBorderPainted(false);
        j43.setBorderPainted(false);
        j44.setBorderPainted(false);
        j45.setBorderPainted(false);
        j46.setBorderPainted(false);
        j47.setBorderPainted(false);
        j48.setBorderPainted(false);
        j49.setBorderPainted(false);
        j50.setBorderPainted(false);
        j51.setBorderPainted(false);
        j52.setBorderPainted(false);
        j53.setBorderPainted(false);
        j54.setBorderPainted(false);
        j55.setBorderPainted(false);
        j56.setBorderPainted(false);
        j57.setBorderPainted(false);
        j58.setBorderPainted(false);
        j59.setBorderPainted(false);
        j60.setBorderPainted(false);
        j61.setBorderPainted(false);
        j62.setBorderPainted(false);
        j63.setBorderPainted(false);
        j64.setBorderPainted(false);
        j65.setBorderPainted(false);
        j66.setBorderPainted(false);
        j67.setBorderPainted(false);
        j68.setBorderPainted(false);
        j69.setBorderPainted(false);
        j70.setBorderPainted(false);
        j71.setBorderPainted(false);
        j72.setBorderPainted(false);
        j73.setBorderPainted(false);
        j74.setBorderPainted(false);
        j75.setBorderPainted(false);
        j76.setBorderPainted(false);
        j77.setBorderPainted(false);
        j78.setBorderPainted(false);
        j79.setBorderPainted(false);
        j80.setBorderPainted(false);
        j81.setBorderPainted(false);
        j82.setBorderPainted(false);
        j83.setBorderPainted(false);
        j84.setBorderPainted(false);
        j85.setBorderPainted(false);
        j86.setBorderPainted(false);
        j87.setBorderPainted(false);
        j88.setBorderPainted(false);
        j89.setBorderPainted(false);
        j90.setBorderPainted(false);
        j91.setBorderPainted(false);
        j92.setBorderPainted(false);
        j93.setBorderPainted(false);
        j94.setBorderPainted(false);
        j95.setBorderPainted(false);
        j96.setBorderPainted(false);
        j97.setBorderPainted(false);
        j98.setBorderPainted(false);
        j99.setBorderPainted(false);
        j100.setBorderPainted(false);
        if (c == j1)
        {
            j1.setBorderPainted(true);
        }
        else if (c == j2)
        {
            j2.setBorderPainted(true);
        }
        else if (c == j3)
        {
            j3.setBorderPainted(true);
        }
        else if (c == j4)
        {
            j4.setBorderPainted(true);
        }
        else if (c == j5)
        {
            j5.setBorderPainted(true);
        }
        else if (c == j6)
        {
            j6.setBorderPainted(true);
        }
        else if (c == j7)
        {
            j7.setBorderPainted(true);
        }
        else if (c == j8)
        {
            j8.setBorderPainted(true);
        }
        else if (c == j9)
        {
            j9.setBorderPainted(true);
        }
        else if (c == j10)
        {
            j10.setBorderPainted(true);
        }
        else if (c == j11)
        {
            j11.setBorderPainted(true);
        }
        else if (c == j12)
        {
            j12.setBorderPainted(true);
        }
        else if (c == j13)
        {
            j13.setBorderPainted(true);
        }
        else if (c == j14)
        {
            j14.setBorderPainted(true);
        }
        else if (c == j15)
        {
            j15.setBorderPainted(true);
        }
        else if (c == j16)
        {
            j16.setBorderPainted(true);
        }
        else if (c == j17)
        {
            j17.setBorderPainted(true);
        }
        else if (c == j18)
        {
            j18.setBorderPainted(true);
        }
        else if (c == j19)
        {
            j19.setBorderPainted(true);
        }
        else if (c == j20)
        {
            j20.setBorderPainted(true);
        }
        else if (c == j21)
        {
            j21.setBorderPainted(true);
        }
        else if (c == j22)
        {
            j22.setBorderPainted(true);
        }
        else if (c == j23)
        {
            j23.setBorderPainted(true);
        }
        else if (c == j24)
        {
            j24.setBorderPainted(true);
        }
        else if (c == j25)
        {
            j25.setBorderPainted(true);
        }
        else if (c == j26)
        {
            j26.setBorderPainted(true);
        }
        else if (c == j27)
        {
            j27.setBorderPainted(true);
        }
        else if (c == j28)
        {
            j28.setBorderPainted(true);
        }
        else if (c == j29)
        {
            j29.setBorderPainted(true);
        }
        else if (c == j30)
        {
            j30.setBorderPainted(true);
        }
        else if (c == j31)
        {
            j31.setBorderPainted(true);
        }
        else if (c == j32)
        {
            j32.setBorderPainted(true);
        }
        else if (c == j33)
        {
            j33.setBorderPainted(true);
        }
        else if (c == j34)
        {
            j34.setBorderPainted(true);
        }
        else if (c == j35)
        {
            j35.setBorderPainted(true);
        }
        else if (c == j36)
        {
            j36.setBorderPainted(true);
        }
        else if (c == j37)
        {
            j37.setBorderPainted(true);
        }
        else if (c == j38)
        {
            j38.setBorderPainted(true);
        }
        else if (c == j39)
        {
            j39.setBorderPainted(true);
        }
        else if (c == j40)
        {
            j40.setBorderPainted(true);
        }
        else if (c == j41)
        {
            j41.setBorderPainted(true);
        }
        else if (c == j42)
        {
            j42.setBorderPainted(true);
        }
        else if (c == j43)
        {
            j43.setBorderPainted(true);
        }
        else if (c == j44)
        {
            j44.setBorderPainted(true);
        }
        else if (c == j45)
        {
            j45.setBorderPainted(true);
        }
        else if (c == j46)
        {
            j46.setBorderPainted(true);
        }
        else if (c == j47)
        {
            j47.setBorderPainted(true);
        }
        else if (c == j48)
        {
            j48.setBorderPainted(true);
        }
        else if (c == j49)
        {
            j49.setBorderPainted(true);
        }
        else if (c == j50)
        {
            j50.setBorderPainted(true);
        }
        else if (c == j51)
        {
            j51.setBorderPainted(true);
        }
        else if (c == j52)
        {
            j52.setBorderPainted(true);
        }
        else if (c == j53)
        {
            j53.setBorderPainted(true);
        }
        else if (c == j54)
        {
            j54.setBorderPainted(true);
        }
        else if (c == j55)
        {
            j55.setBorderPainted(true);
        }
        else if (c == j56)
        {
            j56.setBorderPainted(true);
        }
        else if (c == j57)
        {
            j57.setBorderPainted(true);
        }
        else if (c == j58)
        {
            j58.setBorderPainted(true);
        }
        else if (c == j59)
        {
            j59.setBorderPainted(true);
        }
        else if (c == j60)
        {
            j60.setBorderPainted(true);
        }
        else if (c == j61)
        {
            j61.setBorderPainted(true);
        }
        else if (c == j62)
        {
            j62.setBorderPainted(true);
        }
        else if (c == j63)
        {
            j63.setBorderPainted(true);
        }
        else if (c == j64)
        {
            j64.setBorderPainted(true);
        }
        else if (c == j65)
        {
            j65.setBorderPainted(true);
        }
        else if (c == j66)
        {
            j66.setBorderPainted(true);
        }
        else if (c == j67)
        {
            j67.setBorderPainted(true);
        }
        else if (c == j68)
        {
            j68.setBorderPainted(true);
        }
        else if (c == j69)
        {
            j69.setBorderPainted(true);
        }
        else if (c == j70)
        {
            j70.setBorderPainted(true);
        }
        else if (c == j71)
        {
            j71.setBorderPainted(true);
        }
        else if (c == j72)
        {
            j72.setBorderPainted(true);
        }
        else if (c == j73)
        {
            j73.setBorderPainted(true);
        }
        else if (c == j74)
        {
            j74.setBorderPainted(true);
        }
        else if (c == j75)
        {
            j75.setBorderPainted(true);
        }
        else if (c == j76)
        {
            j76.setBorderPainted(true);
        }
        else if (c == j77)
        {
            j77.setBorderPainted(true);
        }
        else if (c == j78)
        {
            j78.setBorderPainted(true);
        }
        else if (c == j79)
        {
            j79.setBorderPainted(true);
        }
        else if (c == j80)
        {
            j80.setBorderPainted(true);
        }
        else if (c == j81)
        {
            j81.setBorderPainted(true);
        }
        else if (c == j82)
        {
            j82.setBorderPainted(true);
        }
        else if (c == j83)
        {
            j83.setBorderPainted(true);
        }
        else if (c == j84)
        {
            j84.setBorderPainted(true);
        }
        else if (c == j85)
        {
            j85.setBorderPainted(true);
        }
        else if (c == j86)
        {
            j86.setBorderPainted(true);
        }
        else if (c == j87)
        {
            j87.setBorderPainted(true);
        }
        else if (c == j88)
        {
            j88.setBorderPainted(true);
        }
        else if (c == j89)
        {
            j89.setBorderPainted(true);
        }
        else if (c == j90)
        {
            j90.setBorderPainted(true);
        }
        else if (c == j91)
        {
            j91.setBorderPainted(true);
        }
        else if (c == j92)
        {
            j92.setBorderPainted(true);
        }
        else if (c == j93)
        {
            j93.setBorderPainted(true);
        }
        else if (c == j94)
        {
            j94.setBorderPainted(true);
        }
        else if (c == j95)
        {
            j95.setBorderPainted(true);
        }
        else if (c == j96)
        {
            j96.setBorderPainted(true);
        }
        else if (c == j97)
        {
            j97.setBorderPainted(true);
        }
        else if (c == j98)
        {
            j98.setBorderPainted(true);
        }
        else if (c == j99)
        {
            j99.setBorderPainted(true);
        }
        else if (c == j100)
        {
            j100.setBorderPainted(true);
        }
        l1.setBorderPainted(false);
        l2.setBorderPainted(false);
        l3.setBorderPainted(false);
        l4.setBorderPainted(false);
        l5.setBorderPainted(false);
        l6.setBorderPainted(false);
        l7.setBorderPainted(false);
        l8.setBorderPainted(false);
        l9.setBorderPainted(false);
        l10.setBorderPainted(false);
        l11.setBorderPainted(false);
        l12.setBorderPainted(false);
        l13.setBorderPainted(false);
        l14.setBorderPainted(false);
        l15.setBorderPainted(false);
        l16.setBorderPainted(false);
        l17.setBorderPainted(false);
        l18.setBorderPainted(false);
        l19.setBorderPainted(false);
        l20.setBorderPainted(false);
        l21.setBorderPainted(false);
        l22.setBorderPainted(false);
        l23.setBorderPainted(false);
        l24.setBorderPainted(false);
        l25.setBorderPainted(false);
        l26.setBorderPainted(false);
        l27.setBorderPainted(false);
        l28.setBorderPainted(false);
        l29.setBorderPainted(false);
        l30.setBorderPainted(false);
        l31.setBorderPainted(false);
        l32.setBorderPainted(false);
        l33.setBorderPainted(false);
        l34.setBorderPainted(false);
        l35.setBorderPainted(false);
        l36.setBorderPainted(false);
        l37.setBorderPainted(false);
        l38.setBorderPainted(false);
        l39.setBorderPainted(false);
        l40.setBorderPainted(false);
        l41.setBorderPainted(false);
        l42.setBorderPainted(false);
        l43.setBorderPainted(false);
        l44.setBorderPainted(false);
        l45.setBorderPainted(false);
        l46.setBorderPainted(false);
        l47.setBorderPainted(false);
        l48.setBorderPainted(false);
        l49.setBorderPainted(false);
        l50.setBorderPainted(false);
        l51.setBorderPainted(false);
        l52.setBorderPainted(false);
        l53.setBorderPainted(false);
        l54.setBorderPainted(false);
        l55.setBorderPainted(false);
        l56.setBorderPainted(false);
        l57.setBorderPainted(false);
        l58.setBorderPainted(false);
        l59.setBorderPainted(false);
        l60.setBorderPainted(false);
        l61.setBorderPainted(false);
        l62.setBorderPainted(false);
        l63.setBorderPainted(false);
        l64.setBorderPainted(false);
        l65.setBorderPainted(false);
        l66.setBorderPainted(false);
        l67.setBorderPainted(false);
        l68.setBorderPainted(false);
        l69.setBorderPainted(false);
        l70.setBorderPainted(false);
        l71.setBorderPainted(false);
        l72.setBorderPainted(false);
        l73.setBorderPainted(false);
        l74.setBorderPainted(false);
        l75.setBorderPainted(false);
        l76.setBorderPainted(false);
        l77.setBorderPainted(false);
        l78.setBorderPainted(false);
        l79.setBorderPainted(false);
        l80.setBorderPainted(false);
        l81.setBorderPainted(false);
        l82.setBorderPainted(false);
        l83.setBorderPainted(false);
        l84.setBorderPainted(false);
        l85.setBorderPainted(false);
        l86.setBorderPainted(false);
        l87.setBorderPainted(false);
        l88.setBorderPainted(false);
        l89.setBorderPainted(false);
        l90.setBorderPainted(false);
        l91.setBorderPainted(false);
        l92.setBorderPainted(false);
        l93.setBorderPainted(false);
        l94.setBorderPainted(false);
        l95.setBorderPainted(false);
        l96.setBorderPainted(false);
        l97.setBorderPainted(false);
        l98.setBorderPainted(false);
        l99.setBorderPainted(false);
        l100.setBorderPainted(false);
        back_p.setBorderPainted(false);
        back_c.setBorderPainted(false);
        com_hits.setBorderPainted(false);
        play_hits.setBorderPainted(false);
        if (com == l1)
        {
            l1.setBorderPainted(true);
        }
        else if (com == l2)
        {
            l2.setBorderPainted(true);
        }
        else if (com == l3)
        {
            l3.setBorderPainted(true);
        }
        else if (com == l4)
        {
            l4.setBorderPainted(true);
        }
        else if (com == l5)
        {
            l5.setBorderPainted(true);
        }
        else if (com == l6)
        {
            l6.setBorderPainted(true);
        }
        else if (com == l7)
        {
            l7.setBorderPainted(true);
        }
        else if (com == l8)
        {
            l8.setBorderPainted(true);
        }
        else if (com == l9)
        {
            l9.setBorderPainted(true);
        }
        else if (com == l10)
        {
            l10.setBorderPainted(true);
        }
        else if (com == l11)
        {
            l11.setBorderPainted(true);
        }
        else if (com == l12)
        {
            l12.setBorderPainted(true);
        }
        else if (com == l13)
        {
            l13.setBorderPainted(true);
        }
        else if (com == l14)
        {
            l14.setBorderPainted(true);
        }
        else if (com == l15)
        {
            l15.setBorderPainted(true);
        }
        else if (com == l16)
        {
            l16.setBorderPainted(true);
        }
        else if (com == l17)
        {
            l17.setBorderPainted(true);
        }
        else if (com == l18)
        {
            l18.setBorderPainted(true);
        }
        else if (com == l19)
        {
            l19.setBorderPainted(true);
        }
        else if (com == l20)
        {
            l20.setBorderPainted(true);
        }
        else if (com == l21)
        {
            l21.setBorderPainted(true);
        }
        else if (com == l22)
        {
            l22.setBorderPainted(true);
        }
        else if (com == l23)
        {
            l23.setBorderPainted(true);
        }
        else if (com == l24)
        {
            l24.setBorderPainted(true);
        }
        else if (com == l25)
        {
            l25.setBorderPainted(true);
        }
        else if (com == l26)
        {
            l26.setBorderPainted(true);
        }
        else if (com == l27)
        {
            l27.setBorderPainted(true);
        }
        else if (com == l28)
        {
            l28.setBorderPainted(true);
        }
        else if (com == l29)
        {
            l29.setBorderPainted(true);
        }
        else if (com == l30)
        {
            l30.setBorderPainted(true);
        }
        else if (com == l31)
        {
            l31.setBorderPainted(true);
        }
        else if (com == l32)
        {
            l32.setBorderPainted(true);
        }
        else if (com == l33)
        {
            l33.setBorderPainted(true);
        }
        else if (com == l34)
        {
            l34.setBorderPainted(true);
        }
        else if (com == l35)
        {
            l35.setBorderPainted(true);
        }
        else if (com == l36)
        {
            l36.setBorderPainted(true);
        }
        else if (com == l37)
        {
            l37.setBorderPainted(true);
        }
        else if (com == l38)
        {
            l38.setBorderPainted(true);
        }
        else if (com == l39)
        {
            l39.setBorderPainted(true);
        }
        else if (com == l40)
        {
            l40.setBorderPainted(true);
        }
        else if (com == l41)
        {
            l41.setBorderPainted(true);
        }
        else if (com == l42)
        {
            l42.setBorderPainted(true);
        }
        else if (com == l43)
        {
            l43.setBorderPainted(true);
        }
        else if (com == l44)
        {
            l44.setBorderPainted(true);
        }
        else if (com == l45)
        {
            l45.setBorderPainted(true);
        }
        else if (com == l46)
        {
            l46.setBorderPainted(true);
        }
        else if (com == l47)
        {
            l47.setBorderPainted(true);
        }
        else if (com == l48)
        {
            l48.setBorderPainted(true);
        }
        else if (com == l49)
        {
            l49.setBorderPainted(true);
        }
        else if (com == l50)
        {
            l50.setBorderPainted(true);
        }
        else if (com == l51)
        {
            l51.setBorderPainted(true);
        }
        else if (com == l52)
        {
            l52.setBorderPainted(true);
        }
        else if (com == l53)
        {
            l53.setBorderPainted(true);
        }
        else if (com == l54)
        {
            l54.setBorderPainted(true);
        }
        else if (com == l55)
        {
            l55.setBorderPainted(true);
        }
        else if (com == l56)
        {
            l56.setBorderPainted(true);
        }
        else if (com == l57)
        {
            l57.setBorderPainted(true);
        }
        else if (com == l58)
        {
            l58.setBorderPainted(true);
        }
        else if (com == l59)
        {
            l59.setBorderPainted(true);
        }
        else if (com == l60)
        {
            l60.setBorderPainted(true);
        }
        else if (com == l61)
        {
            l61.setBorderPainted(true);
        }
        else if (com == l62)
        {
            l62.setBorderPainted(true);
        }
        else if (com == l63)
        {
            l63.setBorderPainted(true);
        }
        else if (com == l64)
        {
            l64.setBorderPainted(true);
        }
        else if (com == l65)
        {
            l65.setBorderPainted(true);
        }
        else if (com == l66)
        {
            l66.setBorderPainted(true);
        }
        else if (com == l67)
        {
            l67.setBorderPainted(true);
        }
        else if (com == l68)
        {
            l68.setBorderPainted(true);
        }
        else if (com == l69)
        {
            l69.setBorderPainted(true);
        }
        else if (com == l70)
        {
            l70.setBorderPainted(true);
        }
        else if (com == l71)
        {
            l71.setBorderPainted(true);
        }
        else if (com == l72)
        {
            l72.setBorderPainted(true);
        }
        else if (com == l73)
        {
            l73.setBorderPainted(true);
        }
        else if (com == l74)
        {
            l74.setBorderPainted(true);
        }
        else if (com == l75)
        {
            l75.setBorderPainted(true);
        }
        else if (com == l76)
        {
            l76.setBorderPainted(true);
        }
        else if (com == l77)
        {
            l77.setBorderPainted(true);
        }
        else if (com == l78)
        {
            l78.setBorderPainted(true);
        }
        else if (com == l79)
        {
            l79.setBorderPainted(true);
        }
        else if (com == l80)
        {
            l80.setBorderPainted(true);
        }
        else if (com == l81)
        {
            l81.setBorderPainted(true);
        }
        else if (com == l82)
        {
            l82.setBorderPainted(true);
        }
        else if (com == l83)
        {
            l83.setBorderPainted(true);
        }
        else if (com == l84)
        {
            l84.setBorderPainted(true);
        }
        else if (com == l85)
        {
            l85.setBorderPainted(true);
        }
        else if (com == l86)
        {
            l86.setBorderPainted(true);
        }
        else if (com == l87)
        {
            l87.setBorderPainted(true);
        }
        else if (com == l88)
        {
            l88.setBorderPainted(true);
        }
        else if (com == l89)
        {
            l89.setBorderPainted(true);
        }
        else if (com == l90)
        {
            l90.setBorderPainted(true);
        }
        else if (com == l91)
        {
            l91.setBorderPainted(true);
        }
        else if (com == l92)
        {
            l92.setBorderPainted(true);
        }
        else if (com == l93)
        {
            l93.setBorderPainted(true);
        }
        else if (com == l94)
        {
            l94.setBorderPainted(true);
        }
        else if (com == l95)
        {
            l95.setBorderPainted(true);
        }
        else if (com == l96)
        {
            l96.setBorderPainted(true);
        }
        else if (com == l97)
        {
            l97.setBorderPainted(true);
        }
        else if (com == l98)
        {
            l98.setBorderPainted(true);
        }
        else if (com == l99)
        {
            l99.setBorderPainted(true);
        }
        else if (com == l100)
        {
            l100.setBorderPainted(true);
        }
        if (load_screen == play_hits && turn_flag == 2)
        {
            play_hits.setBorderPainted(true);
            //System.out.println("In Play Hits");
        }
        if (load_screen == com_hits && turn_flag == 2)
        {
            com_hits.setBorderPainted(true);
            //System.out.println("In Com Hits");
        }
        else if (c == back_c && turn_flag == 2)
        {
            back_c.setBorderPainted(true);
            //System.out.println("In back_c");
        }
        if (com == back_p && turn_flag == 2)
        {
            back_p.setBorderPainted(true);
            //System.out.println("In back_p");
        }
    }
    public void explosion()
    {
        try
        {
            ac.setFramePosition(0);
            ac.start();
            //System.out.println("In Explosion try");
        }
        catch (Exception ex)
        {
            ac.setFramePosition(0);
            ac.start();
            //System.out.println("In Explosion catch");
            ex.printStackTrace();
        }
    }
    public void miss()
    {
        try
        {
            acm.setFramePosition(0);
            acm.start();
            //System.out.println("In Miss try");
        }
        catch (Exception ex)
        {
            acm.setFramePosition(0);
            acm.start();
            //System.out.println("In Miss catch");
            ex.printStackTrace();
        }
    }
    public void explosion_p()
    {
        try
        {
            ac_p.setFramePosition(0);
            ac_p.start();
            //System.out.println("In Explosion try Player");
        }
        catch (Exception ex)
        {
            ac_p.setFramePosition(0);
            ac_p.start();
            //System.out.println("In Explosion catch Player");
            ex.printStackTrace();
        }
    }
    public void miss_p()
    {
        try
        {
            acm_p.setFramePosition(0);
            acm_p.start();
            //System.out.println("In Miss try Player");
        }
        catch (Exception ex)
        {
            acm_p.setFramePosition(0);
            acm_p.start();
            //System.out.println("In Miss catch Player");
            ex.printStackTrace();
        }
    }
    public JButton play_render(JButton b, int pos)
    {
        if(!b.isEnabled())
        {
            int no_hits = 0;
            if (air_or_c == 0)
            {
                //System.out.println("In Aircraft 0");
                for (int i = 0; i < 5; i++)
                {
                    if (com_aircraft_pos[i] == pos)
                    {
                        next_move_flag = "aircraft-carrier";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-destroyed-tile-" + iconpos + ".png"));
                        com_hit_count++;
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_ai_count++;
                        no_hits = 1;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (air_or_c == 1)
            {
                //System.out.println("In Aircraft 1");
                for (int i = 0; i < 5; i++)
                {
                    if (com_aircraft_pos[i] == pos)
                    {
                        next_move_flag = "aircraft-carrier";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_ai_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (bat_or_c == 0)
            {
                //System.out.println("In Battleship 0");
                for (int i = 0; i < 4; i++)
                {
                    if (com_battleship_pos[i] == pos)
                    {
                        next_move_flag = "battleship";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("battleship/battleship-h-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("battleship/battleship-h-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_bat_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (bat_or_c == 1)
            {
                //System.out.println("In Battleship 1");
                for (int i = 0; i < 4; i++)
                {
                    if (com_battleship_pos[i] == pos)
                    {
                        next_move_flag = "battleship";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("battleship/battleship-v-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("battleship/battleship-v-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_bat_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (sub_or_c == 0)
            {
                //System.out.println("In Submarine 0");
                for (int i = 0; i < 3; i++)
                {
                    if (com_submarine_pos[i] == pos)
                    {
                        next_move_flag = "submarine";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("submarine/submarine-h-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("submarine/submarine-h-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_sub_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (sub_or_c == 1)
            {
                //System.out.println("In Submarine 1");
                for (int i = 0; i < 3; i++)
                {
                    if (com_submarine_pos[i] == pos)
                    {
                        next_move_flag = "submarine";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("submarine/submarine-v-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("submarine/submarine-v-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_sub_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (cru_or_c == 0)
            {
                //System.out.println("In Cruiser 0");
                for (int i = 0; i < 3; i++)
                {
                    if (com_cruiser_pos[i] == pos)
                    {
                        next_move_flag = "cruiser";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("cruiser/cruiser-h-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_cru_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (cru_or_c == 1)
            {
                //System.out.println("In Cruiser 1");
                for (int i = 0; i < 3; i++)
                {
                    if (com_cruiser_pos[i] == pos)
                    {
                        next_move_flag = "cruiser";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("cruiser/cruiser-v-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_cru_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (des_or_c == 0)
            {
                //System.out.println("In Destroyer 0");
                for (int i = 0; i < 2; i++)
                {
                    if (com_destroyer_pos[i] == pos)
                    {
                        next_move_flag = "destroyer";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("destroyer/destroyer-h-destroyed-tile" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-destroyed-tile" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_des_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (des_or_c == 1)
            {
                //System.out.println("In Destroyer 1");
                for (int i = 0; i < 2; i++)
                {
                    if (com_destroyer_pos[i] == pos)
                    {
                        next_move_flag = "destroyer";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("destroyer/destroyer-v-destroyed-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-destroyed-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-destroyed-tile-" + iconpos + ".png");
                        com_des_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
        }
        else
        {
            int no_hits = 0;
            if (air_or_c == 0)
            {
                //System.out.println("In Aircraft 0");
                for (int i = 0; i < 5; i++)
                {
                    if (com_aircraft_pos[i] == pos)
                    {
                        next_move_flag = "aircraft-carrier";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-h-tile-" + iconpos + ".png"));
                        com_hit_count++;
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_ai_count++;
                        no_hits = 1;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (air_or_c == 1)
            {
                //System.out.println("In Aircraft 1");
                for (int i = 0; i < 5; i++)
                {
                    if (com_aircraft_pos[i] == pos)
                    {
                        next_move_flag = "aircraft-carrier";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_ai_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (bat_or_c == 0)
            {
                //System.out.println("In Battleship 0");
                for (int i = 0; i < 4; i++)
                {
                    if (com_battleship_pos[i] == pos)
                    {
                        next_move_flag = "battleship";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("battleship/battleship-h-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("battleship/battleship-h-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_bat_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (bat_or_c == 1)
            {
                //System.out.println("In Battleship 1");
                for (int i = 0; i < 4; i++)
                {
                    if (com_battleship_pos[i] == pos)
                    {
                        next_move_flag = "battleship";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("battleship/battleship-v-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("battleship/battleship-v-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_bat_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (sub_or_c == 0)
            {
                //System.out.println("In Submarine 0");
                for (int i = 0; i < 3; i++)
                {
                    if (com_submarine_pos[i] == pos)
                    {
                        next_move_flag = "submarine";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("submarine/submarine-h-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("submarine/submarine-h-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_sub_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (sub_or_c == 1)
            {
                //System.out.println("In Submarine 1");
                for (int i = 0; i < 3; i++)
                {
                    if (com_submarine_pos[i] == pos)
                    {
                        next_move_flag = "submarine";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("submarine/submarine-v-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("submarine/submarine-v-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_sub_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (cru_or_c == 0)
            {
                //System.out.println("In Cruiser 0");
                for (int i = 0; i < 3; i++)
                {
                    if (com_cruiser_pos[i] == pos)
                    {
                        next_move_flag = "cruiser";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("cruiser/cruiser-h-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("cruiser/cruiser-h-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_cru_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (cru_or_c == 1)
            {
                //System.out.println("In Cruiser 1");
                for (int i = 0; i < 3; i++)
                {
                    if (com_cruiser_pos[i] == pos)
                    {
                        next_move_flag = "cruiser";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("cruiser/cruiser-v-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("cruiser/cruiser-v-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_cru_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (des_or_c == 0)
            {
                //System.out.println("In Destroyer 0");
                for (int i = 0; i < 2; i++)
                {
                    if (com_destroyer_pos[i] == pos)
                    {
                        next_move_flag = "destroyer";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("destroyer/destroyer-h-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("destroyer/destroyer-h-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_des_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
            if (des_or_c == 1)
            {
                //System.out.println("In Destroyer 1");
                for (int i = 0; i < 2; i++)
                {
                    if (com_destroyer_pos[i] == pos)
                    {
                        next_move_flag = "destroyer";
                        int iconpos = i + 1;
                        com_is_hit_or_not = 1;
                        b.setIcon(new ImageIcon("destroyer/destroyer-v-tile-" + iconpos + ".png"));
                        b.setDisabledIcon(new ImageIcon("destroyer/destroyer-v-tile-" + iconpos + ".png"));
                        //System.out.println("aircraft-carrier/aircraft-v-tile-" + iconpos + ".png");
                        com_des_count++;
                        no_hits = 1;
                        com_hit_count++;
                        j.revalidate();
                        j.repaint();
                        return b;
                    }
                }
            }
        }
        return b;
    }
    public void play_render_call()
    {
        l1 = play_render(l1, 1);
        l2 = play_render(l2, 2);
        l3 = play_render(l3, 3);
        l4 = play_render(l4, 4);
        l5 = play_render(l5, 5);
        l6 = play_render(l6, 6);
        l7 = play_render(l7, 7);
        l8 = play_render(l8, 8);
        l9 = play_render(l9, 9);
        l10 = play_render(l10, 10);
        l11 = play_render(l11, 11);
        l12 = play_render(l12, 12);
        l13 = play_render(l13, 13);
        l14 = play_render(l14, 14);
        l15 = play_render(l15, 15);
        l16 = play_render(l16, 16);
        l17 = play_render(l17, 17);
        l18 = play_render(l18, 18);
        l19 = play_render(l19, 19);
        l20 = play_render(l20, 20);
        l21 = play_render(l21, 21);
        l22 = play_render(l22, 22);
        l23 = play_render(l23, 23);
        l24 = play_render(l24, 24);
        l25 = play_render(l25, 25);
        l26 = play_render(l26, 26);
        l27 = play_render(l27, 27);
        l28 = play_render(l28, 28);
        l29 = play_render(l29, 29);
        l30 = play_render(l30, 30);
        l31 = play_render(l31, 31);
        l32 = play_render(l32, 32);
        l33 = play_render(l33, 33);
        l34 = play_render(l34, 34);
        l35 = play_render(l35, 35);
        l36 = play_render(l36, 36);
        l37 = play_render(l37, 37);
        l38 = play_render(l38, 38);
        l39 = play_render(l39, 39);
        l40 = play_render(l40, 40);
        l41 = play_render(l41, 41);
        l42 = play_render(l42, 42);
        l43 = play_render(l43, 43);
        l44 = play_render(l44, 44);
        l45 = play_render(l45, 45);
        l46 = play_render(l46, 46);
        l47 = play_render(l47, 47);
        l48 = play_render(l48, 48);
        l49 = play_render(l49, 49);
        l50 = play_render(l50, 50);
        l51 = play_render(l51, 51);
        l52 = play_render(l52, 52);
        l53 = play_render(l53, 53);
        l54 = play_render(l54, 54);
        l55 = play_render(l55, 55);
        l56 = play_render(l56, 56);
        l57 = play_render(l57, 57);
        l58 = play_render(l58, 58);
        l59 = play_render(l59, 59);
        l60 = play_render(l60, 60);
        l61 = play_render(l61, 61);
        l62 = play_render(l62, 62);
        l63 = play_render(l63, 63);
        l64 = play_render(l64, 64);
        l65 = play_render(l65, 65);
        l66 = play_render(l66, 66);
        l67 = play_render(l67, 67);
        l68 = play_render(l68, 68);
        l69 = play_render(l69, 69);
        l70 = play_render(l70, 70);
        l71 = play_render(l71, 71);
        l72 = play_render(l72, 72);
        l73 = play_render(l73, 73);
        l74 = play_render(l74, 74);
        l75 = play_render(l75, 75);
        l76 = play_render(l76, 76);
        l77 = play_render(l77, 77);
        l78 = play_render(l78, 78);
        l79 = play_render(l79, 79);
        l80 = play_render(l80, 80);
        l81 = play_render(l81, 81);
        l82 = play_render(l82, 82);
        l83 = play_render(l83, 83);
        l84 = play_render(l84, 84);
        l85 = play_render(l85, 85);
        l86 = play_render(l86, 86);
        l87 = play_render(l87, 87);
        l88 = play_render(l88, 88);
        l89 = play_render(l89, 89);
        l90 = play_render(l90, 90);
        l91 = play_render(l91, 91);
        l92 = play_render(l92, 92);
        l93 = play_render(l93, 93);
        l94 = play_render(l94, 94);
        l95 = play_render(l95, 95);
        l96 = play_render(l96, 96);
        l97 = play_render(l97, 97);
        l98 = play_render(l98, 98);
        l99 = play_render(l99, 99);
        l100 = play_render(l100, 100);
    }
    public void mouseMoved(MouseEvent e)
    {
        cur.setBounds(e.getPoint().x - xoffset, e.getPoint().y - yoffset, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
        //p.add(cur);
        cur.repaint();
        xpos = e.getPoint().x - xoffset;
        ypos = e.getPoint().y - yoffset;
        seed = seed + xpos + ypos;
        po = SwingUtilities.convertPoint(p, e.getPoint(), j);
        c = SwingUtilities.getDeepestComponentAt(j, po.x, po.y);
        com = SwingUtilities.getDeepestComponentAt(play_hit, po.x, po.y);
        load_screen = SwingUtilities.getDeepestComponentAt(loading, po.x, po.y);
        button_highlight();
    }

    public void mouseDragged(MouseEvent e)
    {
        cur.setBounds(e.getPoint().x - xoffset, e.getPoint().y - yoffset, (int)cur.getPreferredSize().getWidth(), (int)cur.getPreferredSize().getHeight());
        //p.add(cur);
        cur.repaint();
        xpos = e.getPoint().x - xoffset;
        ypos = e.getPoint().y - yoffset;
        seed = seed + xpos + ypos;
        po = SwingUtilities.convertPoint(p, e.getPoint(), j);
        c = SwingUtilities.getDeepestComponentAt(j, po.x, po.y);
        com = SwingUtilities.getDeepestComponentAt(play_hit, po.x, po.y);
        load_screen = SwingUtilities.getDeepestComponentAt(loading, po.x, po.y);
        button_highlight();
    }
}
