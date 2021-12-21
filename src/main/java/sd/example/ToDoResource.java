package sd.example;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.panache.common.Sort;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ToDoResource {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ToDo> getAll() {
        return ToDo.listAll(Sort.by("priority"));
    }
	
	@GET
	@Path("/search/{word}/{page}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ToDo> search(@PathParam("word")String word, @PathParam("page") Integer pageIndex) {
        return ToDo.search(word, pageIndex);
    }
	
}
