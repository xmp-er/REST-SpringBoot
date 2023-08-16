package com.dailycodebuffer.springbootdemo.Controller;

import com.dailycodebuffer.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

//    @RequestMapping(value="/user",method= RequestMethod.GET)
    @PostMapping("/testPost")
    public User user(){
        User temp_usr = new User();
        temp_usr.setId("12");
        temp_usr.setName("Archit");
        temp_usr.setEmailId("archit32@fgmaos");
        return temp_usr;
    }
    @GetMapping("/usr/{id}/{mp}")
    public String idHandler(@PathVariable String id,@PathVariable String mp){
        return "The id is "+id+" and the mp varaible has the value "+mp;
    }
}
