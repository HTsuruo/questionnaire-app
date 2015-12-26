
package views.html.question

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object completed_Scope0 {
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

class completed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.UserModel,models.Question,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user :models.UserModel, q: models.Question):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import utils._

Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("回答完了")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""
		"""),_display_(/*6.4*/if(user.isFin)/*6.18*/{_display_(Seq[Any](format.raw/*6.19*/("""
			"""),format.raw/*7.4*/("""<div class="text-center" style="margin-bottom:50px;">
			   <h2>おつかれさまでした。</h2>
			   """),_display_(/*9.8*/if(q.questionId==1)/*9.27*/{_display_(Seq[Any](format.raw/*9.28*/("""
			   		"""),format.raw/*10.9*/("""<p>「身体活動テスト」は完了しました</p>
			   """)))}/*11.8*/else/*11.12*/{_display_(Seq[Any](format.raw/*11.13*/("""
			    """),format.raw/*12.8*/("""　"""),_display_(/*12.10*/if(q.questionId==2)/*12.29*/{_display_(Seq[Any](format.raw/*12.30*/("""
			   		"""),format.raw/*13.9*/("""<p>「気分状態テスト」は完了しました</p>
			   """)))}/*14.8*/else/*14.12*/{_display_(Seq[Any](format.raw/*14.13*/("""
			     """),_display_(/*15.10*/if(q.questionId==3)/*15.29*/{_display_(Seq[Any](format.raw/*15.30*/("""
			   		"""),format.raw/*16.9*/("""<p>「健康状態テスト」は完了しました</p>
			   		""")))}),format.raw/*17.10*/("""
			   """)))}),format.raw/*18.8*/("""
			   """)))}),format.raw/*19.8*/("""
			   
			   """),format.raw/*21.7*/("""<p>テストは以上で終了となります。お疲れ様でした。</p>
		   </div>
		   <button type="button" onclick="location.href='/user/"""),_display_(/*23.59*/user/*23.63*/.userId),format.raw/*23.70*/("""'" class="btn btn-default col-xs-offset-2 col-xs-8 col-md-offset-4 col-md-4">
			  <i class="glyphicon glyphicon-triangle-left"></i>ホームへ戻る
			</button>
		""")))}/*26.4*/else/*26.8*/{_display_(Seq[Any](format.raw/*26.9*/("""
		   """),format.raw/*27.6*/("""<div class="text-center" style="margin-bottom:50px;">
			   <h2>おつかれさまでした。</h2>
			   """),_display_(/*29.8*/if(q.questionId!=11)/*29.28*/{_display_(Seq[Any](format.raw/*29.29*/("""
			   		"""),format.raw/*30.9*/("""<p>「テスト"""),_display_(/*30.17*/{q.questionId}),format.raw/*30.31*/("""」は完了しました</p>
			   """)))}),format.raw/*31.8*/("""
			   """),format.raw/*32.7*/("""<p>次のテストを続けて行いますか?</p>
		   </div>
		   <button type="button" onclick="location.href='/question/"""),_display_(/*34.63*/user/*34.67*/.userId),format.raw/*34.74*/("""/"""),_display_(/*34.76*/{q.questionId+1}),format.raw/*34.92*/("""'" class="btn btn-success btn-margin col-xs-offset-2 col-xs-8 btn btn-default col-xs-offset-2 col-xs-8  col-md-offset-4 col-md-4">
			  	次のテストへ<i class="glyphicon glyphicon-triangle-right"></i>
			</button>
		   <button type="button" onclick="location.href='/user/"""),_display_(/*37.59*/user/*37.63*/.userId),format.raw/*37.70*/("""'" class="btn btn-default btn-margin col-xs-offset-2 col-xs-8 btn btn-default col-xs-offset-2 col-xs-8  col-md-offset-4 col-md-4">
			  <i class="glyphicon glyphicon-triangle-left"></i>ホームへ戻る
			</button>
	   """)))}),format.raw/*40.6*/("""
	   
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(user:models.UserModel,q:models.Question): play.twirl.api.HtmlFormat.Appendable = apply(user,q)

  def f:((models.UserModel,models.Question) => play.twirl.api.HtmlFormat.Appendable) = (user,q) => apply(user,q)

  def ref: this.type = this

}


}

/**/
object completed extends completed_Scope0.completed
              /*
                  -- GENERATED --
                  DATE: Sat Dec 26 18:50:45 JST 2015
                  SOURCE: /Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/app/views/question/completed.scala.html
                  HASH: e9f3ca263063e8d66c6a7af4951f108d681e84f7
                  MATRIX: 788->1|941->45|969->63|996->65|1016->77|1055->79|1084->83|1106->97|1144->98|1174->102|1286->189|1313->208|1351->209|1387->218|1436->249|1449->253|1488->254|1523->262|1552->264|1580->283|1619->284|1655->293|1704->324|1717->328|1756->329|1793->339|1821->358|1860->359|1896->368|1960->401|1998->409|2036->417|2077->431|2205->532|2218->536|2246->543|2419->698|2431->702|2469->703|2502->709|2615->796|2644->816|2683->817|2719->826|2754->834|2789->848|2839->868|2873->875|2997->972|3010->976|3038->983|3067->985|3104->1001|3396->1266|3409->1270|3437->1277|3677->1487|3714->1494
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|47->17|48->18|49->19|51->21|53->23|53->23|53->23|56->26|56->26|56->26|57->27|59->29|59->29|59->29|60->30|60->30|60->30|61->31|62->32|64->34|64->34|64->34|64->34|64->34|67->37|67->37|67->37|70->40|72->42
                  -- GENERATED --
              */
          