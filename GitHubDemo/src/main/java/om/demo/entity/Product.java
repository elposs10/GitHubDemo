package om.demo.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="T_PRODUCT")
public class Product implements Serializable {

	private static final Long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Prod_ID")
	private Long Id;
	
	@Column(name = "Prod_NAME")
	private String Name;
	
	@Column(name = "Prod_PRICE")
	private String Price;

	
}