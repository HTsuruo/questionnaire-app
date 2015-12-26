package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import enums.QuestionType;
import models.Question;
import models.UserModel;
import models.answers.Panas;
import models.answers.Shintai;
import models.answers.Who5;

public class QuestionUtil {
	
	public static String getIntroTxtByQId(Long questionId, Long userId){
		String txt = "";
		UserModel user = UserModel.find.byId(userId);
		String panas_txt = "最近";
		String who5_txt = "最近2週間";
		String shintai_txt = "最近を振り返って，以下の質問に";
		if(user.isFin){
			panas_txt = "今日1日";
			who5_txt = "今日1日";
			shintai_txt = "今日1日のことを振り返って，以下の質問に";
		}
		
		Integer q_int = Integer.parseInt(questionId.toString());
		switch(QuestionType.fromValue(q_int)){
		case SHINTAI://Shintai
			txt =  String.format(shintai_txt + "回答して下さい. ");
			break;
		case PANAS://PANAS
			txt =  String.format("以下に状態を表す単語がいくつか表されています.%n"
					+ panas_txt + "のあなたの気分にどれほどあてはまるか以下の中から最も適切なものを選び回答してください. ");
			break;
		case WHO5://WHO-5
			txt = String.format("以下の5つの項目について,"+who5_txt+"のあなたの健康状態に最も近いものを選んでください．%n"
					+ "数値が高いほど精神的健康状態が高いことを示していますのでご注意ください．%n"
					+ who5_txt+"，私は〜 %n");
			break;
		case SELF_DISCLOSURE://自己開示の深さを測定する尺度
			txt = String.format("あなたが同性の初対面の人と出会った場面を思い浮かべて下さい. %n"
					+ "あなたは,この初対面の相手に対して自分のことを語らなければならなくなりました.%n"
					+ "あなたは,この初対面の人に対して以下のようなあなた自身のことをどのくらい詳しく話しますか.%n"
					+ "1:「何も話さない」〜7:「十分に詳しく話す」を用いて評定してください.");
			break;
		case ADULT_EFFORT://成人用エフォートフル・コントロール
			txt = String.format("以下の各文章は,あなたにどのくらいあてはまりますか.%n"
					+ "1:「全く当てはまらない」〜5:「非常によく当てはまる」を用いて評定してください.");
			break;
		case TIPI_J://TIPJ
			txt = String.format("以下の言葉があなた自身にどれくらい当てはまるかについて,もっとも適切なものを選んでください.%n"
					+ "文章全体を総合的に見て,自分にどれだけ当てはまるかを評価してください");
			break;
		case TAC24://TAC-24
			txt = String.format("精神的につらい状況に遭遇した時、その場を乗り越え、落ち着くために、あなたは普段から、どのように考え、どのように行動するようにしていますか。%n"
					+ "各文章に対して、自分がどの程度あてはまるか、以下の基準に基づき評定し、以下から最も適切なものを選んでください.");
			break;
		case TRUST://信頼感
			txt = String.format("以下の設問に回答して下さい.%n"
					+ "1:「全く当てはまらない」〜6:「非常に当てはまる」を用いて評定してください.");;
			break;
		case IKIGAI://生きがい意識尺度(ikigai-9)
			txt = String.format("普段の生活の中で,あなたの感じている気持ちをお答えください.%n"
					+ "以下から最も適切なものを選んでください");
			break;
		case RESILIENCE:
			//二次元レジリエンス要因尺度
			txt = String.format("あなた自身についてお答えください.以下の項目について, 「1.全くあてはまらない」〜「5.よく当てはまる」の中で,もっとも当てはまると思うものを選んでください.");
			break;
		case BISBAS://BIS/BAS
			txt = String.format("以下の項目について,あなた自身がどれくらいあてはまると感じるかをお聞きします.%n"
					+ "最も近いと思うもの選んでください. %n");
			break;
		case SELF_DISCLOSURE_2://自己開示2
			txt = String.format("すでに仲は良いけれど,これからもっと親しくなりたいとあなたが思っている同性の友達を思い浮かべてください. %n"
					+ "あなたは思い浮かべた友だちに対して,以下のようなあなた自身のことをどのくらい詳しく話しますか.%n"
					+ " 1:「何も話さない」~7:「十分に詳しく話す」を用いて評定してください.");
			break;
		default:
			break;
		}
		return txt;
	}
	
