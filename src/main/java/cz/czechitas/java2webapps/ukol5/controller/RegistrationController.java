package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

        if (bindingResult.hasErrors()) {
            return "/form";
        }

        return new ModelAndView("/registered")
                .addObject("email", form.getEmail());
    }

}