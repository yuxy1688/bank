package com.test.bankweb;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BankWebApplication {

    @GetMapping("/getinfo/{name}")
    public String getInfo(@PathVariable("name") String name, @RequestParam(value = "age",required = false) String age){

        return "welcome :"+name + " &age:"+age;

    }
    @GetMapping("/getinfo")
    public String getInfoName( @RequestParam(value = "age",required = false) String age){

        return "welcome 11221:"+" &age:"+age;

    }

    public static void main(String[] args) {
        SpringApplication.run(BankWebApplication.class, args);
    }

}
