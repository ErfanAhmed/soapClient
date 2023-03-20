package net.example.soapClient;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author erfan
 * @since 3/16/23
 */
public class SoapHttpClient {
    public String content = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" \n" +
            "                xmlns=\"http://example.com/endpoint\">\n" +
            "  <soap:Body>\n" +
            "    <MyRequest>\n" +
            "      <name>BD</name>\n" +
            "    </MyRequest>\n" +
            "  </soap:Body>\n" +
            "</soap:Envelope>";

    public void sendReq() {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost("http://localhost:8080");

        postRequest.addHeader("Content-Type", "text/xml; charset=utf-8");
        postRequest.addHeader("SOAPAction", "POST");
        try {
            postRequest.setEntity(new StringEntity(content));

            HttpResponse response = httpClient.execute(postRequest);

            System.out.println(response.getStatusLine().getStatusCode());
            System.out.println(EntityUtils.toString(response.getEntity()));

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
