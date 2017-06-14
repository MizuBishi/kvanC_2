package ch.fhnw.kvanc.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {
    private Log log = LogFactory.getLog(this.getClass());

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
        log.debug("Server called successfully");
        return new ResponseEntity<String>("Hello from server", HttpStatus.OK);
    }
}