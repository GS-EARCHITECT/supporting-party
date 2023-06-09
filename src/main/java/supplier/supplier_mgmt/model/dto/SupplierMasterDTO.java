package supplier.supplier_mgmt.model.dto;

import java.io.Serializable;

public class SupplierMasterDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6854659515200536526L;
	private Long supplierSeqNo;
	private Long partySeqNo;
	private String remark;
	private String status;

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

	public SupplierMasterDTO(Long supplierSeqNo, Long partySeqNo, String remark, String status) {
		super();
		this.supplierSeqNo = supplierSeqNo;
		this.partySeqNo = partySeqNo;
		this.remark = remark;
		this.status = status;
	}

	public SupplierMasterDTO() {
		super();
	}

}