package rh.pramudito;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import rh.pramudito.data.Chapter;
import rh.pramudito.data.Chapters;
import rh.pramudito.service.QuranAPIClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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
    @Produces(MediaType.APPLICATION_JSON)
    public Chapters.Quran getQuran(@PathParam("id") String id) {
        List<Chapters.Quran> filter = quranAPIClient.getQuranChapters().getChapters();
        var hasil = filter.stream().filter(quran -> quran.getId().equals(id)).toList();
        return hasil.get(0);
    }

    @GET
    @Path("/byname")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getByTranslatedName(@QueryParam("name") String name, @QueryParam("name2") String name2) {
        List<Chapters.Quran> filter = quranAPIClient.getQuranChapters().getChapters();
        var hasil = filter.stream().filter(quran -> quran.getTranslatedName().getName().contains(name))
                .map(Chapters.Quran::getNameSimple).toList();

        return hasil;
    }
}