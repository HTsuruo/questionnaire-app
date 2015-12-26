package controllers;

import java.util.List;

import models.UserModel;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class UserController extends Controller {

    public Result index(Long id) {
    	UserModel u = UserModel.find.byId(id);
        return ok(user.render(u));
    }
    
    public Result login() {
    	Form<UserModel> userForm = Form.form(UserModel.class);
    	String username = userForm.bindFromRequest().get().userName;
    	UserModel uniqueUser = UserModel.find.where().eq("user_name", username).eq("status",true).findUnique();
    	if(uniqueUser==null)return ok(index.render("※ユーザ名が間違っています"));
        return ok(user.render(uniqueUser));
    }

    public Result submit() {
    	Form<UserModel> userForm = Form.form(UserModel.class);
    	UserModel u = userForm.bindFromRequest().get();
    	//念のため
    	List<UserModel> userList = UserModel.find.where().eq("user_name", u.userName).eq("status",true).findList();
    	if(userList!=null && userList.size()>0)return ok(index.render(String.format("※同じ名前のユーザが存在します。%n別の名前で登録して下さい。")));
    	UserModel user = new UserModel();
    	user = u;
    	user.save();
    	return index(user.userId);
    }

}
