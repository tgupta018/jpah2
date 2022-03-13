package com.demo.spring.jpa.domain;

import javax.persistence.*;

import com.demo.spring.jpa.audit.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "master_users")
@EntityListeners(AuditingEntityListener.class)
public class User extends Auditable<String> {




	@Id
	@Column(name = "user_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "order_sequence")
	@SequenceGenerator(sequenceName = "ORDER_SEQ", name = "order_sequence", allocationSize = 1)
	private long userId;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email_address", nullable = false)
	private String emailId;


	public long getUserId() {
		return userId;
	}

	public void setUserId(long id) {
		this.userId = id;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
