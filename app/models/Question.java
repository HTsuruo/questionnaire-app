package models;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

import play.data.validation.Constraints.Required;

@Entity
public class Question extends Model{
	
	@Id
	public Long questionId;
	
	@Column
	public String name;
	
	@Column
	public Integer qNum;
	
	public String q1;
	public String q2;
	public String q3;
	public String q4;
	public String q5;
	public String q6;
	public String q7;
	public String q8;
	public String q9;
	public String q10;
	public String q11;
	public String q12;
	public String q13;
	public String q14;
	public String q15;
	public String q16;
	public String q17;
	public String q18;
	public String q19;
	public String q20;
	public String q21;
	public String q22;
	public String q23;
	public String q24;
	public String q25;
	public String q26;
	public String q27;
	public String q28;
	public String q29;
	public String q30;
	public String q31;
	public String q32;
	public String q33;
	public String q34;
	public String q35;
	
	@CreatedTimestamp
	public Date createdDate;
	
	//＊推奨*
	public static final Find<Long ,Question> find = new Find<Long, Question>(){};
	
	public String getCreatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(createdDate);
	};
	
}
