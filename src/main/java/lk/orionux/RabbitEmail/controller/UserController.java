package lk.orionux.RabbitEmail.controller;

import lk.orionux.RabbitEmail.dto.EmailDetails;
import lk.orionux.RabbitEmail.dto.ResponseDto;
import lk.orionux.RabbitEmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 4/2/2024
 * @project : RabbitEmail
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private  UserService userService;
    @PostMapping("/send/emails")
    public ResponseDto sendEmails(@RequestBody EmailDetails email){

        userService.sentEmails(email);
        return new ResponseDto("200","Message Sent");
    }


}
