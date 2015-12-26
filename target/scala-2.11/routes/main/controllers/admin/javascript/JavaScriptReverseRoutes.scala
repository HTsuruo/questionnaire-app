
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/conf/routes
// @DATE:Thu Dec 24 01:36:14 JST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers.admin.javascript {
  import ReverseRouteContext.empty

  // @LINE:14
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.AdminController.deleteUser",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/user/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:16
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.AdminController.download",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/download/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:14
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.AdminController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:15
    def setInitialData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.AdminController.setInitialData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/initial"})
        }
      """
    )
  
  }


}