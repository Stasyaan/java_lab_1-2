package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
public class ComplexController {

    @GetMapping("/")
    public Complex GetParam(@RequestParam(value = "real", defaultValue = "2") Double a,
                             @RequestParam(value = "imaginary", defaultValue = "3") Double b) {
        Logger logger = LogManager.getLogger(ComplexController.class);
        Complex num = new Complex(a, b);




        if(num.check()){
            logger.info("Successfully");
            num.calcMagnitude();
            num.calcPhase();
            return num;
        }
        else{
            logger.info("400 error!");
            throw new BadRequestException();
        }

    }
}