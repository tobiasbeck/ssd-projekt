
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object productList_Scope0 {
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

class productList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productList: List[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Produkte")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Produkte</h1>
    """),_display_(/*5.6*/if(productList.size() > 0)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""

        """),format.raw/*7.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <td>EAN</td>
                            <td>Bezeichnung</td>
                            <td>Beschreibung</td>
                            <td></td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*19.22*/for(product <- productList) yield /*19.49*/{_display_(Seq[Any](format.raw/*19.50*/("""
                        """),format.raw/*20.25*/("""<tr>
                            <td>"""),_display_(/*21.34*/product/*21.41*/.getEan()),format.raw/*21.50*/("""</td>
                            <td>"""),_display_(/*22.34*/product/*22.41*/.getName()),format.raw/*22.51*/("""</td>
                            <td>"""),_display_(/*23.34*/product/*23.41*/.getDescription()),format.raw/*23.58*/("""</td>
                            <td>
                                <a href=""""),_display_(/*25.43*/routes/*25.49*/.ProductController.show(product.getId())),format.raw/*25.89*/("""" class="btn btn-default"><i class="fa fa-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*26.43*/routes/*26.49*/.ProductController.delete(product.getId())),format.raw/*26.91*/("""" class="btn btn-danger"><i class="fa fa-minus" aria-hidden="true"></i></a>
                            </td>


                        </tr>

                    """)))}),format.raw/*32.22*/("""
                    """),format.raw/*33.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*38.7*/else/*38.11*/{_display_(Seq[Any](format.raw/*38.12*/("""
        """),format.raw/*39.9*/("""<div class="warehouse-item">
            Kein Produkt vorhanden
        </div>
    """)))}),format.raw/*42.6*/("""

    """),format.raw/*44.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*45.19*/routes/*45.25*/.FormController.addProduct),format.raw/*45.51*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Produkt anlegen</a>
    </div>

""")))}))
      }
    }
  }

  def render(productList:List[Product]): play.twirl.api.HtmlFormat.Appendable = apply(productList)

  def f:((List[Product]) => play.twirl.api.HtmlFormat.Appendable) = (productList) => apply(productList)

  def ref: this.type = this

}


}

/**/
object productList extends productList_Scope0.productList
              /*
                  -- GENERATED --
                  DATE: Thu May 18 14:51:45 CEST 2017
                  SOURCE: /Users/tobibeck/Downloads/warehouse/app/views/productList.scala.html
                  HASH: 83dcd0ebd91ed1b41a77466fb2c81de6243b6857
                  MATRIX: 764->1|887->29|915->32|939->48|977->49|1008->54|1056->77|1090->103|1129->105|1165->115|1641->564|1684->591|1723->592|1776->617|1841->655|1857->662|1887->671|1953->710|1969->717|2000->727|2066->766|2082->773|2120->790|2228->871|2243->877|2304->917|2451->1037|2466->1043|2529->1085|2724->1249|2773->1270|2865->1345|2878->1349|2917->1350|2953->1359|3067->1443|3100->1449|3170->1492|3185->1498|3232->1524
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|63->32|64->33|69->38|69->38|69->38|70->39|73->42|75->44|76->45|76->45|76->45
                  -- GENERATED --
              */
          