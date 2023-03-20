package net.example.soapClient.soapReqResSchema;

import javax.xml.bind.annotation.*;

/**
 * @author erfan
 * @since 3/16/23
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name"
})
@XmlRootElement(name = "MyRequest")
public class MyRequest {

    @XmlElement
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}