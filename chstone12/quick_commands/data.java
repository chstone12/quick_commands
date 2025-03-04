package chstone12.quick_commands;

import com.mojang.brigadier.context.CommandContext;
import java.util.Objects;
import net.minecraft.class_2168;
import net.minecraft.class_2203;
import net.minecraft.class_2520;
import net.minecraft.class_2561;

import static chstone12.quick_commands.functions.*;


public class data extends quick_commands {


    public static int set_entity_data(class_2203.class_2209 args1, class_2520 args2, CommandContext<class_2168> context) {


        String path = args1.method_54100();
        String elem;
        if(args2 == null) elem = "null";
        else elem = args2.toString();

        // 체력 바꾸기
        if(is_this_number(path.replace(".", ""))) {

            if(args2 == null) {
                String command2 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "가장 가까운 엔티티인 \",{\"selector\":\"@n[type=!player]\",\"color\":\"green\"},\"의 Health 값을 §b" + path.replace("\"", "") + "§f(으)로 설정했습니다.\"]";
                if (!send_feedback(context)) command2 = "";
                run_commands("execute at @a[tag=quick_command_executor] run data merge entity @n[type=!player] {Health:" + path + "f}", command2, "", context);
            }

            else if(elem.equals("\"s\"")) {
                float hp = Float.parseFloat(path);
                Objects.requireNonNull(context.getSource().method_44023()).method_6033(hp);
                context.getSource().method_9226(() -> class_2561.method_43470(chat + "체력을 §a%s§f(으)로 설정했습니다.".formatted(hp)), false);
            }

            else {
                send_error_message(context, "s가 아닌 다른 문자는 거기에 쓸 수 없습니다. 입력값 : %s".formatted(args2));
            }
        }


        // invulnerable
        else if(path.equals("inv")) {
            String command2 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "가장 가까운 엔티티인 \",{\"color\":\"green\",\"selector\":\"@n[type=!player]\"},\"의 Invulnerable을 1로 설정했습니다.\"]";
            if(!send_feedback(context)) command2 = "";
            run_commands("execute at @a[tag=quick_command_executor] run data merge entity @n[type=!player] {Invulnerable:1b}", command2, "", context);
        }


        // NoAI
        else if(path.equals("ai")) {
            String command2 = "/tellraw @a[tag=quick_command_executor] [\"" + chat + "가장 가까운 엔티티인 \",{\"color\":\"green\",\"selector\":\"@n[type=!player]\"},\"의 NoAI를 1로 설정했습니다.\"]";
            if(!send_feedback(context)) command2 = "";
            run_commands("execute at @a[tag=quick_command_executor] run data merge entity @n[type=!player] {NoAI:1b}", command2, "", context);
        }


        // 테스트로
        else if(path.equals("t")) {
            String command2 = "/tellraw @a[tag=quick_command_executor] [\"" + chat + "가장 가까운 엔티티인 \",{\"color\":\"green\",\"selector\":\"@n[type=!player]\"},\"의 NoAI와 Silent를 1로 설정했습니다.\"]";
            if(!send_feedback(context)) command2 = "";
            run_commands("execute at @a[tag=quick_command_executor] run data merge entity @n[type=!player] {NoAI:1b,Silent:1b}", command2, "", context);
        }


        // 아머스탠드
        else if(path.equals("as")) {
            context.getSource().method_9226(() -> class_2561.method_43470(chat + "가장 가까운 아머스탠드의 NoGravity, NoBasePlate, ShowArms, Invulnerable을 1로 설정했습니다."), false);
            run_command("execute at @a[tag=quick_command_executor] run data merge entity @n[type=armor_stand] {NoBasePlate:1,NoGravity:1b,ShowArms:1b,Invulnerable:1b}", context);
        }


        // 인터렉션
        else if(path.equals("i")) {

            String[] split = elem.replace("[", "").replace("]", "").split(",");
            String width = split[0];
            String height = split[1];

            run_command("/execute at @a[tag=quick_command_executor] run data merge entity @n[type=interaction] {width:" + width + ",height:" + height + "}", context);
            context.getSource().method_9226(() -> class_2561.method_43470(chat + "가장 가까운 인터렉션의 가로를 §a" + width + "§f, 세로를 §b" + height + "§f(으)로 수정했습니다."), false);

        }

//
//        // tp
//        else if(path.equals("p")) {
//
//            String[] sp = elem.replace("[", "").replace("]", "").split(",");
//            String feedback;
//
//            if(sp.length == 2) {
//
//
//                if(send_feedback(context)) feedback = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + " \",{\"selector\":\"@n[type=!player]\"},\"을(를) §a[ " + sp[0] + " / " + sp[1] + " ]§f 만큼 회전시켰습니다.\"]";
//                else feedback = "";
//
//                run_commands("/execute at @a[tag=quick_command_executor] as @n[type=!player] at @s run tp @s ~ ~ ~ ~" + sp[0] + " ~" + sp[1], feedback, "", context);
//
//            }
//
//            else if(sp.length == 3) {
//
//                if(send_feedback(context)) feedback = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + " \",{\"selector\":\"@n[type=!player]\"},\"을(를) §a[ " + sp[0] + " / " + sp[1] + " / " + sp[2] + " ]§f 만큼 TP시켰습니다.\"]";
//                else feedback = "";
//
//                run_commands("/execute at @a[tag=quick_command_executor] as @n[type=!player] at @s run tp @s ~" + sp[0] + " ~" + sp[1] + " ~" + sp[2], feedback, "", context);
//
//            }
//
//            else if(sp.length == 5) {
//
//                if(send_feedback(context)) feedback = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + " \",{\"selector\":\"@n[type=!player]\"},\"을(를) §a[ " + sp[0] + " / " + sp[1] + " / " + sp[2] + " ]§f 만큼 TP, §b[ " + sp[3] + " / " + sp[4] + " ]§f 만큼 회전시켰습니다.\"]";
//                else feedback = "";
//
//                run_commands("/execute at @a[tag=quick_command_executor] as @n[type=!player] at @s run tp @s ~" + sp[0] + " ~" + sp[1] + " ~" + sp[2] + " ~" + sp[3] + " ~" + sp[4], feedback, "", context);
//
//            }
//
//
//            else send_error_message(context, "입력이 잘못되었습니다.");
//          }






        else if(path.equals("r")) {

            String[] sp = elem.replace("[", "").replace("]", "").replace("f", "").split(",");
            String feedback;

            if(is_this_number(sp[0].replace(".", "")) && is_this_number(sp[1].replace(".", ""))) {
                if (send_feedback(context))
                    feedback = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + " \",{\"selector\":\"@n[type=!player]\"},\"의 Rotation을 §a[ " + sp[0] + " , " + sp[1] + " ] §f(으)로 설정했습니다.\"]";
                else feedback = "";

                run_commands("/execute at @a[tag=quick_command_executor] run data merge entity @n[type=!player] {Rotation:[" + sp[0] + "f," + sp[1] + "f]}", feedback, "", context);
            }

            else send_error_message(context, "숫자가 아닌데요..");

        }



        // 기타
        else {

            if(elem.equals("null") || path.equals("null")) {
                if(path.equals("null")) send_error_message(context, "어떤 NBT를 바꿀지 써주세요.");
                else send_error_message(context, path + "을(를) 뭘로 바꿀지 써주세요.");
            }

            else {

                path = path.replace("tr-", "transformation").replace("trs-", "transformation.scale")
                        .replace("trt-", "transformation.translation").replace("trr-", "transformation.right_rotation")
                        .replace("trl-", "transformation.left_rotation").replace("max-", "attributes[{id:\"minecraft:max_health\"}].base");


                String command2 = "/tellraw @a[tag=quick_command_executor] [\"" + chat + "\",{\"selector\":\"@n[type=!player]\"},\"의 §a" + path.replace("\"", "") + "§f을(를) §b" + elem.replace("\"", "") +  "§f(으)로 설정했습니다.\"]";
                if(!send_feedback(context)) command2 = "";
                run_commands("execute at @a[tag=quick_command_executor] run data modify entity @n[type=!player] " + path + " set value " + elem, command2, "", context);
            }
        }



        return 1;
    }
}
