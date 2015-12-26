package models.answers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;

import models.UserModel;

@Entity
public class Ikigai extends Model{
	
	@Id
	public Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonIgnore
	public UserModel user;
	
	//設問(9問)
	public Integer q1;
	public Integer q2;
	public Integer q3;
	public Integer q4;
	public Integer q5;
	public Integer q6;
	public Integer q7;
	public Integer q8;
	public Integer q9;
	
	@CreatedTimestamp
	public Date createdDate;

	//＊推奨*
	public static final Find<Long ,Ikigai> find = new Find<Long, Ikigai>(){};
	
	public String getCreatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(createdDate);
	};

}
