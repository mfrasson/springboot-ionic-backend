package com.mfrasson.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mfrasson.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
