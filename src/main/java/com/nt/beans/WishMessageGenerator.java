package com.nt.beans;
import java.util.Date;
public class WishMessageGenerator {
	//HAS-A-PROPERTY
 private Date date;
 //setter method for setter Injection
 public void setDate(Date date) {
	 this.date=date;
 }
 
 
 public String generate(String user) {
	 //get hour of the day
	 int hour= date.getHours();
	 //generate wish message
	 if(hour<12) 
		 return"Good Morning::"+user;
		 else if(hour<16) 
			 return"goodAfter::"+user;
			 else if(hour<20)
				 return"good evening::"+user;
			 else 
				 return"good night::"+user;
				 
		 
		 
	 
 }
}
