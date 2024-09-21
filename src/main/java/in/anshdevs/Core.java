package in.anshdevs;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;

@Path("/")
public class Core {


    @Singleton
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        HashMap<String, Object> res = new HashMap<>(){{
                put("message", "PRICE SURGE");
        }};
        return Response.status(Response.Status.OK).entity(res).build();
    }
}
