
package views.html.question

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,models.Question,HashMap[Integer, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userId :Long, q: models.Question, qList: HashMap[Integer,String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import utils._

Seq[Any](format.raw/*1.68*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("設問")/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
	"""),_display_(/*6.3*/if(q!=null)/*6.14*/{_display_(Seq[Any](format.raw/*6.15*/("""
	    """),format.raw/*7.6*/("""<h2>テスト"""),_display_(/*7.14*/{q.questionId}),format.raw/*7.28*/("""</h2>
	    <div class="introduction">
	    	<pre>"""),_display_(/*9.13*/QuestionUtil/*9.25*/.getIntroTxtByQId(q.questionId,userId)),format.raw/*9.63*/("""</pre>
	    </div>
	    	<div class="question-contents">
	    		<form action="/question/submit/"""),_display_(/*12.40*/{userId}),format.raw/*12.48*/("""/"""),_display_(/*12.50*/{q.questionId}),format.raw/*12.64*/("""" method="post">
			    	"""),_display_(/*13.10*/if(qList!=null && qList.size>0)/*13.41*/{_display_(Seq[Any](format.raw/*13.42*/("""
			    		"""),_display_(/*14.11*/for((key,value) <- qList) yield /*14.36*/{_display_(Seq[Any](format.raw/*14.37*/("""
			    			"""),format.raw/*15.11*/("""<div style="color:#119d55;font-weight:bold;font-size:18px;">Q."""),_display_(/*15.74*/{key}),format.raw/*15.79*/("""</div>
			    			"""),_display_(/*16.12*/if(q.questionId==1 && key==1)/*16.41*/{_display_(Seq[Any](format.raw/*16.42*/("""
			    				"""),format.raw/*17.12*/("""<div style="font-weight:normal;padding-left:10px;">"""),_display_(/*17.64*/{value}),format.raw/*17.71*/("""</div>
			    				<textarea name="q"""),_display_(/*18.30*/key),format.raw/*18.33*/("""" class="form-control" required="required" placeholder="ex)週に3回程度、30分間のランニングを行っている。" style="width:100%;height:100px;"></textarea>
			    			""")))}/*19.12*/else/*19.16*/{_display_(Seq[Any](format.raw/*19.17*/("""
				    			"""),format.raw/*20.12*/("""<table class="q-table table table-striped">
				    				<thead>
				 			    		<th style="font-weight:normal;padding-left:10px;">"""),_display_(/*22.66*/{value}),format.raw/*22.73*/("""</th>
					 			    </thead>
					 			    <tbody>
					 			    """),_display_(/*25.15*/for((v,txt) <- QuestionUtil.getAnswerChoices(q.questionId,key)) yield /*25.78*/{_display_(Seq[Any](format.raw/*25.79*/("""
					 			    		"""),format.raw/*26.16*/("""<tr class="q"><td><input type="radio" name="q"""),_display_(/*26.62*/key),format.raw/*26.65*/("""" value=""""),_display_(/*26.75*/v),format.raw/*26.76*/("""" required="required">"""),_display_(/*26.99*/txt),format.raw/*26.102*/("""</td></tr>
					 			    """)))}),format.raw/*27.15*/("""
					 			    """),format.raw/*28.14*/("""</tbody>
				 			    </table>
			 			    """)))}),format.raw/*30.13*/("""
			 			    """),format.raw/*31.12*/("""<hr>
			    		""")))}),format.raw/*32.11*/("""
			    		"""),_display_(/*33.11*/if(q.questionId!=4)/*33.30*/{_display_(Seq[Any](format.raw/*33.31*/("""
				    		"""),format.raw/*34.11*/("""<button type="submit" class="btn btn-lg btn-success col-xs-offset-2 col-xs-8" style="margin-bottom:50px;margin-top:50px;">
								<i class="glyphicon glyphicon-ok-sign"></i> 回答を完了する
							</button>
						""")))}),format.raw/*37.8*/("""
			    	""")))}),format.raw/*38.10*/("""
			    	"""),format.raw/*39.9*/("""<!-- 自己開示テストの場合 -->
			    	"""),_display_(/*40.10*/if(q.questionId==4)/*40.29*/{_display_(Seq[Any](format.raw/*40.30*/("""
			    		"""),format.raw/*41.10*/("""<div class="introduction">
			    			<pre>"""),_display_(/*42.17*/QuestionUtil/*42.29*/.getIntroTxtByQId(q.questionId+10,userId)),format.raw/*42.70*/("""</pre>
			    		</div>
				    	"""),_display_(/*44.11*/if(qList!=null && qList.size>0)/*44.42*/{_display_(Seq[Any](format.raw/*44.43*/("""
				    		"""),_display_(/*45.12*/for((key,value) <- qList) yield /*45.37*/{_display_(Seq[Any](format.raw/*45.38*/("""
				    			"""),format.raw/*46.12*/("""<div style="color:#119d55;font-weight:bold;font-size:18px;">Q."""),_display_(/*46.75*/{key}),format.raw/*46.80*/("""</div>
				    			<table class="q-table table table-striped">
				    				<thead>
				 			    		<th style="font-weight:normal;padding-left:10px;">"""),_display_(/*49.66*/{value}),format.raw/*49.73*/("""</th>
					 			    </thead>
					 			    <tbody>
					 			    """),_display_(/*52.15*/for((v,txt) <- QuestionUtil.getAnswerChoices(q.questionId,key)) yield /*52.78*/{_display_(Seq[Any](format.raw/*52.79*/("""
					 			    		"""),format.raw/*53.16*/("""<tr class="q"><td><input type="radio" name="q2_"""),_display_(/*53.64*/key),format.raw/*53.67*/("""" value=""""),_display_(/*53.77*/v),format.raw/*53.78*/("""" required="required">"""),_display_(/*53.101*/txt),format.raw/*53.104*/("""</td></tr>
					 			    """)))}),format.raw/*54.15*/("""
					 			    """),format.raw/*55.14*/("""</tbody>
				 			    </table>
				 			    <hr>
				    		""")))}),format.raw/*58.12*/("""
				    		"""),format.raw/*59.11*/("""<button type="submit" class="btn btn-lg btn-success col-xs-offset-2 col-xs-8" style="margin-bottom:50px;margin-top:50px;">
								<i class="glyphicon glyphicon-ok-sign"></i> 回答を完了する
							</button>
				    	""")))}),format.raw/*62.11*/("""
			    	""")))}),format.raw/*63.10*/("""
		    	"""),format.raw/*64.8*/("""</form>
	    	</div>
	   	</button>
   	""")))}/*67.6*/else/*67.10*/{_display_(Seq[Any](format.raw/*67.11*/("""
   		"""),format.raw/*68.6*/("""<p>設問内容がありません。管理画面から登録して下さい。</p>
   	""")))}),format.raw/*69.6*/("""
""")))}),format.raw/*70.2*/("""
"""))
      }
    }
  }

  def render(userId:Long,q:models.Question,qList:HashMap[Integer, String]): play.twirl.api.HtmlFormat.Appendable = apply(userId,q,qList)

  def f:((Long,models.Question,HashMap[Integer, String]) => play.twirl.api.HtmlFormat.Appendable) = (userId,q,qList) => apply(userId,q,qList)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Dec 26 18:50:45 JST 2015
                  SOURCE: /Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/app/views/question/index.scala.html
                  HASH: fefc53e42be5727678e858bebc627850acdaaad4
                  MATRIX: 793->1|968->67|996->85|1023->87|1041->97|1080->99|1108->102|1127->113|1165->114|1197->120|1231->128|1265->142|1341->192|1361->204|1419->242|1542->338|1571->346|1600->348|1635->362|1688->388|1728->419|1767->420|1805->431|1846->456|1885->457|1924->468|2014->531|2040->536|2085->554|2123->583|2162->584|2202->596|2281->648|2309->655|2372->691|2396->694|2556->835|2569->839|2608->840|2648->852|2804->981|2832->988|2922->1051|3001->1114|3040->1115|3084->1131|3157->1177|3181->1180|3218->1190|3240->1191|3290->1214|3315->1217|3371->1242|3413->1256|3486->1298|3526->1310|3572->1325|3610->1336|3638->1355|3677->1356|3716->1367|3953->1574|3994->1584|4030->1593|4086->1622|4114->1641|4153->1642|4191->1652|4261->1695|4282->1707|4344->1748|4404->1781|4444->1812|4483->1813|4522->1825|4563->1850|4602->1851|4642->1863|4732->1926|4758->1931|4932->2078|4960->2085|5050->2148|5129->2211|5168->2212|5212->2228|5287->2276|5311->2279|5348->2289|5370->2290|5421->2313|5446->2316|5502->2341|5544->2355|5633->2413|5672->2424|5913->2634|5954->2644|5989->2652|6048->2693|6061->2697|6100->2698|6133->2704|6201->2742|6233->2744
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|39->9|39->9|39->9|42->12|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|49->19|49->19|49->19|50->20|52->22|52->22|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|56->26|57->27|58->28|60->30|61->31|62->32|63->33|63->33|63->33|64->34|67->37|68->38|69->39|70->40|70->40|70->40|71->41|72->42|72->42|72->42|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|79->49|79->49|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|84->54|85->55|88->58|89->59|92->62|93->63|94->64|97->67|97->67|97->67|98->68|99->69|100->70
                  -- GENERATED --
              */
          