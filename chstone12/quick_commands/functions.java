package chstone12.quick_commands;

import com.mojang.brigadier.context.CommandContext;
import java.util.Objects;
import net.minecraft.class_1928;
import net.minecraft.class_2168;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2593;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_3218;

public class functions {


    public static boolean send_feedback(CommandContext<class_2168> context) {
        return context.getSource().method_9225().method_64395().method_8355(class_1928.field_19400);
    }

    public static void run_command(String command, CommandContext<class_2168> context) {

        Objects.requireNonNull(context.getSource().method_44023()).method_5780("quick_command_executor");
        class_2680 block = class_2246.field_10525.method_9564();
        class_2680 block2 = class_2246.field_10395.method_9564();
        class_3218 sw = context.getSource().method_9225();

        double x = context.getSource().method_44023().method_23317();
        double z = context.getSource().method_44023().method_23321();

        class_2338 pos = class_2338.method_49638(new class_243(x, 319, z));
        class_2338 pos2 = class_2338.method_49638(new class_243(x, 319, z-1));
        class_2338 pos3 = class_2338.method_49638(new class_243(x, 319, z-2));

        sw.method_8501(pos, block);
        sw.method_8501(pos2, block2);
        sw.method_8501(pos3, block2);


        if (sw.method_8321(pos) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos2) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286("/tag @a remove quick_command_executor");
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos3) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286("/fill ~ ~ ~ ~ ~ ~2 air");
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }

    }


    public static void run_commands(String command1, String command2, String command3, CommandContext<class_2168> context) {

        Objects.requireNonNull(context.getSource().method_44023()).method_5780("quick_command_executor");
        class_2680 block = class_2246.field_10525.method_9564();
        class_2680 block2 = class_2246.field_10395.method_9564();
        class_3218 sw = context.getSource().method_9225();

        double x = context.getSource().method_44023().method_23317();
        double z = context.getSource().method_44023().method_23321();

        class_2338 pos = class_2338.method_49638(new class_243(x, 319, z));
        class_2338 pos2 = class_2338.method_49638(new class_243(x, 319, z-1));
        class_2338 pos3 = class_2338.method_49638(new class_243(x, 319, z-2));
        class_2338 pos4 = class_2338.method_49638(new class_243(x, 319, z-3));
        class_2338 pos5 = class_2338.method_49638(new class_243(x, 319, z-4));

        sw.method_8501(pos, block);
        sw.method_8501(pos2, block2);
        sw.method_8501(pos3, block2);
        sw.method_8501(pos4, block2);
        sw.method_8501(pos5, block2);


        if (sw.method_8321(pos) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command1);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos2) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command2);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos3) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command3);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos4) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286("/tag @a remove quick_command_executor");
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos5) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286("/fill ~ ~ ~ ~ ~ ~5 air");
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }

    }


    public static void run_more_commands(String command1, String command2, String command3, String command4, String command5, String command6, String command7, String command8, String command9, CommandContext<class_2168> context) {

        Objects.requireNonNull(context.getSource().method_44023()).method_5780("quick_command_executor");
        class_2680 block = class_2246.field_10525.method_9564();
        class_2680 block2 = class_2246.field_10395.method_9564();
        class_3218 sw = context.getSource().method_9225();

        double x = context.getSource().method_44023().method_23317();
        double z = context.getSource().method_44023().method_23321();

        class_2338 pos = class_2338.method_49638(new class_243(x, 319, z));
        class_2338 pos2 = class_2338.method_49638(new class_243(x, 319, z-1));
        class_2338 pos3 = class_2338.method_49638(new class_243(x, 319, z-2));
        class_2338 pos4 = class_2338.method_49638(new class_243(x, 319, z-3));
        class_2338 pos5 = class_2338.method_49638(new class_243(x, 319, z-4));
        class_2338 pos6 = class_2338.method_49638(new class_243(x, 319, z-5));
        class_2338 pos7 = class_2338.method_49638(new class_243(x, 319, z-6));
        class_2338 pos8 = class_2338.method_49638(new class_243(x, 319, z-7));
        class_2338 pos9 = class_2338.method_49638(new class_243(x, 319, z-8));
        class_2338 pos10 = class_2338.method_49638(new class_243(x, 319, z-9));
        class_2338 pos11 = class_2338.method_49638(new class_243(x, 319, z-10));

        sw.method_8501(pos, block);
        sw.method_8501(pos2, block2);
        sw.method_8501(pos3, block2);
        sw.method_8501(pos4, block2);
        sw.method_8501(pos5, block2);
        sw.method_8501(pos6, block2);
        sw.method_8501(pos7, block2);
        sw.method_8501(pos8, block2);
        sw.method_8501(pos9, block2);
        sw.method_8501(pos10, block2);
        sw.method_8501(pos11, block2);


        if (sw.method_8321(pos) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command1);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos2) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command2);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos3) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command3);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos4) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command4);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos5) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command5);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos6) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command6);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos7) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command7);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos8) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command8);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos9) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command9);
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos10) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286("/tag @a remove quick_command_executor");
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }
        if (sw.method_8321(pos11) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286("/fill ~ ~ ~ ~ ~ ~11 air");
            commandBlock.method_11041(true);
            commandBlock.method_5431();
        }

    }


    public static void send_error_message(CommandContext<class_2168> context, String str) {
        context.getSource().method_9213(class_2561.method_43470("§6[QuickCommands] §c" + str));
    }


    public static void place_command_block(CommandContext<class_2168> context, String command, int x, int y, int z, int type) {

        class_2680 block;
        if(type == 1) block = class_2246.field_10525.method_9564();
        else if(type == 2) block = class_2246.field_10263.method_9564();
        else if(type == 3) block = class_2246.field_10395.method_9564();
        else block = class_2246.field_10395.method_9564().method_11657(class_2741.field_12486, true);


        class_2338 pos = class_2338.method_49638(new class_243(x, y, z));
        context.getSource().method_9225().method_8501(pos, block);


        if (context.getSource().method_9225().method_8321(pos) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command);
            if(type >= 3) commandBlock.method_11041(true);
            commandBlock.method_5431();
        }

    }



    public static void place_command_block(CommandContext<class_2168> context, String command, int x, int y, int z, int type, String dir) {

        class_2680 block;
        if(type == 1) block = class_2246.field_10525.method_9564();
        else if(type == 2) block = class_2246.field_10263.method_9564();
        else if(type == 3) block = class_2246.field_10395.method_9564();
        else block = class_2246.field_10395.method_9564().method_11657(class_2741.field_12486, true);

        if(dir.equals("up")) block = block.method_11657(class_2741.field_12525, class_2350.field_11036);
        else if(dir.equals("down")) block = block.method_11657(class_2741.field_12525, class_2350.field_11036);
        else if(dir.equals("px")) block = block.method_11657(class_2741.field_12525, class_2350.field_11034);
        else if(dir.equals("nx")) block = block.method_11657(class_2741.field_12525, class_2350.field_11039);
        else if(dir.equals("nz")) block = block.method_11657(class_2741.field_12525, class_2350.field_11043);
        else if(dir.equals("pz")) block = block.method_11657(class_2741.field_12525, class_2350.field_11035);

        class_2338 pos = class_2338.method_49638(new class_243(x, y, z));
        context.getSource().method_9225().method_8501(pos, block);


        if (context.getSource().method_9225().method_8321(pos) instanceof class_2593 commandBlock) {
            commandBlock.method_11040().method_8286(command);
            if(type == 2) commandBlock.method_11041(true);
            commandBlock.method_5431();
        }

    }


    // 아 맞다 into였지 근데 어차피 이정도 전치사 조금 틀린건 아무 상관없어
    public static String convert_number_to_item(String num) {
        String number, subnumber;
        if(num.contains(".")) {
            number = num.split("\\.")[0];
            subnumber = num.split("\\.")[1];
        } else {
            number = num;
            subnumber = "0";
        }

        String items = chstone12.quick_commands.items.item_list;
        if(!items.contains(number + " ; " + subnumber + " ;")) return "[존재하지 않는 아이템]";
        else {
            String[] list = items.split("\\R");
            for(String s : list) {
                if(s.startsWith(number + " ; " + subnumber)) {
                    return s.replace(" ", "").split(";")[3];
                }
            }
        }
        return "[존재하지 않는 아이템]";
    }


    public static String convert_number_to_entity(String num) {
        String number, subnumber;
        if(num.contains(".")) {
            number = num.split("\\.")[0];
            subnumber = num.split("\\.")[1];
        } else {
            number = num;
            subnumber = "0";
        }

        String items = entits.entity_list;
        if(!items.contains(number + " ; " + subnumber + " ;")) return "[존재하지 않는 엔티티]";
        else {
            String[] list = items.split("\\R");
            for(String s : list) {
                if(s.startsWith(number + " ; " + subnumber)) {
                    return s.replace(" ", "").split(";")[3];
                }
            }
        }
        return "[존재하지 않는 엔티티]";
    }


    public static String random_youtube() {
        String[] when = {"아침에", "점심에", "낮에", "저녁에", "한밤중에", "새벽에", "생일에", "2030년에", "저녁 시간에", "저녁을 먹으며", "일어나자마자", "내일", "수능 보는 날에", "아침에"};
        String[] where = {"달에서","축구장에서", "노래방에서", "학교에서", "화장실에서", "변기 안에서", "하수처리장에서", "피씨방에서", "맥도날드에서", "공장에서", "노인회관에서", "도박장에서", "카페에서", "엘리베이터 안에서", "텐트 안에서", "집에서", "납골당에서", "장례식장에서", "빕스에서", "아웃백에서", "소 농장에서", "사과나무 농장에서", "버스 안에서", "도서관에서", "동굴에서", "오션월드에서", "에버랜드에서", "치킨집에서", "우주선에서", "술집에서", "들판에서", "에베레스트산에서", "남극에서", "사막에서", "태평양 한가운데에서", "태평양 한가운데에서", "집에서", "지옥에서", "화장실에서", "변기통 안에서", "#음식 안에서", "#대상 앞에서", "하수구 안에서", "하수처리장에서", "원자력 발전소에서", "코스트코에서", "아파트 옥상에서", "퇴근시간 지하철 안에서", "강남 한가운데에서", "서울대에서", "버스 안에서", "KTX 안에서", "침대 위에서", "콘서트에서", "무대 위에서", "쓰레기통 안에서", "비행기 안에서", "크루즈 안에서", "바다 한가운데에서", "남극에서", ""};
        String[] how = {"웃으며", "방귀를 뀌며", "똥을 싸면서", "물구나무를 서서", "노래를 부르며", "더럽게", "가식스럽게", "가증스럽게", "각박스럽게", "감격스럽게", "거드럭스럽게", "거만스럽게", "거북스럽게", "거짓스럽게", "게걸스럽게", "고급스럽게", "고풍스럽게", "늙어보이게", "병걸린 것처럼", "어딘가가 아픈 것처럼", "딱딱하게", "과감하게", "괴팍하게", "보기 흉하게", "보잘것없게", "초라하게", "기괴하게", "괴랄하게", "신박하게", "까다롭게", "냉정하게", "당황스럽게", "맛있게", "맛없게", "밉상스럽게", "재밌게", "신나게", "감격스럽게", "죄송스럽게", "죄송스럽게", ""};
        String[] whilst = {"똥을 싸면서", "넘어지면서", "코를 파면서", "땅을 파면서", "소리를 지르면서", "울부짖으면서", "축구하면서", "물구나무 선 상태로", "치킨을 먹으면서", "방사능에 피폭되면서", "쓰레기를 버리면서", "쓰레기를 버리면서"};
        String[] what = {"#대상 뒷광고하기", "댓글 읽기", "영화 리뷰하기", "번개 맞기","#음식 먹방", "#게임 하기", "#대상 참교육하기", "#음식 먹으면서 #게임 하기", "#행동 #대상 참교육하기", "#스피드런 세계 최고기록 세우기", "#게임 스피드런하기", "브이로그 찍기", "차에 치이기", "사과영상 올리고 자숙하기", "사과영상 올리고 자숙하기"};

        int when_int = (int) (Math.random() * when.length - 1);
        int where_int = (int) (Math.random() * where.length - 1);
        int how_int = (int) (Math.random() * how.length - 1);
        int whilst_int = (int) (Math.random() * whilst.length - 1);
        int what_int = (int) (Math.random() * what.length - 1);

        String contents = "유튜브 컨텐츠 추천: " + when[when_int] + " " + where[where_int] + " " + how[how_int] + " " + whilst[whilst_int] + " " + what[what_int];


        if(contents.contains("#게임")) {
            int random = (int) (Math.random() * 20);
            if(random == 0) contents = contents.replace("#게임", "기적의검");
            else if(random == 1) contents = contents.replace("#게임", "탕탕특공대");
            else if(random == 2) contents = contents.replace("#게임", "라이더");
            else if(random == 3) contents = contents.replace("#게임", "왕이되는자");
            else if(random == 4) contents = contents.replace("#게임", "거지키우기");
            else if(random == 5) contents = contents.replace("#게임", "바운스볼");
            else if(random == 6) contents = contents.replace("#게임", "마인크래프트 포켓에디션");
            else if(random == 7) contents = contents.replace("#게임", "황새 오래 걷기 1,000m 달성");
            else if(random == 8) contents = contents.replace("#게임", "크롬 공룡 게임");
            else if(random == 9) contents = contents.replace("#게임", "크롬 공룡 게임 100,000점 달성");
            else if(random == 10) contents = contents.replace("#게임", "기적의 검 전서버 1위 달성");
            else if(random == 11) contents = contents.replace("#게임", "노맨즈 스카이 맵 끝까지 도달");
            else if(random == 12) contents = contents.replace("#게임", "슈의 라면가게 4만원 달성");
            else if(random == 13) contents = contents.replace("#게임", "지오메트리 대쉬 Tidal Wave 클리어");
            else if(random == 14) contents = contents.replace("#게임", "라이즈 오브 킹덤즈 전서버 세계 1위 달성");
            else if(random == 15) contents = contents.replace("#게임", "테트리스");
            else if(random == 16) contents = contents.replace("#게임", "개드립피하기 10만점 달성");
            else if(random == 17) contents = contents.replace("#게임", "거지키우기 돈 1,000경원 달성");
            else if(random == 18) contents = contents.replace("#게임", "지구 한 바퀴 달리기");
            else if(random == 19) contents = contents.replace("#게임", "지구 화성 왕복");
            else if(random == 20) contents = contents.replace("#게임", "목성에 착륙");
        }
        if(contents.contains("#행동")) {
            int random = (int) (Math.random() * 20);
            if(random == 0) contents = contents.replace("#행동", "딱풀 먹은");
            else if(random == 1) contents = contents.replace("#행동", "요플레 뚜껑 안 핥고 버린");
            else if(random == 2) contents = contents.replace("#행동", "닭다리 2개 혼자 먹은");
            else if(random == 3) contents = contents.replace("#행동", "예고편 올려놓고 유튜브 잠수 탄");
            else if(random == 4) contents = contents.replace("#행동", "남의 연애사에 개입한");
            else if(random == 5) contents = contents.replace("#행동", "장난전화한");
            else if(random == 6) contents = contents.replace("#행동", "고양이 울린");
            else if(random == 7) contents = contents.replace("#행동", "뒷광고 한");
            else if(random == 8) contents = contents.replace("#행동", "피자 한조각, 치킨 한입 먹고 배달부가 먹었다고 한");
            else if(random == 9) contents = contents.replace("#행동", "배달하면서 치킨 한 조각 빼먹은");
            else if(random == 10) contents = contents.replace("#행동", "주차할 때 자리 2칸 먹은");
            else if(random == 11) contents = contents.replace("#행동", "뽑기 확률 조작한");
            else if(random == 12) contents = contents.replace("#행동", "치킨값 뻥튀기한");
            else if(random == 13) contents = contents.replace("#행동", "축구하다가 자살골 넣은");
            else if(random == 14) contents = contents.replace("#행동", "남의 바퀴벌레 훔쳐먹은");
            else if(random >= 15) contents = contents.replace("#행동", "남의 테이프 훔쳐먹은");
        }

        if(contents.contains("#대상")) {
            int random = (int) (Math.random() * 20);
            if(random == 0) contents = contents.replace("#대상", "참치");
            else if(random == 1) contents = contents.replace("#대상", "바퀴벌레");
            else if(random == 2) contents = contents.replace("#대상", "고등어");
            else if(random == 3) contents = contents.replace("#대상", "철갑상어");
            else if(random == 4) contents = contents.replace("#대상", "갈구리무늬 꽃수레 밤나비");
            else if(random == 5) contents = contents.replace("#대상", "외투");
            else if(random == 6) contents = contents.replace("#대상", "쥐");
            else if(random == 7) contents = contents.replace("#대상", "바오밥나무");
            else if(random == 8) contents = contents.replace("#대상", "연어");
            else if(random == 9) contents = contents.replace("#대상", "감자");
            else if(random == 10) contents = contents.replace("#대상", "개");
            else if(random == 11) contents = contents.replace("#대상", "길고양이");
            else if(random == 12) contents = contents.replace("#대상", "애벌레");
            else if(random == 13) contents = contents.replace("#대상", "지렁이");
            else if(random == 14) contents = contents.replace("#대상", "번데기");
            else if(random == 15) contents = contents.replace("#대상", "날다람쥐");
            else if(random == 16) contents = contents.replace("#대상", "고릴라");
            else if(random == 17) contents = contents.replace("#대상", "원숭이");
            else if(random == 18) contents = contents.replace("#대상", "닭");
            else if(random == 19) contents = contents.replace("#대상", "병아리");
            else if(random == 20) contents = contents.replace("#대상", "강아지");
        }
        if(contents.contains("#스피드런")) {
            int random = (int) (Math.random() * 15);
            if(random == 0) contents = contents.replace("#스피드런", "줄넘기 1개 빨리 뛰기");
            else if(random == 1) contents = contents.replace("#스피드런", "길에서 만원 빨리 줍기");
            else if(random == 2) contents = contents.replace("#스피드런", "1cm 빨리 달리기");
            else if(random == 3) contents = contents.replace("#스피드런", "물티슈 한 통 빨리 먹기");
            else if(random == 4) contents = contents.replace("#스피드런", "#음식 500g 빨리 먹기");
            else if(random == 5) contents = contents.replace("#스피드런", "테이프 10cm 빨리 뜯기");
            else if(random == 6) contents = contents.replace("#스피드런", "핸드폰 비밀번호 빨리 누르기");
            else if(random == 7) contents = contents.replace("#스피드런", "밖에 나가서 번개 빨리 맞기");
            else if(random == 8) contents = contents.replace("#스피드런", "자전거로 10cm 빨리 가기");
            else if(random == 9) contents = contents.replace("#스피드런", "알코올램프로 고기 빨리 굽기");
            else if(random == 10) contents = contents.replace("#스피드런", "알코올램프로 고기 빨리 굽기");
            else if(random == 11) contents = contents.replace("#스피드런", "독버섯 빨리 먹기");
            else if(random == 12) contents = contents.replace("#스피드런", "볼펜 빨리 사기");
            else if(random == 13) contents = contents.replace("#스피드런", "와이파이 빨리 연결하기");
            else if(random == 14) contents = contents.replace("#스피드런", "#음식 300g 빨리 먹기");
            else if(random == 15) contents = contents.replace("#스피드런", "#음식 1kg 빨리 먹기");
        }





        if(contents.contains("#음식")) {
            int random = (int) (Math.random() * 20);
            if(random == 0) contents = contents.replace("#음식", "키보드");
            else if(random == 1) contents = contents.replace("#음식", "바퀴벌레");
            else if(random == 2) contents = contents.replace("#음식", "캡사이신소스");
            else if(random == 3) contents = contents.replace("#음식", "마요네즈");
            else if(random == 4) contents = contents.replace("#음식", "휘발유");
            else if(random == 5) contents = contents.replace("#음식", "면도크림케이크");
            else if(random == 6) contents = contents.replace("#음식", "딱풀");
            else if(random == 7) contents = contents.replace("#음식", "나무");
            else if(random == 8) contents = contents.replace("#음식", "짱돌");
            else if(random == 9) contents = contents.replace("#음식", "새총");
            else if(random == 10) contents = contents.replace("#음식", "알코올램프");
            else if(random == 11) contents = contents.replace("#음식", "독버섯");
            else if(random == 12) contents = contents.replace("#음식", "볼펜");
            else if(random == 13) contents = contents.replace("#음식", "유리 플라스크");
            else if(random == 14) contents = contents.replace("#음식", "수산화 나트륨");
            else if(random == 15) contents = contents.replace("#음식", "물티슈");
            else if(random == 16) contents = contents.replace("#음식", "니코틴");
            else if(random == 17) contents = contents.replace("#음식", "타르");
            else if(random == 18) contents = contents.replace("#음식", "타르타르소스");
            else if(random == 19) contents = contents.replace("#음식", "머리카락");
            else if(random == 20) contents = contents.replace("#음식", "취두부");
        }

        return contents;
    }



    public static String random_sentence(String who, String josa) {

        String[] when = {"아침에", "점심에", "저녁에", "밤에", "새벽에", "낮에", "코딱지를 팔 때", "어제", "2100년 어느 날에", "1900년 어느 날에", "IMF 때", "4월의 어느 맑은 아침에", "본인 생일에", "원시시대 때", "조선시대 때", "기원전 100년경에", "3022년 어느 날에", "기원전 3000년 어느 날에"};
        String[] where = {"지옥에서", "천국에서", "학교에서", "화장실에서", "변기 안에서", "하수처리장에서", "피씨방에서", "맥도날드에서", "공장에서", "노인회관에서", "도박장에서", "엘리베이터 안에서", "텐트 안에서", "집에서", "납골당에서", "장례식장에서", "빕스에서", "아웃백에서", "소 농장에서", "사과나무 농장에서", "버스 안에서", "도서관에서", "동굴에서", "오션월드에서", "에버랜드에서", "치킨집에서", "우주선에서", "술집에서", "들판에서", "에베레스트산에서", "남극에서", "사막에서", "태평양 한가운데에서"};
        String[] how = {"웃으며", "방귀를 뀌며", "똥을 싸면서", "물구나무를 서서", "노래를 부르며", "더럽게", "가식스럽게", "가증스럽게", "각박스럽게", "감격스럽게", "거드럭스럽게", "거만스럽게", "거북스럽게", "거짓스럽게", "게걸스럽게", "고급스럽게", "고풍스럽게", "늙어보이게", "병걸린 것처럼", "어딘가가 아픈 것처럼", "딱딱하게", "과감하게", "괴팍하게", "보기 흉하게", "보잘것없게", "초라하게", "기괴하게", "괴랄하게", "신박하게", "까다롭게", "냉정하게", "당황스럽게", "맛있게", "맛없게", "밉상스럽게", "재밌게", "신나게", "감격스럽게", "죄송스럽게"};
        String[] why = {"기분이 좋아서", "별 이유 없이", "습관적으로", "어떻게든", "하고 싶었던 거라서", "태어날 때부터 하고 싶었던 거라서", "치킨을 먹어서", "재밌어서", "심심해서", "궁금해서", "유치원생 때부터 하던 행동이라서", "배고파서", "맛있어보여서", "본능적으로"};
        String[] what = {"바지에 똥을 지렸다.", "가장 가까운 곳에 있는 #액체 마셨다.", "미끄러져 넘어졌다.", "#바닥에 떨어져있던 #음식 먹었다.", "코를 팠다.", "울부짖었다.", "땅을 팠다.", "물구나무를 섰다.", "그자리에서 바닥에 똥을 쌌다.", "소리를 질렀다.", "#음식 먹었다.", "방사능에 피폭되었다."};

        int whenint = (int) (Math.random() * 17);
        int whereint = (int) (Math.random() * 32);
        int howint = (int) (Math.random() * 38);
        int whyint = (int) (Math.random() * 13);
        int whatint = (int) (Math.random() * 12);

        String t = who + josa + " " + why[whyint] + " " + when[whenint] + " " + where[whereint] + " " + how[howint] + " " + what[whatint];

        if(t.contains("#음식")) {
            int food = (int) (Math.random() * 20);
            if(food == 0) t = t.replace("#음식", "피자를");
            else if(food == 1) t = t.replace("#음식", "치킨을");
            else if(food == 2) t = t.replace("#음식", "방사능을");
            else if(food == 3) t = t.replace("#음식", "노트북을");
            else if(food == 4) t = t.replace("#음식", "선풍기를");
            else if(food == 5) t = t.replace("#음식", "취두부를");
            else if(food == 6) t = t.replace("#음식", "불닭볶음면을");
            else if(food == 7) t = t.replace("#음식", "변깃물을");
            else if(food == 8) t = t.replace("#음식", "의자를");
            else if(food == 9) t = t.replace("#음식", "종이를");
            else if(food == 10) t = t.replace("#음식", "와플을");
            else if(food == 11) t = t.replace("#음식", "생크림케이크를");
            else if(food == 12) t = t.replace("#음식", "햄버거를");
            else if(food == 13) t = t.replace("#음식", "유리를");
            else if(food == 14) t = t.replace("#음식", "생닭을");
            else if(food == 15) t = t.replace("#음식", "달걀 껍질을");
            else if(food == 16) t = t.replace("#음식", "날달걀을");
            else if(food == 17) t = t.replace("#음식", "휴지를");
            else if(food == 18) t = t.replace("#음식", "양말을");
            else if(food == 19) t = t.replace("#음식", "톱밥을");
            else if(food == 20) t = t.replace("#음식", "캣타워를");
        }
        if(t.contains("#바닥")) {
            int food = (int) (Math.random() * 10);
            if(food == 0) t = t.replace("#바닥", "바닥");
            else if(food == 1) t = t.replace("#바닥", "땅");
            else if(food == 2) t = t.replace("#바닥", "발");
            else if(food == 3) t = t.replace("#바닥", "의자");
            else if(food == 4) t = t.replace("#바닥", "머리");
            else if(food == 5) t = t.replace("#바닥", "아래");
            else if(food == 6) t = t.replace("#바닥", "뒤");
            else if(food == 7) t = t.replace("#바닥", "옆");
            else if(food == 8) t = t.replace("#바닥", "1km 앞");
            else if(food == 9) t = t.replace("#바닥", "땅 속");
            else if(food == 10) t = t.replace("#바닥", "바닥");
        }
        if(t.contains("#액체")) {
            int food = (int) (Math.random() * 20);
            if(food == 0) t = t.replace("#액체", "물을");
            else if(food == 1) t = t.replace("#액체", "오렌지쥬스를");
            else if(food == 2) t = t.replace("#액체", "오줌을");
            else if(food == 3) t = t.replace("#액체", "콜라를");
            else if(food == 4) t = t.replace("#액체", "커피를");
            else if(food == 5) t = t.replace("#액체", "밀크쉐이크를");
            else if(food == 6) t = t.replace("#액체", "오줌을");
            else if(food == 7) t = t.replace("#액체", "오줌을");
            else if(food == 8) t = t.replace("#액체", "변깃물을");
            else if(food == 9) t = t.replace("#액체", "해골물을");
            else if(food == 10) t = t.replace("#액체", "휘발유를");
            else if(food == 11) t = t.replace("#액체", "피를");
            else if(food == 12) t = t.replace("#액체", "변깃물을");
            else if(food == 13) t = t.replace("#액체", "휘발유를");
            else if(food == 14) t = t.replace("#액체", "치킨스톡을");
            else if(food == 15) t = t.replace("#액체", "날달걀을");
            else if(food == 16) t = t.replace("#액체", "비눗물을");
            else if(food == 17) t = t.replace("#액체", "간장을");
            else if(food == 18) t = t.replace("#액체", "까나리액젓을");
            else if(food == 19) t = t.replace("#액체", "마요네즈를");
            else if(food == 20) t = t.replace("#액체", "케찹을");
        }

        return t;
    }







}