	public static LinkedHashMap<Integer, String> getAnswerChoices(Long questionId, Integer key){
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		Integer q_int = Integer.parseInt(questionId.toString());
		switch(QuestionType.fromValue(q_int)){
		case SHINTAI://Shintai
			map = ShintaiSetAnsChoice(map,key);
		break;
		case PANAS://PANAS
				map.put(1, "全く当てはまらない");
				map.put(2, "当てはまらない");
				map.put(3, "どちらかといえば当てはまらない");
				map.put(4, "どちらかといえば当てはまる");
				map.put(5, "当てはまる");
				map.put(6, "非常によく当てはまる");
			break;
		case WHO5://WHO-5
				map.put(0, "まったくない");
				map.put(1, "ほんのたまに");
				map.put(2, "半分以下の期間を");
				map.put(3, "半分以上の期間を");
				map.put(4, "ほとんどいつも");
				map.put(5, "いつも");
			break;
		case SELF_DISCLOSURE://自己開示の深さ測定尺度
				map.put(1, "1.何も話さない");
				map.put(2, "2");
				map.put(3, "3");
				map.put(4, "4");
				map.put(5, "5");
				map.put(6, "6");
				map.put(7, "7.十分に詳しく話す");
			break;
		case ADULT_EFFORT://成人用エフォートフル・コントロール
				map.put(1, "1.全く当てはまらない");
				map.put(2, "2");
				map.put(3, "3");
				map.put(4, "4");
				map.put(5, "5.非常によく当てはまる");
			break;
		case TIPI_J://TIPJ
				map.put(1, "全く違うと思う");
				map.put(2, "おおよそ違うと思う");
				map.put(3, "少し違うと思う");
				map.put(4, "どちらでもない");
				map.put(5, "少しそう思う");
				map.put(6, "まあまあそう思う");
				map.put(7, "強くそう思う");
			break;
		case TAC24://TAC-24
				map.put(1, "そのようにしたこと(考えたこと)は全くない.これからも決してないだろう");
				map.put(2, "そのようにしたこと(考えたこと)はあまりない.これからもあまりないだろう");
				map.put(3, "そのようにしたこと(考えたこと)が時々ある.これからも時々はするだろう");
				map.put(4, "そのようにしたこと(考えたこと)がよくある.これからもたびたびそうするだろう");
				map.put(5, "いつもそのようにしてきた(考えてきた).これからもそうするだろう");
			break;
		case TRUST://信頼感
				map.put(1, "1.全く当てはまらない");
				map.put(2, "2");
				map.put(3, "3");
				map.put(4, "4");
				map.put(5, "5");
				map.put(6, "6.非常に当てはまる");
			break;
		case IKIGAI://生きがい意識尺度(ikigai-9)
				map.put(1, "ほとんど当てはまらない");
				map.put(2, "あまり当てはまらない");
				map.put(3, "やや当てはまる");
				map.put(4, "わりに当てはまる");
				map.put(5, "とても当てはまる");
			break;
		case RESILIENCE://二次元レジリエンス要因尺度
				map.put(1, "1.全く当てはまらない");
				map.put(2, "2");
				map.put(3, "3");
				map.put(4, "4");
				map.put(5, "5.よく当てはまる");
			break;
		case BISBAS://BIS/BAS
				map.put(1, "当てはまらない");
				map.put(2, "あまり当てはまらない");
				map.put(3, "少し当てはまる");
				map.put(4, "当てはまる");
			break;
		default:
			break;
		}
		return map;
	}
	
	public static LinkedHashMap<Integer, String> ShintaiSetAnsChoice(LinkedHashMap<Integer, String> map, Integer key){
		switch(key){
			case 2:
				map.put(1, "0時間以上~1.5時間未満");
				map.put(2, "1.5時間以上~3時間未満");
				map.put(3, "3時間以上~4.5時間未満");
				map.put(4, "4.5時間以上~6時間未満");
				map.put(5, "6時間以上");
				break;
			case 3:
				map.put(1, "0~3時間");
				map.put(2, "4~5時間");
				map.put(3, "6~8時間");
				map.put(4, "9~10時間");
				map.put(5, "11時間以上");
				break;
			case 4:
				map.put(1, "0時間以上~1.5時間未満");
				map.put(2, "1.5時間以上~3時間未満");
				map.put(3, "3時間以上~4.5時間未満");
				map.put(4, "4.5時間以上~6時間未満");
				map.put(5, "6時間以上");
				break;
			default:
				break;
		}
		return map;
	}
	
	public static String getQuestionName(Long questionId){
		return Question.find.byId(questionId).name;
	}
	
	public static String getLatestShintaiDate(Long userId){
		List<Shintai> sList = Shintai.find.where().eq("user_id", userId).orderBy("id desc").findList();
		Shintai s = sList.get(0);
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(s.createdDate);
	}
	
	public static String getLatestPanasDate(Long userId){
		List<Panas> pList = Panas.find.where().eq("user_id", userId).orderBy("id desc").findList();
		Panas p = pList.get(0);
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(p.createdDate);
	}
	
	public static String getLatestWho5Date(Long userId){
		List<Who5> wList = Who5.find.where().eq("user_id", userId).orderBy("id desc").findList();
		Who5 w = wList.get(0);
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(w.createdDate);
	}
	
	public static String formatDate(Date date){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	};
}
