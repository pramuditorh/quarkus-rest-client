package rh.pramudito.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import rh.pramudito.data.Currency;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.Collection;

@RegisterRestClient(configKey = "config.api.crypto")
@Path("ticker")
public interface TickerAPIClient {
    @GET
    Collection<Currency> getCurrency(@QueryParam("id") String id);
}
