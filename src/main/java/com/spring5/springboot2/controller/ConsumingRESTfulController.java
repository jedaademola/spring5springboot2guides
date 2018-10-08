package com.spring5.springboot2.controller;

import com.spring5.springboot2.Application;
import com.spring5.springboot2.model.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumingRESTfulController {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRESTfulController.class);

    public void consume(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}
