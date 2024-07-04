package area.server;

import area.client.InfosClient;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private List<InfosClient> infosClients;

    public ClientService() {
        this.infosClients = new ArrayList<> ();
    }

    public void addClient(InfosClient client) {
        infosClients.add(client);
    }

    public List<InfosClient> getAllClients() {
        return infosClients;
    }
}
