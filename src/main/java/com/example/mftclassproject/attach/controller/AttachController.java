package com.example.mftclassproject.attach.controller;


import com.example.mftclassproject.attach.model.entity.Attach;
import com.example.mftclassproject.attach.service.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/attach")
public class AttachController
{   private final AttachService attachService;
    public AttachController(AttachService attachService){
        this.attachService = attachService;
    }

    @GetMapping
    public String loadAttachPage (Model model){
        model.addAttribute("attach", new Attach());
        model.addAttribute("attachList", attachService.findAll());

        return "attach";
    }
    @PostMapping
    public String save (Model model, Attach attach){
        attachService.save(attach);

        return "redirect:attach";

    }

}