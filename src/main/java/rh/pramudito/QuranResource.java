package rh.pramudito;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import rh.pramudito.data.Currency;
import rh.pramudito.data.Quran;
import rh.pramudito.service.QuranAPIClient;
import rh.pramudito.service.TickerAPIClient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/crypto")
public class QuranResource {

    @RestClient
    TickerAPIClient tickerAPIClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Currency> getCrypto(@QueryParam("id") String id) {
        return tickerAPIClient.getCurrency(id);
    }
}