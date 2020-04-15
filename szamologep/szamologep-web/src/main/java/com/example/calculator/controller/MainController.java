package com.example.calculator.controller;

import azazel.hu.Calculator;
import com.example.calculator.controller.dto.paramDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;

@Controller
public class MainController {
    private Calculator calculator;

    @Autowired
    public void setCalculator (Calculator calculator){
        this.calculator = calculator;
    }

    @PostMapping(value = "/")
    public ModelAndView postCalculate(@Valid paramDTO paramdto, BindingResult bindingResult){
        ModelAndView mav = new ModelAndView();
        if (bindingResult.hasErrors()) {
            mav.setViewName("calc");
            mav.addObject("paramdto", paramdto);
            return mav;
        }
        if(paramdto.getOperator().equals("/")&& paramdto.getY()==0){
            bindingResult.addError(new FieldError("paramdto","y", paramdto.getY(),false, null,null,"Nullával való osztás nem megengedett"));
            mav.setViewName("calc");
            mav.addObject("paramdto", paramdto);
            return mav;
        }

            calculator.szamol(paramdto.getX(), paramdto.getY(), paramdto.getOperator());
            mav.addObject("calculator", calculator.getResult());
            mav.setViewName("calc");
            return mav;
        }


    @GetMapping(value = "/")
    public ModelAndView getCalc() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("calc");
        mav.addObject("paramDTO", new paramDTO(0.0,"+",0.0));
        mav.addObject("calculator", calculator.getResult());
        return mav;
    }

}
