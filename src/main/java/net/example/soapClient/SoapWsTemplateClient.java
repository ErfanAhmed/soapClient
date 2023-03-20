package net.example.soapClient;

import net.example.soapClient.soapReqResSchema.MyRequest;
import net.example.soapClient.soapReqResSchema.MyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * @author erfan
 * @since 3/20/23
 */
@RestController
@RequestMapping
public class SoapWsTemplateClient {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    @GetMapping(value = "/myRequest")
    public MyResponse sedReq() {
        MyRequest request = new MyRequest();
        request.setName("BD");

        MyResponse response = (MyResponse) webServiceTemplate.marshalSendAndReceive(request);
        System.out.println(response.getMessage());

        return response;
    }
}
