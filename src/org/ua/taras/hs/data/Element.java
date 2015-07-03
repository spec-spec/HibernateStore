package org.ua.taras.hs.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;




@Entity
@Table(name = "elements")
public class Element implements Serializable {
	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
	private  long id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "description")
	private String elementDescription;
	public Element(){}
	public Element(long id, String name, String year, int quantity, String elementDescription) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.quantity = quantity;
		this.elementDescription = elementDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getElementDescription() {
		return elementDescription;
	}

	public void setElementDescription(String elementDescription) {
		this.elementDescription = elementDescription;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public long getId() {
		return id;
	}

}
