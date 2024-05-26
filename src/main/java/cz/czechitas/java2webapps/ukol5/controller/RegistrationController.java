package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistrationController {

  @GetMapping("/")
  public ModelAndView form() {
  ModelAndView result = new ModelAndView("/form");
  result.addObject("form", new RegistrationForm());
    return result;
  }

}
