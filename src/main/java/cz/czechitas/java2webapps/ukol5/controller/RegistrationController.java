package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.Period;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
@RequestMapping("/")
public class RegistrationController {

    @GetMapping("")
    public ModelAndView form() {
        ModelAndView result = new ModelAndView("/form");
        result.addObject("form", new RegistrationForm());
        return result;
    }

    @PostMapping("")
    public Object form(@Valid @ModelAttribute("form") RegistrationForm form, BindingResult bindingResult) {
        //TODO when wrong value of birthdate is submitted, the previously chosen radio button gender selection is erased

        if (!bindingResult.hasErrors()) {
            Period period = Period.between(form.getBirthDate(), LocalDate.now());
            int vek = period.getYears();
            if (vek < 9 || vek > 15) {
                bindingResult.rejectValue("birthDate","","NOT VALID AGE: Sorry, but only children in the age of 9-15years can be registered!");
                return "/form";
            }
            return new ModelAndView("/registered")
                    .addObject("email", form.getEmail());
        }
        return "/form";
    }
}


/*
        if (bindingResult.hasErrors()) {
            return "/form";
        }
        Period period = Period.between(form.getBirthDate(), LocalDate.now());
        int vek = period.getYears();
        if (vek < 9 || vek > 15) {
            bindingResult.rejectValue("birthDate","Sorry, but only children in the age of 9-15years can be registered!","not valid age");
            return "/form";
        }
       return new ModelAndView("/registered")
                    .addObject("email", form.getEmail());
*/



