package net.floodlightcontroller.core.statistics;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFStatisticsReply;

public class StatisticsAggregator {
	
	private static Map<String, StatisticPacket> mapStatisticPackets= new ConcurrentHashMap<String, StatisticPacket>(); 
	
	private static AtomicLong requestPacketCount = new AtomicLong(0);	
	private static AtomicLong requestPacketLength = new AtomicLong(0);
	
	private static AtomicLong replyPacketCount = new AtomicLong(0);
	private static AtomicLong replyPacketLength = new AtomicLong(0);
	
	private static AtomicLong sumResponse = new AtomicLong(0);
	
	private static AtomicLong timeRequest = new AtomicLong(0);
	private static AtomicLong timeReply = new AtomicLong(0);
	
	private static AtomicLong packetOutCount = new AtomicLong(0);	
	private static AtomicLong packetOutLength = new AtomicLong(0);
	
	private static AtomicLong flowModCount = new AtomicLong(0);	
	private static AtomicLong flowModLength = new AtomicLong(0);
	
	private static AtomicLong packetInCount = new AtomicLong(0);	
	private static AtomicLong packetInLength = new AtomicLong(0);
			
	public static void addPacketInMessage(OFMessage msg, String switchDPID, AtomicInteger transactionId){
		//Switch DPID and Transaction ID never used
		packetInCount.incrementAndGet();
		packetInLength.addAndGet(msg.getLength());
	}
	
	public static void addPacketOutMessage(OFMessage msg, String switchDPID, AtomicInteger transactionId){
		// Switch DPID and Transaction ID never used
		packetOutCount.incrementAndGet();
		packetOutLength.addAndGet(msg.getLength());
	}

	public static void addFlowModMessage(OFMessage msg, String switchDPID,
			AtomicInteger transactionId) {
		// Switch DPID and Transaction ID never used
		flowModCount.incrementAndGet();
		flowModLength.addAndGet(msg.getLength());
	}

	public static void addStatsRequestMessage(OFMessage msg, String switchDPID, AtomicInteger transactionId){		
		//System.out.println("addStatsRequestMessage " + msg.getType());				
		StatisticPacket sp = new StatisticPacket();
		sp.setTransactionId(transactionId);
		sp.setSwitchDPID(switchDPID);
		sp.setLengthRequest(msg.getLength());
		sp.setTimeRequest(System.currentTimeMillis());
		//System.out.println(sp.toString());
		mapStatisticPackets.put(sp.getSwitchDPID() + sp.getTransactionId(), sp);
		requestPacketCount.incrementAndGet();
		requestPacketLength.addAndGet(msg.getLength()); //+= msg.getLength();
		timeRequest.set(System.currentTimeMillis());
	}
	
	public static void addStatsReplyMessage(OFStatisticsReply msg, String switchDPID, AtomicInteger transactionId){
		//System.out.println("addStatsReplyMessage " + msg);	
		StatisticPacket sp = mapStatisticPackets.get(switchDPID + transactionId);
		if (sp != null){
			sumResponse.addAndGet(System.currentTimeMillis() - sp.getTimeRequest());
			mapStatisticPackets.remove(sp);
		}
		replyPacketCount.incrementAndGet();
		replyPacketLength.addAndGet(msg.getLength());
		timeReply.set(System.currentTimeMillis()); 
		
		System.out.println("--------------------STATS_REPLY--------------------\n"
				+ "requestPacketCount: " + requestPacketCount + "\t"
				+ "requestPacketLength: " + requestPacketLength + "\n"
				+ "replyPacketCount:" + replyPacketCount + "\t"				
				+ "replyPacketLength:" + replyPacketLength + "\n"
				+ "avgResponse: " + getAvgResponse() + "\n"
				+ "timeRequest: " + getTimeRequest() + "\n"
				+ "timeReply: " + getTimeReply() + "\n"
				+ "---------------------------------------------------");
	}

	public static Map<String, StatisticPacket> getMapStatisticPackets() {
		return mapStatisticPackets;
	}

	public static void setMapStatisticPackets(
			Map<String, StatisticPacket> mapStatisticPackets) {
		StatisticsAggregator.mapStatisticPackets = mapStatisticPackets;
	}

	public static AtomicLong getRequestPacketCount() {
		return requestPacketCount;
	}

	public static void setRequestPacketCount(AtomicLong requestPacketCount) {
		StatisticsAggregator.requestPacketCount = requestPacketCount;
	}

	public static AtomicLong getRequestPacketLength() {
		return requestPacketLength;
	}

	public static void setRequestPacketLength(AtomicLong requestPacketLength) {
		StatisticsAggregator.requestPacketLength = requestPacketLength;
	}

	public static AtomicLong getReplyPacketCount() {
		return replyPacketCount;
	}

	public static void setReplyPacketCount(AtomicLong replyPacketCount) {
		StatisticsAggregator.replyPacketCount = replyPacketCount;
	}

	public static AtomicLong getReplyPacketLength() {
		return replyPacketLength;
	}

	public static void setReplyPacketLength(AtomicLong replyPacketLength) {
		StatisticsAggregator.replyPacketLength = replyPacketLength;
	}

	public static AtomicLong getSumResponse() {
		return sumResponse;
	}

	public static void setSumResponse(AtomicLong sumResponse) {
		StatisticsAggregator.sumResponse = sumResponse;
	}

	public static float getAvgResponse() {
		return (float) sumResponse.get()/replyPacketCount.get();
	}

	public static AtomicLong getTimeRequest() {
		return timeRequest;
	}

	public static void setTimeRequest(AtomicLong timeRequest) {
		StatisticsAggregator.timeRequest = timeRequest;
	}

	public static AtomicLong getTimeReply() {
		return timeReply;
	}

	public static void setTimeReply(AtomicLong timeReply) {
		StatisticsAggregator.timeReply = timeReply;
	}

	public static void setTimeResponse(AtomicLong timeResponse) {
		StatisticsAggregator.timeRequest = timeResponse;
	}

	public static AtomicLong getPacketOutCount() {
		return packetOutCount;
	}

	public static void setPacketOutCount(AtomicLong packetOutCount) {
		StatisticsAggregator.packetOutCount = packetOutCount;
	}

	public static AtomicLong getPacketOutLength() {
		return packetOutLength;
	}

	public static void setPacketOutLength(AtomicLong packetOutLength) {
		StatisticsAggregator.packetOutLength = packetOutLength;
	}

	public static AtomicLong getFlowModCount() {
		return flowModCount;
	}

	public static void setFlowModCount(AtomicLong flowModCount) {
		StatisticsAggregator.flowModCount = flowModCount;
	}

	public static AtomicLong getFlowModLength() {
		return flowModLength;
	}

	public static void setFlowModLength(AtomicLong flowModLength) {
		StatisticsAggregator.flowModLength = flowModLength;
	}

	public static AtomicLong getPacketInCount() {
		return packetInCount;
	}

	public static void setPacketInCount(AtomicLong packetInCount) {
		StatisticsAggregator.packetInCount = packetInCount;
	}

	public static AtomicLong getPacketInLength() {
		return packetInLength;
	}

	public static void setPacketInLength(AtomicLong packetInLength) {
		StatisticsAggregator.packetInLength = packetInLength;
	}	
	
}
