package com.tsystems.js;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class RestJerseyClient {

    private static final String REST_URI = "http://localhost:8081";

    public static List<Product> getProductList() {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(REST_URI);
        WebTarget bestsellers = webTarget.path("bestsellers");
        Invocation.Builder invocationBuilder = bestsellers.request(MediaType.APPLICATION_JSON);
        List<Product> response = invocationBuilder.get(List.class);
        return response;
    }
}

