package net.floodlightcontroller.core.statistics;

import java.util.concurrent.atomic.AtomicInteger;
	
public class StatisticPacket {
	private AtomicInteger transactionId;
	private String switchDPID;
	private long timeRequest;
	private short lengthRequest;
	private int timeout = 10;
	
	public AtomicInteger getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(AtomicInteger transactionId) {
		this.transactionId = transactionId;
	}
	public String getSwitchDPID() {
		return switchDPID;
	}
	public void setSwitchDPID(String switchDPID) {
		this.switchDPID = switchDPID;
	}
	public long getTimeRequest() {
		return timeRequest;
	}
	public void setTimeRequest(long timeRequest) {
		this.timeRequest = timeRequest;
	}
	public short getLengthRequest() {
		return lengthRequest;
	}
	public void setLengthRequest(short lengthRequest) {
		this.lengthRequest = lengthRequest;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	@Override
	public String toString() {
		return "StatisticPacket [transactionId=" + transactionId
				+ ", switchDPID=" + switchDPID + ", timeRequest=" + timeRequest
				+ ", lengthRequest=" + lengthRequest + ", timeout=" + timeout
				+ "]";
	}
	
	
}