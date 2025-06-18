package chstone12.quick_commands;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.class_2168;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_3218;

import static chstone12.quick_commands.functions.*;
import static chstone12.quick_commands.quick_commands.chat;
import static chstone12.quick_commands.quick_commands.is_this_number;

public class write {
    private static final class_2338.class_2339 mutPos = new class_2338.class_2339();

    public static void write_text(CommandContext<class_2168> context, String args2, String args3, String args4) {
        if(args2.equals("null") || args3.equals("null")) send_error_message(context, "쓸 텍스트와 방향을 입력해 주세요.");
        else if(!args3.equals("n") && !args3.equals("e") && !args3.equals("w") && !args3.equals("s") && !(args3.length() >= 2 && args3.charAt(1) == 'l')) send_error_message(context, chat + "방향은 n, e, w, s, nl, el, wl, sl 중 하나를 입력해야 합니다.");
        else {

            if(args2.contains("170")) args2 = args2.replace("170", "169.9");

            // args3 = dir = n, e, w, s, nl, el, wl, sl

            String block;
            if(args4.equals("null")) block = "iron_block";
            else if(is_this_number(args4.replaceFirst("\\.", ""))) block = convert_number_to_item(args4);
            else block = args4;

            int x = context.getSource().method_44023().method_31477();
            int y = context.getSource().method_44023().method_31478();
            int z = context.getSource().method_44023().method_31479();
            String[] split = args2.split("");
            class_3218 sw = context.getSource().method_9225();
            class_2338 pos = class_2338.method_49638(new class_243(x, y, z));
            class_2680 bl = class_2246.field_55984.method_9564();
            int count = 0;

            if(args3.startsWith("n")) {
                count = z;
                for(String s : split) {

                    for(int i = 0; i <= 4; i++) fillblock(x, y-2, z-i, sw, class_2246.field_10124.method_9564());

                    z--;
                    if(s.equals("a")) {
                        setblock(x, y+1, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("1")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("2")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                    }
                    else if (s.equals("3")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("4")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y+2, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("5")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("6")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("7")) {
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("8")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("9")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                    }
                    else if(s.equals("0")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z--;
                    }

                    else if (s.equals("b")) {
                        fillblock(x, y, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;

                        setblock(x, y + 1, z, sw, bl);
                        z--;
                    } else if (s.equals("c")) {
                        setblock(x, y + 1, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("d")) {
                        setblock(x, y + 1, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;

                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("e")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("f")) {
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        fillblock(x, y - 1, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("g")) {
                        setblock(x, y - 2, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        setblock(x, y - 2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y - 1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                    } else if (s.equals("h")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                    } else if (s.equals("i")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("j")) {
                        setblock(x, y - 1, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("k")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("l")) {
                        setblock(x, y + 4, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("m")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                    } else if (s.equals("n")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                    } else if (s.equals("o")) {
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                    } else if (s.equals("p")) {
                        fillblock(x, y - 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                    } else if (s.equals("q")) {
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        fillblock(x, y - 2, z, sw, bl);
                        z--;
                    } else if (s.equals("r")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("s")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("t")) {
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("u")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("v")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("w")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("x")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("y")) {
                        setblock(x, y - 2, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y - 2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y - 1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals(" ")) z--;
                    else if (s.equals("A")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("B")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("C")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("D")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("E")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("F")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("G")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("H")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("I")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("J")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("K")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("L")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("M")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("N")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("O")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("P")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("Q")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y - 1, z, sw, bl);
                        z--;
                    } else if (s.equals("R")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("S")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("T")) {
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("U")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("V")) {
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("W")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("X")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("Y")) {
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("Z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("!")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("@")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("$")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y - 1, z, sw, bl);
                        setblock(x, y + 5, z, sw, bl);
                        z--;

                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("#")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("%")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("^")) {
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("&")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y - 1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("*")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("(")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals(")")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("_")) {
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("-")) {
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("=")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("+")) {
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("~")) {
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("`")) {
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("[")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("]")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("{")) {
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("}")) {
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals("\\")) {
                        setblock(x, y + 4, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z--;
                    } else if (s.equals("/")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("|")) {
                        fillblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals(";")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals(":")) {
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                    } else if (s.equals("'")) {
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals("\"")) {
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z -= 2;
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals(",")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y - 1, z, sw, bl);
                        z--;
                    } else if (s.equals("<")) {
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    } else if (s.equals(">")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 1, z, sw, bl);
                        setblock(x, y + 3, z, sw, bl);
                        z--;
                        setblock(x, y + 2, z, sw, bl);
                        z--;
                    } else if (s.equals(".")) {
                        setblock(x, y, z, sw, bl);
                        z--;
                    } else if (s.equals("?")) {
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y + 2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                        setblock(x, y + 3, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);
                        z--;
                    }

                }
            }


            else if(args3.startsWith("s")) {
                count = z;
                for(String s : split) {

                    for(int i = 0; i <= 4; i++) fillblock(x, y-2, z+i, sw, class_2246.field_10124.method_9564());

                    z++;
                    if(s.equals("a")) {
                        setblock(x, y+1, z, sw, bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("1")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("2")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if (s.equals("3")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("4")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("5")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("6")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("7")) {
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("8")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("9")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("0")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("b")) {
                        fillblock(x, y, z, sw, bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;

                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("c")) {
                        setblock(x, y+1, z, sw, bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("d")) {
                        setblock(x, y+1, z, sw ,bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;

                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("e")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("f")) {
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        fillblock(x, y-1, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("g")) {
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("h")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("i")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("j")) {
                        setblock(x, y-1, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);

                        z++;
                    }
                    else if(s.equals("k")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("l")) {
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("m")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("n")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("o")) {
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("p")) {
                        fillblock(x, y-2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("q")) {
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        fillblock(x, y-2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("r")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("s")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    } else if (s.equals("t")) {
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("u")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("v")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("w")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("x")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("y")) {
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals(" ")) z++;
                    else if(s.equals("A")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("B")) {
                        fillblock(x, y, z, sw ,bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("C")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("D")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("E")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("F")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("G")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("H")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("I")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("J")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("K")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("L")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("M")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("N")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("O")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("P")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("Q")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("R")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("S")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("T")) {
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("U")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("V")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x,y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x,y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("W")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("X")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("Y")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("Z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("!")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("@")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("$")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y+5, z, sw, bl);
                        z++;

                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("#")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("%")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("^")) {
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("&")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("*")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("(")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals(")")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("_")) {
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("-")) {
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("=")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("+")) {
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("~")) {
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x,y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("`")) {
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("[")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("]")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("{")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("}")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("\\")) {
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("/")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("|")) {
                        fillblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals(";")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals(":")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("'")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("\"")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z+=2;
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals(",")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("<")) {
                        setblock(x, y+2, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }
                    else if(s.equals(">")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        z++;
                        setblock(x, y+2, z, sw, bl);
                        z++;
                    }
                    else if(s.equals(".")) {
                        setblock(x, y, z, sw, bl);
                        z++;
                    }
                    else if(s.equals("?")) {
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        z++;
                    }

                }
            }


            else if(args3.startsWith("w")) {
                count = x;
                for(String s : split) {

                    for(int i = 0; i <= 4; i++) fillblock(x-i, y-2, z, sw, class_2246.field_10124.method_9564());

                    x--;
                    if(s.equals("a")) {
                        setblock(x, y+1, z, sw, bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("1")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("2")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if (s.equals("3")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("4")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("5")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("6")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("7")) {
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("8")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("9")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("0")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("b")) {
                        fillblock(x, y, z, sw, bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;

                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("c")) {
                        setblock(x, y+1, z, sw, bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("d")) {
                        setblock(x, y+1, z, sw ,bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;

                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("e")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("f")) {
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        fillblock(x, y-1, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("g")) {
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("h")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("i")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("j")) {
                        setblock(x, y-1, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);

                        x--;
                    }
                    else if(s.equals("k")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("l")) {
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("m")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("n")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("o")) {
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("p")) {
                        fillblock(x, y-2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("q")) {
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        fillblock(x, y-2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("r")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("s")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    } else if (s.equals("t")) {
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("u")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("v")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("w")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("x")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("y")) {
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals(" ")) x--;
                    else if(s.equals("A")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("B")) {
                        fillblock(x, y, z, sw ,bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("C")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("D")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("E")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("F")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("G")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("H")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("I")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("J")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("K")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("L")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("M")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("N")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("O")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("P")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("Q")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("R")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("S")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("T")) {
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("U")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("V")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x,y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x,y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("W")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("X")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("Y")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("Z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("!")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("@")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("$")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y+5, z, sw, bl);
                        x--;

                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("#")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("%")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("^")) {
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("&")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("*")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("(")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals(")")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("_")) {
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("-")) {
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("=")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("+")) {
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("~")) {
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x,y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("`")) {
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("[")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("]")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("{")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("}")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("\\")) {
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("/")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("|")) {
                        fillblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals(";")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals(":")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("'")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("\"")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;x--;
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals(",")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("<")) {
                        setblock(x, y+2, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }
                    else if(s.equals(">")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x--;
                        setblock(x, y+2, z, sw, bl);
                        x--;
                    }
                    else if(s.equals(".")) {
                        setblock(x, y, z, sw, bl);
                        x--;
                    }
                    else if(s.equals("?")) {
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x--;
                    }

                }
            }

            else if(args3.startsWith("e")) {
                count = x;
                for(String s : split) {

                    for(int i = 0; i <= 4; i++) fillblock(x+i, y-2, z, sw, class_2246.field_10124.method_9564());

                    x++;
                    if(s.equals("a")) {
                        setblock(x, y+1, z, sw, bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("1")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("2")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if (s.equals("3")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("4")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("5")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("6")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("7")) {
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("8")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("9")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("0")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("b")) {
                        fillblock(x, y, z, sw, bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;

                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("c")) {
                        setblock(x, y+1, z, sw, bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("d")) {
                        setblock(x, y+1, z, sw ,bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;

                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("e")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;

                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("f")) {
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        fillblock(x, y-1, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("g")) {
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("h")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("i")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("j")) {
                        setblock(x, y-1, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y + 4, z, sw, bl);

                        x++;
                    }
                    else if(s.equals("k")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("l")) {
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("m")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("n")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("o")) {
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("p")) {
                        fillblock(x, y-2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("q")) {
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        fillblock(x, y-2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("r")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("s")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    } else if (s.equals("t")) {
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("u")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("v")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("w")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("x")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("y")) {
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y-2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals(" ")) x++;
                    else if(s.equals("A")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("B")) {
                        fillblock(x, y, z, sw ,bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("C")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("D")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("E")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("F")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("G")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("H")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("I")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("J")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("K")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("L")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("M")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("N")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("O")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("P")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("Q")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("R")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("S")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("T")) {
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("U")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("V")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x,y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x,y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("W")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("X")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("Y")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("Z")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("!")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("@")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("$")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y+5, z, sw, bl);
                        x++;

                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("#")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("%")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("^")) {
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("&")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y-1, z, sw, bl);
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("*")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("(")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals(")")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("_")) {
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("-")) {
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("=")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("+")) {
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("~")) {
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x,y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("`")) {
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("[")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("]")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("{")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("}")) {
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("\\")) {
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);

                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);

                        x++;
                    }
                    else if(s.equals("/")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+4, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("|")) {
                        fillblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals(";")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals(":")) {
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("'")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("\"")) {
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;x++;
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals(",")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y-1, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("<")) {
                        setblock(x, y+2, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }
                    else if(s.equals(">")) {
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+1, z, sw, bl);
                        setblock(x, y+3, z, sw, bl);
                        x++;
                        setblock(x, y+2, z, sw, bl);
                        x++;
                    }
                    else if(s.equals(".")) {
                        setblock(x, y, z, sw, bl);
                        x++;
                    }
                    else if(s.equals("?")) {
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y, z, sw, bl);
                        setblock(x, y+2, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                        setblock(x, y+3, z, sw, bl);
                        setblock(x, y+4, z, sw, bl);
                        x++;
                    }

                }
            }




            if(args3.startsWith("n")) count -= z;
            else if(args3.startsWith("s")) count -= z;
            else if(args3.startsWith("e")) count -= x;
            else if(args3.startsWith("w")) count -= x;

            if(count < 0) count *= -1;



            if(args3.equals("n")) run_command("/execute at @a[tag=quick_command_executor] run fill ~ ~-2 ~ ~ ~4 ~-" + count + " " + block + " replace test_block", context);
            else if(args3.equals("s")) run_command("/execute at @a[tag=quick_command_executor] run fill ~ ~-2 ~ ~ ~4 ~" + count + " " + block + " replace test_block", context);
            else if(args3.equals("e")) run_command("/execute at @a[tag=quick_command_executor] run fill ~ ~-2 ~ ~" + count + " ~4 ~ " + block + " replace test_block", context);
            else if(args3.equals("w")) run_command("/execute at @a[tag=quick_command_executor] run fill ~ ~-2 ~ ~-" + count + " ~4 ~ " + block + " replace test_block", context);
            else if(args3.equals("nl")) {
                String cmd1 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-2 ~ ~ ~-2 ~-" + count + " ~2 ~ ~-" + count + " strict replace move";
                String cmd2 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-1 ~ ~ ~-1 ~-" + count + " ~1 ~ ~-" + count + " strict replace move";
                String cmd3 = "/execute at @a[tag=quick_command_executor] run clone ~ ~ ~ ~ ~ ~-" + count + " ~ ~ ~-" + count + " strict replace move";
                String cmd4 = "/execute at @a[tag=quick_command_executor] run clone ~ ~1 ~ ~ ~1 ~-" + count + " ~-1 ~ ~-" + count + " strict replace move";
                String cmd5 = "/execute at @a[tag=quick_command_executor] run clone ~ ~2 ~ ~ ~2 ~-" + count + " ~-2 ~ ~-" + count + " strict replace move";
                String cmd6 = "/execute at @a[tag=quick_command_executor] run clone ~ ~3 ~ ~ ~3 ~-" + count + " ~-3 ~ ~-" + count + " strict replace move";
                String cmd7 = "/execute at @a[tag=quick_command_executor] run clone ~ ~4 ~ ~ ~4 ~-" + count + " ~-4 ~ ~-" + count + " strict replace move";
                String cmd8 = "/execute at @a[tag=quick_command_executor] run clone ~ ~5 ~ ~ ~5 ~-" + count + " ~-5 ~ ~-" + count + " strict replace move";
                String cmd9 = "/execute at @a[tag=quick_command_executor] run fill ~2 ~ ~ ~-5 ~ ~-" + count + " " + block + " replace test_block";
                run_more_commands(cmd1, cmd2, cmd3, cmd4, cmd5, cmd6, cmd7, cmd8, cmd9, context);
            }
            else if(args3.equals("sl")) {
                String cmd1 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-2 ~ ~ ~-2 ~" + count + " ~-2 ~ ~ strict replace move";
                String cmd2 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-1 ~ ~ ~-1 ~" + count + " ~-1 ~ ~ strict replace move";
                String cmd3 = "/execute at @a[tag=quick_command_executor] run clone ~ ~ ~ ~ ~ ~" + count + " ~ ~ ~ strict replace move";
                String cmd4 = "/execute at @a[tag=quick_command_executor] run clone ~ ~1 ~ ~ ~1 ~" + count + " ~1 ~ ~ strict replace move";
                String cmd5 = "/execute at @a[tag=quick_command_executor] run clone ~ ~2 ~ ~ ~2 ~" + count + " ~2 ~ ~ strict replace move";
                String cmd6 = "/execute at @a[tag=quick_command_executor] run clone ~ ~3 ~ ~ ~3 ~" + count + " ~3 ~ ~ strict replace move";
                String cmd7 = "/execute at @a[tag=quick_command_executor] run clone ~ ~4 ~ ~ ~4 ~" + count + " ~4 ~ ~ strict replace move";
                String cmd8 = "/execute at @a[tag=quick_command_executor] run clone ~ ~5 ~ ~ ~5 ~" + count + " ~5 ~ ~ strict replace move";
                String cmd9 = "/execute at @a[tag=quick_command_executor] run fill ~-2 ~ ~ ~5 ~ ~" + count + " " + block + " replace test_block";
                run_more_commands(cmd1, cmd2, cmd3, cmd4, cmd5, cmd6, cmd7, cmd8, cmd9, context);
            }
            else if(args3.equals("el")) {
                String cmd1 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-2 ~ ~" + count + " ~-2 ~ ~ ~ ~2 strict replace move";
                String cmd2 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-1 ~ ~" + count + " ~-1 ~ ~ ~ ~1 strict replace move";
                String cmd3 = "/execute at @a[tag=quick_command_executor] run clone ~ ~ ~ ~" + count + " ~ ~ ~ ~ ~ strict replace move";
                String cmd4 = "/execute at @a[tag=quick_command_executor] run clone ~ ~1 ~ ~" + count + " ~1 ~ ~ ~ ~-1 strict replace move";
                String cmd5 = "/execute at @a[tag=quick_command_executor] run clone ~ ~2 ~ ~" + count + " ~2 ~ ~ ~ ~-2 strict replace move";
                String cmd6 = "/execute at @a[tag=quick_command_executor] run clone ~ ~3 ~ ~" + count + " ~3 ~ ~ ~ ~-3 strict replace move";
                String cmd7 = "/execute at @a[tag=quick_command_executor] run clone ~ ~4 ~ ~" + count + " ~4 ~ ~ ~ ~-4 strict replace move";
                String cmd8 = "/execute at @a[tag=quick_command_executor] run clone ~ ~5 ~ ~" + count + " ~5 ~ ~ ~ ~-5 strict replace move";
                String cmd9 = "/execute at @a[tag=quick_command_executor] run fill ~ ~ ~2 ~" + count + " ~ ~-5 " + block + " replace test_block";
                run_more_commands(cmd1, cmd2, cmd3, cmd4, cmd5, cmd6, cmd7, cmd8, cmd9, context);
            }
            else if(args3.equals("wl")) {
                String cmd1 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-2 ~ ~-" + count + " ~-2 ~ ~-" + count + " ~ ~-2 strict replace move";
                String cmd2 = "/execute at @a[tag=quick_command_executor] run clone ~ ~-1 ~ ~-" + count + " ~-1 ~ ~-" + count + " ~ ~-1 strict replace move";
                String cmd3 = "/execute at @a[tag=quick_command_executor] run clone ~ ~ ~ ~-" + count + " ~ ~ ~-" + count + " ~ ~ strict replace move";
                String cmd4 = "/execute at @a[tag=quick_command_executor] run clone ~ ~1 ~ ~-" + count + " ~1 ~ ~-" + count + " ~ ~1 strict replace move";
                String cmd5 = "/execute at @a[tag=quick_command_executor] run clone ~ ~2 ~ ~-" + count + " ~2 ~ ~-" + count + " ~ ~2 strict replace move";
                String cmd6 = "/execute at @a[tag=quick_command_executor] run clone ~ ~3 ~ ~-" + count + " ~3 ~ ~-" + count + " ~ ~3 strict replace move";
                String cmd7 = "/execute at @a[tag=quick_command_executor] run clone ~ ~4 ~ ~-" + count + " ~4 ~ ~-" + count + " ~ ~4 strict replace move";
                String cmd8 = "/execute at @a[tag=quick_command_executor] run clone ~ ~5 ~ ~-" + count + " ~5 ~ ~-" + count + " ~ ~5 strict replace move";
                String cmd9 = "/execute at @a[tag=quick_command_executor] run fill ~ ~ ~-2 ~-" + count + " ~ ~5 " + block + " replace test_block";
                run_more_commands(cmd1, cmd2, cmd3, cmd4, cmd5, cmd6, cmd7, cmd8, cmd9, context);
            }




            String text = args2;
            if(text.length() > 20) text = text.substring(0, 20) + "...";
            if(send_feedback(context)) {
                String finalText = text;
                String dir;
                if(args3.equals("n")) dir = "북쪽으로 세워서";
                else if(args3.equals("e")) dir = "동쪽으로 세워서";
                else if(args3.equals("w")) dir = "서쪽으로 세워서";
                else if(args3.equals("s")) dir = "남쪽으로 세워서";
                else if(args3.equals("nl")) dir = "북쪽으로 눕혀서";
                else if(args3.equals("el")) dir = "동쪽으로 눕혀서";
                else if(args3.equals("wl")) dir = "서쪽으로 눕혀서";
                else dir = "남쪽으로 눕혀서";
                String finalDir = dir;
                int finalCount = count;
                context.getSource().method_9226(() -> class_2561.method_43470(chat + "§a" + finalText + "§f을(를) §b" + block + "§f(으)로, §d" + finalDir + "§f 썼습니다. ( " + finalCount + "칸 )"), false);
            }


        }
    }

    private static void setblock(int x, int y, int z, class_3218 sw, class_2680 bl) {
        mutPos.method_10103(x, y, z);
        sw.method_8652(mutPos, bl, class_2248.field_31036);
    }

    private static void fillblock(int x, int y, int z, class_3218 sw, class_2680 bl) {
        setblock(x, y, z, sw, bl);
        setblock(x, y+1, z, sw, bl);
        setblock(x, y+2, z, sw, bl);
        setblock(x, y+3, z, sw, bl);
        setblock(x, y+4, z, sw, bl);
    }
}






















