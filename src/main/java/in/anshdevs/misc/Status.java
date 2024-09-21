package in.anshdevs.misc;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Map;
@Path("/status")
public class Status {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        var res = Map.of(
                "status","UP",
                "message","working as intended"
        );
        return Response.status(200).entity(res).build();
    }
}
