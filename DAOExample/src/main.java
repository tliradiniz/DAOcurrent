import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import dao.ClientDao;
import model.Client;

public class main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

			Client c2 = new Client();
			c2.setName("Joao");
			c2.setAdress("Rua");
			c2.setCredit(9);
			c2.setId(2);
			ClientDao c1 = new ClientDao();
			c2.setExpiration(c2.toDate(2019, 12, 15));
			
			
			c1.addClient(c2);
//			c1.deleteClient(3);
//			c1.updateClient(c2);
		c1.getAllUsers();
			
		
	}

}
