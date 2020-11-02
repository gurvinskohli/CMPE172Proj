package com.example.demo;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FoodController {
	@Autowired
    private foodService foodService;
    
    @RequestMapping(value= "/dog",method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("dogs", foodService.findAll());
        return "home";
    }
    
    //add new dog
    @RequestMapping(value= "/dog/add",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public String add(Model model) {
        model.addAttribute("dog", new Food());
        return "register";
    }	
    
    //delete a dog by ID
    @RequestMapping(value= "/dog/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
    	foodService.delete(id);
        return "redirect:/dog";
    }

    //save dog
    @RequestMapping(value= "/dog/save",method = RequestMethod.POST)
    public String save(@Valid Food food, RedirectAttributes redirect) {
    	foodService.save(food);
        return "redirect:/dog";
    }
    
    // search for dog by breed
    @RequestMapping(value= "/dog/search",method = RequestMethod.GET)
    public String search(@RequestParam("breed") String breed, Model model) {
        model.addAttribute("dogs", foodService.findByName(breed));
        return "home";
    }
    
    //modify
    @RequestMapping(value= "/dog/edit/{id}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("dog", foodService.findOne(id));
        return "register";
    }


}

