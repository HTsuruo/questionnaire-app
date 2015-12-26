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
public class AnswerChoice extends Model{
	
	@Id
	public Long questionId;
	
	@Column
	public String name;
	
	@Column
	public Integer qNum;
	
	@Column
	public String q1;
	
	@Column
	public String q2;
	
	@Column
	public String q3;
	
	@Column
	public String q4;
	
	@Column
	public String q5;
	
	@Column
	public String q6;
	
	@Column
	public String q7;
	
	@CreatedTimestamp
	public Date createdDate;
	
	//＊推奨*
	public static final Find<Long ,AnswerChoice> find = new Find<Long, AnswerChoice>(){};
	
	public String getCreatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(createdDate);
	};
	
}
