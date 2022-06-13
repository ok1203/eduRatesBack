package com.example.edurates.staff;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StaffController {

    @Autowired
    private StaffService service;

    @GetMapping("/staff")
    public String showUsersList(Model model) {
        List<Staff> listStaff = service.listAll();
        model.addAttribute("listStaff", listStaff);

        return "staff";
    }

    @GetMapping("/staff/new")
    public String showNewForm(Model model){
        model.addAttribute("staff" , new Staff());

        return "staff_form";
    }

    @PostMapping("/staff/save")
    public String saveUser(Staff staff, RedirectAttributes ra) {
        service.save(staff);
        ra.addFlashAttribute("message", "The user has been successfully created");
        return "redirect:/staff";
    }

    @GetMapping("/staff/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra){
        try{
            Staff staff = service.get(id);
            model.addAttribute("Staff", staff);
            return "staff_form";
        } catch (StaffNotFoundException e) {

            return "redirect:/staff";
        }
    }

    @GetMapping("/staff/delete/{id}")
    public String showDeleteForm(@PathVariable("id") Integer id, RedirectAttributes ra){
        try{
            service.delete(id);
            ra.addFlashAttribute("message", "staff has been successfully deleted");
        } catch (StaffNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/staff";
    }
}
