package at.htlklu.springboottemplate.controllers;

import at.htlklu.springboottemplate.model.Lebensmittel;
import at.htlklu.springboottemplate.repositories.LebensmittelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;

@Controller
public class LebensmittelController {
    @Autowired
    LebensmittelRepository lebRepo;

    @GetMapping("/lebensmittel")
    public String showAll(Model model){
        List<Lebensmittel> lebensmittels = lebRepo.findAll();
        lebensmittels.sort(Comparator.comparing(Lebensmittel::getBezeichnung));
        model.addAttribute("lebensmittel",lebensmittels);
        return "overview";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id){
        lebRepo.deleteById(id);
        return "redirect:/lebensmittel";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model){
        Lebensmittel lebensmittel = lebRepo.findById(id).get();
        model.addAttribute("lebensmittel",lebensmittel);
        return "modify";
    }

    @GetMapping("/add")
    public String add(Model model){
        Lebensmittel neuesLebensmittel = new Lebensmittel();
        model.addAttribute("lebensmittel",neuesLebensmittel);
        return "modify";
    }

    @PostMapping("/edit")
    public String save(@ModelAttribute Lebensmittel lebensmittel){
        lebRepo.save(lebensmittel);
        return "redirect:/lebensmittel";
    }
}
