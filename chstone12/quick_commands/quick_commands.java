package chstone12.quick_commands;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.class_124;
import net.minecraft.class_1767;
import net.minecraft.class_1928;
import net.minecraft.class_2168;
import net.minecraft.class_2170;
import net.minecraft.class_2203;
import net.minecraft.class_2212;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2625;
import net.minecraft.class_2738;
import net.minecraft.class_274;
import net.minecraft.class_2741;
import net.minecraft.class_2750;
import net.minecraft.class_2756;
import net.minecraft.class_3218;
import net.minecraft.class_8242;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

import static chstone12.quick_commands.data.set_entity_data;
import static chstone12.quick_commands.functions.*;
import static chstone12.quick_commands.help.quick_command_help;
import static chstone12.quick_commands.write.write_text;


public class quick_commands implements ModInitializer {
	public static final String MOD_ID = "quick_commands";
	public static final String chat = "§e[QuickCommands] §f";
	// public static final String chat2 = "§6[QuickCommands] §c";

	final static String[] JONG = {"","ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ","ㄹ","ㄺ","ㄻ","ㄼ",
			"ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ","ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};


	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the loggers name.
	// That way, its clear which mod wrote info, warnings, and errors.

	/*

	else if(args1.equals("test")) {

			// 와 씨발 됐다1!!!!111120ㅑㄷ90-9ㅑ3201-4789023ㅕㄹ8ㅑㅐ;ㅇ너ㅑㅏㄹ;ㅓㅑ ㅐㅓ;ㅑㅈㄷ ㄹ더ㅑㅐ러쟈ㅐ러 ㅈㄷㄹ ;ㅐ
			// 대 C H A T G P T 마크 ㅗㅁ드도만들어줕ㅋ네

			BlockState block = Blocks.COMMAND_BLOCK.getDefaultState();
			BlockPos pos = BlockPos.ofFloored(Objects.requireNonNull(sauce.getPlayer()).getPos());

			sauce.getWorld().setBlockState(pos, block);

			if (context.getSource().getWorld().getBlockEntity(pos) instanceof CommandBlockBlockEntity commandBlock) {
				commandBlock.getCommandExecutor().setCommand("/tellraw @a \"됐냐?\"");
				commandBlock.setAuto(true);
				commandBlock.markDirty();
			}


		}

	나무위키에서 Fabric 공식 튜토리얼 사이트 링크 안걸어줬으면 진짜 하루종일 프로젝트 세팅만 했겠다.
	Gradle 미친색기들이 왜 자바 버전 맞췄는데도 안 되고 지랄이냐


	*/

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		// Spigot API가 편한거였네 뭐냐 이거 ㅡㅡ

		LOGGER.info("Hello Fabric world!");


			CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
				dispatcher.register(class_2170.method_9247("q")
						.executes(context -> executeCommon("null", "null", "null", "null", "null", context))
						.then(class_2170.method_9244("args1", StringArgumentType.string())
								.executes(context -> executeCommon(StringArgumentType.getString(context, "args1"), "null", "null", "null", "null", context))
								.then(class_2170.method_9244("args2", StringArgumentType.string())
										.executes(context -> executeCommon(
												StringArgumentType.getString(context, "args1"),
												StringArgumentType.getString(context, "args2"), "null", "null", "null", context))
										.then(class_2170.method_9244("args3", StringArgumentType.string())
												.executes(context -> executeCommon(StringArgumentType.getString(context, "args1"), StringArgumentType.getString(context, "args2"), StringArgumentType.getString(context, "args3"), "null", "null", context))
												.then(class_2170.method_9244("args4", StringArgumentType.string())
														.executes(context -> executeCommon(StringArgumentType.getString(context, "args1"), StringArgumentType.getString(context, "args2"), StringArgumentType.getString(context, "args3"), StringArgumentType.getString(context, "args4"), "null", context))
														.then(class_2170.method_9244("args5", StringArgumentType.string())
																.executes(context -> executeCommon(StringArgumentType.getString(context, "args1"), StringArgumentType.getString(context, "args2"), StringArgumentType.getString(context, "args3"), StringArgumentType.getString(context, "args4"), StringArgumentType.getString(context, "args5"), context)))
												)))));

				dispatcher.register(class_2170.method_9247("qd")
						.then(class_2170.method_9244("args1", class_2203.method_9360())
								.executes(context -> set_entity_data(class_2203.method_9358(context, "args1"), null, context))
								.then(class_2170.method_9244("args2", class_2212.method_9389())
										.executes(context -> set_entity_data(class_2203.method_9358(context, "args1"), class_2212.method_9390(context, "args2"), context)))));

				dispatcher.register(class_2170.method_9247("qh")
						.then(class_2170.method_9244("command", StringArgumentType.string())
								.suggests(new suggestions_help())
								.executes(context -> quick_command_help(StringArgumentType.getString(context, "command"), context))));
			});



	}

	private static final String eastereggs = """
			, uit, sorry, truth, false, 진실, 거짓, wer, tuber, hitomi, youtube, sent, recipe, food,
			""";

	private static int executeCommon(String args1, String args2, String args3, String args4, String args5, CommandContext<class_2168> context) {


		class_2168 sauce = context.getSource();
		class_3218 world = sauce.method_9225();

		if (args1.equals("null")) {
			try {
				URI i = new URI("https://drive.google.com/file/d/1uyGYOYv-nB-hOKWA6pcWpuPnxSIxGvcy/view?usp=sharing");
				context.getSource().method_45068(class_2561.method_43470("").method_27693("자주 쓰이는 커맨드를 더 빠르게 칠 수 있게 해줍니다. /qh를 치시면 사용할 수 있는 명령어들을 보여줍니다. 싱글 전용이라서 멀티에서 자주 쓰이는 커맨드는 지원하지 않습니다. (애초에 서버에선 이거 못씁니다.)\n\nComponent 관련은 그냥 NBTAutoComplete 모드로...\n\n서버에 몇가지 기능을 추가해 주는 ").method_10862(class_2583.field_24360).method_27693("제가 만든 플러그인도 사용해 보세요.").method_10862(class_2583.field_24360));
				context.getSource().method_45068(class_2561.method_43470("[링크]").method_10862(class_2583.field_24360.method_10982(true).method_10977(class_124.field_1078).method_30938(true).method_10958(new class_2558.class_10608(i))));
			} catch (URISyntaxException e) {
				System.out.println("이거 발생할 일 없음");
			}
		}


		// 이스터에그..
		else if (eastereggs.contains(", " + args1 + ",")) {
			switch (args1) {
				case "sorry" ->
						context.getSource().method_45068(class_2561.method_43470("안녕하세요 저는 치지직에서 방송을 하고 있는 스트리머 케인입니다. 먼저 저의 말과 행동으로 인해 큰 피해를 끼치고 실망을 드린 샌드백님, 시청자 분들께 죄송합니다. 지금부터는"));
				case "truth", "진실" -> context.getSource().method_45068(class_2561.method_43470("169.9"));
				case "false", "거짓" -> context.getSource().method_45068(class_2561.method_43470("170"));
				case "wer" ->
						context.getSource().method_45068(class_2561.method_43470("Q, W, E, R !"));
				case "tuber" -> context.getSource().method_45068(class_2561.method_43470("1997년 9월 11일!"));
				case "tp" -> context.getSource().method_45068(class_2561.method_43470("그정도는그냥쓰시죠..."));
				case "hitomi", "뭐가 나올까" -> {
					int ran = (int) (Math.random() * 777777) + 1777777;
					sauce.method_45068(class_2561.method_43470(String.valueOf(ran)));
				}
				case "youtube" -> sauce.method_45068(class_2561.method_43470(chat + random_youtube()));
				case "sent" -> {



					char uniVal = args2.charAt(args2.length() - 1);
					String jng;
					if (uniVal >= 0xAC00) {
						uniVal = (char) (uniVal - 0xAC00);

//						char cho = (char) (uniVal / 28 / 21);ㅁ
	//					char joong = (char) ((uniVal) / 28 % 21);
						char jong = (char) (uniVal % 28);

						jng = JONG[jong];
					} else {
						jng = "없음";
					}
					String josa;
					if (jng.equals("없음") || jng.equals("")) josa = "가";
					else josa = "이";
					sauce.method_45068(class_2561.method_43470(chat + random_sentence(args2, josa)));



				}
				case "recipe" -> {
					String[] main = {"돼지고기", "소고기", "치킨", "통닭", "식빵", "햄버거빵", "라면", "파스타 면", "김치", "밀가루 반죽", "참치", "연어", "쌀", "두부", "망고", "감자", "호박", "고래고기", "샥스핀", "스팸", "소시지", "베이컨", "오징어", "랍스터", "게", "새우", "귀뚜라미", "독버섯"};
					String[] amount = {"1Kg을", "500g을", "10개를", "5개를", "1톤을", "20개를", "반 개를", "5g을", "2g을"};
					String[] amountLitter = {"8 L", "4 L", "2 L", "1 L", "500 mL", "250 mL", "100 mL", "50 mL", "25 mL", "10 mL", "두 숟가락", "한 컵", "반 컵", "두 컵", "반 숟가락", "한 숟가락"};
					String[] sub = {"땅콩", "대파", "호두", "파인애플", "복숭아", "당근", "오이", "날달걀", "삶은계란", "가지", "피망", "파프리카", "시금치", "치즈", "버터", "생크림", "면도크림", "휘핑크림", "건새우", "조개", "전복", "잣", "청양고추", "고사리", "숙주나물", "콩나물", "양배추", "토마토", "쑥", "마늘", "참깨", "얼음", "강아지풀", "생강", "아몬드", "마카다미아", "양파", "스타후르츠", "아스파라거스", "미트볼", "차슈", "버터", "겨털", "멸치", "시험지", "외투"};
					String[] way = {"끓인다.", "데친다.", "튀긴다.", "굽는다.", "튀기듯이 굽는다.", "얼린다.", "태운다.", "녹인다."};
					String[] way2 = {"잘게 썰고", "다지고", "반으로 썰고", "길게 썰고", "칼로 썰고", "터트리고", "발로 밟고", "핸드블렌더로 갈고", "집게로 집고", "뒤집개로 뒤집고", "감자칼로 깎고", "면도칼로 깎고"};
					String[] where = {"냄비에", "오븐에", "후라이팬에", "믹서기에", "토스트기에", "전자레인지에", "냉장고에", "냉동고에"};
					String[] cook = {"조리한다.", "굽는다.", "굽는다.", "간다.", "구운다.", "돌린다.", "기다린다.", "얼린다."};
					String[] sauce_ = {"민트초코 아이스크림 녹인거를", "캡사이신 소스를", "간장을", "식초를", "참기름을", "들기름을", "마요네즈를", "머스타드를", "케첩을", "살사소스를", "핫소스를", "데리야끼를", "고추장을", "와사비를", "토마토 소스를", "까나리 액젓을"};
					String[] powder = {"고춧가루", "설탕", "소금", "후리카케", "후추", "라면스프", "미숫가루", "빵가루", "밀가루", "원칩 가루", "과자 부스러기", "뼛가루", "수박 씨", "금가루"};
					String[] plating = {"접시에", "쟁반에", "식탁 위에", "베개에", "아이패드 위에", "소설책 위에", "라이스페이퍼 위에", "벤츠 차 로고에", "시험지 위에"};
					String[] time = {"2시간", "1시간", "30분", "15분", "5분", "3분", "1분", "30초", "15초", "물이 끓을 때까지"};
					int iMain = (int) (Math.random() * main.length - 1);
					int iAmount = (int) (Math.random() * amount.length - 1);
					int iAmount2 = (int) (Math.random() * amount.length - 1);
					int iAmount3 = (int) (Math.random() * amount.length - 1);
					int iAmountLitter = (int) (Math.random() * amountLitter.length - 1);
					int iSub = (int) (Math.random() * sub.length - 1);
					int iWay = (int) (Math.random() * way.length - 1);
					int iWay2 = (int) (Math.random() * way2.length - 1);
					int iWhere = (int) (Math.random() * where.length - 1);
					int iSauce = (int) (Math.random() * sauce_.length - 1);
					int iPowder = (int) (Math.random() * powder.length - 1);
					int iPlating = (int) (Math.random() * plating.length - 1);
					int iTime = (int) (Math.random() * time.length - 1);
					int iTime2 = (int) (Math.random() * time.length - 1);
					while (iAmount2 == iAmount) iAmount2 = (int) (Math.random() * amount.length - 1);
					while (iAmount2 == iAmount3) iAmount3 = (int) (Math.random() * amount.length - 1);
					while (iTime2 == iTime) iTime2 = (int) (Math.random() * time.length - 1);
					String output = "1. " + main[iMain] + " " + amount[iAmount] + " 준비한다.\n" +
							"2. 준비된 " + main[iMain] + "에다가 " + powder[iPowder] + " " + amount[iAmount2] + " 뿌려준다.\n" +
							"3. 이거를 " + where[iWhere] + " 넣고 " + time[iTime] + " " + cook[iWhere] + "\n" +
							"4. 그리고 나서 " + where[iWhere] + " " + sauce_[iSauce] + " " + amountLitter[iAmountLitter] + " 넣어준다.\n" +
							"5. 그 다음에 " + sub[iSub] + " " + amount[iAmount3] + " 준비한 다음 " + way2[iWay2] + " " + where[iWhere] + " 넣는다.\n" +
							"6. 이 상태로 " + time[iTime2] + " " + way[iWay] + "\n" +
							"7. 마지막으로, " + where[iWhere] + " 있는 완성된 요리를 " + plating[iPlating] + " 올린다.";
					sauce.method_9226(() -> class_2561.method_43470(chat + output), false);
				}

				case "uit" -> {
					class_2338 pos = Objects.requireNonNull(sauce.method_44023()).method_24515();
					world.method_8501(pos, class_2246.field_10231.method_9564());
					if(world.method_8321(pos) instanceof class_2625 sign) {
						class_2561[] ar = new class_2561[3];
						ar[1] = class_2561.method_30163("튕겨라!!!!!!!!!");
						class_8242 text = new class_8242(ar, ar, class_1767.field_7963, false);
						sign.method_49840(text, true);
					}
					sauce.method_45068(class_2561.method_43470(chat + "튕겨라!!!!!!!!!"));
				}

				case "food" -> {

					String[] food = {"감자탕(뼈해장국)", "치킨", "페리카나", "교촌치킨", "BBQ", "BHC", "굽네치킨", "피자", "맘스터치", "삼겹살", "규카츠", "돼지국밥", "칼국수", "돈까스", "미소야 (일식)", "삼계탕", "익히지 않은 돼지고기", "회", "한솥", "본도시락", "비빔밥", "우동", "냉면", "회냉면", "보쌈 족발 수육", "돈까스덮밥 (가츠동)", "간장게장", "양념게장", "카레덮밥 / 카레돈가스", "치킨마요", "갈비찜", "갈비탕", "곱창", "막창", "제육덮밥", "샤부샤부", "본죽", "엽떡", "크림파스타 (까르보나라)", "대파" ,"빠네파스타", "아웃백", "빕스", "에슐리", "명륜진사갈비", "쿠우쿠우", "김치찜 / 돼지찜", "컵라면, 순대, 떡볶이, 튀김", "잔치국수", "비빔국수", "순대볶음 (근데 이거 어디서 파는거임 대체)", "순대국밥 (순댓국)", "집 근처에 있는 배달 안하는 중국집", "상추 사과 브로콜리 샐러드", "규동", "서오릉피자 (얘네 왜이렇게 비싸졌음 근데)", "버거킹", "생크림케이크를 넣은 김치찌개", "함박스테이크덮밥", "닭칼국수", "알밥", "메밀국수", "라멘", "오징어볶음밥", "낙지덮밥", "쭈꾸미덮밥", "해물탕 / 해물찜 / 아구찜", "해물칼국수", "장칼국수", "참치마요", "족발 보쌈 막국수 수육", "놀부부대찌개", "누구나홀딱반한닭", "국밥", "해장국", "한정식", "랍스터", "킹크랩", "KFC", "닭도리탕", "써브웨이", "불고기덮밥", "역전우동", "돈코츠라멘", "오므라이스", "홍익돈까스", "돈가스카레덮밥", "치킨덮밥", "모둠돈까스", "일식 돈까스", "돌솥비빔밥에서 비빔밥 빼고", "비빔냉면", "망향비빔국수", "쌈밥", "제육쌈밥", "떡갈비", "파전", "육개장사발면 + 한솥", "경의중앙선 야당역 ㄱㄱ", "야당역 근처에 있는 소문난명동감자탕", "닭갈비", "바이킹스 워프 (주의 : 개비쌈)", "일산칼국수 (줄 너무 길면 야당역 근처에도 하나 있음)", "풍산역 근처에 있는 누룽지탕", "피시앤칩스", "고기국수", "스시 뷔페", "로스트 비프", "해물파스타", "해물까르보나라", "18번 완당 (부산광역시 서구 구덕로238번길 6; 토성역 근처)", "현대옥 본점 (전주에 있음)"
							, "일산 이지구에 횟집 하나 있음", "가장맛있는족발", "파닭", "무뼈닭발", "코스트코 피자 (피자 GOAT)", "봉구스 밥버거", "불낙", "츄르", "찜닭", "소갈비찜", "수제비 (해물 수제비)", "안심 스테이크", "돼지갈비", "스시", "치즈닭갈비", "게찜 (대게찜)", "삼겹살 된장찌개 계란찜 냉면 볶음밥", "낙곱새", "물냉면", "설렁탕", "수육 국밥", "양갈비", "고추장삼겹살", "훠궈", "돌솥 비빔밥", "불족발", "투움바파스타", "밀면", "전골", "매운탕 / 알탕 (횟집)", "누룽지백숙", "튀김우동 (컵라면 말고)", "훈제 치킨", "통닭", "쌀국수", "돈가스김치나베", "텐동", "탄두리치킨", "마파두부 덮밥", "취두부"};

					int n = (int) (Math.random() * food.length); n--;

					context.getSource().method_45068(class_2561.method_43470(chat + "메뉴 추천 : " + food[n]));

				}
			}
		}



		// 시작
		else {

			// 시간
			if (args1.equals("t")) {
				try {
					long time = Integer.parseInt(args2);
					context.getSource().method_9225().method_29199(time);
					context.getSource().method_9226(() -> class_2561.method_43470("§e[QuickCommands] §f시간을 %s(으)로 바꿨습니다.".formatted(args2)), false);
				} catch (Exception e) {
					context.getSource().method_9213(class_2561.method_43470("§6[QuickCommands] §c%s은(는) 정수가 아닌데요..".formatted(args2)));
				}
			}

			// 스코어보드
			else if (args1.equals("s")) {

				if (args2.equals("null"))
					context.getSource().method_9213(class_2561.method_43470("§6[QuickCommands] §c스코어보드 이름이 없는데요.."));

				else if (args3.equals("null")) {
					try {
						context.getSource().method_9225().method_14170().method_1168(args2, class_274.field_1468, class_2561.method_43470(args2), class_274.class_275.field_1472, true, null);
						context.getSource().method_9226(() -> class_2561.method_43470("§e[QuickCommands] §fdummy 유형의 스코어보드 %s을(를) 추가했습니다.".formatted(args2)), false);
					} catch (Exception e) {
						send_error_message(context, "이미 있는 스코어보드 이름인데요..");
					}
				} else {

					try {
						String crit = args3.replace("..", ":").replace("m.", "minecraft.");

						String cmd = "/scoreboard objectives add " + args2 + " " + crit;
						run_command(cmd, context);
						sauce.method_9226(() -> class_2561.method_43470("§e[QuickCommands] §f%s 유형의 스코어보드 %s을(를) 추가했습니다. (추가되지 않았다면 %s이(가) 존재하지 않는 기준인 겁니다.)".formatted(crit, args2, crit)), false);
					} catch (Exception e) {
						send_error_message(context, "이미 있는 스코어보드 이름인데요..");
					}

				}
			}


			// 템 번호 검색 or 엔티티 번호 검색
			else if (args1.equals("se") || args1.equals("see")) {
				String items;
				if (args1.equals("se")) items = chstone12.quick_commands.items.item_list;
				else items = entits.entity_list;


				if(is_this_number(args2)) {

					if (args3.equals("null")) args3 = "0";

					if (items.contains(args2 + " ; " + args3)) {
						String[] line = items.split("\\R");



						for (String s : line) {
							if (s.startsWith(args2 + " ; " + args3)) {
								String input = args2 + ":" + args3;
								String[] item = s.replace(" ", "").split(";");



								if (args1.equals("se"))
									sauce.method_9226(() -> class_2561.method_43470("§e[QuickCommands] §a%s§f번 아이템은 §b%s§f입니다.".formatted(input, item[2])), false);
								else
									sauce.method_9226(() -> class_2561.method_43470("§e[QuickCommands] §a%s§f번 엔티티는 §b%s§f입니다.".formatted(input.replace(":0", ""), item[2])), false);

								break;
								}
							}

						} else {
							if (args1.equals("se")) send_error_message(context, "그런 템 없는데요..");
							else send_error_message(context, "그런 엔티티 없는데요..");
						}



				}

				else {

					if (!items.toLowerCase().replace(" ", "").contains(";" + args2.toLowerCase())) {
						if (args1.equals("se")) send_error_message(context, "그런 템 없는데요..");
						else send_error_message(context, "그런 엔티티 없는데요..");
					} else {
						String[] line = items.replace(" ", "").split("\\R");

						for (String s : line) {
							if (s.toLowerCase().contains(";" + args2.toLowerCase())) {
								String[] item = s.replace(" ", "").split(";");
								String number = item[0] + ":" + item[1];
								if (args1.equals("se"))
									sauce.method_9226(() -> class_2561.method_43470("§e[QuickCommands] §a%s§f은(는) §b%s§f번입니다.".formatted(item[2], number)), false);
								else
									sauce.method_9226(() -> class_2561.method_43470("§e[QuickCommands] §a%s§f은(는) §b%s§f번입니다.".formatted(item[2], number.replace(":0", ""))), false);
								if (!args3.equals("a")) break;
							}
						}
					}
				}

			}


			// summon
			else if (args1.equals("sm")) {
				String entity = "";
				String list = entits.entity_list;
				String[] line = list.split("\\R");
				if (is_this_number(args2.replace(".", ""))) {

					String input = args2.replace(".", " ; ");

					if (list.contains(input)) {
						for (String s : line) {
							if (s.startsWith(input)) {
								entity = s.split(" ; ")[3];
								break;
							}
						}
					} else send_error_message(context, "그런 엔티티 없는데요..");
				} else {
					if (list.contains("; " + args2)) {
						for (String s : line) {
							if (s.contains("; " + args2)) {
								entity = s.split(" ; ")[3];
							}
						}
					} else entity = args2;
				}


				String finalEntity = entity;
				if (!args3.equals("null")) {

					if (args4.equals("null")) {
						run_command("/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {Tags:[\"" + args3 + "\"]}", context);
						String finalArgs = args3;
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s§f인 §b%s§f을(를) 소환했습니다.".formatted(finalArgs, finalEntity)), false);
					} else {
						run_command("/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {Tags:[\"" + args3 + "\", \"" + args4 + "\"]}", context);
						String finalArgs1 = args3;
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s, %s§f인 §b%s§f을(를) 소환했습니다.".formatted(finalArgs1, args4, finalEntity)), false);
					}
				} else {
					run_command("/execute at @a[tag=quick_command_executor] run summon " + entity, context);
					sauce.method_9226(() -> class_2561.method_43470(chat + "§a%s§f을(를) 소환했습니다.".formatted(finalEntity)), false);
				}
			}


			// 테스트용 엔티티 소환
			else if (args1.equals("ts")) {
				String entity = "";
				String list = entits.entity_list;
				String[] line = list.split("\\R");
				if (is_this_number(args2.replace(".", ""))) {

					String input = args2.replace(".", " ; ");

					if (list.contains(input)) {
						for (String s : line) {
							if (s.startsWith(input)) {
								entity = s.split(" ; ")[3];
								break;
							}
						}
					} else send_error_message(context, "그런 엔티티 없는데요..");
				} else {
					if (list.contains("; " + args2)) {
						for (String s : line) {
							if (s.contains("; " + args2)) {
								entity = s.split(" ; ")[3];
							}
						}
					} else entity = args2;
				}


				String finalEntity = entity;
				String command;
				if (!args3.equals("null")) {


					if (entity.equals("armor_stand")) {
						if (args4.equals("null"))
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoBasePlate:1,ShowArms:1,NoGravity:1,Invulnerable:1,Tags:[\"" + args3 + "\"]}";
						else
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoBasePlate:1,ShowArms:1,NoGravity:1,Invulnerable:1,Tags:[\"" + args3 + "\",\"" + args4 + "\"]}";
					} else {
						if (args4.equals("null"))
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {PersistenceRequired:1b,NoAI:1,Silent:1,Tags:[\"" + args3 + "\"]}";
						else
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {PersistenceRequired:1b,NoAI:1,Silent:1,Tags:[\"" + args3 + "\",\"" + args4 + "\"]}";
					}


					run_command(command, context);
					if (args4.equals("null")) {
						String finalArgs3 = args3;
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s§f인 테스트용 엔티티 §b%s§f을(를) 소환했습니다.".formatted(finalArgs3, finalEntity)), false);
					}
					else {
						String finalArgs2 = args3;
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s, %s§f인 테스트용 엔티티 §b%s§f을(를) 소환했습니다.".formatted(finalArgs2, args4, finalEntity)), false);
					}
				} else {
					if (entity.equals("armor_stand"))
						run_command("/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoBasePlate:1,ShowArms:1,NoGravity:1,Invulnerable:1}", context);
					else
						run_command("/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoAI:1,Silent:1,PersistenceRequired:1b}", context);
					sauce.method_9226(() -> class_2561.method_43470(chat + "테스트용 엔티티 §a%s§f을(를) 소환했습니다.".formatted(finalEntity)), false);
				}
			}

			else if (args1.equals("tsi")) {
				String entity = "";
				String list = entits.entity_list;
				String[] line = list.split("\\R");
				if (is_this_number(args2.replace(".", ""))) {

					String input = args2.replace(".", " ; ");

					if (list.contains(input)) {
						for (String s : line) {
							if (s.startsWith(input)) {
								entity = s.split(" ; ")[3];
								break;
							}
						}
					} else send_error_message(context, "그런 엔티티 없는데요..");
				} else {
					if (list.contains("; " + args2)) {
						for (String s : line) {
							if (s.contains("; " + args2)) {
								entity = s.split(" ; ")[3];
							}
						}
					} else entity = args2;
				}


				String finalEntity = entity;
				String command;
				if (!args3.equals("null")) {


					if (entity.equals("armor_stand")) {
						if (args4.equals("null"))
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoBasePlate:1,ShowArms:1,NoGravity:1,Invulnerable:1,Tags:[\"" + args3 + "\"]}";
						else
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoBasePlate:1,ShowArms:1,NoGravity:1,Invulnerable:1,Tags:[\"" + args3 + "\",\"" + args4 + "\"]}";
					} else {
						if (args4.equals("null"))
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {PersistenceRequired:1b,NoAI:1,Invulnerable:1b,Silent:1,Tags:[\"" + args3 + "\"]}";
						else
							command = "/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {PersistenceRequired:1b,NoAI:1,Invulnerable:1b,Silent:1,Tags:[\"" + args3 + "\",\"" + args4 + "\"]}";
					}


					run_command(command, context);
					if (args4.equals("null")) {
						String finalArgs3 = args3;
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s§f인 테스트용 엔티티 §b%s§f을(를) 소환했습니다.".formatted(finalArgs3, finalEntity)), false);
					}
					else {
						String finalArgs2 = args3;
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s, %s§f인 테스트용 엔티티 §b%s§f을(를) 소환했습니다.".formatted(finalArgs2, args4, finalEntity)), false);
					}
				} else {
					if (entity.equals("armor_stand"))
						run_command("/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoBasePlate:1,ShowArms:1,NoGravity:1,Invulnerable:1}", context);
					else
						run_command("/execute at @a[tag=quick_command_executor] run summon " + entity + " ~ ~ ~ {NoAI:1,Silent:1,Invulnerable:1b,PersistenceRequired:1b}", context);
					sauce.method_9226(() -> class_2561.method_43470(chat + "무적인 테스트용 엔티티 §a%s§f을(를) 소환했습니다.".formatted(finalEntity)), false);
				}
			}


			// 블럭 디스플레이
			else if (args1.equals("smb")) {
				String block = args2;
				if (is_this_number(args2.replace(".", ""))) block = convert_number_to_item(args2);

				String command1 = "/setblock ~ ~-1 ~ " + block;
				String command2;
				String command3 = "/setblock ~ ~-1 ~2 air";

				if (args3.equals("null"))
					command2 = "/execute if block ~ ~-1 ~1 " + block + " at @a[tag=quick_command_executor] run summon block_display ~ ~ ~ {block_state:{Name:\"" + block + "\"}}";
				else if (args4.equals("null"))
					command2 = "/execute if block ~ ~-1 ~1 " + block + " at @a[tag=quick_command_executor] run summon block_display ~ ~ ~ {block_state:{Name:\"" + block + "\"},Tags:[\"" + args3 + "\"]}";
				else
					command2 = "/execute if block ~ ~-1 ~1 " + block + " at @a[tag=quick_command_executor] run summon block_display ~ ~ ~ {block_state:{Name:\"" + block + "\"},Tags:[\"" + args3 + "\",\"" + args4 + "\"]}";

				run_commands(command1, command2, command3, context);

				String finalBlock = block;

				if (args3.equals("null"))
					sauce.method_9226(() -> class_2561.method_43470(chat + "§a%s§f 블럭 디스플레이를 소환했습니다.".formatted(finalBlock)), false);
				else if (args4.equals("null")) {
					String finalArgs4 = args3;
					sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s§f인 §b%s§f 블럭 디스플레이를 소환했습니다.".formatted(finalArgs4, finalBlock)), false);
				}
				else {
					String finalArgs5 = args3;
					sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s, %s§f인 §b%s§f 블럭 디스플레이를 소환했습니다.".formatted(finalArgs5, args4, finalBlock)), false);
				}

			}


			// 아이템 디스플레이
			else if (args1.equals("smi")) {
				String block = args2;
				if (is_this_number(args2.replace(".", ""))) block = convert_number_to_item(args2);

				String command1 = "/summon item ~ ~ ~ {Item:{id:\"" + block + "\"},Tags:[\"quick_command_itemdisplay\"]}";
				String command2;
				String command3 = "/kill @e[tag=quick_command_itemdisplay]";

				if (args3.equals("null"))
					command2 = "/execute if entity @e[tag=quick_command_itemdisplay] at @a[tag=quick_command_executor] run summon item_display ~ ~ ~ {item:{id:\"" + block + "\"}}";
				else if (args4.equals("null"))
					command2 = "/execute if entity @e[tag=quick_command_itemdisplay] at @a[tag=quick_command_executor] run summon item_display ~ ~ ~ {item:{id:\"" + block + "\"},Tags:[\"" + args3 + "\"]}";
				else
					command2 = "/execute if entity @e[tag=quick_command_itemdisplay] at @a[tag=quick_command_executor] run summon item_display ~ ~ ~ {item:{id:\"" + block + "\"},Tags:[\"" + args3 + "\",\"" + args4 + "\"]}";


				run_commands(command1, command2, command3, context);

				String finalBlock = block;

				if (args3.equals("null"))
					sauce.method_9226(() -> class_2561.method_43470(chat + "§a%s§f 아이템 디스플레이를 소환했습니다.".formatted(finalBlock)), false);
				else if (args4.equals("null")) {
					String finalArgs7 = args3;
					sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s§f인 §b%s§f 아이템 디스플레이를 소환했습니다.".formatted(finalArgs7, finalBlock)), false);
				}
				else {
					String finalArgs6 = args3;
					sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s, %s§f인 §b%s§f 아이템 디스플레이를 소환했습니다.".formatted(finalArgs6, args4, finalBlock)), false);
				}

			}


			// 텍스트 디스플레이
			else if (args1.equals("smt")) {


				float rot = sauce.method_9210().field_1342;

				String dir;
				if (rot > 135 || rot < -135) dir = "[180f,0f]";
				else if (45 < rot && rot < 135) dir = "[90f,0f]";
				else if (-45 > rot && rot > -135) dir = "[-90f,0f]";
				else dir = "[0f,0f]";

				String text = args2;
				if (text.length() > 15) text = text.substring(0, 15) + "...";

				if (args3.equals("null")) {

					String finalText = text;

					sauce.method_9226(() -> class_2561.method_43470(chat + "§a%s§f 텍스트 디스플레이를 소환했습니다.".formatted(finalText)), false);
					run_command("/execute at @a[tag=quick_command_executor] run summon text_display ~ ~ ~ {shadow:1,Rotation:" + dir + ",text:" + args2 + "}", context);

				}

				else {
					int bg = 0;
					String finalText1 = text;

					if (!args3.equals("0")) {
						if (!(args3.length() > 6)) {
							try {
								bg = Integer.parseInt(args3, 16);
								bg = 16777216 - bg;
								bg *= -1;
							} catch (NumberFormatException e) {
								send_error_message(context, "숫자가 잘못 입력되었습니다.");

							}
						}
					}

					if (args4.equals("null")) {
						sauce.method_9226(() -> class_2561.method_43470(chat + "§a%s§f 텍스트 디스플레이를 소환했습니다.".formatted(finalText1)), false);
						run_command("/execute at @a[tag=quick_command_executor] run summon text_display ~ ~ ~ {shadow:1,Rotation:" + dir + ",text:" + args2 + ",background:" + bg + "}", context);
					}

					else if (args5.equals("null")) {
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s§f인 §b%s§f 텍스트 디스플레이를 소환했습니다.".formatted(args4, finalText1)), false);
						run_command("/execute at @a[tag=quick_command_executor] run summon text_display ~ ~ ~ {shadow:1,Rotation:" + dir + ",text:" + args2 + ",background:" + bg + ",Tags:[\"" + args4 + "\"]}", context);
					}

					else {
						sauce.method_9226(() -> class_2561.method_43470(chat + "태그가 §a%s, %s§f인 §b%s§f 텍스트 디스플레이를 소환했습니다.".formatted(args4, args5, finalText1)), false);
						run_command("/execute at @a[tag=quick_command_executor] run summon text_display ~ ~ ~ {shadow:1,Rotation:" + dir + ",text:" + args2 + ",background:" + bg + ",Tags:[\"" + args4 + "\",\"" + args5 + "\"]}", context);
					}
				}


			}


			// 태그
			else if (args1.equals("ta")) {
				if(args2.equals("l")) {
					run_command("/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[type=!player]\"},\"의 태그 : \",{\"entity\":\"@n[type=!player]\",\"nbt\":\"Tags\",\"color\":\"green\"}]", context);
				}

				else if (args2.equals("r")) {

					if(!args5.equals("null")) {
						String command1 = "/execute at @a[tag=quick_command_executor] run tag @n[tag=" + args3 + "] remove " + args3;
						String command2 = "/execute at @a[tag=quick_command_executor] run tag @n[tag=" + args4 + "] remove " + args4;
						String command3 = "/execute at @a[tag=quick_command_executor] run tag @n[tag=" + args5 + "] remove " + args5;
						String command4, command5, command6;

						if (send_feedback(context)) {
							command4 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[tag=" + args3.replace("\"", "") + "]\"},\"에게서 §a" + args3.replace("\"", "") + "§f 태그를 제거했습니다.\"]";
							command5 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[tag=" + args4.replace("\"", "") + "]\"},\"에게서 §a" + args4.replace("\"", "") + "§f 태그를 제거했습니다.\"]";
							command6 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[tag=" + args5.replace("\"", "") + "]\"},\"에게서 §a" + args5.replace("\"", "") + "§f 태그를 제거했습니다.\"]";

						}
						else {
							command4 = "";
							command5 = "";
							command6 = "";
						}

						run_more_commands(command4, command5, command6, command1, command2, command3, "", "", "", context);

					}

					else if(!args4.equals("null")) {
						String command1 = "/execute at @a[tag=quick_command_executor] run tag @n[tag=" + args3 + "] remove " + args3;
						String command2 = "/execute at @a[tag=quick_command_executor] run tag @n[tag=" + args4 + "] remove " + args4;
						String command3, command4;

						if (send_feedback(context)) {
							command3 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[tag=" + args3.replace("\"", "") + "]\"},\"에게서 §a" + args3.replace("\"", "") + "§f 태그를 제거했습니다.\"]";
							command4 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[tag=" + args4.replace("\"", "") + "]\"},\"에게서 §a" + args4.replace("\"", "") + "§f 태그를 제거했습니다.\"]";

						}
						else {
							command3 = ""; command4 = "";
						}

						run_more_commands(command3, command4, command1, command2, "", "", "", "", "", context);


					}

					else if(!args3.equals("null")) {


						String command1 = "/execute at @a[tag=quick_command_executor] run tag @n[tag=" + args3 + "] remove " + args3;
						String command2;

						if (send_feedback(context))
							command2 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[tag=" + args3.replace("\"", "") + "]\"},\"에게서 §a" + args3.replace("\"", "") + " §f태그를 제거했습니다.\"]";
						else command2 = "";

						run_commands(command2, command1, "", context);
					}


					else send_error_message(context, "제거할 태그를 입력해 주세요.");


				}


				else {


					if(!args5.equals("null")) {
						String command1 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args2;
						String command2 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args3;
						String command3 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args4;
						String command4 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args5;

						String command5;

						if (send_feedback(context)) command5 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[type=!player]\"},\"에게 §a" + args2.replace("\"", "") + ", " + args3.replace("\"", "") + ", " + args4.replace("\"", "") + ", " + args5.replace("\"", "") + "§f 태그를 추가했습니다.\"]";
						else command5 = "";

						run_more_commands(command1, command2, command3, command4, command5, "", "", "", "", context);

					}

					else if(!args4.equals("null")) {
						String command1 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args2;
						String command2 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args3;
						String command3 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args4;

						String command4;
						if (send_feedback(context)) command4 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[type=!player]\"},\"에게 §a" + args2.replace("\"", "") + ", " + args3.replace("\"", "") + ", " + args4.replace("\"", "") + "§f 태그를 추가했습니다.\"]";
						else command4 = "";

						run_more_commands(command1, command2, command3, command4, "", "", "", "", "", context);
					}

					else if (!args3.equals("null")) {
						String command1 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args2;
						String command2 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args3;
						String command3;

						if (send_feedback(context)) command3 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[type=!player]\"},\"에게 §a" + args2.replace("\"", "") + ", " + args3.replace("\"", "") + "§f 태그를 추가했습니다.\"]";
						else command3 = "";

						run_commands(command1, command2, command3, context);
					}

					else {

						String command1 = "/execute at @a[tag=quick_command_executor] run tag @n[type=!player] add " + args2;
						String command2;

						if (send_feedback(context)) command2 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "\",{\"selector\":\"@n[type=!player]\"},\"에게 §a" + args2.replace("\"", "") + "§f 태그를 추가했습니다.\"]";
						else command2 = "";

						run_commands(command1, command2, "", context);

					}
				}
			}


			// 마검
			else if (args1.equals("ench")) {

				String item = Objects.requireNonNull(sauce.method_44023()).method_6047().method_7909().toString();
				run_command("/item replace entity @a[tag=quick_command_executor] weapon.mainhand with " + item + "[enchantments={protection:255,bane_of_arthropods:255,blast_protection:255,breach:255,channeling:255,density:255,depth_strider:255,efficiency:255,feather_falling:255,fire_aspect:255,fire_protection:255,flame:255,fortune:255,frost_walker:255,impaling:255,infinity:255,knockback:255,looting:255,loyalty:255,luck_of_the_sea:255,lure:255,mending:1,multishot:100,piercing:255,power:255,projectile_protection:255,protection:255,punch:255,quick_charge:5,respiration:255,riptide:255,sharpness:255,silk_touch:255,smite:255,soul_speed:255,sweeping_edge:255,swift_sneak:255,thorns:255,unbreaking:255,wind_burst:255}]", context);
				sauce.method_9226(() -> class_2561.method_43470(chat + "손에 든 §a%s§f을(를) 마검으로 만들었습니다.".formatted(item)), false);


			}


			// 무지개
			else if (args1.equals("rt")) {
				String mes = args2;

				if (mes.length() <= 6) send_error_message(context, "입력이 7글자 이상이어야 합니다.");
				else {




					int length = (int) Math.round(((double) mes.length() / 6));

					int r, g, b, q = 0;
					StringBuilder output = new StringBuilder("[\"\"");
					for (int a = 0; a <= mes.length() - 1; a++) {
						if (a == length || a == length * 2 || a == length * 3 || a == length * 4 || a == length * 5 || a == length * 6 || a == length * 7)
							q = 0;

						if (a < length) {

							g = (255 / length) * q;
							q++;
							if (Integer.toHexString(g).length() == 1)
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("ff0").append(Integer.toHexString(g)).append("00").append("\"}");
							else
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("ff").append(Integer.toHexString(g)).append("00").append("\"}");
						} else if (a < length * 2) {

							r = 255 - (255 / length) * q;
							q++;
							if (Integer.toHexString(r).length() == 1)
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#0").append(Integer.toHexString(r)).append("ff").append("00").append("\"}");
							else
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append(Integer.toHexString(r)).append("ff").append("00").append("\"}");
						} else if (a < length * 3) {
							b = (255 / length) * q;
							q++;
							if (Integer.toHexString(b).length() == 1)
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("00").append("ff0").append(Integer.toHexString(b)).append("\"}");
							else
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("00").append("ff").append(Integer.toHexString(b)).append("\"}");
						} else if (a < length * 4) {
							g = 255 - ((255 / length) * q);
							q++;
							if (Integer.toHexString(g).length() == 1)
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("000").append(Integer.toHexString(g)).append("ff").append("\"}");
							else
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("00").append(Integer.toHexString(g)).append("ff").append("\"}");
						} else if (a < length * 5) {
							r = (255 / length) * q;
							q++;
							if (Integer.toHexString(r).length() == 1)
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#0").append(Integer.toHexString(r)).append("00").append("ff").append("\"}");
							else
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append(Integer.toHexString(r)).append("00").append("ff").append("\"}");
						} else if (a < length * 6) {
							b = 255 - ((255 / length) * q);

							q++;
							if (Integer.toHexString(b).length() == 1)
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("ff").append("000").append(Integer.toHexString(b)).append("\"}");
							else
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("ff").append("00").append(Integer.toHexString(b)).append("\"}");


						} else {
							g = (255 / length) * q;
							q++;
							if (Integer.toHexString(g).length() == 1)
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("ff0").append(Integer.toHexString(g)).append("00").append("\"}");
							else
								output.append(",{\"text\":\"").append(mes.charAt(a)).append("\",\"color\":\"#").append("ff").append(Integer.toHexString(g)).append("00").append("\"}");
						}

					}
					String finalMes2 = output + "]";
					if (mes.length() > 20) {
						mes = mes.substring(0, 19);
						mes += "...";
					}

					String finalMes = mes;
					sauce.method_9226(() -> class_2561.method_43470(chat + finalMes + "의 무지개색 텍스트가 생성되었습니다. 눌러서 복사하세요."), false);
					sauce.method_9226(() -> class_2561.method_43470(chat + "[클릭]").method_10862(class_2583.field_24360.method_10958(new class_2558.class_10606(finalMes2)).method_30938(true).method_10977(class_124.field_1054).method_10982(true)), false);


				}
			}


			// 그라데이션
			else if (args1.equals("gd")) {
				try {

					String[] color = new String[2];
					color[0] = args3;
					color[1] = args4;

					String input = args4;

					color[0] = args2.replace("darkgreen", "007f00").replace("darkgray", "404040").replace("lightblue", "007fff")
							.replace("darkred", "700000")
							.replace("lightgray", "c0c0c0").replace("red", "ff0000").replace("blue", "0000ff").replace("green", "00ff00")
							.replace("orange", "ff7f00").replace("yellow", "ffff00")
							.replace("aqua", "00ffff")
							.replace("magenta", "ff00ff").replace("purple", "7f00ff").replace("shindol", "177013")
							.replace("white", "ffffff").replace("black", "000000").replace("gray", "7f7f7f")
							.replace("pink", "ff9ed3").replace("brown", "873e23").replace("sky", "aefcfb")
							.replace("miku", "39c5bb").replace(" ", "");

					color[1] = args3.replace("darkgreen", "007f00").replace("darkgray", "404040").replace("lightblue", "007fff")
							.replace("darkred", "700000")
							.replace("lightgray", "c0c0c0").replace("red", "ff0000").replace("blue", "0000ff").replace("green", "00ff00")
							.replace("orange", "ff7f00").replace("yellow", "ffff00").replace("shindol", "177013")
							.replace("aqua", "00ffff")
							.replace("magenta", "ff00ff").replace("purple", "7f00ff")
							.replace("white", "ffffff").replace("black", "000000").replace("gray", "7f7f7f")
							.replace("pink", "ff9ed3").replace("brown", "873e23").replace("sky", "aefcfb")
							.replace("miku", "39c5bb").replace(" ", "");


					if (color[0].length() == 1) color[0] = "00000" + color[0];
					else if (color[0].length() == 2) color[0] = "0000" + color[0];
					else if (color[0].length() == 3) color[0] = "000" + color[0];
					else if (color[0].length() == 4) color[0] = "00" + color[0];
					else if (color[0].length() == 5) color[0] = "0" + color[0];

					if (color[1].length() == 1) color[1] = "00000" + color[1];
					else if (color[1].length() == 2) color[1] = "0000" + color[1];
					else if (color[1].length() == 3) color[1] = "000" + color[1];
					else if (color[1].length() == 4) color[1] = "00" + color[1];
					else if (color[1].length() == 5) color[1] = "0" + color[1];


					StringBuilder output = new StringBuilder("[\"\"");

					String color1 = "#" + color[0];
					String color2 = "#" + color[1];
					int steps = input.length();

					Color c1 = Color.decode(color1);
					Color c2 = Color.decode(color2);

					int redStep = (c2.getRed() - c1.getRed()) / steps;
					int greenStep = (c2.getGreen() - c1.getGreen()) / steps;
					int blueStep = (c2.getBlue() - c1.getBlue()) / steps;

					Color[] gradient = new Color[steps];
					for (int i = 0; i < steps; i++) {
						int r = c1.getRed() + (i * redStep);
						int g = c1.getGreen() + (i * greenStep);
						int b = c1.getBlue() + (i * blueStep);
						gradient[i] = new Color(r, g, b);
					}

					for (int i = 0; i < steps; i++) {
						output.append(",{\"text\":\"").append(input.charAt(i)).append("\",\"color\":\"#").append(Integer.toHexString(gradient[i].getRGB()).substring(2)).append("\"}");
					}
					output.append("]");


					if (input.length() > 20) {
						input = input.substring(0, 19);
						input += "...";
					}


					String finalInput = input;
					sauce.method_9226(() -> class_2561.method_43470(chat + "%s의 그라데이션 텍스트가 생성되었습니다. 눌러서 복사하세요.".formatted(finalInput)), false);
					String finalOutput = output.toString();
					sauce.method_9226(() -> class_2561.method_43470(chat + "[클릭]").method_10862(class_2583.field_24360.method_10958(new class_2558.class_10606(finalOutput)).method_30938(true).method_10977(class_124.field_1054).method_10982(true)), false);


				} catch (ArrayIndexOutOfBoundsException e) {
					send_error_message(context, "색깔 두 개를 제대로 입력해 주세요.");
				} catch (StringIndexOutOfBoundsException e) {
					send_error_message(context, "색깔 또는 문자열을 제대로 입력해 주세요.");
				} catch (NumberFormatException e) {
					send_error_message(context, "색깔을 제대로 입력해 주세요. 색깔은 미리 정의돼 있는 색깔 중 하나, 또는 HEX 코드에서 #을 빼고 입력해야 됩니다.");
				}
			}


			// 게임룰
			else if (args1.equals("gr")) {
				if (args2.equals("c")) {
					class_1928 r = sauce.method_9225().method_64395();
					MinecraftServer server = sauce.method_9211();
					world.method_29199(1699);

					r.method_20746(class_1928.field_19396).method_20758(false, server);
					r.method_20746(class_1928.field_19409).method_20758(false, server);
					r.method_20746(class_1928.field_19394).method_20758(false, server);
					r.method_20746(class_1928.field_41766).method_35236(16991699, server);
					r.method_20746(class_1928.field_54909).method_20758(true, server);
					r.method_20746(class_1928.field_19422).method_20758(true, server);
					r.method_20746(class_1928.field_19393).method_20758(false, server);
					r.method_20746(class_1928.field_19387).method_20758(false, server);
					r.method_20746(class_1928.field_20638).method_20758(true, server);
					r.method_20746(class_1928.field_20637).method_20758(false, server);
					r.method_20746(class_1928.field_19390).method_20758(false, server);
					r.method_20746(class_1928.field_21831).method_20758(false, server);
					r.method_20746(class_1928.field_19392).method_20758(false, server);
					r.method_20746(class_1928.field_21832).method_20758(false, server);
					r.method_20746(class_1928.field_42474).method_20758(false, server);
					r.method_20746(class_1928.field_38975).method_20758(false, server);
					r.method_20746(class_1928.field_19406).method_20758(false, server);
					r.method_20746(class_1928.field_20634).method_20758(false, server);
					r.method_20746(class_1928.field_20635).method_20758(false, server);
					r.method_20746(class_1928.field_19389).method_20758(true, server);
					r.method_20746(class_1928.field_40885).method_20758(true, server);
					r.method_20746(class_1928.field_19408).method_35236(2147483647, server);
					r.method_20746(class_1928.field_19405).method_35236(1699, server);
					r.method_20746(class_1928.field_19388).method_20758(false, server); // 얘 왜 do 붙어있음? 뭐야 이건
					r.method_20746(class_1928.field_19399).method_35236(0, server);
					r.method_20746(class_1928.field_19400).method_20758(true, server);
					r.method_20746(class_1928.field_40883).method_35236(10, server);
					r.method_20746(class_1928.field_19403).method_35236(0, server);


					r.method_20746(class_1928.field_40880).method_20758(true, server);
					r.method_20746(class_1928.field_19404).method_20758(false, server);
					r.method_20746(class_1928.field_54909).method_20758(false, server);
					r.method_20746(class_1928.field_19407).method_20758(false, server);
					r.method_20746(class_1928.field_19391).method_20758(true, server);
					r.method_20746(class_1928.field_46176).method_20758(true, server);
					r.method_20746(class_1928.field_20636).method_20758(true, server);
					r.method_20746(class_1928.field_25401).method_20758(false, server);
					r.method_20746(class_1928.field_28044).method_20758(true, server);
					r.method_20746(class_1928.field_40886).method_20758(true, server);
					r.method_20746(class_1928.field_40884).method_20758(true, server);
					r.method_20746(class_1928.field_25402).method_20758(true, server);
					r.method_20746(class_1928.field_40882).method_20758(false, server);
					r.method_20746(class_1928.field_19402).method_20758(true, server);
					r.method_20746(class_1928.field_48374).method_35236(3, server);
					r.method_20746(class_1928.field_19398).method_20758(true, server);
					r.method_20746(class_1928.field_19401).method_20758(false, server);
					r.method_20746(class_1928.field_46796).method_20758(true, server);
					r.method_20746(class_1928.field_28357).method_35236(100, server);
					r.method_20746(class_1928.field_46795).method_35236(0, server);
					r.method_20746(class_1928.field_46794).method_35236(80, server);
					r.method_20746(class_1928.field_19395).method_20758(true, server);
					r.method_20746(class_1928.field_40881).method_20758(true, server);
					r.method_20746(class_1928.field_46658).method_35236(65536, server);
					r.method_20746(class_1928.field_19397).method_20758(true, server);

					run_command("/attribute @p[tag=quick_command_executor] attack_speed base set 14", context);

					sauce.method_9226(() -> class_2561.method_43470(chat + "게임룰을 맵 제작에 용이하게 변경했습니다."), false);

				} else if (args2.equals("d")) {

					class_1928 r = sauce.method_9225().method_64395();
					MinecraftServer server = sauce.method_9211();
					run_command("/attribute @p[tag=quick_command_executor] attack_speed base set 4", context);

					r.method_20746(class_1928.field_19396).method_20758(true, server);
					r.method_20746(class_1928.field_19409).method_20758(true, server);
					r.method_20746(class_1928.field_19394).method_20758(true, server);
					r.method_20746(class_1928.field_41766).method_35236(32767, server);
					r.method_20746(class_1928.field_54909).method_20758(false, server);
					r.method_20746(class_1928.field_19422).method_20758(false, server);
					r.method_20746(class_1928.field_19393).method_20758(true, server);
					r.method_20746(class_1928.field_19387).method_20758(true, server);
					r.method_20746(class_1928.field_20638).method_20758(false, server);
					r.method_20746(class_1928.field_20637).method_20758(true, server);
					r.method_20746(class_1928.field_19390).method_20758(true, server);
					r.method_20746(class_1928.field_21831).method_20758(true, server);
					r.method_20746(class_1928.field_19392).method_20758(true, server);
					r.method_20746(class_1928.field_21832).method_20758(true, server);
					r.method_20746(class_1928.field_42474).method_20758(true, server);
					r.method_20746(class_1928.field_38975).method_20758(true, server);
					r.method_20746(class_1928.field_19406).method_20758(true, server);
					r.method_20746(class_1928.field_20634).method_20758(true, server);
					r.method_20746(class_1928.field_20635).method_20758(true, server);
					r.method_20746(class_1928.field_19389).method_20758(false, server);
					r.method_20746(class_1928.field_40885).method_20758(false, server);
					r.method_20746(class_1928.field_19408).method_35236(65536, server);
					r.method_20746(class_1928.field_19405).method_35236(24, server);
					r.method_20746(class_1928.field_19388).method_20758(true, server);
					r.method_20746(class_1928.field_19399).method_35236(3, server);
					r.method_20746(class_1928.field_19400).method_20758(true, server);
					r.method_20746(class_1928.field_40883).method_35236(1, server);
					r.method_20746(class_1928.field_19403).method_35236(10, server);


					r.method_20746(class_1928.field_40880).method_20758(true, server);
					r.method_20746(class_1928.field_19404).method_20758(false, server);
					r.method_20746(class_1928.field_54909).method_20758(false, server);
					r.method_20746(class_1928.field_19407).method_20758(false, server);
					r.method_20746(class_1928.field_19391).method_20758(true, server);
					r.method_20746(class_1928.field_46176).method_20758(true, server);
					r.method_20746(class_1928.field_20636).method_20758(true, server);
					r.method_20746(class_1928.field_25401).method_20758(false, server);
					r.method_20746(class_1928.field_28044).method_20758(true, server);
					r.method_20746(class_1928.field_40886).method_20758(true, server);
					r.method_20746(class_1928.field_40884).method_20758(true, server);
					r.method_20746(class_1928.field_25402).method_20758(true, server);
					r.method_20746(class_1928.field_40882).method_20758(false, server);
					r.method_20746(class_1928.field_19402).method_20758(true, server);
					r.method_20746(class_1928.field_48374).method_35236(3, server);
					r.method_20746(class_1928.field_19398).method_20758(true, server);
					r.method_20746(class_1928.field_19401).method_20758(false, server);
					r.method_20746(class_1928.field_46796).method_20758(true, server);
					r.method_20746(class_1928.field_28357).method_35236(100, server);
					r.method_20746(class_1928.field_46795).method_35236(0, server);
					r.method_20746(class_1928.field_46794).method_35236(80, server);
					r.method_20746(class_1928.field_19395).method_20758(true, server);
					r.method_20746(class_1928.field_40881).method_20758(true, server);
					r.method_20746(class_1928.field_46658).method_35236(65536, server);
					r.method_20746(class_1928.field_19397).method_20758(true, server);


					sauce.method_9226(() -> class_2561.method_43470(chat + "게임룰을 원래대로 변경했습니다."), false);

				}
			}


			// 배고픔과 체력
			else if(args1.startsWith("f")) {

				switch (args1) {
					case "f" -> {
						run_command("/effect give @a[tag=quick_command_executor] instant_health 10 10", context);
						sauce.method_9226(() -> class_2561.method_43470(chat + "체력을 풀피로 만들었습니다."), false);
					}
					case "fs" -> {
						run_command("/effect give @a[tag=quick_command_executor] saturation 10 10", context);
						sauce.method_9226(() -> class_2561.method_43470(chat + "배고픔을 가득 채웠습니다."), false);
					}
					case "ff" -> {
						run_commands("/effect give @a[tag=quick_command_executor] instant_health 10 10", "/effect give @a[tag=quick_command_executor] saturation 10 10", "", context);
						sauce.method_9226(() -> class_2561.method_43470(chat + "배고픔과 체력을 가득 채웠습니다."), false);
					}
				}

			}

			// 커맨드 생성
			else if (args1.equals("gen")) {

				switch (args2) {
					case "timer" -> {

						run_command("/scoreboard objectives add quick_command dummy", context);

						int x = Objects.requireNonNull(sauce.method_44023()).method_31477();
						int y = sauce.method_44023().method_31478();
						int z = sauce.method_44023().method_31479();
						String setblock = "/execute if score timer_sec quick_command matches 0 if score timer_min quick_command matches 0 run setblock " + x + " " + y + " " + (z + 1) + " air";


						place_command_block(context, "/scoreboard players add timer_tick quick_command 1", x, y, z, 2);
						place_command_block(context, "/execute if score timer_tick quick_command matches 20.. run scoreboard players set timer_tick quick_command 0", x, y, z - 1, 3);
						place_command_block(context, "/scoreboard players remove timer_sec quick_command 1", x, y, z - 2, 4);
						place_command_block(context, "/execute if score timer_sec quick_command matches ..-1 run scoreboard players set timer_sec quick_command 59", x, y, z - 3, 3);
						place_command_block(context, "/scoreboard players remove timer_min quick_command 1", x, y, z - 4, 4);
						place_command_block(context, "/title @a actionbar [\"\",\"§a남은 시간 : \",{\"score\":{\"objective\":\"quick_command\",\"name\":\"timer_min\"},\"color\":\"yellow\"},\"분 \",{\"score\":{\"objective\":\"quick_command\",\"name\":\"timer_sec\"},\"color\":\"yellow\"},\"초\"]", x, y, z - 5, 3);
						place_command_block(context, setblock, x, y, z - 6, 3);
						place_command_block(context, "/title @a actionbar \"§a남은 시간 : §4TIME OVER\"", x, y, z - 7, 4);

						place_command_block(context, "/scoreboard players set timer_min quick_command 3", x - 1, y, z, 1);
						place_command_block(context, "/scoreboard players set timer_sec quick_command 30", x - 1, y, z - 1, 3);


						sauce.method_9226(() -> class_2561.method_43470(chat + "타이머 커맨드를 생성했습니다."), false);

					}
					case "sw", "stopwatch" -> {

						run_command("/scoreboard objectives add quick_command dummy", context);
						int x = Objects.requireNonNull(sauce.method_44023()).method_31477();
						int y = sauce.method_44023().method_31478();
						int z = sauce.method_44023().method_31479();

						place_command_block(context, "/scoreboard players add sw_tick quick_command 5", x, y, z, 2);
						place_command_block(context, "/execute if score sw_tick quick_command matches 100.. run scoreboard players set sw_tick quick_command 0", x, y, z - 1, 3);
						place_command_block(context, "/scoreboard players add sw_sec quick_command 1", x, y, z - 2, 4);
						place_command_block(context, "/execute if score sw_sec quick_command matches 60.. run scoreboard players set sw_sec quick_command 0", x, y, z - 3, 3);
						place_command_block(context, "/scoreboard players add sw_min quick_command 1", x, y, z - 4, 4);
						place_command_block(context, "/execute if score sw_tick quick_command matches 0 run title @a actionbar [\"\",{\"text\":\"시간 : \",\"color\":\"green\"},{\"score\":{\"objective\":\"quick_command\",\"name\":\"sw_min\"},\"color\":\"yellow\"},\"분 \",{\"score\":{\"objective\":\"quick_command\",\"name\":\"sw_sec\"},\"color\":\"yellow\"},\"초 \",{\"color\":\"#999955\",\"text\":\"00\"}]", x, y, z - 5, 3);
						place_command_block(context, "/execute if score sw_tick quick_command matches 5 run title @a actionbar [\"\",{\"text\":\"시간 : \",\"color\":\"green\"},{\"score\":{\"objective\":\"quick_command\",\"name\":\"sw_min\"},\"color\":\"yellow\"},\"분 \",{\"score\":{\"objective\":\"quick_command\",\"name\":\"sw_sec\"},\"color\":\"yellow\"},\"초 \",{\"color\":\"#999955\",\"text\":\"05\"}]", x, y, z - 6, 3);
						place_command_block(context, "/execute if score sw_tick quick_command matches 10.. run title @a actionbar [\"\",{\"text\":\"시간 : \",\"color\":\"green\"},{\"score\":{\"objective\":\"quick_command\",\"name\":\"sw_min\"},\"color\":\"yellow\"},\"분 \",{\"score\":{\"objective\":\"quick_command\",\"name\":\"sw_sec\"},\"color\":\"yellow\"},\"초 \",{\"color\":\"#999955\",\"score\":{\"name\":\"sw_tick\",\"objective\":\"quick_command\"}}]", x, y, z - 7, 3);

						place_command_block(context, "/scoreboard players set sw_tick quick_command 0", x + 1, y, z, 1);
						place_command_block(context, "/scoreboard players set sw_sec quick_command 0", x + 1, y, z - 1, 3);
						place_command_block(context, "/scoreboard players set sw_min quick_command 0", x + 1, y, z - 2, 3);


						sauce.method_9226(() -> class_2561.method_43470(chat + "스탑워치 커맨드를 생성했습니다."), false);

					}
					case "quiz" -> {


						// 아 그냥 for문 써서 했어야됐나 뭐하는거냐이게


						int x = Objects.requireNonNull(sauce.method_44023()).method_31477();
						int y = sauce.method_44023().method_31478();
						int z = sauce.method_44023().method_31479();

						String wall = args3;
						String floor = args4;
						String ceiling = args5;

						if (is_this_number(wall.replace(".", ""))) wall = convert_number_to_item(wall);
						if (is_this_number(floor.replace(".", ""))) floor = convert_number_to_item(floor);
						if (is_this_number(ceiling.replace(".", ""))) ceiling = convert_number_to_item(ceiling);

						if (wall.equals("null")) wall = "iron_block";
						if (floor.equals("null")) floor = "white_terracotta";
						if (ceiling.equals("null")) ceiling = "air";


						run_more_commands("/execute at @a[tag=quick_command_executor] run fill ~ ~-1 ~ ~6 ~4 ~6 " + wall + " replace air", "/execute at @a[tag=quick_command_executor] run fill ~1 ~ ~1 ~5 ~3 ~5 air replace " + wall, "/execute at @a[tag=quick_command_executor] run fill ~ ~-1 ~ ~6 ~-1 ~6 " + floor, "/execute at @a[tag=quick_command_executor] run fill ~1 ~4 ~1 ~5 ~4 ~5 " + ceiling, "/execute at @a[tag=quick_command_executor] run setblock ~5 ~ ~1 minecraft:chest[facing=west,type=single,waterlogged=false]{Items:[{Slot:13b,count:64,id:\"minecraft:paper\"}]}", "/execute at @a[tag=quick_command_executor] run setblock ~1 ~-1 ~5 hopper", "/execute at @a[tag=quick_command_executor] run setblock ~1 ~2 ~2 birch_wall_sign[facing=east]{is_waxed:true,front_text:{messages:[\"\",\"정답\",\"\",\"\"]}}", "/execute at @a[tag=quick_command_executor] run setblock ~1 ~2 ~4 birch_wall_sign[facing=east]{is_waxed:true,front_text:{messages:[\"\",\"힌트\",\"\",\"\"]}}", "/execute at @a[tag=quick_command_executor] run setblock ~4 ~-1 ~6 repeater[facing=east]", context);


						place_command_block(context, "/execute if blocks ~2 ~ ~ ~2 ~ ~ ~7 ~-1 ~ masked run setblock ~11 ~-1 ~1 minecraft:redstone_block", x - 6, y, z + 5, 2, "up");
						place_command_block(context, "/tellraw @a \"정답!\"", x - 6, y + 1, z + 5, 4, "up");
						place_command_block(context, "execute if block ~11 ~-3 ~1 redstone_block unless blocks ~2 ~-2 ~ ~2 ~ ~2 ~7 ~-3 ~ masked run setblock ~11 ~-3 ~1 air", x - 6, y + 2, z + 5, 3, "up");


						class_2338 pos = class_2338.method_49638(new class_243(x + 5, y, z + 2));
						world.method_8501(pos, class_2246.field_10535.method_9564());

						pos = class_2338.method_49638(new class_243(x + 5, y, z + 3));
						world.method_8501(pos, class_2246.field_10535.method_9564());

						pos = class_2338.method_49638(new class_243(x + 5, y, z + 4));
						world.method_8501(pos, class_2246.field_10535.method_9564());

						pos = class_2338.method_49638(new class_243(x + 5, y, z + 5));
						world.method_8501(pos, class_2246.field_10535.method_9564());

						pos = class_2338.method_49638(new class_243(x - 7, y, z + 5));
						world.method_8501(pos, class_2246.field_10002.method_9564());


						place_command_block(context, "/tellraw @a \"정답 : \"", x - 1, y + 1, z + 2, 1);
						place_command_block(context, "/tellraw @a \"힌트 : \"", x - 1, y + 1, z + 4, 1);


						pos = class_2338.method_49638(new class_243(x + 1, y + 1, z + 4));
						world.method_8501(pos, class_2246.field_10494.method_9564().method_11657(class_2741.field_12481, class_2350.field_11034).method_11657(class_2741.field_12555, class_2738.field_12471));

						pos = class_2338.method_49638(new class_243(x + 1, y + 1, z + 2));
						world.method_8501(pos, class_2246.field_10494.method_9564().method_11657(class_2741.field_12481, class_2350.field_11034).method_11657(class_2741.field_12555, class_2738.field_12471));

						pos = class_2338.method_49638(new class_243(x + 3, y, z + 6));
						world.method_8501(pos, class_2246.field_9973.method_9564().method_11657(class_2741.field_12481, class_2350.field_11035).method_11657(class_2741.field_12533, class_2756.field_12607).method_11657(class_2741.field_12520, class_2750.field_12588));

						pos = class_2338.method_49638(new class_243(x + 3, y + 1, z + 6));
						world.method_8501(pos, class_2246.field_9973.method_9564().method_11657(class_2741.field_12481, class_2350.field_11035).method_11657(class_2741.field_12533, class_2756.field_12609).method_11657(class_2741.field_12520, class_2750.field_12588));

						pos = class_2338.method_49638(new class_243(x - 4, y, z + 5));
						world.method_8501(pos, class_2246.field_10312.method_9564());

						pos = class_2338.method_49638(new class_243(x + 1, y - 1, z + 5));
						world.method_8501(pos, class_2246.field_10312.method_9564());


						String finalCeiling = ceiling;
						String finalFloor = floor;
						String finalWall = wall;
						sauce.method_9226(() -> class_2561.method_43470(chat + "%s, %s, %s(으)로 퀴즈를 생성했습니다. 블럭이 설치되지 않았다면 잘못된 블럭을 입력한 겁니다. //stack으로 방 수를 늘릴 수 있습니다.".formatted(finalWall, finalFloor, finalCeiling)), false);


					}
				}

			}



			else if(args1.equals("k")) {
				String command1 = "";
				if(send_feedback(context)) command1 = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + "가장 가까운 엔티티인 \",{\"color\":\"green\",\"selector\":\"@n[type=!player]\"},\"을(를) 죽였습니다.\"]";
				String command2 = "/execute at @a[tag=quick_command_executor] run kill @n[type=!player]";
				run_commands(command1, command2, "", context);

			}



			else if(args1.equals("tp")) {

				String feedback;

				if(args4.equals("null")) {

					if(is_this_number(args2.replace(".", "")) && is_this_number(args3.replace(".", ""))) {


						if(send_feedback(context)) feedback = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + " \",{\"selector\":\"@n[type=!player]\"},\"을(를) §a[ " + args2 + " , " + args3 + " ]§f 만큼 회전시켰습니다.\"]";
						else feedback = "";

						run_commands("/execute at @a[tag=quick_command_executor] as @n[type=!player] at @s run tp @s ~ ~ ~ ~" + args2 + " ~" + args3, feedback, "", context);


					}

					else send_error_message(context, "숫자가 아닌데요..");

				}

				else {

					if(is_this_number(args2.replace(".", "")) && is_this_number(args3.replace(".", "")) && is_this_number(args4.replace(".", ""))) {


						if(send_feedback(context)) feedback = "/execute as @a[tag=quick_command_executor] at @s run tellraw @s [\"" + chat + " \",{\"selector\":\"@n[type=!player]\"},\"을(를) §a[ " + args2 + " , " + args3 + " , " + args4 + " ]§f 만큼 TP시켰습니다.\"]";
						else feedback = "";

						run_commands("/execute at @a[tag=quick_command_executor] as @n[type=!player] at @s run tp @s ~" + args2 + " ~" + args3 + " ~" + args4, feedback, "", context);


					}

					else send_error_message(context, "숫자가 아닌데요..");


				}


			}

			else if(args1.equals("e")) {
				String dur, ef;
				if(args3.equals("i")) dur = "infinite";
				else dur = args3;

				if(args2.equals("1")) ef = "speed";
				else if(args2.equals("2")) ef = "slowness";
				else if(args2.equals("3")) ef = "haste";
				else if(args2.equals("4")) ef = "mining_fatigue";
				else if(args2.equals("5")) ef = "strength";
				else if(args2.equals("6")) ef = "instant_health";
				else if(args2.equals("7")) ef = "instant_damage";
				else if(args2.equals("8")) ef = "jump_boost";
				else if(args2.equals("9")) ef = "nausea";
				else if(args2.equals("10")) ef = "regeneration";
				else if(args2.equals("11")) ef = "resistance";
				else if(args2.equals("12")) ef = "fire_resistance";
				else if(args2.equals("13")) ef = "water_breathing";
				else if(args2.equals("14")) ef = "invisibility";
				else if(args2.equals("15")) ef = "blindness";
				else if(args2.equals("16")) ef = "night_vision";
				else if(args2.equals("17")) ef = "hunger";
				else if(args2.equals("18")) ef = "weakness";
				else if(args2.equals("19")) ef = "poison";
				else if(args2.equals("20")) ef = "wither";
				else if(args2.equals("21")) ef = "health_boost";
				else if(args2.equals("22")) ef = "absorption";
				else if(args2.equals("23")) ef = "saturation";
				else if(args2.equals("24")) ef = "glowing";
				else if(args2.equals("25")) ef = "levitation";
				else if(args2.equals("26")) ef = "luck";
				else if(args2.equals("27")) ef = "bad_luck";
				else if(args2.equals("28")) ef = "slow_falling";
				else if(args2.equals("29")) ef = "conduit_power";
				else if(args2.equals("30")) ef = "dolphins_grace";
				else if(args2.equals("31")) ef = "bad_omen";
				else if(args2.equals("32")) ef = "hero_of_the_village";
				else if(args2.equals("33")) ef = "darkness";
				else if(args2.equals("34")) ef = "infested";
				else if(args2.equals("35")) ef = "oozing";
				else if(args2.equals("36")) ef = "weaving";
				else if(args2.equals("37")) ef = "wind_charged";
				else if(args2.equals("38")) ef = "raid_omen";
				else if(args2.equals("39")) ef = "trial_omen";
				else ef = "";




				int amp;
				if(!is_this_number(args4)) amp = 0;
				if(args4.equals("null")) amp = 0;
				else amp = Integer.parseInt(args4);



				String command = "/effect give @a[tag=quick_command_executor] " + ef + " " + dur + " " + amp + " true";
				if(send_feedback(context)) {
					int finalAmp = amp;
					sauce.method_9226(() -> class_2561.method_43470(chat + "§d" + finalAmp + "§f 짜리 " + "§a" + ef + "§f " + "을(를) §b" + dur + "§f 동안 부여했습니다."), false);
				}
				run_command(command, context);








			}


			else if(args1.equals("wr")) {
				write_text(context, args2, args3, args4);
			}

			else if(args1.equals("g")) {
				// give @s args2[item_name={args3},lore=[{args4},{args5}]]
				String item;
				if(is_this_number(args2.replaceFirst("\\.", ""))) item = convert_number_to_item(args2);
				else if(args2.equals("null")) item = "stone";
				else item = args2;

				String command = "/give @a[tag=quick_command_executor] " + item + "[item_name=" + args3 + ",lore=[{\"color\":\"gray\",\"italic\":false,\"text\":\"" + args4 + "\"},{\"color\":\"gray\",\"italic\":false,\"text\":\"" + args5 + "\"}]]";
				sauce.method_9226(() -> class_2561.method_43470(chat + "아이템 이름과 설명이 쓰여진 " + item + "을(를) 지급했습니다."), false);
				run_command(command, context);
			}




			else {
				// give
				if (is_this_number(args1.replace(".", ""))) {

					String subnumber;
					String number;

					if (args1.contains(".")) {
						String[] item_input = args1.split("\\.");
						subnumber = item_input[1];
						number = item_input[0];
					} else {
						number = args1;
						subnumber = "0";
					}

					String items = chstone12.quick_commands.items.item_list;

					if (!items.contains(number + " ; " + subnumber + " ;"))
						send_error_message(context, "그런 아이템 없는데요..");
					else {
						String[] line = items.split("\\R");
						for (String s : line) {

							if (s.startsWith(number + " ; " + subnumber)) {

								String[] arr = s.replace(" ", "").split(";");

								int count = 1;
								if (is_this_number(args2)) count = Integer.parseInt(args2);

								String command = "/give @a[tag=quick_command_executor] " + arr[3] + " " + count;
								run_command(command, context);
								int finalCount = count;
								sauce.method_9226(() -> class_2561.method_43470(chat + "§a" + arr[3] + "§f " + finalCount + "개를 지급했습니다."), false);
								break;
							}
						}
					}
				} else send_error_message(context, "그런 구문 없는데요..");
			}


		}


		return 1;
	}



	public static boolean is_this_number(String input) {
		try {
			int a = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}









}
