package rh.pramudito;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import rh.pramudito.data.Chapter;
import rh.pramudito.data.Chapters;
import rh.pramudito.service.QuranAPIClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/quran")
public class QuranResource {

    @RestClient
    QuranAPIClient quranAPIClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Chapters getChapter(@QueryParam("id") String id) {
        return quranAPIClient.getQuranChapters();
    }

    @GET
    @Path("/{id}")
    @Produces
    public Chapter getQuran(@PathParam("id") int id) {
        return quranAPIClient.getQuran(id);
    }
}