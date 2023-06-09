package supplier.supplier_mgmt.model.master;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "SUPPLIER_MASTER")
public class SupplierMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SUPPLIER_SEQUENCE")
	@SequenceGenerator(name = "SUPPLIER_SEQUENCE", sequenceName = "SUPPLIER_SEQUENCE", allocationSize = 1)
	@Column(name = "SUPPLIER_SEQ_NO")
	private Long supplierSeqNo;

	@Column(name = "PARTY_SEQ_NO")
	private Long partySeqNo;

	@Column(name = "REMARK")
	private String remark;

	@Column(name = "STATUS")
	private String status;

	public SupplierMaster() {
	}

	public Long getSupplierSeqNo() {
		return supplierSeqNo;
	}

	public void setSupplierSeqNo(Long supplierSeqNo) {
		this.supplierSeqNo = supplierSeqNo;
	}

	public Long getPartySeqNo() {
		return partySeqNo;
	}

	public void setPartySeqNo(Long partySeqNo) {
		this.partySeqNo = partySeqNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partySeqNo == null) ? 0 : partySeqNo.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((supplierSeqNo == null) ? 0 : supplierSeqNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SupplierMaster other = (SupplierMaster) obj;
		if (partySeqNo == null) {
			if (other.partySeqNo != null)
				return false;
		} else if (!partySeqNo.equals(other.partySeqNo))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (supplierSeqNo == null) {
			if (other.supplierSeqNo != null)
				return false;
		} else if (!supplierSeqNo.equals(other.supplierSeqNo))
			return false;
		return true;
	}

	public SupplierMaster(Long supplierSeqNo, Long partySeqNo, String remark, String status) {
		super();
		this.supplierSeqNo = supplierSeqNo;
		this.partySeqNo = partySeqNo;
		this.remark = remark;
		this.status = status;
	}

}