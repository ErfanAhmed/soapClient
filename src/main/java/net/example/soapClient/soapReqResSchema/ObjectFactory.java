package net.example.soapClient.soapReqResSchema;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * @author erfan
 * @since 3/20/23
 */
@XmlRegistry
public class ObjectFactory {
    public MyRequest createMyRequest() {
        return new MyRequest();
    }

    public MyResponse createMyResponse() {
        return new MyResponse();
    }
}
