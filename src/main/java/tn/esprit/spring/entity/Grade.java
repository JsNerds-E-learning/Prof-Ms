package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

		@Entity
		@Table(name= "GRADE")
		public class Grade implements Serializable {
			private static final long serialVersionUID = 1L;
			@Id
			@GeneratedValue (strategy= GenerationType.IDENTITY)
			private long id_Role;
			
			private String grade_name;
			private String grade_desc;
			public long getId_Role() {
				return id_Role;
			}
			public void setId_Role(long id_Role) {
				this.id_Role = id_Role;
			}
			public String getGrade_name() {
				return grade_name;
			}
			public void setGrade_name(String grade_name) {
				this.grade_name = grade_name;
			}
			public String getGrade_desc() {
				return grade_desc;
			}
			public void setGrade_desc(String grade_desc) {
				this.grade_desc = grade_desc;
			}
			public static long getSerialversionuid() {
				return serialVersionUID;
			}
			@Override
			public String toString() {
				return "grade [id_Role=" + id_Role + ", grade_name=" + grade_name + ", grade_desc=" + grade_desc + "]";
			}
			public Grade(long id_Role, String grade_name, String grade_desc) {
				super();
				this.id_Role = id_Role;
				this.grade_name = grade_name;
				this.grade_desc = grade_desc;
			}
			public Grade() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Grade(Grade r){
				this.grade_name = r.grade_name;
				this.grade_desc = r.grade_desc;
			}
		
	

}
