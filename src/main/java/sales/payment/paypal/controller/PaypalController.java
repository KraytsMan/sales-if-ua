package sales.payment.paypal.controller;

import com.paypal.api.payments.CreditCard;
import com.paypal.core.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sales.goods.domain.Good;
import sales.payment.paypal.domain.Paypal;
import sales.payment.paypal.service.Authentication;
import sales.payment.paypal.service.PayPalPayment;
import sales.payment.paypal.service.PaypalService;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by volodya on 27.07.15.
 */
@RestController
@RequestMapping("/paypal")
public class PaypalController {

    protected static Logger logger = Logger.getLogger(PaypalController.class.getName());

    @RequestMapping(value = "",
            method = RequestMethod.POST,
            produces = "application/json; charset=UTF-8",
            consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public String apiVerification(@RequestParam(value = "clientId") String clientId,
                          @RequestParam(value = "secret") String secret)throws PayPalRESTException {
        logger.info("Paypal: save paypal api");
        String token = new Authentication().verification(clientId, secret);
        return token;
    }
}
