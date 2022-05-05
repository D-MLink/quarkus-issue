package org.acme;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/get")
public class getParamsTest {

    @GET
    public String getTest(@QueryParam("testObj") TestObj testObj){
        return null;
    }

}
