package com.example.qtcDemo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.qtcbeans.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
	
    @RequestMapping(value="/find", method=RequestMethod.GET)
    public Caso caso(@RequestParam(value="id", defaultValue="0") int id) {
    	Caso caso = new Caso();
    	caso.setTitulo("Ola");
    	caso.setDescricao("funcionou");
    	
    	return caso;
    }
}
