
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.UserModel,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user :models.UserModel):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import utils._

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("ホーム画面")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""
	"""),format.raw/*6.2*/("""<div class="text-center" id="home">
		"""),_display_(/*7.4*/if(user.isFin)/*7.18*/{_display_(Seq[Any](format.raw/*7.19*/("""
			"""),format.raw/*8.4*/("""<h3>こんにちは """),_display_(/*8.15*/{user.userName}),format.raw/*8.30*/(""" """),format.raw/*8.31*/("""さん。</h3>
			<p>今日も頑張りましょう</p>
			
			<button type="button" onclick="location.href='/question/"""),_display_(/*11.61*/user/*11.65*/.userId),format.raw/*11.72*/("""/1'" class="btn btn-primary btn-lg col-xs-offset-1 col-xs-10 col-md-offset-4 col-md-4" style="margin-bottom:20px;">
				  「身体活動テスト」を始める <i class="glyphicon glyphicon glyphicon-hand-right"></i>
			</button>
			<div class="clear"></div>
			<p>最終受験日 : """),_display_(/*15.16*/QuestionUtil/*15.28*/.getLatestShintaiDate(user.userId)),format.raw/*15.62*/("""</p>
			
			<button type="button" onclick="location.href='/question/"""),_display_(/*17.61*/user/*17.65*/.userId),format.raw/*17.72*/("""/2'" class="btn btn-primary btn-lg col-xs-offset-1 col-xs-10 col-md-offset-4 col-md-4" style="margin-bottom:20px;">
				  「気分状態テスト」を始める <i class="glyphicon glyphicon glyphicon-hand-right"></i>
			</button>
			<div class="clear"></div>
			<p>最終受験日 : """),_display_(/*21.16*/QuestionUtil/*21.28*/.getLatestPanasDate(user.userId)),format.raw/*21.60*/("""</p>
			
			<button type="button" onclick="location.href='/question/"""),_display_(/*23.61*/user/*23.65*/.userId),format.raw/*23.72*/("""/3'" class="btn btn-primary btn-lg col-xs-offset-1 col-xs-10 col-md-offset-4 col-md-4" style="margin-bottom:20px;">
				  「健康状態テスト」を始める <i class="glyphicon glyphicon glyphicon-hand-right"></i>
			</button>
			<p class="clear">最終受験日 : """),_display_(/*26.30*/QuestionUtil/*26.42*/.getLatestWho5Date(user.userId)),format.raw/*26.73*/("""</p>
		""")))}/*27.4*/else/*27.8*/{_display_(Seq[Any](format.raw/*27.9*/("""
			"""),format.raw/*28.4*/("""<h3>ようこそ """),_display_(/*28.14*/{user.userName}),format.raw/*28.29*/(""" """),format.raw/*28.30*/("""さん。</h3>
			<p>次は「テスト"""),_display_(/*29.14*/{user.finCount+1}),format.raw/*29.31*/("""」です</p>
			<p>解答済 : """),_display_(/*30.14*/{user.finCount}),format.raw/*30.29*/(""" """),format.raw/*30.30*/("""/ 11</p>
			<button type="button" onclick="location.href='/question/"""),_display_(/*31.61*/user/*31.65*/.userId),format.raw/*31.72*/("""/"""),_display_(/*31.74*/{user.finCount+1}),format.raw/*31.91*/("""'" class="btn btn-primary btn-lg btn-margin col-xs-offset-2 col-xs-8 col-md-offset-4 col-md-4">
				  テストを始める <i class="glyphicon glyphicon glyphicon-hand-right"></i>
			</button>
		""")))}),format.raw/*34.4*/("""
		"""),format.raw/*35.3*/("""<button type="button" onclick="location.href='/'" class="btn btn-default btn-lg col-xs-offset-3 col-xs-6 col-md-offset-5 col-md-2">
			<i class="glyphicon glyphicon-log-out"></i> Log Out
		</button>
	</div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(user:models.UserModel): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.UserModel) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Sat Dec 26 18:50:44 JST 2015
                  SOURCE: /Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/app/views/user.scala.html
                  HASH: 4535620075859794541734f872262031f5a8db74
                  MATRIX: 753->1|886->25|914->43|941->45|962->58|1001->60|1029->62|1093->101|1115->115|1153->116|1183->120|1220->131|1255->146|1283->147|1404->241|1417->245|1445->252|1722->502|1743->514|1798->548|1894->617|1907->621|1935->628|2212->878|2233->890|2286->922|2382->991|2395->995|2423->1002|2685->1237|2706->1249|2758->1280|2784->1288|2796->1292|2834->1293|2865->1297|2902->1307|2938->1322|2967->1323|3016->1345|3054->1362|3102->1383|3138->1398|3167->1399|3263->1468|3276->1472|3304->1479|3333->1481|3371->1498|3584->1681|3614->1684|3852->1892
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|37->7|38->8|38->8|38->8|38->8|41->11|41->11|41->11|45->15|45->15|45->15|47->17|47->17|47->17|51->21|51->21|51->21|53->23|53->23|53->23|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|58->28|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|61->31|61->31|64->34|65->35|69->39
                  -- GENERATED --
              */
          