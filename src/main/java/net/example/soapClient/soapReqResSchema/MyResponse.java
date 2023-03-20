package net.example.soapClient.soapReqResSchema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author erfan
 * @since 3/16/23
 */
@XmlRootElement(name = "MyResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyResponse {
    @XmlElement(name = "Message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}