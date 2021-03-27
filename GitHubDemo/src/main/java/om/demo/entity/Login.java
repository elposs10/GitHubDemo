package om.demo.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="T_LOGIN")
public class Login implements Serializable {
	
	private static final Long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Log_ID")
	private Long Id;
	
	@Column(name = "Log_EMAIL")
	private String Email;
	
	@Column(name = "Log_PASSWORD")
	private String Password;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(Long id, String email, String password) {
		super();
		Id = id;
		Email = email;
		Password = password;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public static Long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Login [Id=" + Id + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
	

}
