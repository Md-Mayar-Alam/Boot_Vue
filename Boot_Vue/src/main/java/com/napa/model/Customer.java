package com.napa.model;
// Generated Nov 7, 2019 3:43:45 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "napaonline", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Customer implements java.io.Serializable {

	private Long customerId;
	private Role role;
	private String firstName;
	private String lastName;
	private Long phoneNo;
	private String accountType;
	private String accountStatus;
	private String email;
	private String password;
	private Set<CustomerVehicle> customerVehicles = new HashSet<CustomerVehicle>(0);
	private CustomerDefaultVehicle customerDefaultVehicle;

	public Customer() {
	}

	public Customer(Role role, String firstName, String lastName, Long phoneNo, String accountType,
			String accountStatus, String email, String password, Set<CustomerVehicle> customerVehicles,
			CustomerDefaultVehicle customerDefaultVehicle) {
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.email = email;
		this.password = password;
		this.customerVehicles = customerVehicles;
		this.customerDefaultVehicle = customerDefaultVehicle;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "customer_id", unique = true, nullable = false)
	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "first_name", length = 512)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 512)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "phone_no")
	public Long getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "account_type", length = 512)
	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Column(name = "account_status", length = 512)
	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Column(name = "email", unique = true, length = 512)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", length = 512)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<CustomerVehicle> getCustomerVehicles() {
		return this.customerVehicles;
	}

	public void setCustomerVehicles(Set<CustomerVehicle> customerVehicles) {
		this.customerVehicles = customerVehicles;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "customer")
	public CustomerDefaultVehicle getCustomerDefaultVehicle() {
		return this.customerDefaultVehicle;
	}

	public void setCustomerDefaultVehicle(CustomerDefaultVehicle customerDefaultVehicle) {
		this.customerDefaultVehicle = customerDefaultVehicle;
	}

}