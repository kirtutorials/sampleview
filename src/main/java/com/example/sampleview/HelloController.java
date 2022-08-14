package com.example.sampleview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    /**
     * MVC
     *  - model => myModelData = "Modelling Data is always good!"
     *  - View => index.jsp
     *  - Controller =>
     */
    @RequestMapping("/")
    public String printMessage(ModelMap model) {
        model.addAttribute("message", "this is custom msg!!!");

        return "Hello";
    }

}

/**
 * <h1><%= "Hello World!" %>
 * </h1>
 */


