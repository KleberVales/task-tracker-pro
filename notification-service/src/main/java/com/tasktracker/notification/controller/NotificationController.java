package com.tasktracker.notification.controller;

import com.tasktracker.notification.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/email")
    public String sendEmail(@RequestParam String to,
                            @RequestParam String subject,
                            @RequestParam String body) {
        emailService.sendTextEmail(to, subject, body);
        return "Email enviado para " + to;
    }
}
