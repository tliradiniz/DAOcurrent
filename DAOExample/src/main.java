import dao.ClientDao;
import model.Client;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Client c = new Client();
			c.setName("Joao");
			ClientDao c1 = new ClientDao();
			c1.addClient(c);
		
	}

}
