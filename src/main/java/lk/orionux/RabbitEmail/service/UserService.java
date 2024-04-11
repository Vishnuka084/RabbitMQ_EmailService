package lk.orionux.RabbitEmail.service;

import lk.orionux.RabbitEmail.dto.EmailDetails;



/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 4/2/2024
 * @project : RabbitEmail
 */
public interface UserService  {
    void sentEmails(EmailDetails email);

}
