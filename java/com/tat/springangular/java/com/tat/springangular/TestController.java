package com.tat.springangular;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/tat/test")
public class TestController {

    
    
    @RequestMapping(method= RequestMethod.GET)
    public String getAllHome(Model model){
        System.out.println("in get home");
    	//model.addAttribute("rooms", this.roomServices.getAllRooms());
        return "home";
    }
}
