package http.controller;

import db.DataBase;
import http.HttpRequest;
import http.Response.HttpResponse;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by iltaek on 2020/06/09 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */
public class CreateUserController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(CreateUserController.class);

    public static final String REDIRECT_URL = "/index.html";

    @Override
    public void doPost(HttpRequest request, HttpResponse response) {
        User user = User.ofRequest(request);
        logger.debug("User : {}", user);
        DataBase.addUser(user);

        response.redirect(REDIRECT_URL);
    }
}