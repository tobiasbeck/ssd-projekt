
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tagList_Scope0 {
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

class tagList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Tag],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tagList: List[Tag]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/main("Tags")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<h1>Tags</h1>
    """),_display_(/*5.6*/if(tagList.size() > 0)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
        """),_display_(/*6.10*/for(tag <- tagList) yield /*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""
            """),format.raw/*7.13*/("""<div class="warehouse-item">
            """),_display_(/*8.14*/tag),format.raw/*8.17*/("""
            """),format.raw/*9.13*/("""</div>
        """)))}),format.raw/*10.10*/("""
    """)))}/*11.7*/else/*11.11*/{_display_(Seq[Any](format.raw/*11.12*/("""
        """),format.raw/*12.9*/("""<div class="warehouse-item">
            Kein Tag vorhanden
        </div>
    """)))}),format.raw/*15.6*/("""

    """),format.raw/*17.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*18.19*/routes/*18.25*/.FormController.addTag()),format.raw/*18.49*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neuen Tag anlegen</a>
    </div>

""")))}))
      }
    }
  }

  def render(tagList:List[Tag]): play.twirl.api.HtmlFormat.Appendable = apply(tagList)

  def f:((List[Tag]) => play.twirl.api.HtmlFormat.Appendable) = (tagList) => apply(tagList)

  def ref: this.type = this

}


}

/**/
object tagList extends tagList_Scope0.tagList
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/tagList.scala.html
                  HASH: 8005ff260c552e2f8f90bb0cb8efa77250fb266b
                  MATRIX: 752->1|867->21|895->24|915->36|953->37|984->42|1028->61|1058->83|1097->85|1133->95|1167->114|1206->116|1246->129|1314->171|1337->174|1377->187|1424->203|1448->210|1461->214|1500->215|1536->224|1646->304|1679->310|1749->353|1764->359|1809->383
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|39->8|39->8|40->9|41->10|42->11|42->11|42->11|43->12|46->15|48->17|49->18|49->18|49->18
                  -- GENERATED --
              */
          