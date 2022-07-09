package com.gl.SpringMVCGradedProject3.CustomerMgmt.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Entity Bean with JPA Annotations
 * Hibernate provides JPA Implementations
 */
@Entity
@Table(name="customer")

public class Customer {

		@Id
	    @Column(name="id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long customerId;
	    @Column(name="fname")
		private String firstName;
	    @Column(name="lname")
		private String lastName;
	    @Column(name="email")
	    private String email;
	    
	            
	    public Customer() {
	    	super();
	      }
	    
	    public Customer(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	    
	    public long getCustomerId() {
			return customerId;
		}


		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + "]";
		}

	}
