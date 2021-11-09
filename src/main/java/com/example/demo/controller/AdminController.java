package com.example.demo.controller;

import com.example.demo.domain.Admin;
import com.example.demo.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    @Qualifier("AdminServiceImpl")
    private IAdminService adminService;


    @RequestMapping("/findAll")
    public String list(Model model){
        List<Admin> admins=adminService.findAll();
        model.addAttribute("list",admins);
        return "findAll";
    }

}
