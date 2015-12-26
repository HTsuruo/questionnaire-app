
package views.html.admin

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[models.UserModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String=null, userList: List[models.UserModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""


"""),_display_(/*4.2*/main("管理画面ページ")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
	"""),format.raw/*5.2*/("""<div class="text-center">
	    <h2 class="btn-margin">管理画面</h2>
	    
	    """),_display_(/*8.7*/if(userList!=null && userList.size>0)/*8.44*/{_display_(Seq[Any](format.raw/*8.45*/("""
    	"""),format.raw/*9.6*/("""<div class="col-xs-offset-2 col-xs-8 col-md-offset-4 col-md-4">
    		<p>ダウンロードするユーザ名を選択して下さい</p>
    		<form id="csv-form" action="/admin/download/1" method="POST">
		    	<select id="select-user" class="form-control btn-margin">
		    	"""),_display_(/*13.9*/for(user <- userList) yield /*13.30*/{_display_(Seq[Any](format.raw/*13.31*/("""
	    			"""),format.raw/*14.9*/("""<option value=""""),_display_(/*14.25*/user/*14.29*/.userId),format.raw/*14.36*/("""">"""),_display_(/*14.39*/user/*14.43*/.userName),format.raw/*14.52*/("""</option>
		    	""")))}),format.raw/*15.9*/("""
		    	"""),format.raw/*16.8*/("""</select>
	    	</form>
	    	<form id="delete-form" action="/admin/user/delete/1" method="POST">
	    	</form>
    	</div>
	    	<div class="clear"></div>
	    <button id="download-btn" class="btn btn-success btn-margin btn-lg col-xs-offset-2 col-xs-8 col-md-offset-4 col-md-4">CSVダウンロード</button>
	    <button id="delete-btn" class="btn btn-danger btn-margin btn-lg col-xs-offset-2 col-xs-8 col-md-offset-4 col-md-4">ユーザを削除する</button>
	    
	    """)))}),format.raw/*25.7*/("""
	    """),format.raw/*26.6*/("""<div class="clear" style="color:red;">"""),_display_(/*26.45*/{message}),format.raw/*26.54*/("""</div>
	    <button onclick="location.href='/admin/initial'" class="btn btn-default btn-margin btn-lg col-xs-offset-2 col-xs-8 col-md-offset-5 col-md-2">設問を登録する</button>
    </div>
""")))}),format.raw/*29.2*/("""

"""),format.raw/*31.1*/("""<script type="text/javascript">
	$(function()"""),format.raw/*32.14*/("""{"""),format.raw/*32.15*/("""
		"""),format.raw/*33.3*/("""$("#select-user").bind('change',function()"""),format.raw/*33.45*/("""{"""),format.raw/*33.46*/("""
			"""),format.raw/*34.4*/("""var userId = $(this).val();
			$("#csv-form").attr("action","/admin/download/"+userId);
			$("#delete-form").attr("action","/admin/user/delete/"+userId);
		"""),format.raw/*37.3*/("""}"""),format.raw/*37.4*/(""");

		$("#download-btn").click(function()"""),format.raw/*39.38*/("""{"""),format.raw/*39.39*/("""
			"""),format.raw/*40.4*/("""$("#csv-form").submit();
		"""),format.raw/*41.3*/("""}"""),format.raw/*41.4*/(""");

		$("#delete-btn").click(function()"""),format.raw/*43.36*/("""{"""),format.raw/*43.37*/("""
			"""),format.raw/*44.4*/("""$("#delete-form").submit();
		"""),format.raw/*45.3*/("""}"""),format.raw/*45.4*/(""");
	"""),format.raw/*46.2*/("""}"""),format.raw/*46.3*/(""");
</script>"""))
      }
    }
  }

  def render(message:String,userList:List[models.UserModel]): play.twirl.api.HtmlFormat.Appendable = apply(message,userList)

  def f:((String,List[models.UserModel]) => play.twirl.api.HtmlFormat.Appendable) = (message,userList) => apply(message,userList)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Dec 26 18:50:45 JST 2015
                  SOURCE: /Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/app/views/admin/index.scala.html
                  HASH: 050c54f142a205af62b247840666d25dcd20d098
                  MATRIX: 774->1|925->57|954->61|977->76|1016->78|1044->80|1145->156|1190->193|1228->194|1260->200|1525->439|1562->460|1601->461|1637->470|1680->486|1693->490|1721->497|1751->500|1764->504|1794->513|1842->531|1877->539|2355->987|2388->993|2454->1032|2484->1041|2696->1223|2725->1225|2798->1270|2827->1271|2857->1274|2927->1316|2956->1317|2987->1321|3170->1477|3198->1478|3267->1519|3296->1520|3327->1524|3381->1551|3409->1552|3476->1591|3505->1592|3536->1596|3593->1626|3621->1627|3652->1631|3680->1632
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|39->8|39->8|39->8|40->9|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|56->25|57->26|57->26|57->26|60->29|62->31|63->32|63->32|64->33|64->33|64->33|65->34|68->37|68->37|70->39|70->39|71->40|72->41|72->41|74->43|74->43|75->44|76->45|76->45|77->46|77->46
                  -- GENERATED --
              */
          