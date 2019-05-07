import dao.ClientDao;
import model.Client;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Client c2 = new Client();
			c2.setName("Joao");
			c2.setAdress("Rua");
			c2.setCredit(982100);
			c2.setId(2);
			
			ClientDao c1 = new ClientDao();
//			c1.addClient(c);
//			c1.deleteClient(3);
			c1.updateClient(c2);
			c1.getAllUsers();
			
		
	}

}
