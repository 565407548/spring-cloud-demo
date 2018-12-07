package com.zcj.notification.service;

import com.zcj.notification.domain.NotificationType;
import com.zcj.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
