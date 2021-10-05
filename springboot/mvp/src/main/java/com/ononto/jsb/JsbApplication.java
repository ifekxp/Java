package com.ononto.jsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@SpringBootApplication
@RestController
public class JsbApplication {

  @RequestMapping("/")
  public String home() {
    return "This is home page";
  }

  @RequestMapping("/about")
  public String about() {
    return "This is about page";
  }

  @RequestMapping(value = "/welcome/{name}", produces = {"application/JSON"})
  @ResponseBody
  public HashMap<String, String> getName(@PathVariable String name) {
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("data", "Welcome " + name);
	return map;
  }

  public static void main(String[] args) {
    SpringApplication.run(JsbApplication.class, args);
  }
}