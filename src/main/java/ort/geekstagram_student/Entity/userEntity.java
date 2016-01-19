package ort.geekstagram_student.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name= "User")
@Entity
public class userEntity {
	
	private int Id ;
	private String pseudo;
	private String password ;
	private String mail;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	

}
