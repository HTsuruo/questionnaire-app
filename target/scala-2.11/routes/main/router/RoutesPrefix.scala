
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/conf/routes
// @DATE:Thu Dec 24 01:36:14 JST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
