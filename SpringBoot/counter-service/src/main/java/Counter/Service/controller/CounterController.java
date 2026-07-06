package Counter.Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import Counter.Service.CounterService;

@RestController
public class CounterController {
   private final CounterService counterService;

   public CounterController(CounterService counterService) {
      this.counterService = counterService;
   }

   @GetMapping
   public String hello() {
      return "Hello, world!";
   }

   @GetMapping("/counter")
   public String count() {
      counterService.countdown();
      return "Количество запросов: " + counterService.getCount();
   }

   @GetMapping("/greetings")
    public String greetings(@RequestParam("name") String name, 

    @RequestParam("lastName") String lastName) {
    return "Hello, " + name + " " + lastName;
    }
}