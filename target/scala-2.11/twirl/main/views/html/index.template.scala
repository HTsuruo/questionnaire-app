
package views.html

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("心理尺度テスト")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
	"""),format.raw/*4.2*/("""<h3 class="text-center" style="margin-bottom:50px;">心理尺度テストへようこそ</h3>
	<div class="col-md-6 col-md-offset-3">
		<div class="panel panel-login">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-6">
						<a href="#" class="active" id="login-form-link">Login</a>
					</div>
					<div class="col-xs-6">
						<a href="#" id="register-form-link">Register</a>
					</div>
				</div>
				<hr>
			</div>
			
			"""),_display_(/*19.5*/if(message!=null && message.size>0)/*19.40*/{_display_(Seq[Any](format.raw/*19.41*/("""
				"""),format.raw/*20.5*/("""<div class="redirect-message">"""),_display_(/*20.36*/message),format.raw/*20.43*/("""</div>
			""")))}),format.raw/*21.5*/("""
			
			"""),format.raw/*23.4*/("""<div class="panel-body">
				<div class="row">
					<div class="col-lg-12 col-xs-12">
					
						<!-- login -->
						<form id="login-form" action="/login" method="GET" role="form" style="display: block;"  enctype='multipart/form-data'>
							<div class="form-group">
								<div class="group-control">
							    	<input type="text" name="userName" value="" placeholder="名前を入力して下さい" class="form-control" required="required">
							    </div>
							</div>
							<div class="form-group">
								<button type="submit" class="btn btn-success btn-lg btn-block btn-login">
									ログイン <i class="glyphicon glyphicon-log-in"></i>
								</button>
							</div>
						</form>
						
						<!-- register -->
						<form id="register-form" action="/user/submit" method="POST" role="form" style="display: none;">
							<div class="form-group">
								<input type="text" name="userName" tabindex="1" class="form-control" placeholder="名前を入力して下さい" value="" required="required">
							</div>
							<div class="form-group">
								<div class="form-group">
									<button type="submit" class="btn btn-success btn-lg btn-block btn-login">
										START <i class="glyphicon glyphicon-log-in"></i>
									</button>
							  	</div> 
							</div>
						</form>
						
			
					</div><!-- /.col-lg-12 -->
				</div><!-- /.row -->
			</div><!-- /.panel-body -->
		</div><!-- /.panel panel-login -->
	</div><!-- /.col-md-6 col-md-offset-3 -->
""")))}),format.raw/*61.2*/("""

"""),format.raw/*63.1*/("""<script type="text/javascript">
	$('#login-form-link').click(function(e) """),format.raw/*64.42*/("""{"""),format.raw/*64.43*/("""
		"""),format.raw/*65.3*/("""$("#login-form").delay(100).fadeIn(100);
			$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	"""),format.raw/*70.2*/("""}"""),format.raw/*70.3*/(""");
	$('#register-form-link').click(function(e) """),format.raw/*71.45*/("""{"""),format.raw/*71.46*/("""
		"""),format.raw/*72.3*/("""$("#register-form").delay(100).fadeIn(100);
			$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	"""),format.raw/*77.2*/("""}"""),format.raw/*77.3*/(""");
</script>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 24 01:18:04 JST 2015
                  SOURCE: /Users/Tsuruoka/Documents/PlayFramework/questionnaire-app/app/views/index.scala.html
                  HASH: d6fbe2f52d17429e892645fcbfbcfe812318b69c
                  MATRIX: 745->1|857->18|885->21|908->36|947->38|975->40|1435->474|1479->509|1518->510|1550->515|1608->546|1636->553|1677->564|1712->572|3184->2014|3213->2016|3314->2089|3343->2090|3373->2093|3581->2274|3609->2275|3684->2322|3713->2323|3743->2326|3948->2504|3976->2505
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|51->20|51->20|52->21|54->23|92->61|94->63|95->64|95->64|96->65|101->70|101->70|102->71|102->71|103->72|108->77|108->77
                  -- GENERATED --
              */
          