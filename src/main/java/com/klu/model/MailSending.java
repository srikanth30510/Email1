package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class MailSending {

@Autowired
JavaMailSender jms;
public String sending(String from,String to,String sub,String msg)
{
	try {
	SimpleMailMessage smm=new SimpleMailMessage();
	smm.setFrom(from);
	smm.setTo(to);
	smm.setSubject(sub);
	smm.setText(msg);
	jms.send(smm);
	return "mail sent sucessfully";
	}
	catch (Exception e) {
		// TODO: handle exception
		return e.getMessage();
	}
}
}
