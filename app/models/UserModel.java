package models;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

import play.data.validation.Constraints.Required;

@Entity
public class UserModel extends Model{
	
	@Id
	public Long userId;
	
	@Required
	public String userName;
	
	//回答が終わった回数
	public Integer finCount=0;
	
	//一度全ての問題を解き終わった否か
	public boolean isFin=false;
	
	//ユーザが削除されたか否か
	public boolean status=true;
	
	/*@Required
	public String password;*/
	
	@CreatedTimestamp
	public Date createdDate;
	
	@Version
	public Date updateDate;

	//＊推奨*
	public static final Find<Long ,UserModel> find = new Find<Long, UserModel>(){};
	
	public String getCreatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(createdDate);
	};
	
	public String getUpdatedDate(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(updateDate);
	};

}
