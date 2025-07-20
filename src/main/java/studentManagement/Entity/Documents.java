package studentManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Documents {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docid;
	private int AdharNo;
	private String PanNo;
	
	private String Username;
	
	public int getDocid() {
		return docid;
	}

	public void setDocid(int docid) {
		this.docid = docid;
	}

	public int getAdharNo() {
		return AdharNo;
	}

	public void setAdharNo(int adharNo) {
		AdharNo = adharNo;
	}

	public String getPanNo() {
		return PanNo;
	}

	public void setPanNo(String panNo) {
		PanNo = panNo;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	@Override
	public String toString() {
		return "document [AdharNo=" + AdharNo + ", PanNo=" + PanNo + ", Username=" + Username + "]";
	}
	
	
}
