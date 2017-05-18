package controllers;

import com.google.common.io.Files;
import com.sun.org.apache.regexp.internal.RE;
import models.Product;

import org.h2.store.fs.FileUtils;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
public class ProductController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result list(){
        List<Product> productList = Product.find.all();
        return ok(views.html.productList.render(productList));
    }

    public Result show(Long id){
        Product product = Product.find.byId(id);
        return ok(views.html.product.render(product));
    }



    public Result create(){
        Form<Product> productForm = formFactory.form(Product.class);
        Product product = productForm.bindFromRequest().get();
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart image = body.getFile("image");

        String fileName = "";
        if (image != null) {
            fileName = image.getFilename();
            File file = (File) image.getFile();

            try {
                FileUtils.move(file.getAbsolutePath(), "public/images/"+fileName);
            } catch (Exception ioe) {
                System.out.println("Problem operating on filesystem");
            }

        }

        product.setImagePath("images/"+fileName);
        product.save();
        return  redirect(routes.ProductController.list());
    }

    public Result delete(Long id){
        Product product = Product.find.byId(id);
        product.delete();
        return redirect(routes.ProductController.list());
    }

}
