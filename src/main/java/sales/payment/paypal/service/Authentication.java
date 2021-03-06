package sales.payment.paypal.service;


import com.paypal.core.rest.OAuthTokenCredential;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;
import sales.util.Constants;

import java.io.File;

/**
 * Created by volodya on 25.07.15.
 */
public class Authentication {

    public static String getAuthenticationToken(String clientId, String secret) throws PayPalRESTException {
            PayPalResource.initConfig(new File(".",
                    Constants.PAYPAL_CONFIG_PATH));
            return new OAuthTokenCredential(clientId, secret)
                    .getAccessToken();
    }

    public static String verification(String clientId, String secret) {
        try {
            PayPalResource.initConfig(new File(".",
                    Constants.PAYPAL_CONFIG_PATH));
            return new OAuthTokenCredential(clientId, secret)
                    .getAccessToken();
        } catch (PayPalRESTException e) {
            e.printStackTrace();
            return "Wrong clientId or secret";
        }
    }


}
