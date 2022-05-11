package rh.pramudito.service;

import io.quarkus.rest.client.reactive.ClientExceptionMapper;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import rh.pramudito.data.Quran;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@RegisterRestClient(baseUri = "https://api.quran.com/api/v4")
@Path("chapters")
@Produces(MediaType.APPLICATION_JSON)
public interface QuranAPIClient {

    @GET
    Quran getQuranChapters();

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
