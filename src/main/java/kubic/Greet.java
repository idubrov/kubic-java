package kubic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class Greet {

    @RequestMapping(method = RequestMethod.GET)
    public Greeting hello(@RequestParam(value = "name", defaultValue = "Anonymous") String name) {
        return new Greeting("Greetings, " + name);
    }
}
