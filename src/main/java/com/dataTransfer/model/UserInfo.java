package com.dataTransfer.model;

import java.util.Date;
import java.io.Serializable;

public class UserInfo implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.id
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.user_name
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.phone_md5
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String phoneMd5;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.phone_no
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String phoneNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.city
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String city;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.user_address
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String userAddress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.house_space
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String houseSpace;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.measure_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String measureTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.comment
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private String comment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.create_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.update_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_data.export
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private Integer export;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_data
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.id
	 * @return  the value of user_data.id
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.id
	 * @param id  the value for user_data.id
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.user_name
	 * @return  the value of user_data.user_name
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.user_name
	 * @param userName  the value for user_data.user_name
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.phone_md5
	 * @return  the value of user_data.phone_md5
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getPhoneMd5() {
		return phoneMd5;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.phone_md5
	 * @param phoneMd5  the value for user_data.phone_md5
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setPhoneMd5(String phoneMd5) {
		this.phoneMd5 = phoneMd5;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.phone_no
	 * @return  the value of user_data.phone_no
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.phone_no
	 * @param phoneNo  the value for user_data.phone_no
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.city
	 * @return  the value of user_data.city
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getCity() {
		return city;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.city
	 * @param city  the value for user_data.city
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.user_address
	 * @return  the value of user_data.user_address
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getUserAddress() {
		return userAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.user_address
	 * @param userAddress  the value for user_data.user_address
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.house_space
	 * @return  the value of user_data.house_space
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getHouseSpace() {
		return houseSpace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.house_space
	 * @param houseSpace  the value for user_data.house_space
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setHouseSpace(String houseSpace) {
		this.houseSpace = houseSpace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.measure_time
	 * @return  the value of user_data.measure_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getMeasureTime() {
		return measureTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.measure_time
	 * @param measureTime  the value for user_data.measure_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setMeasureTime(String measureTime) {
		this.measureTime = measureTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.comment
	 * @return  the value of user_data.comment
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.comment
	 * @param comment  the value for user_data.comment
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.create_time
	 * @return  the value of user_data.create_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.create_time
	 * @param createTime  the value for user_data.create_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.update_time
	 * @return  the value of user_data.update_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.update_time
	 * @param updateTime  the value for user_data.update_time
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_data.export
	 * @return  the value of user_data.export
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public Integer getExport() {
		return export;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_data.export
	 * @param export  the value for user_data.export
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	public void setExport(Integer export) {
		this.export = export;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_data
	 * @mbg.generated  Thu Jun 13 15:31:15 CST 2024
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", userName=").append(userName);
		sb.append(", phoneMd5=").append(phoneMd5);
		sb.append(", phoneNo=").append(phoneNo);
		sb.append(", city=").append(city);
		sb.append(", userAddress=").append(userAddress);
		sb.append(", houseSpace=").append(houseSpace);
		sb.append(", measureTime=").append(measureTime);
		sb.append(", comment=").append(comment);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", export=").append(export);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}