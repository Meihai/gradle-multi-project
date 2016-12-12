package com.keydak.main;

import com.keydak.core.MessageService;
import org.slf4j.LoggerFactory;

/**
 * @author HuangZhichang
 */
public class HelloWorld {
   

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        String message = messageService.getMessage();
		LoggerFactory.getLogger(HelloWorld.class).debug("Received message: " + message);     
    }
}
 