import area.client.InfosClient;
import area.server.ClientService;

public class EsquemaLoginPOO {
    public static void main (String[] args) {
        ClientService clientService = new ClientService();

        InfosClient client_1 = new InfosClient("Jonh Doe", "johndoe@gmail.com", "555-999-253-6630", "USA");
        InfosClient client_2 = new InfosClient("Casandra Smith", "Casandramith@outlook.com", "555-778-452-0366", "USA");
        InfosClient client_3 = new InfosClient("Bob Will", "bobwill@yahoo.com", "555-878-135-6789", "USA");

        clientService.addClient(client_1);
        clientService.addClient(client_2);
        clientService.addClient(client_3);

        for(InfosClient infosClient : clientService.getAllClients ()) {
            System.out.println(infosClient);
        }
    }
}