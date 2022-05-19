package rh.pramudito.service;

import io.quarkus.rest.client.reactive.ClientExceptionMapper;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import rh.pramudito.data.Chapter;
import rh.pramudito.data.Chapters;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://api.quran.com/api/v4")
@Path("chapters")
@Produces(MediaType.APPLICATION_JSON)
public interface QuranAPIClient {

    @GET
    Chapters getQuranChapters();

    @GET
    @Path("/{id}")
    Chapter getQuran(@PathParam("id") int id);

    @ClientExceptionMapper
    static RuntimeException toException(javax.ws.rs.core.Response response) {
        throw new RuntimeException(
                ""
                        .concat("Request to log server failed! Server response: ")
                        .concat("Status code ")
                        .concat(String.valueOf(response.getStatus()))
                        .concat(". Body: ")
                        .concat(response.readEntity(String.class))
        );
    }
}
