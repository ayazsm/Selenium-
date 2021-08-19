package demo.ProjeOne;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		
		System.out.println("Test Started ");
		
		
		sendEmail();
		
		System.out.println("Email Sent");
		 
		
		 

	}

	public static void sendEmail() throws EmailException {
		 EmailAttachment attachment1 = new EmailAttachment();
		 attachment1.setPath("test-output\\emailable-report.html");
		 attachment1.setDisposition(EmailAttachment.ATTACHMENT);
		 attachment1.setDescription("Emailable Report");
		 attachment1.setName("Emailable Report");
		 
		 
		 EmailAttachment attachment2 = new EmailAttachment();
		 attachment2.setPath("test-output\\index.html");
		 attachment2.setDisposition(EmailAttachment.ATTACHMENT);
		 attachment2.setDescription("Test Suite ");
		 attachment2.setName("Test Suite");
		 
		 EmailAttachment attachment3 = new EmailAttachment();
		 attachment3.setPath("screenshots\\screenshot1.png");
		 attachment3.setDisposition(EmailAttachment.ATTACHMENT);
		 attachment3.setDescription("Emailable Report");
		 attachment3.setName("Emailable Report");
		 
		 EmailAttachment attachment4 = new EmailAttachment();
		 attachment4.setPath("screenshots\\screenshot2.png");
		 attachment4.setDisposition(EmailAttachment.ATTACHMENT);
		 attachment4.setDescription("Emailable Report");
		 attachment4.setName("Emailable Report");
		 
		 
		 
		 
		 
		 
		 

		 // Create the email message
		 MultiPartEmail email = new MultiPartEmail();
		 email.setHostName("smtp.gmail.com");
		 email.setSSLOnConnect(true);
		 email.setSmtpPort(465);
		 email.setAuthenticator(new DefaultAuthenticator("ayazmahammad1@gmail.com", "shariqayaz@569"));
		 email.setSSLOnConnect(true);
		 email.setFrom("ayazmahammad1@gmail.com");
		 email.setSubject("Bronto Doctor login Report ");
		 email.setMsg("Doctor Login Reports");
		 email.addTo("ayaz@codetru.com");
		 email.attach(attachment1);
		 email.attach(attachment2);
		 email.attach(attachment3);
		 email.attach(attachment4);
		 email.send();
		 System.out.println("Mail sent");
	}

}
