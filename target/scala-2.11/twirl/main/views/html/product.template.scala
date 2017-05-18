
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object product_Scope0 {
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

class product extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Product,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Product):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main(product.getName)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<div class="row back">
        <div class="col-xs-12">
            <a href=""""),_display_(/*5.23*/routes/*5.29*/.ProductController.list()),format.raw/*5.54*/(""""><i class="fa fa-caret-left" aria-hidden="true"></i> Zurück</a>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
            <h1>"""),_display_(/*11.18*/product/*11.25*/.getName()),format.raw/*11.35*/("""</h1>
            <span class="ean"><b>EAN:</b> """),_display_(/*12.44*/product/*12.51*/.getEan),format.raw/*12.58*/("""</span>
        </div>
    </div>
    <div class="row product-detail">
        <div class="col-xs-6">
            <img src=""""),_display_(/*17.24*/routes/*17.30*/.Assets.versioned(product.getImagePath())),format.raw/*17.71*/("""" class="img-responsive" />
        </div>
        <div class="col-xs-6">
            <b>Beschreibung:</b>
            <div class="description">
            """),_display_(/*22.14*/product/*22.21*/.getDescription()),format.raw/*22.38*/("""
            """),format.raw/*23.13*/("""</div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(product:Product): play.twirl.api.HtmlFormat.Appendable = apply(product)

  def f:((Product) => play.twirl.api.HtmlFormat.Appendable) = (product) => apply(product)

  def ref: this.type = this

}


}

/**/
object product extends product_Scope0.product
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/product.scala.html
                  HASH: eeb4afecc19aa14cc5d127dd79b3c302954b9ea3
                  MATRIX: 750->1|863->19|890->21|919->42|958->44|989->49|1092->126|1106->132|1151->157|1341->320|1357->327|1388->337|1464->386|1480->393|1508->400|1660->525|1675->531|1737->572|1922->730|1938->737|1976->754|2017->767
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|42->11|42->11|42->11|43->12|43->12|43->12|48->17|48->17|48->17|53->22|53->22|53->22|54->23
                  -- GENERATED --
              */
          