package controllers;

import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Result;

import javax.inject.Inject;

import java.util.List;

import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;

/**
 * Created by tobibeck on 13.06.17.
 */
public class UserController {

    @Inject
    public FormFactory formFactory;

    public Result create(){
        Form<User> userForm = formFactory.form(User.class);
        User user = userForm.bindFromRequest().get();



        user.save();
        return  redirect(routes.HomeController.index());
    }


    public Result list(){
        List<User> userList = User.find.all();
        return ok(views.html.listUser.render(userList));
    }
}
