package studentManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_info")
public class Students {

	@Id
	private int id;
	private String name;
	
	private String email;
	private String cources;
	
	private int marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCources() {
		return cources;
	}

	public void setCources(String cources) {
		this.cources = cources;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", email=" + email + ", cources=" + cources + ", marks="
				+ marks + "]";
	}
	
	
}
