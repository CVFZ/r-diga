package com.example.thymeleaf_spring_boot_db.controller;

import com.example.thymeleaf_spring_boot_db.entities.Student;
import com.example.thymeleaf_spring_boot_db.repo.SchoolclassRepository;
import com.example.thymeleaf_spring_boot_db.repo.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentsController {
    private Logger logger = LoggerFactory.getLogger(StudentsController.class);

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    SchoolclassRepository schoolclassRepo;

    @GetMapping({"/information","/"})
    public String showAll(Model model){
        model.addAttribute("students",studentRepo.findAll());
        return "index";
    }

    @GetMapping("/delete")
    public String deleteStudentById(@RequestParam int id){
        studentRepo.deleteById(id);
        return "redirect:/information";
    }

    @GetMapping("/add")
    public String addStudent(Model model){
        Student student = new Student();
        student.setSchoolclassesBySchoolclassId(schoolclassRepo.findById(1).get());
        model.addAttribute("student",student);
        return "studentConfig";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student){
        logger.info(student.getSchoolclassesBySchoolclassId().getName());
        studentRepo.save(student);
        return "redirect:/information";
    }

    @GetMapping("/edit")
    public String editStudent(@RequestParam int id, Model model){
        model.addAttribute("student",studentRepo.findById(id).get());
        return "studentConfig";
    }

}
