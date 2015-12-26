package models.questions;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

@Entity
public class PanasQ extends Model{
	
	@Id
	public Long questionId;
	
	//設問内容
	
	
	@CreatedTimestamp
	public Date createdDate;
	
	//＊推奨*
	public static final Find<Long ,PanasQ> find = new Find<Long, PanasQ>(){};
	
	public String getCreatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(createdDate);
	};
}
