/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.controller;

import com.vuong.entity.UserEntity;
import com.vuong.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ducvuong25
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/result")
    public String toResult(Model model) {
        List<UserEntity> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "result";
    }

    @RequestMapping(path = "/addUser")
    public String toBlankForm(Model model) {
        UserEntity user = new UserEntity();
        model.addAttribute("user", user);
        model.addAttribute("action", "/addUser");
        model.addAttribute("content", "Add a new User");
        return "form";
    }

    @RequestMapping(path = "/addUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute UserEntity User) {
        userService.addUser(User);
        return "redirect:/result";
    }

    @RequestMapping(path = "/edit")
    public String toFilledForm(@RequestParam int id,
            Model model) {
        model.addAttribute("user", userService.getUser(id));
        model.addAttribute("action", "/edit");
        model.addAttribute("content", "Edit a User");
        return "form";
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute UserEntity user,
            Model model) {
        userService.addUser(user);
        return "redirect:/result";
    }

    @RequestMapping(path = "/delete")
    public String deleteUser(@RequestParam int id) {
        userService.removeUser(id);
        return "redirect:/result";
    }

}
