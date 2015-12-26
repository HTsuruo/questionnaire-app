
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*10.108*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/jquery-1.11.3.min.js")),format.raw/*12.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*13.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*14.79*/("""" type="text/javascript"></script>
    </head>
    <body>
    	<div class="container" style="margin-top:-50px;">
    		<div class="row">
    			<div class="col-xs-12">
       		 		"""),_display_(/*20.14*/content),format.raw/*20.21*/("""
       		 	"""),format.raw/*21.12*/("""</div>
    		</div><!-- /.row -->
   		</div><!-- /.container -->
    </body>
</html>

<script type="text/javascript">
$(function()"""),format.raw/*28.13*/("""{"""),format.raw/*28.14*/("""
	"""),format.raw/*29.2*/("""$("tr.q").click(function()"""),format.raw/*29.28*/("""{"""),format.raw/*29.29*/("""
		"""),format.raw/*30.3*/("""$(this).siblings().removeClass("warning");
		$("input[type='radio']",this).prop('checked',true);
		$(this).addClass("warning");
	"""),format.raw/*33.2*/("""}"""),format.raw/*33.3*/(""");
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/(""");
</script>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 24 01:18:05 JST 2015
                  SOURCE: /Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/app/views/main.scala.html
                  HASH: 52dcd1b250304b0c7f28932bb44264b9a057dae1
                  MATRIX: 748->1|873->31|901->33|988->94|1013->99|1161->221|1175->227|1237->268|1320->324|1335->330|1405->378|1493->439|1508->445|1569->484|1621->509|1636->515|1710->568|1794->625|1809->631|1871->672|1955->729|1970->735|2041->785|2249->966|2277->973|2317->985|2476->1116|2505->1117|2534->1119|2588->1145|2617->1146|2647->1149|2803->1278|2831->1279|2861->1282|2889->1283
                  LINES: 27->1|32->1|34->3|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|51->20|51->20|52->21|59->28|59->28|60->29|60->29|60->29|61->30|64->33|64->33|65->34|65->34
                  -- GENERATED --
              */
          