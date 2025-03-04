package chstone12.quick_commands;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.class_2168;
import net.minecraft.class_2561;

import static chstone12.quick_commands.functions.send_error_message;

public class help extends quick_commands {

    public static int quick_command_help(String args1, CommandContext<class_2168> context) {

        if (args1.equalsIgnoreCase("q_number"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q [숫자] \n\n[숫자]번의 아이템을 줍니다.\n콜론이 포함되는 아이템 번호는 콜론 대신 점을 써야 됩니다.\n\n/q 364 64 -> 스테이크 64개 지급\n/q 251.15 -> 검은색 콘크리트 1개 지급\n"));


        else if(args1.equalsIgnoreCase("q_etc"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q youtube, /q recipe, /q sent 등의 여러 이스터에그들이 있습니다. 찾아보세요"));


        else if(args1.equals("q_s"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q s [이름] , /q s [이름] [기준]\n\n/q s var  ->  이름이 var이고 기준이 dummy인 스코어보드를 추가합니다.\n/q s diamond_pickaxe m.used..m.diamond_pickaxe  ->  이름이 diamond_pickaxe고 기준이 minecraft.used:minecraft.diamond_pickaxe인 스코어보드를 추가합니다. 추가되지 않았다면 잘못된 기준을 입력한 겁니다."));

        else if(args1.equals("q_se"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q se [문자]\n\n입력된 아이템이 몇 번 아이템인지 알려줍니다. 뒤에다가 a를 붙이면 검색 결과를 전부 띄워줍니다. (끝까지 입력하지 않아도 됩니다.)\n\n/q se [숫자1] [숫자2]\n\n입력된 숫자가 어떤 아이템인지 알려줍니다. 검은색 콘크리트의 번호는 251:15번인데, 여기에서 앞에 있는 숫자(251)를 [숫자1]에, 뒤의 숫자(15)를 [숫자2]에 쓰면 됩니다. [숫자2]에 아무것도 안 쓰면 0이 됩니다.\n(se = search)\n\n/q se 169  ->  바다 랜턴\n/q se 251 15  ->  검은색 콘크리트\n/q se sea_lan  ->  169\n/q se chest a  ->  chest는 54:0번, Minecart with chest는 342:0번"));


        else if(args1.equals("q_see"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q see [숫자/문자]\n\n숫자를 입력하면 그 번호의 엔티티를 알려줍니다.\n문자를 입력하면 그 엔티티가 몇 번인지 알려줍니다. (끝까지 입력하지 않아도 됩니다.) 뒤에다가 a를 붙이면 검색 결과를 전부 띄워줍니다. \n(see = SEarch Entity)\n\n/q see cr  ->  50\n/q see 50  ->  크리퍼"));


        else if(args1.equals("q_k"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q k\n\n가장 가까운 엔티티를 죽입니다."));

        else if(args1.equals("q_t"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q t [숫자]\n\n시간을 [숫자]로 바꿉니다.\n/q t 1000  ->  시간 1000으로 설정"));

        else if(args1.equals("q_sm"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q sm [숫자/문자] [문자2] [문자3]\n\n[숫자/문자]에 해당되는 엔티티를 소환합니다. 문자를 입력하는 경우엔 굳이 끝까지 입력하지 않아도 됩니다. 그리고 숫자는 엔티티 번호입니다. [문자2], [문자3]을 입력하면 태그가 있는 채로 소환됩니다. 소환되지 않았다면 잘못 입력한 겁니다. (sm = summon)\n\n/q sm cr  ->  크리퍼 소환\n/q sm cr enemy  ->  태그가 enemy인 크리퍼 소환\n/q sm 50 enemy creeper  ->  태그가 enemy, creeper인 크리퍼 소환"));

        else if(args1.equals("q_ts"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q sm과 똑같지만, Silent:1b,NoAI:1b인 채로 소환됩니다. (ts = Testentity Summon)"));

        else if(args1.equals("q_smb"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q smb [숫자/문자] [문자2] [문자3]\n\n[숫자/문자]에 해당하는 블럭의 블럭 디스플레이를 소환합니다. 숫자는 아이템 번호인데, 콜론이 포함되는 번호는 콜론을 점으로 바꿔야 합니다. [문자2], [문자3]은 입력하면 태그가 있는 채로 소환됩니다. 입력하지 않아도 됩니다. 소환되지 않았다면 잘못된 블럭을 입력한 것입니다. 이 경우 투명 디스플레이가 소환된 게 아니라 아예 소환되지 않습니다. (smb = SuMmon Blockdisplay)\n\n/q smb 1  ->  돌 블럭 디스플레이 소환\n/q smb 251.15 bdp  ->  태그가 bdp인 검은색 콘크리트 블럭 디스플레이 소환\n\n/q smb diamond_block dia mond  ->  태그가 dia, mond인 다이아몬드 블럭 디스플레이 소환"));

        else if(args1.equals("q_smi"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q smb와 똑같지만 아이템 디스플레이를 소환합니다. (smi = SuMmon Itemdisplay)"));

        else if(args1.equals("q_smt"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q smt [텍스트] [색깔] [문자1] [문자2]\n\n텍스트 디스플레이를 소환합니다. [색깔], [문자1], [문자2]는 입력하지 않아도 됩니다. [텍스트] 부분에는 따옴표로 감싼 json을, [색깔]은 배경색을 Hex 코드(ex. ff0000, 39c5bb)로, [문자1]과 [문자2]는 태그를 입력하시면 됩니다. [색깔]은 배경색을 쓰는 곳인데, 입력하지 않으면 0으로 설정됩니다. 현재 당신이 보고 있는 방향(동/서/남/북)으로 소환됩니다.\n\n/q smt '{\"text\":\"텍스트\",\"color\":\"blue\"}'  ->  파란색으로 '텍스트'라고 써져 있는 텍스트 디스플레이 소환\n/q smt '{\"text\":\"빨간배경\"}' ff0000 foo bar  ->  배경색이 #ff0000(빨간색)이고 태그가 foo, bar이며 '빨간배경'이라고 써져 있는 텍스트 디스플레이 소환"));


        else if(args1.equals("q_ta"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q ta [문자1] [문자2] [문자3] [문자4]\n\n가장 가까운 엔티티에게 태그를 추가합니다. 최대 네 개까지 한번에 추가할 수 있습니다.\n\n /q ta r [문자1] [문자2] [문자3]\n\n각각의 태그를 가진 가장 가까운 엔티티에게서 해당 태그를 제거합니다. 최대 세 개까지 한번에 제거할 수 있습니다.\n\n/q ta l\n\n가장 가까운 엔티티의 태그 목록을 보여줍니다.\n\n당연히 여기에서 '엔티티'는 플레이어를 제외한 엔티티를 말합니다."));


        else if(args1.equals("q_ench"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q ench\n\n들고 있는 아이템을 마검으로 만듭니다. 옛날 마크 유저라면 아는 /enchatall과 비슷합니다."));

        else if (args1.equals("q_rt"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q rt [텍스트]\n\n[텍스트]를 무지개색으로 칠한 json을 만들어 줍니다. /tellraw나 아이템 이름 등으로 쓸 수 있습니다. [텍스트]는 큰따옴표로 감싸면 됩니다. (rt = rainbow text)\n\n/q rt \"fwoiejf ifwoej fewiojf\"  ->  fwoiejf ifwoej fewiojf을 무지개색으로 칠한 텍스트 만들어줌"));

        else if(args1.equals("q_gd"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q gd [색깔1] [색깔2] [텍스트]\n\n[텍스트]를 [색깔1]에서 [색깔2]까지의 그라데이션으로 칠한 json을 만들어 줍니다. /tellraw나 아이템 이름 등으로 쓸 수 있습니다. [텍스트]는 큰따옴표로 감싸면 되고, [색깔1]과 [색깔2]에는 Hex를 쓰거나, 이 중 하나를 쓸 수 있습니다.\ndarkgreen, darkgray, lightblue, darkred, lightgray, red, blue, green, orange, yellow, aqua, magenta, purple, white, black, gray, pink, brown, sky, miku\n\n(gd = gradient. geometry dash 아님)\n\n/q gd ff0000 0000ff \"asdasdfdasdasd\"\n/q gd red blue \"fweiofiwjfowjiefjwioef\"\n/q gd red 00ff00 \"fjiowo23908u8wuifhiw\""));

        else if(args1.equals("q_gr"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q gr [c/d]\n\n/q gr c를 치면 맵 제작에 용이하도록 게임룰을 바꿔줍니다. (gr = GameRule)\n/q gr d를 치면 게임룰을 기본값으로 되돌립니다."));

        else if(args1.equals("q_gen"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q gen [timer/sw/quiz]\n\n/q gen timer를 치면 타이머 커맨드를 만들어 줍니다.\n/q gen sw를 치면 스탑워치 커맨드를 만들어 줍니다.\n/q gen quiz를 치면 퀴즈 템플릿을 만들어 줍니다.\n(gen = generate)"));

        else if(args1.equalsIgnoreCase("qd_number"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd [숫자] [s]\n\n/qd [숫자]를 치면 가장 가까운 엔티티의 체력을 [숫자]로 설정합니다. 최대체력을 바꾸지는 않습니다.\n/q [숫자] s를 치면 자신의 체력을 [숫자]로 설정합니다."));

        else if(args1.equalsIgnoreCase("qd_string"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd [NBT] [값]\n\n가장 가까운 엔티티의 [NBT]를 [값]으로 설정합니다. (/data modify와 같음)\n일부 nbt는 단축어가 있습니다.\n\ntr- = transformation, trs- = transformation.scale, trl- = transformation.left_rotation, trr- = transformation.right_rotation, trt- = transformation.translation, max- = attributes[{id:\"minecraft:max_health\"}].base\n\n/q trs- [2,2,2]  ->  가장 가까운 엔티티의 transformation.scale을 [2,2,2]로 설정\n/q trt-[1] 1f  ->  가장 가까운 엔티티의 transformation.translation[1]을 1f로 설정"));

        else if(args1.equals("qd_inv"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd inv\n\n가장 가까운 엔티티의 invulnerable을 1로 설정합니다."));

        else if(args1.equals("qd_ai"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd ai\n\n가장 가까운 엔티티의 NoAI를 1로 설정합니다."));

        else if(args1.equals("qd_as"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd as\n\n가장 가까운 아머스탠드의 NoBasePlate, NoGravity, ShowArms, Invulnerable을 1로 설정합니다. (as = armor stand)"));

        else if(args1.equals("qd_t"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd t\n\n가장 가까운 엔티티의 Silent와 NoAI를 1로 설정합니다."));

        else if(args1.equals("q_food"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q food\n\n음식 추천"));

        else if(args1.equals("qd_i"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd i [숫자 두개]\n\n가장 가까운 인터렉션의 가로세로를 조절합니다.\n\n/qd i [1.6,0.9]  ->  가장 가까운 인터렉션의 가로를 1.6칸, 세로를 0.9칸으로 설정"));

        else if(args1.equals("q_tp"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /q tp [숫자1] [숫자2] [숫자3]\n\n숫자 두 개를 쓰면 가장 가까운 엔티티를 회전시킵니다.\n숫자 세 개를 쓰면 가장 가까운 엔티티를, 해당 개체 기준으로 x, y, z로 몇 칸씩 움직입니다.\n\n/q tp 1 2 3  =  /execute as @n[type=!player] at @s run tp @s ~1 ~2 ~3\n/q tp 1 2  =  /execute as @n[type=!player] at @s run tp @s ~ ~ ~ ~1 ~2"));

        else if(args1.equals("qd_r"))
            context.getSource().method_45068(class_2561.method_43470(chat + " /qd r [숫자 2개]\n\n가장 가까운 엔티티의 Rotation값을 [숫자1,숫자2]로 설정합니다.\n\n/qd r [90,0]  ->  가장 가까운 엔티티에게 {Rotation:[90f,0f]} merge"));

        else send_error_message(context, "아그런구문없는대;;;");

        return 1;
    }

}
