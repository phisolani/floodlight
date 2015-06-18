package net.floodlightcontroller.core.statistics;

public class OStatisticsTemp {
	private long requestPacketCount;
	private long requestPacketLength;
	private long replyPacketCount;
	private long replyPacketLength;
	private float avgResponse;
	private long timeRequest;
	private long timeReply;
	
	private long packetInCount;
	private long packetInLength;
	private long packetOutCount;
	private long packetOutLength;
	private long flowModCount;
	private long flowModLength;
	public OStatisticsTemp(long requestPacketCount, long requestPacketLength,
			long replyPacketCount, long replyPacketLength, float avgResponse,
			long timeRequest, long timeReply, long packetInCount,
			long packetInLength, long packetOutCount, long packetOutLength,
			long flowModCount, long flowModLength) {
		super();
		this.requestPacketCount = requestPacketCount;
		this.requestPacketLength = requestPacketLength;
		this.replyPacketCount = replyPacketCount;
		this.replyPacketLength = replyPacketLength;
		this.avgResponse = avgResponse;
		this.timeRequest = timeRequest;
		this.timeReply = timeReply;
		this.packetInCount = packetInCount;
		this.packetInLength = packetInLength;
		this.packetOutCount = packetOutCount;
		this.packetOutLength = packetOutLength;
		this.flowModCount = flowModCount;
		this.flowModLength = flowModLength;
	}
	public long getRequestPacketCount() {
		return requestPacketCount;
	}
	public void setRequestPacketCount(long requestPacketCount) {
		this.requestPacketCount = requestPacketCount;
	}
	public long getRequestPacketLength() {
		return requestPacketLength;
	}
	public void setRequestPacketLength(long requestPacketLength) {
		this.requestPacketLength = requestPacketLength;
	}
	public long getReplyPacketCount() {
		return replyPacketCount;
	}
	public void setReplyPacketCount(long replyPacketCount) {
		this.replyPacketCount = replyPacketCount;
	}
	public long getReplyPacketLength() {
		return replyPacketLength;
	}
	public void setReplyPacketLength(long replyPacketLength) {
		this.replyPacketLength = replyPacketLength;
	}
	public float getAvgResponse() {
		return avgResponse;
	}
	public void setAvgResponse(float avgResponse) {
		this.avgResponse = avgResponse;
	}
	public long getTimeRequest() {
		return timeRequest;
	}
	public void setTimeRequest(long timeRequest) {
		this.timeRequest = timeRequest;
	}
	public long getTimeReply() {
		return timeReply;
	}
	public void setTimeReply(long timeReply) {
		this.timeReply = timeReply;
	}
	public long getPacketInCount() {
		return packetInCount;
	}
	public void setPacketInCount(long packetInCount) {
		this.packetInCount = packetInCount;
	}
	public long getPacketInLength() {
		return packetInLength;
	}
	public void setPacketInLength(long packetInLength) {
		this.packetInLength = packetInLength;
	}
	public long getPacketOutCount() {
		return packetOutCount;
	}
	public void setPacketOutCount(long packetOutCount) {
		this.packetOutCount = packetOutCount;
	}
	public long getPacketOutLength() {
		return packetOutLength;
	}
	public void setPacketOutLength(long packetOutLength) {
		this.packetOutLength = packetOutLength;
	}
	public long getFlowModCount() {
		return flowModCount;
	}
	public void setFlowModCount(long flowModCount) {
		this.flowModCount = flowModCount;
	}
	public long getFlowModLength() {
		return flowModLength;
	}
	public void setFlowModLength(long flowModLength) {
		this.flowModLength = flowModLength;
	}	
}
