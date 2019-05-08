package model;

import java.sql.Date;
import java.time.LocalDate;

public class Client {
	
	private int id;
	private String name;
	private String adress;
	private float credit;
	private LocalDate dateEntry;
	private Date dateRead;
	
	public void setDateaux(Date dateaux) {
        this.dateRead = dateaux;
    }
	public Date getDateaux() {
        return dateRead;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	public LocalDate getExpiration() {
		return dateEntry;
	}
	public void setExpiration(LocalDate expiration) {
		this.dateEntry = expiration;
	}
	
	  public LocalDate toDate(int ano, int mes, int dia) {
	    	LocalDate localDate = LocalDate.of(ano, mes, dia);
	    	
			return localDate;
	    	
	    }
	  
	  public LocalDate convertToEntityAttribute(Date date) {
		    return date.toLocalDate();
		  }
		
	
}
