package controllers;

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
public class TagController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result list(){
        List<Tag> tagList = Tag.find.all();
        return ok(views.html.tagList.render(tagList));
    }

    public Result create(){
        Form<Tag> tagForm = formFactory.form(Tag.class);
        Tag tag = tagForm.bindFromRequest().get();
        tag.save();
        return  redirect(routes.TagController.list());
    }
}
