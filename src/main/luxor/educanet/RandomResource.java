package luxor.educanet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;


@Produces(MediaType.APPLICATION_JSON)
@Path("random")
public class RandomResource {

  @GET public Response metoda() {
      return Response.ok("okay").build();

  }
}
