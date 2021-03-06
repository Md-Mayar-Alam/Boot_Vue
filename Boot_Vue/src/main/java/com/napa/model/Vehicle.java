package com.napa.model;
// Generated Nov 7, 2019 3:43:45 PM by Hibernate Tools 5.1.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vehicle generated by hbm2java
 */
@Entity
@Table(name = "vehicle", catalog = "napaonline")
public class Vehicle implements java.io.Serializable {

	private Long vehicleId;
	private String napaVehicleTypeId;
	private String endecaVehicleTypeId;
	private String vehicleTypeName;
	private String napaYearId;
	private String endecaYearId;
	private String yearName;
	private String napaMakeId;
	private String endecaMakeId;
	private String makeName;
	private String napaModelId;
	private String endecaModelId;
	private String modelName;
	private String napaEngineId;
	private String endecaEngineId;
	private String engineName;
	private Boolean isDefault;
	private Date lastSyncupDate;
	private Set<CustomerVehicle> customerVehicles = new HashSet<CustomerVehicle>(0);
	private Set<CustomerDefaultVehicle> customerDefaultVehicles = new HashSet<CustomerDefaultVehicle>(0);

	public Vehicle() {
	}

	public Vehicle(Date lastSyncupDate) {
		this.lastSyncupDate = lastSyncupDate;
	}

	public Vehicle(String napaVehicleTypeId, String endecaVehicleTypeId, String vehicleTypeName, String napaYearId,
			String endecaYearId, String yearName, String napaMakeId, String endecaMakeId, String makeName,
			String napaModelId, String endecaModelId, String modelName, String napaEngineId, String endecaEngineId,
			String engineName, Boolean isDefault, Date lastSyncupDate, Set<CustomerVehicle> customerVehicles,
			Set<CustomerDefaultVehicle> customerDefaultVehicles) {
		this.napaVehicleTypeId = napaVehicleTypeId;
		this.endecaVehicleTypeId = endecaVehicleTypeId;
		this.vehicleTypeName = vehicleTypeName;
		this.napaYearId = napaYearId;
		this.endecaYearId = endecaYearId;
		this.yearName = yearName;
		this.napaMakeId = napaMakeId;
		this.endecaMakeId = endecaMakeId;
		this.makeName = makeName;
		this.napaModelId = napaModelId;
		this.endecaModelId = endecaModelId;
		this.modelName = modelName;
		this.napaEngineId = napaEngineId;
		this.endecaEngineId = endecaEngineId;
		this.engineName = engineName;
		this.isDefault = isDefault;
		this.lastSyncupDate = lastSyncupDate;
		this.customerVehicles = customerVehicles;
		this.customerDefaultVehicles = customerDefaultVehicles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "vehicle_id", unique = true, nullable = false)
	public Long getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Column(name = "napa_vehicle_type_id", length = 512)
	public String getNapaVehicleTypeId() {
		return this.napaVehicleTypeId;
	}

	public void setNapaVehicleTypeId(String napaVehicleTypeId) {
		this.napaVehicleTypeId = napaVehicleTypeId;
	}

	@Column(name = "endeca_vehicle_type_id", length = 512)
	public String getEndecaVehicleTypeId() {
		return this.endecaVehicleTypeId;
	}

	public void setEndecaVehicleTypeId(String endecaVehicleTypeId) {
		this.endecaVehicleTypeId = endecaVehicleTypeId;
	}

	@Column(name = "vehicle_type_name", length = 512)
	public String getVehicleTypeName() {
		return this.vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}

	@Column(name = "napa_year_id", length = 512)
	public String getNapaYearId() {
		return this.napaYearId;
	}

	public void setNapaYearId(String napaYearId) {
		this.napaYearId = napaYearId;
	}

	@Column(name = "endeca_year_id", length = 512)
	public String getEndecaYearId() {
		return this.endecaYearId;
	}

	public void setEndecaYearId(String endecaYearId) {
		this.endecaYearId = endecaYearId;
	}

	@Column(name = "year_name", length = 512)
	public String getYearName() {
		return this.yearName;
	}

	public void setYearName(String yearName) {
		this.yearName = yearName;
	}

	@Column(name = "napa_make_id", length = 512)
	public String getNapaMakeId() {
		return this.napaMakeId;
	}

	public void setNapaMakeId(String napaMakeId) {
		this.napaMakeId = napaMakeId;
	}

	@Column(name = "endeca_make_id", length = 512)
	public String getEndecaMakeId() {
		return this.endecaMakeId;
	}

	public void setEndecaMakeId(String endecaMakeId) {
		this.endecaMakeId = endecaMakeId;
	}

	@Column(name = "make_name", length = 512)
	public String getMakeName() {
		return this.makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	@Column(name = "napa_model_id", length = 512)
	public String getNapaModelId() {
		return this.napaModelId;
	}

	public void setNapaModelId(String napaModelId) {
		this.napaModelId = napaModelId;
	}

	@Column(name = "endeca_model_id", length = 512)
	public String getEndecaModelId() {
		return this.endecaModelId;
	}

	public void setEndecaModelId(String endecaModelId) {
		this.endecaModelId = endecaModelId;
	}

	@Column(name = "model_name", length = 512)
	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Column(name = "napa_engine_id", length = 512)
	public String getNapaEngineId() {
		return this.napaEngineId;
	}

	public void setNapaEngineId(String napaEngineId) {
		this.napaEngineId = napaEngineId;
	}

	@Column(name = "endeca_engine_id", length = 512)
	public String getEndecaEngineId() {
		return this.endecaEngineId;
	}

	public void setEndecaEngineId(String endecaEngineId) {
		this.endecaEngineId = endecaEngineId;
	}

	@Column(name = "engine_name", length = 512)
	public String getEngineName() {
		return this.engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	@Column(name = "is_default")
	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_syncup_date", nullable = false, length = 26)
	public Date getLastSyncupDate() {
		return this.lastSyncupDate;
	}

	public void setLastSyncupDate(Date lastSyncupDate) {
		this.lastSyncupDate = lastSyncupDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
	public Set<CustomerVehicle> getCustomerVehicles() {
		return this.customerVehicles;
	}

	public void setCustomerVehicles(Set<CustomerVehicle> customerVehicles) {
		this.customerVehicles = customerVehicles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
	public Set<CustomerDefaultVehicle> getCustomerDefaultVehicles() {
		return this.customerDefaultVehicles;
	}

	public void setCustomerDefaultVehicles(Set<CustomerDefaultVehicle> customerDefaultVehicles) {
		this.customerDefaultVehicles = customerDefaultVehicles;
	}

}
