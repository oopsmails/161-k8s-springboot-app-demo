package com.oopsmails.configmgmt.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class WelcomeController {

    private final ApplicationEnvironmentProperties props;

    public WelcomeController(ApplicationEnvironmentProperties props) {
        this.props = props;
    }

    @GetMapping("/")
    public String welcome(Model model) {
        log.info("App logging, label = {}, color = {}", props.getEnv().getLabel(), props.getEnv().getColor());
        model.addAttribute("label", props.getEnv().getLabel());
        model.addAttribute("color", props.getEnv().getColor());

        return "welcome";
    }
}
