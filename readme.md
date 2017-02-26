# Custom Decryption and Spring Cloud Config Server

This code example shows how to facilitate custom decryption of
passwords in client applications of a Spring Cloud Config Server.

This project has been split into three subprojects:
* **the client application**: requests its configuration from the
configuration server and includes the decryption library to decrypt
encrypted properties
* **the configuration server**: exposes the configuration for the 
client application. Doesn't decrypt encrypted values.
* **the decryption library**: contains the encryption/decryption
algorithm and required setup to do autconfiguration in the client

For a more thorough explanation read the blog post at .

## To run this code

1. Execute ```mvn clean install``` in the root project.
2. Run ```java -jar custompasswordconfigserver\target\custom-password-config-server-1.0-SNAPSHOT.jar``` to start the server
3. Run ```java -jar custompasswordclientapplication\target\custom-password-clientapplication-1.0-SNAPSHOT.jar --bldn.encryption=reversable``` to start the client
4. Visit ```http://localhost:48081/test``` to see the decrypted password