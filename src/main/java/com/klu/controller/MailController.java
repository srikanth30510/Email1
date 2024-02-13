package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.MailSending;

@RestController
@RequestMapping("/mail")
public class MailController {

@Autowired
MailSending ms;
@GetMapping("/sent")
public String sending()
{
 String from="srikanth891922@gmail.com";
 String to="muzamilraheman123@gmail.com";
 String sub="Party";
 String msg="Hi Welcome to the Club";
return ms.sending(from, to, sub, msg);
	
}
}
