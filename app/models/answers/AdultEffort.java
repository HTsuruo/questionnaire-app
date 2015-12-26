package models.answers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;

import models.UserModel;

@Entity
public class AdultEffort extends Model{
	
	@Id
	public Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonIgnore
	public UserModel user;
	
	//設問(11+12+12)
	public Integer q1;
	public Integer q2;
	public Integer q3;
	public Integer q4;
	public Integer q5;
	public Integer q6;
	public Integer q7;
	public Integer q8;
	public Integer q9;
	public Integer q10;
	public Integer q11;
	public Integer q12;
	public Integer q13;
	public Integer q14;
	public Integer q15;
	public Integer q16;
	public Integer q17;
	public Integer q18;
	public Integer q19;
	public Integer q20;
	public Integer q21;
	public Integer q22;
	public Integer q23;
	public Integer q24;
	public Integer q25;
	public Integer q26;
	public Integer q27;
	public Integer q28;
	public Integer q29;
	public Integer q30;
	public Integer q31;
	public Integer q32;
	public Integer q33;
	public Integer q34;
	public Integer q35;
	
	@CreatedTimestamp
	public Date createdDate;
	
	//＊推奨*
	public static final Find<Long ,AdultEffort> find = new Find<Long, AdultEffort>(){};
	
	public String getCreatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(createdDate);
	};
	
}
