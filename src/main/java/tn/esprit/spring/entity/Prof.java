package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name= "PROF")
public class Prof implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private long id_user;
	private String firstName;
	private String lastName;
	private String mail_user;
	private long tel_user;
	private String adresse_user;
	private String sexe_user;
	private float salaire_user;


	@OneToOne
	@JoinColumn(name = "Grade_name")
    private Grade grade;
   @Temporal (TemporalType.DATE)
   private Date date_naissance;
public Grade getRole() {
	return grade;
}
public void setRole(Grade grade) {
	this.grade = grade;
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
public long getId_user() {
	return id_user;
}
public void setId_user(long id_user) {
	this.id_user = id_user;
}
public String getMail_user() {
	return mail_user;
}
public void setMail_user(String mail_user) {
	this.mail_user = mail_user;
}
public long getTel_user() {
	return tel_user;
}
public void setTel_user(long tel_user) {
	this.tel_user = tel_user;
}
public String getAdresse_user() {
	return adresse_user;
}
public void setAdresse_user(String adresse_user) {
	this.adresse_user = adresse_user;
}
public String getSexe_user() {
	return sexe_user;
}
public void setSexe_user(String sexe_user) {
	this.sexe_user = sexe_user;
}
public float getSalaire_user() {
	return salaire_user;
}
public void setSalaire_user(float salaire_user) {
	this.salaire_user = salaire_user;
}
public Date getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}
@Override
public String toString() {
	return "User [id_user=" + id_user + ", firstName=" + firstName + ", lastName=" + lastName + ", mail_user="
			+ mail_user + ", tel_user=" + tel_user + ", adresse_user=" + adresse_user + ", sexe_user=" + sexe_user
			+ ", salaire_user=" + salaire_user + ", role=" + grade + ", date_naissance=" + date_naissance + "]";
}
public Prof(long id_user, String firstName, String lastName, String mail_user, long tel_user, String adresse_user,
		String sexe_user, float salaire_user, Grade grade, Date date_naissance) {
	super();
	this.id_user = id_user;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mail_user = mail_user;
	this.tel_user = tel_user;
	this.adresse_user = adresse_user;
	this.sexe_user = sexe_user;
	this.salaire_user = salaire_user;
	this.grade = grade;
	this.date_naissance = date_naissance;
}
public Prof() {
	super();
	// TODO Auto-generated constructor stub
}

}
