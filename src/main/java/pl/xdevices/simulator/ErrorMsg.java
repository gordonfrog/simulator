package pl.xdevices.simulator;

import lombok.AllArgsConstructor;
import lombok.Data;

//@AllArgsConstructor
//@Data
public class ErrorMsg {
    private int status;
    private String msg;
    private String details;
	public ErrorMsg(int status, String msg, String details) {
		super();
		this.status = status;
		this.msg = msg;
		this.details = details;
	}
	public ErrorMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
    
    
}
