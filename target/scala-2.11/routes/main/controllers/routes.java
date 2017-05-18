
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tobibeck/htdocs/ssd-project/conf/routes
// @DATE:Thu May 18 15:05:02 CEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTagController TagController = new controllers.ReverseTagController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStockItemController StockItemController = new controllers.ReverseStockItemController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWarehouseController WarehouseController = new controllers.ReverseWarehouseController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductController ProductController = new controllers.ReverseProductController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFormController FormController = new controllers.ReverseFormController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTagController TagController = new controllers.javascript.ReverseTagController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStockItemController StockItemController = new controllers.javascript.ReverseStockItemController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWarehouseController WarehouseController = new controllers.javascript.ReverseWarehouseController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductController ProductController = new controllers.javascript.ReverseProductController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFormController FormController = new controllers.javascript.ReverseFormController(RoutesPrefix.byNamePrefix());
  }

}
