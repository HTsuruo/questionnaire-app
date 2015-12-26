
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/conf/routes
// @DATE:Thu Dec 24 01:36:14 JST 2015

package controllers.admin;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.admin.ReverseAdminController AdminController = new controllers.admin.ReverseAdminController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.admin.javascript.ReverseAdminController AdminController = new controllers.admin.javascript.ReverseAdminController(RoutesPrefix.byNamePrefix());
  }

}
