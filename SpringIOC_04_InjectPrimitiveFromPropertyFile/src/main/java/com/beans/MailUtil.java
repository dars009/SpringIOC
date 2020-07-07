package com.beans;

import org.springframework.beans.factory.annotation.Value;

public class MailUtil {
	
	@Value("${MailID}")
	public String mailId;
	
	@Value("${MailPassword}")
	String mailPass;

}
