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
public class SelfDisclosure extends Model{
	
	@Id
	public Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonIgnore
	public UserModel user;
	
	//設問(24問×2)
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
	
	public Integer q2_1;
	public Integer q2_2;
	public Integer q2_3;
	public Integer q2_4;
	public Integer q2_5;
	public Integer q2_6;
	public Integer q2_7;
	public Integer q2_8;
	public Integer q2_9;
	public Integer q2_10;
	public Integer q2_11;
	public Integer q2_12;
	public Integer q2_13;
	public Integer q2_14;
	public Integer q2_15;
	public Integer q2_16;
	public Integer q2_17;
	public Integer q2_18;
	public Integer q2_19;
	public Integer q2_20;
	public Integer q2_21;
	public Integer q2_22;
	public Integer q2_23;
	public Integer q2_24;
	
	@CreatedTimestamp
	public Date createdDate;
	
	//＊推奨*
	public static final Find<Long ,SelfDisclosure> find = new Find<Long, SelfDisclosure>(){};
	
	public String getCreatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(createdDate);
	};

}
