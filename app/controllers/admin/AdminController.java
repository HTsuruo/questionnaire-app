package controllers.admin;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import init.initialData;
import models.UserModel;
import models.answers.AdultEffort;
import models.answers.BisBas;
import models.answers.Ikigai;
import models.answers.Panas;
import models.answers.Resilience;
import models.answers.SelfDisclosure;
import models.answers.Shintai;
import models.answers.TAC24;
import models.answers.TIPI_J;
import models.answers.Trust;
import models.answers.Who5;
import play.mvc.Controller;
import play.mvc.Result;
import utils.QuestionUtil;
import views.html.admin.*;

public class AdminController extends Controller {

    public Result index() {
    	List<UserModel>  userList = UserModel.find.where().eq("status", true).findList();
        return ok(index.render("",userList));
    }
    
    public Result setInitialData(){
    	initialData.insert();
    	List<UserModel>  userList = UserModel.find.where().eq("status", true).findList();
    	return ok(index.render("設問を登録しました",userList));
    }
    
    //CSVダウンロード
    public Result download(Long userId){
    	UserModel user = UserModel.find.byId(userId);
    	
    	// CSV //
		StringBuffer csv = new StringBuffer();
		
		csv.append(String.format("\"%s\" \n",user.userName));
		csv.append("テスト名,作成日,");
		for(int i=0;i<35;i++){
			String s = "Q"+(i+1);
			csv.append(String.format("\"%s\",",s));
		}
		csv.append("\n");
		
		List<Shintai> shintaiList = Shintai.find.where().eq("user_id",user.userId).orderBy("id asc").findList();
		List<Panas> panasList = Panas.find.where().eq("user_id",user.userId).findList();
		List<Who5> who5List= Who5.find.where().eq("user_id",user.userId).findList();
		SelfDisclosure self = SelfDisclosure.find.where().eq("user_id",user.userId).findUnique();
		AdultEffort adult = AdultEffort.find.where().eq("user_id",user.userId).findUnique();
		TIPI_J tipi = TIPI_J.find.where().eq("user_id",user.userId).findUnique();
		TAC24 tac24 = TAC24.find.where().eq("user_id",user.userId).findUnique();
		Trust trust = Trust.find.where().eq("user_id",user.userId).findUnique();
		Ikigai ikigai = Ikigai.find.where().eq("user_id",user.userId).findUnique();
		Resilience resi = Resilience.find.where().eq("user_id",user.userId).findUnique();
		BisBas bisbas = BisBas.find.where().eq("user_id",user.userId).findUnique();
		
		Shintai shintai = new Shintai();
		Panas panas = new Panas();
		Who5 who5 = new Who5();
		
		String tmp = "";
		
		if(shintaiList !=null && shintaiList.size()>0){
			shintai = shintaiList.get(0);
			//shintai 4問
			tmp = setStrForInt(3);//１つStringなので
			csv.append(String.format("\"%s\",\"%s\",\"%s\","+tmp+" \n","身体活動",QuestionUtil.formatDate(shintai.createdDate),shintai.q1,shintai.q2,shintai.q3,shintai.q4));
		}
		if(panasList !=null && panasList.size()>0){
			panas = panasList.get(0);
			//panas 16問
			tmp = setStrForInt(16);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","PANAS",QuestionUtil.formatDate(panas.createdDate),panas.q1,panas.q2,panas.q3,panas.q4,panas.q5,panas.q6,panas.q7,panas.q8,panas.q9,panas.q10,panas.q11,panas.q12,panas.q13,panas.q14,panas.q15,panas.q16));
		}
		if(who5List !=null && who5List.size()>0){
			who5 = who5List.get(0);
			tmp = setStrForInt(5);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","WHO-5",QuestionUtil.formatDate(who5.createdDate),who5.q1,who5.q2,who5.q3,who5.q4,who5.q5));
		}
		
		if(self!=null){
			//自己開示 24×2問
			tmp = setStrForInt(24);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","自己開示1",QuestionUtil.formatDate(self.createdDate),self.q1,self.q2,self.q3,self.q4,self.q5,self.q6,self.q7,self.q8,self.q9,self.q10,self.q11,self.q12,self.q13,self.q14,self.q15,self.q16,self.q17,self.q18,self.q19,self.q20,self.q21,self.q22,self.q23,self.q24));
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","自己開示2",QuestionUtil.formatDate(self.createdDate),self.q2_1,self.q2_2,self.q2_3,self.q2_4,self.q2_5,self.q2_6,self.q2_7,self.q2_8,self.q2_9,self.q2_10,self.q2_11,self.q2_12,self.q2_13,self.q2_14,self.q2_15,self.q2_16,self.q2_17,self.q2_18,self.q2_19,self.q2_20,self.q2_21,self.q2_22,self.q2_23,self.q2_24));
		}
		
		if(adult!=null){
			//成人用エフォートコントロール 35問
			tmp = setStrForInt(35);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","成人用エフォートコントロール",QuestionUtil.formatDate(adult.createdDate),adult.q1,adult.q2,adult.q3,adult.q4,adult.q5,adult.q6,adult.q7,adult.q8,adult.q9,adult.q10,adult.q11,adult.q12,adult.q13,adult.q14,adult.q15,adult.q16,adult.q17,adult.q18,adult.q19,adult.q20,adult.q21,adult.q22,adult.q23,adult.q24,adult.q25,adult.q26,adult.q27,adult.q28,adult.q29,adult.q30,adult.q31,adult.q32,adult.q33,adult.q34,adult.q35));
		}
		
		if(tipi!=null){
			//TIPI_J 10問
			tmp = setStrForInt(10);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","TIPI_J",QuestionUtil.formatDate(tipi.createdDate),tipi.q1,tipi.q2,tipi.q3,tipi.q4,tipi.q5,tipi.q6,tipi.q7,tipi.q8,tipi.q9,tipi.q10));
		}
		if(tac24!=null){
			//TAC24 24問
			tmp = setStrForInt(24);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","TAC24",QuestionUtil.formatDate(tac24.createdDate),tac24.q1,tac24.q2,tac24.q3,tac24.q4,tac24.q5,tac24.q6,tac24.q7,tac24.q8,tac24.q9,tac24.q10,tac24.q11,tac24.q12,tac24.q13,tac24.q14,tac24.q15,tac24.q16,tac24.q17,tac24.q18,tac24.q19,tac24.q20,tac24.q21,tac24.q22,tac24.q23,tac24.q24));
		}
		
		if(trust!=null){
			//信頼感 24問
			tmp = setStrForInt(24);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","信頼感",QuestionUtil.formatDate(trust.createdDate),trust.q1,trust.q2,trust.q3,trust.q4,trust.q5,trust.q6,trust.q7,trust.q8,trust.q9,trust.q10,trust.q11,trust.q12,trust.q13,trust.q14,trust.q15,trust.q16,trust.q17,trust.q18,trust.q19,trust.q20,trust.q21,trust.q22,trust.q23,trust.q24));
		}
		
		if(ikigai!=null){
			//生きがい 9問
			tmp = setStrForInt(9);
			csv.append(String.format("\"%s\",\"%s\","+tmp+" \n","生きがい",QuestionUtil.formatDate(ikigai.createdDate),ikigai.q1,ikigai.q2,ikigai.q3,ikigai.q4,ikigai.q5,ikigai.q6,ikigai.q7,ikigai.q8,ikigai.q9));
		}
		
		if(resi!=null){
			//二次元レジリエンス 21問
			tmp = setStrForInt(21);
			csv.append(String.format("\"%s\",\"%s\","+tmp+"\n","二次元レジリエンス",QuestionUtil.formatDate(resi.createdDate),resi.q1,resi.q2,resi.q3,resi.q4,resi.q5,resi.q6,resi.q7,resi.q8,resi.q9,resi.q10,resi.q11,resi.q12,resi.q13,resi.q14,resi.q15,resi.q16,resi.q17,resi.q18,resi.q19,resi.q20,resi.q21));
		}
		
		if(bisbas!=null){
			//BISBAS 20問
			tmp = setStrForInt(20);
			csv.append(String.format("\"%s\",\"%s\","+tmp+"\n","BIS/BAS",QuestionUtil.formatDate(bisbas.createdDate),bisbas.q1,bisbas.q2,bisbas.q3,bisbas.q4,bisbas.q5,bisbas.q6,bisbas.q7,bisbas.q8,bisbas.q9,bisbas.q10,bisbas.q11,bisbas.q12,bisbas.q13,bisbas.q14,bisbas.q15,bisbas.q16,bisbas.q17,bisbas.q18,bisbas.q19,bisbas.q20));
		}
		
		//２回目以降
		int max = 0;
		if(shintaiList !=null && shintaiList.size()>1){
			max = 0;
			max = shintaiList.size();
		}
		if(panasList !=null && panasList.size()>1){
			if(panasList.size()>max)max = panasList.size();
		}
		if(who5List!=null && who5List.size()>1){
			if(who5List.size()>max)max = who5List.size();
		}
		if(max>0){
			String shintai_tmp = setStrForInt(3);
			String panas_tmp = setStrForInt(16);
			String who5_tmp = setStrForInt(5);
			for(int i=0;i<max;i++){
				if(shintaiList.size()>(i+1)){
					shintai = shintaiList.get(i+1);
					csv.append(String.format("\"%s\",\"%s\",\"%s\","+shintai_tmp+" \n","身体活動",QuestionUtil.formatDate(shintai.createdDate),shintai.q1,shintai.q2,shintai.q3,shintai.q4));
				}
				if(panasList.size()>(i+1)){
					panas = panasList.get(i+1);
					csv.append(String.format("\"%s\",\"%s\","+panas_tmp+" \n","PANAS",QuestionUtil.formatDate(panas.createdDate),panas.q1,panas.q2,panas.q3,panas.q4,panas.q5,panas.q6,panas.q7,panas.q8,panas.q9,panas.q10,panas.q11,panas.q12,panas.q13,panas.q14,panas.q15,panas.q16));
				}
				if(who5List.size()>(i+1)){
					who5 = who5List.get(i+1);
					csv.append(String.format("\"%s\",\"%s\","+who5_tmp+" \n","WHO-5",QuestionUtil.formatDate(who5.createdDate),who5.q1,who5.q2,who5.q3,who5.q4,who5.q5));
				}
			}
		}
		
		try {
			Date date = new Date();
			String date_str = new SimpleDateFormat("yyyyMMdd_HHmmss").format(date);
			InputStream csvStream = new ByteArrayInputStream(csv.toString()
					.getBytes("windows-31j"));
			String fnSuffixEx  = ".csv";
			response().setHeader("Content-Disposition",
					"attachment; filename="+"q-"+ date_str + fnSuffixEx);
			return ok(csvStream).as("text/csv");
		} catch (UnsupportedEncodingException e) {
			System.out.println("download error");
		}
    	
		return null;
    	//return ok(index.render("",userList));
    }
    
    public static String convertNullToBlank(String input){
  		if(input ==null)return "";
  		return input;
  	}
    
    //標準入出力Integer用
    public static String setStrForInt(Integer num){
    	String tmp ="";
    	for(int i=0;i<num;i++){
    		tmp += "\"%d\",";
		}
    	return tmp;
    }
    
    public Result deleteUser(Long userId){
    	UserModel u = UserModel.find.byId(userId);
    	List<UserModel>  userList = UserModel.find.where().eq("status", true).findList();
    	if(u==null)return ok(index.render("",userList));
    	u.status =false;
    	u.update();
    	return ok(index.render("ユーザ「"+u.userName+"「を削除しました",userList));
    }
    
}
