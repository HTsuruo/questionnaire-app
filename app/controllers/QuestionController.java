package controllers;

import java.util.LinkedHashMap;
import java.util.List;

import models.Question;
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
import models.questions.*;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import enums.QuestionType;
import views.html.question.*;

public class QuestionController extends Controller {

    public Result index(Long userId, Long questionId) {
    	Question q = Question.find.byId(questionId);
    	LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    	if(q!=null)map = setQuestionList(q);
        return ok(index.render(userId,q,map));
    }
    
    public static LinkedHashMap<Integer, String> setQuestionList(Question q){
    	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
    	if(hasData(q.q1))map.put(1, q.q1);
    	if(hasData(q.q2))map.put(2, q.q2);
    	if(hasData(q.q3))map.put(3, q.q3);
    	if(hasData(q.q4))map.put(4, q.q4);
    	if(hasData(q.q5))map.put(5, q.q5);
    	if(hasData(q.q6))map.put(6, q.q6);
    	if(hasData(q.q7))map.put(7, q.q7);
    	if(hasData(q.q8))map.put(8, q.q8);
    	if(hasData(q.q9))map.put(9, q.q9);
    	if(hasData(q.q10))map.put(10, q.q10);
    	if(hasData(q.q11))map.put(11, q.q11);
    	if(hasData(q.q12))map.put(12, q.q12);
    	if(hasData(q.q13))map.put(13, q.q13);
    	if(hasData(q.q14))map.put(14, q.q14);
    	if(hasData(q.q15))map.put(15, q.q15);
    	if(hasData(q.q16))map.put(16, q.q16);
    	if(hasData(q.q17))map.put(17, q.q17);
    	if(hasData(q.q18))map.put(18, q.q18);
    	if(hasData(q.q19))map.put(19, q.q19);
    	if(hasData(q.q20))map.put(20, q.q20);
    	if(hasData(q.q21))map.put(21, q.q21);
    	if(hasData(q.q22))map.put(22, q.q22);
    	if(hasData(q.q23))map.put(23, q.q23);
    	if(hasData(q.q24))map.put(24, q.q24);
    	if(hasData(q.q25))map.put(25, q.q25);
    	if(hasData(q.q26))map.put(26, q.q26);
    	if(hasData(q.q27))map.put(27, q.q27);
    	if(hasData(q.q28))map.put(28, q.q28);
    	if(hasData(q.q29))map.put(29, q.q29);
    	if(hasData(q.q30))map.put(30, q.q30);
    	if(hasData(q.q31))map.put(31, q.q31);
    	if(hasData(q.q32))map.put(32, q.q32);
    	if(hasData(q.q33))map.put(33, q.q33);
    	if(hasData(q.q34))map.put(34, q.q34);
    	if(hasData(q.q35))map.put(35, q.q35);
    	
    	return map;
    }
    
    public static boolean hasData(String str){
    	return str!=null && str.length()>0;
    }
    
    public Result submit(Long userId, Long questionId){
    	Question question = Question.find.byId(questionId);
    	Integer q_int = Integer.valueOf(questionId.toString());
    	UserModel user = UserModel.find.byId(userId);
    	saveData(user,q_int);
    	return ok(completed.render(user,question));
    }
    
    public void saveData(UserModel user, Integer questionId){
    	switch(questionId){
    	    case 1:
    	    	Shintai shintai = Form.form(Shintai.class).bindFromRequest().get();
		    	shintai.user = user;
		    	shintai.save();
		    	if(!user.isFin){
		    		user.finCount=questionId;
		    		user.update();
		    	}
				break;
			case 2:
		    	Form<Panas> form = Form.form(Panas.class);
		    	Panas panas = form.bindFromRequest().get();
		    	panas.user = user;
		    	panas.save();
		    	if(!user.isFin){
		    		user.finCount=questionId;
		    		user.update();
		    	}
				break;
			case 3:
		    	Who5 who5 = Form.form(Who5.class).bindFromRequest().get();
		    	who5.user = user;
		    	who5.save();
		    	if(!user.isFin){
		    		user.finCount=questionId;
		    		user.update();
		    	}
				break;
			case 4:
				if(SelfDisclosure.find.where().eq("user_id", user.userId).findUnique()!=null)break;
		    	SelfDisclosure sd = Form.form(SelfDisclosure.class).bindFromRequest().get();
		    	sd.user = user;
		    	sd.save();
		    	user.finCount = questionId;
		    	user.update();
				break;
			case 5:
				if(AdultEffort.find.where().eq("user_id", user.userId).findUnique()!=null)break;
		    	AdultEffort ae = Form.form(AdultEffort.class).bindFromRequest().get();
		    	ae.user = user;
		    	ae.save();
		    	user.finCount = questionId;
		    	user.update();
				break;
			case 6:
				if(TIPI_J.find.where().eq("user_id", user.userId).findUnique()!=null)break;
		    	TIPI_J tipi = Form.form(TIPI_J.class).bindFromRequest().get();
		    	tipi.user = user;
		    	tipi.save();
		    	user.finCount = questionId;
		    	user.update();
				break;
			case 7:
				if(TAC24.find.where().eq("user_id", user.userId).findUnique()!=null)break;
		    	TAC24 tac24 = Form.form(TAC24.class).bindFromRequest().get();
		    	tac24.user = user;
		    	tac24.save();
		    	user.finCount = questionId;
		    	user.update();
				break;
			case 8:
				if(Trust.find.where().eq("user_id", user.userId).findUnique()!=null)break;
		    	Trust trust = Form.form(Trust.class).bindFromRequest().get();
		    	trust.user = user;
		    	trust.save();
		    	user.finCount = questionId;
		    	user.update();
				break;
			case 9:
				if(Ikigai.find.where().eq("user_id", user.userId).findUnique()!=null)break;
		    	Ikigai ikigai = Form.form(Ikigai.class).bindFromRequest().get();
		    	ikigai.user = user;
		    	ikigai.save();
		    	user.finCount = questionId;
		    	user.update();
				break;
			case 10:
				if(Resilience.find.where().eq("user_id", user.userId).findUnique()!=null)break;
				Resilience resilience = Form.form(Resilience.class).bindFromRequest().get();
				resilience.user = user;
				resilience.save();
				user.finCount = questionId;
				user.update();
				break;
			case 11:
				if(BisBas.find.where().eq("user_id", user.userId).findUnique()!=null)break;
		    	BisBas bisbas = Form.form(BisBas.class).bindFromRequest().get();
		    	bisbas.user = user;
		    	bisbas.save();
		    	user.finCount = questionId;
		    	user.isFin =true;
		    	user.update();
				break;
			default:
			break;
		}
    }

}
