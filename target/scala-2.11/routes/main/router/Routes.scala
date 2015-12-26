
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/conf/routes
// @DATE:Thu Dec 24 01:36:14 JST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: controllers.Application,
  // @LINE:7
  UserController_1: controllers.UserController,
  // @LINE:10
  QuestionController_0: controllers.QuestionController,
  // @LINE:14
  AdminController_2: controllers.admin.AdminController,
  // @LINE:20
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:7
    UserController_1: controllers.UserController,
    // @LINE:10
    QuestionController_0: controllers.QuestionController,
    // @LINE:14
    AdminController_2: controllers.admin.AdminController,
    // @LINE:20
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_4, UserController_1, QuestionController_0, AdminController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, UserController_1, QuestionController_0, AdminController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/$id<[^/]+>""", """controllers.UserController.index(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/submit""", """controllers.UserController.submit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """question/$id<[^/]+>/$id2<[^/]+>""", """controllers.QuestionController.index(id:Long, id2:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """question/submit/$id<[^/]+>/$id2<[^/]+>""", """controllers.QuestionController.submit(id:Long, id2:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.admin.AdminController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/initial""", """controllers.admin.AdminController.setInitialData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/download/$id<[^/]+>""", """controllers.admin.AdminController.download(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/user/delete/$id<[^/]+>""", """controllers.admin.AdminController.deleteUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_index1_invoker = createInvoker(
    UserController_1.index(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """user/$id<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login2_invoker = createInvoker(
    UserController_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_submit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/submit")))
  )
  private[this] lazy val controllers_UserController_submit3_invoker = createInvoker(
    UserController_1.submit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """user/submit"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_QuestionController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("question/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QuestionController_index4_invoker = createInvoker(
    QuestionController_0.index(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuestionController",
      "index",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """question/$id<[^/]+>/$id2<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_QuestionController_submit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("question/submit/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("id2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QuestionController_submit5_invoker = createInvoker(
    QuestionController_0.submit(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuestionController",
      "submit",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """question/submit/$id<[^/]+>/$id2<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_admin_AdminController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_admin_AdminController_index6_invoker = createInvoker(
    AdminController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.admin.AdminController",
      "index",
      Nil,
      "GET",
      """管理画面""",
      this.prefix + """admin"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_admin_AdminController_setInitialData7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/initial")))
  )
  private[this] lazy val controllers_admin_AdminController_setInitialData7_invoker = createInvoker(
    AdminController_2.setInitialData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.admin.AdminController",
      "setInitialData",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/initial"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_admin_AdminController_download8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/download/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_AdminController_download8_invoker = createInvoker(
    AdminController_2.download(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.admin.AdminController",
      "download",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/download/$id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_admin_AdminController_deleteUser9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/user/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_AdminController_deleteUser9_invoker = createInvoker(
    AdminController_2.deleteUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.admin.AdminController",
      "deleteUser",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/user/delete/$id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index())
      }
  
    // @LINE:7
    case controllers_UserController_index1_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_index1_invoker.call(UserController_1.index(id))
      }
  
    // @LINE:8
    case controllers_UserController_login2_route(params) =>
      call { 
        controllers_UserController_login2_invoker.call(UserController_1.login())
      }
  
    // @LINE:9
    case controllers_UserController_submit3_route(params) =>
      call { 
        controllers_UserController_submit3_invoker.call(UserController_1.submit())
      }
  
    // @LINE:10
    case controllers_QuestionController_index4_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_QuestionController_index4_invoker.call(QuestionController_0.index(id, id2))
      }
  
    // @LINE:11
    case controllers_QuestionController_submit5_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("id2", None)) { (id, id2) =>
        controllers_QuestionController_submit5_invoker.call(QuestionController_0.submit(id, id2))
      }
  
    // @LINE:14
    case controllers_admin_AdminController_index6_route(params) =>
      call { 
        controllers_admin_AdminController_index6_invoker.call(AdminController_2.index())
      }
  
    // @LINE:15
    case controllers_admin_AdminController_setInitialData7_route(params) =>
      call { 
        controllers_admin_AdminController_setInitialData7_invoker.call(AdminController_2.setInitialData())
      }
  
    // @LINE:16
    case controllers_admin_AdminController_download8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admin_AdminController_download8_invoker.call(AdminController_2.download(id))
      }
  
    // @LINE:17
    case controllers_admin_AdminController_deleteUser9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admin_AdminController_deleteUser9_invoker.call(AdminController_2.deleteUser(id))
      }
  
    // @LINE:20
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_3.versioned(path, file))
      }
  }
}