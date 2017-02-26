package nl.bldn.projects.customdecryption;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.encrypt.TextEncryptor;

@Configuration
public class CustomEncryptorBootstrapConfiguration {
    public static final String CUSTOM_ENCRYPT_PROPERTY_NAME = "bldn.encryption";
    public static final String REVERSABLE_ENCRYPTION = "reversable";

    @Configuration
    @ConditionalOnProperty(name = CUSTOM_ENCRYPT_PROPERTY_NAME, havingValue = REVERSABLE_ENCRYPTION)
    protected static class ReverableEncryptorConfiguration {
        @Bean
        @ConditionalOnMissingBean(ReversableEncryptor.class)
        public TextEncryptor reversableEncryptor() {
            return new ReversableEncryptor();
        }
    }
}
