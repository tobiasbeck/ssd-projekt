
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tobibeck/Downloads/warehouse/conf/routes
// @DATE:Thu May 18 14:51:44 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:10
  FormController_5: controllers.FormController,
  // @LINE:17
  WarehouseController_0: controllers.WarehouseController,
  // @LINE:22
  ProductController_3: controllers.ProductController,
  // @LINE:28
  TagController_4: controllers.TagController,
  // @LINE:32
  StockItemController_2: controllers.StockItemController,
  // @LINE:35
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:10
    FormController_5: controllers.FormController,
    // @LINE:17
    WarehouseController_0: controllers.WarehouseController,
    // @LINE:22
    ProductController_3: controllers.ProductController,
    // @LINE:28
    TagController_4: controllers.TagController,
    // @LINE:32
    StockItemController_2: controllers.StockItemController,
    // @LINE:35
    Assets_6: controllers.Assets
  ) = this(errorHandler, HomeController_1, FormController_5, WarehouseController_0, ProductController_3, TagController_4, StockItemController_2, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, FormController_5, WarehouseController_0, ProductController_3, TagController_4, StockItemController_2, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addWarehouse""", """controllers.FormController.addWarehouse()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProduct""", """controllers.FormController.addProduct()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTag""", """controllers.FormController.addTag()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addStockItem""", """controllers.FormController.addStockItem()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse""", """controllers.WarehouseController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletewarehouse/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """controllers.ProductController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """controllers.ProductController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproduct/""" + "$" + """id<[^/]+>""", """controllers.ProductController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag""", """controllers.TagController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag""", """controllers.TagController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stockitem""", """controllers.StockItemController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_FormController_addWarehouse1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addWarehouse")))
  )
  private[this] lazy val controllers_FormController_addWarehouse1_invoker = createInvoker(
    FormController_5.addWarehouse(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addWarehouse",
      Nil,
      "GET",
      """Forms""",
      this.prefix + """addWarehouse"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_FormController_addProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProduct")))
  )
  private[this] lazy val controllers_FormController_addProduct2_invoker = createInvoker(
    FormController_5.addProduct(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """addProduct"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_FormController_addTag3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTag")))
  )
  private[this] lazy val controllers_FormController_addTag3_invoker = createInvoker(
    FormController_5.addTag(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addTag",
      Nil,
      "GET",
      """""",
      this.prefix + """addTag"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_FormController_addStockItem4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addStockItem")))
  )
  private[this] lazy val controllers_FormController_addStockItem4_invoker = createInvoker(
    FormController_5.addStockItem(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addStockItem",
      Nil,
      "GET",
      """""",
      this.prefix + """addStockItem"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_WarehouseController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_show5_invoker = createInvoker(
    WarehouseController_0.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """Warehouse""",
      this.prefix + """warehouse/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_WarehouseController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse")))
  )
  private[this] lazy val controllers_WarehouseController_create6_invoker = createInvoker(
    WarehouseController_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """warehouse"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_WarehouseController_delete7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletewarehouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_delete7_invoker = createInvoker(
    WarehouseController_0.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deletewarehouse/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ProductController_list8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_ProductController_list8_invoker = createInvoker(
    ProductController_3.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "list",
      Nil,
      "GET",
      """Product""",
      this.prefix + """product"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ProductController_show9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_show9_invoker = createInvoker(
    ProductController_3.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """product/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProductController_create10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_ProductController_create10_invoker = createInvoker(
    ProductController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """product"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProductController_delete11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_delete11_invoker = createInvoker(
    ProductController_3.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteproduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_TagController_list12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag")))
  )
  private[this] lazy val controllers_TagController_list12_invoker = createInvoker(
    TagController_4.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TagController",
      "list",
      Nil,
      "GET",
      """Tag""",
      this.prefix + """tag"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_TagController_create13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag")))
  )
  private[this] lazy val controllers_TagController_create13_invoker = createInvoker(
    TagController_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TagController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """tag"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_StockItemController_create14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stockitem")))
  )
  private[this] lazy val controllers_StockItemController_create14_invoker = createInvoker(
    StockItemController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StockItemController",
      "create",
      Nil,
      "POST",
      """StockItem""",
      this.prefix + """stockitem"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:10
    case controllers_FormController_addWarehouse1_route(params) =>
      call { 
        controllers_FormController_addWarehouse1_invoker.call(FormController_5.addWarehouse())
      }
  
    // @LINE:11
    case controllers_FormController_addProduct2_route(params) =>
      call { 
        controllers_FormController_addProduct2_invoker.call(FormController_5.addProduct())
      }
  
    // @LINE:12
    case controllers_FormController_addTag3_route(params) =>
      call { 
        controllers_FormController_addTag3_invoker.call(FormController_5.addTag())
      }
  
    // @LINE:13
    case controllers_FormController_addStockItem4_route(params) =>
      call { 
        controllers_FormController_addStockItem4_invoker.call(FormController_5.addStockItem())
      }
  
    // @LINE:17
    case controllers_WarehouseController_show5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_show5_invoker.call(WarehouseController_0.show(id))
      }
  
    // @LINE:18
    case controllers_WarehouseController_create6_route(params) =>
      call { 
        controllers_WarehouseController_create6_invoker.call(WarehouseController_0.create())
      }
  
    // @LINE:19
    case controllers_WarehouseController_delete7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_delete7_invoker.call(WarehouseController_0.delete(id))
      }
  
    // @LINE:22
    case controllers_ProductController_list8_route(params) =>
      call { 
        controllers_ProductController_list8_invoker.call(ProductController_3.list())
      }
  
    // @LINE:23
    case controllers_ProductController_show9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_show9_invoker.call(ProductController_3.show(id))
      }
  
    // @LINE:24
    case controllers_ProductController_create10_route(params) =>
      call { 
        controllers_ProductController_create10_invoker.call(ProductController_3.create())
      }
  
    // @LINE:25
    case controllers_ProductController_delete11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_delete11_invoker.call(ProductController_3.delete(id))
      }
  
    // @LINE:28
    case controllers_TagController_list12_route(params) =>
      call { 
        controllers_TagController_list12_invoker.call(TagController_4.list())
      }
  
    // @LINE:29
    case controllers_TagController_create13_route(params) =>
      call { 
        controllers_TagController_create13_invoker.call(TagController_4.create())
      }
  
    // @LINE:32
    case controllers_StockItemController_create14_route(params) =>
      call { 
        controllers_StockItemController_create14_invoker.call(StockItemController_2.create())
      }
  
    // @LINE:35
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
