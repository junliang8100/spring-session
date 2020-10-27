package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {


    @GetMapping("/first")
    public String index(Model model){
        String msg = "thymeleaf.!!!!!!";
        model.addAttribute("msg",msg);
        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setUid(1);
        u1.setName("aaaaaaaa!!!!");

        User u2 = new User();
        u2.setUid(2);
        u2.setName("BBBBBBB!!!!");

        list.add(u1);
        list.add(u2);

        model.addAttribute("userList",list);
        return "index";
    }


}
