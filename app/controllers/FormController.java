package controllers;

import models.Product;
import models.StockItem;
import models.Tag;
import models.Warehouse;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
public class FormController extends Controller {
    @Inject
    public FormFactory formFactory;
    public Result addWarehouse(){
        Form<Warehouse> warehouseForm = formFactory.form(Warehouse.class);
        return ok(views.html.addWarehouse.render(warehouseForm));
    }

    public Result addProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(views.html.addProduct.render(productForm));
    }

    public Result addTag(){
        Form<Tag> tagForm = formFactory.form(Tag.class);
        return ok(views.html.addTag.render(tagForm));
    }

    public Result addStockItem(){
        Form<StockItem> stockForm = formFactory.form(StockItem.class);
        List<Warehouse> warehouseList = Warehouse.find.all();
        List<Product> productList = Product.find.all();
        return ok(views.html.addStockItem.render(stockForm, warehouseList, productList));
    }
}
