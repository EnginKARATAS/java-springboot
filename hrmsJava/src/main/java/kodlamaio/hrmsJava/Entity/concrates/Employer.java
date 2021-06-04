package kodlamaio.hrmsJava.Entity.concrates;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="employers")
public class Employer {
	@Column(name = "company_name")
	@NotNull
	private String companyName;
	
	@Column(name="web_address", nullable = false)
	@NotNull
  	private String webSite;
	
	@Column(name="web_address", nullable = false)
	@NotNull
	private String phoneNumber;
	
	@JsonIgnore
	
	@OneToMany(mappedBy ="employer")
	private List
}
