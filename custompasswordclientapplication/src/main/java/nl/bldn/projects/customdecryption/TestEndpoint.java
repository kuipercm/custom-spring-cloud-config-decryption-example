package nl.bldn.projects.customdecryption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/test")
public class TestEndpoint {

    @Value("${spring.datasource.password}")
    private String decryptedPassword;

    /**
     * Obviously such an endpoint would never exist in reality,
     * but it is useful in this example, to show that the password
     * actually gets decrypted.
     *
     * @return the decrypted password
     */
    @RequestMapping(method = GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String showDecryptedPassword() {
        return decryptedPassword;
    }

}
