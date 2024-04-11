package lk.orionux.RabbitEmail.advisor;

import lk.orionux.RabbitEmail.dto.ResponseDto;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 4/2/2024
 * @project : RabbitEmail
 */
@RestControllerAdvice
@CrossOrigin
public class ExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler({Exception.class})
    public ResponseDto sendResponse(Exception e){
        return new ResponseDto("500",e.getMessage());
    }
}
