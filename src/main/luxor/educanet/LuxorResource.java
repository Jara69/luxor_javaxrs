package luxor.educanet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.*;
import java.util.ArrayList;



@Produces(MediaType.APPLICATION_JSON)
@Path("/luxor")
public class LuxorResource {

    @GET
    @Path("luxor")
    public Response getBooks() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/luxor", "root", "");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT book.id , book.title, book.author, book.glossary, book.price, FROM book");
        ArrayList<Luxor> luxorList = new ArrayList<>();
        while (result.next()) {
            Luxor book = new Luxor();

            String id = result.getString("id");
            book.setId(id);
            String title = result.getString("title");
            book.setTitle(title);
            String author = result.getString("author");
            book.setAuthor(author);
            String glossary = result.getString("glossary");
            book.setGlossary(glossary);
            String price = result.getString("price");
            book.setPrice(price);

            luxorList.add(book);
            System.out.println("Book added");
        }
        connection.close();
        return Response.ok(luxorList).build();
    }

}
