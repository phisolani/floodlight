/**
*    Copyright 2014, 
*    Originally created by Pedro Heleno Isolani, 
*    Federal University of Rio Grande do Sul
**/

package net.floodlightcontroller.core.statistics;

import java.util.concurrent.atomic.AtomicLong;

/**
 * The class defines the switch and its counters
 * 
 * @author Pedro Heleno Isolani
 *
 */

public class Counter{

	private AtomicLong read_state_request_count = new AtomicLong(0);
	private AtomicLong read_state_request_bytes = new AtomicLong(0);
	private AtomicLong read_state_reply_count = new AtomicLong(0);
	private AtomicLong read_state_reply_bytes = new AtomicLong(0);
	private AtomicLong barrier_request_count = new AtomicLong(0);
	private AtomicLong barrier_request_bytes = new AtomicLong(0);
	private AtomicLong barrier_reply_count = new AtomicLong(0);
	private AtomicLong barrier_reply_bytes = new AtomicLong(0);					  						 
	private AtomicLong send_packet_count = new AtomicLong(0);
	private AtomicLong send_packet_bytes = new AtomicLong(0);
	private AtomicLong modify_state_count = new AtomicLong(0);
	private AtomicLong modify_state_bytes = new AtomicLong(0);
	private AtomicLong features_request_count = new AtomicLong(0);					  
	private AtomicLong features_request_bytes = new AtomicLong(0);
	private AtomicLong features_reply_count = new AtomicLong(0);
	private AtomicLong features_reply_bytes = new AtomicLong(0);
	private AtomicLong configuration_request_count = new AtomicLong(0);
	private AtomicLong configuration_request_bytes = new AtomicLong(0);
	private AtomicLong configuration_reply_count = new AtomicLong(0);
	private AtomicLong configuration_reply_bytes = new AtomicLong(0);
	private AtomicLong packet_in_count = new AtomicLong(0);
	private AtomicLong packet_in_bytes = new AtomicLong(0);
	private AtomicLong flow_removed_count = new AtomicLong(0);
	private AtomicLong flow_removed_bytes = new AtomicLong(0);
	private AtomicLong port_status_count = new AtomicLong(0);
	private AtomicLong port_status_bytes = new AtomicLong(0);
	private AtomicLong error_count = new AtomicLong(0);
	private AtomicLong error_bytes = new AtomicLong(0);
	private AtomicLong hello_request_count = new AtomicLong(0);
	private AtomicLong hello_request_bytes = new AtomicLong(0);
	private AtomicLong hello_reply_count = new AtomicLong(0);
	private AtomicLong hello_reply_bytes = new AtomicLong(0);
	private AtomicLong echo_request_count = new AtomicLong(0);
	private AtomicLong echo_request_bytes = new AtomicLong(0);
	private AtomicLong echo_reply_count = new AtomicLong(0);
	private AtomicLong echo_reply_bytes = new AtomicLong(0);
	private AtomicLong vendor_request_count = new AtomicLong(0);
	private AtomicLong vendor_request_bytes = new AtomicLong(0);
	private AtomicLong vendor_reply_count = new AtomicLong(0);
	private AtomicLong vendor_reply_bytes = new AtomicLong(0);
	
	public AtomicLong getReadStateRequestCount() {
		return read_state_request_count;
	}
	public void setReadStateRequestCount(AtomicLong read_state_request_count) {
		this.read_state_request_count = read_state_request_count;
	}
	public AtomicLong getReadStateRequestBytes() {
		return read_state_request_bytes;
	}
	public void setReadStateRequestBytes(AtomicLong read_state_request_bytes) {
		this.read_state_request_bytes = read_state_request_bytes;
	}
	public AtomicLong getReadStateReplyCount() {
		return read_state_reply_count;
	}
	public void setReadStateReplyCount(AtomicLong read_state_reply_count) {
		this.read_state_reply_count = read_state_reply_count;
	}
	public AtomicLong getReadStateReplyBytes() {
		return read_state_reply_bytes;
	}
	public void setReadStateReplyBytes(AtomicLong read_state_reply_bytes) {
		this.read_state_reply_bytes = read_state_reply_bytes;
	}
	public AtomicLong getBarrierRequestCount() {
		return barrier_request_count;
	}
	public void setBarrierRequestCount(AtomicLong barrier_request_count) {
		this.barrier_request_count = barrier_request_count;
	}
	public AtomicLong getBarrierRequestBytes() {
		return barrier_request_bytes;
	}
	public void setBarrierRequestBytes(AtomicLong barrier_request_bytes) {
		this.barrier_request_bytes = barrier_request_bytes;
	}
	public AtomicLong getBarrierReplyCount() {
		return barrier_reply_count;
	}
	public void setBarrierReplyCount(AtomicLong barrier_reply_count) {
		this.barrier_reply_count = barrier_reply_count;
	}
	public AtomicLong getBarrierReplyBytes() {
		return barrier_reply_bytes;
	}
	public void setBarrierReplyBytes(AtomicLong barrier_reply_bytes) {
		this.barrier_reply_bytes = barrier_reply_bytes;
	}
	public AtomicLong getSendPacketCount() {
		return send_packet_count;
	}
	public void setSendPacketCount(AtomicLong send_packet_count) {
		this.send_packet_count = send_packet_count;
	}
	public AtomicLong getSendPacketBytes() {
		return send_packet_bytes;
	}
	public void setSendPacketBytes(AtomicLong send_packet_bytes) {
		this.send_packet_bytes = send_packet_bytes;
	}
	public AtomicLong getModifyStateCount() {
		return modify_state_count;
	}
	public void setModifyStateCount(AtomicLong modify_state_count) {
		this.modify_state_count = modify_state_count;
	}
	public AtomicLong getModifyStateBytes() {
		return modify_state_bytes;
	}
	public void setModifyStateBytes(AtomicLong modify_state_bytes) {
		this.modify_state_bytes = modify_state_bytes;
	}
	public AtomicLong getFeaturesRequestCount() {
		return features_request_count;
	}
	public void setFeaturesRequestCount(AtomicLong features_request_count) {
		this.features_request_count = features_request_count;
	}
	public AtomicLong getFeaturesRequestBytes() {
		return features_request_bytes;
	}
	public void setFeaturesRequestBytes(AtomicLong features_request_bytes) {
		this.features_request_bytes = features_request_bytes;
	}
	public AtomicLong getFeaturesReplyCount() {
		return features_reply_count;
	}
	public void setFeaturesReplyCount(AtomicLong features_reply_count) {
		this.features_reply_count = features_reply_count;
	}
	public AtomicLong getFeaturesReplyBytes() {
		return features_reply_bytes;
	}
	public void setFeaturesReplyBytes(AtomicLong features_reply_bytes) {
		this.features_reply_bytes = features_reply_bytes;
	}
	public AtomicLong getConfigurationRequestCount() {
		return configuration_request_count;
	}
	public void setConfigurationRequestCount(
			AtomicLong configuration_request_count) {
		this.configuration_request_count = configuration_request_count;
	}
	public AtomicLong getConfigurationRequestBytes() {
		return configuration_request_bytes;
	}
	public void setConfigurationRequestBytes(
			AtomicLong configuration_request_bytes) {
		this.configuration_request_bytes = configuration_request_bytes;
	}
	public AtomicLong getConfigurationReplyCount() {
		return configuration_reply_count;
	}
	public void setConfigurationReplyCount(AtomicLong configuration_reply_count) {
		this.configuration_reply_count = configuration_reply_count;
	}
	public AtomicLong getConfigurationReplyBytes() {
		return configuration_reply_bytes;
	}
	public void setConfigurationReplyBytes(AtomicLong configuration_reply_bytes) {
		this.configuration_reply_bytes = configuration_reply_bytes;
	}
	public AtomicLong getPacketInCount() {
		return packet_in_count;
	}
	public void setPacketInCount(AtomicLong packet_in_count) {
		this.packet_in_count = packet_in_count;
	}
	public AtomicLong getPacketInBytes() {
		return packet_in_bytes;
	}
	public void setPacketInBytes(AtomicLong packet_in_bytes) {
		this.packet_in_bytes = packet_in_bytes;
	}
	public AtomicLong getFlowRemovedCount() {
		return flow_removed_count;
	}
	public void setFlowRemovedCount(AtomicLong flow_removed_count) {
		this.flow_removed_count = flow_removed_count;
	}
	public AtomicLong getFlowRemovedBytes() {
		return flow_removed_bytes;
	}
	public void setFlowRemovedBytes(AtomicLong flow_removed_bytes) {
		this.flow_removed_bytes = flow_removed_bytes;
	}
	public AtomicLong getPortStatusCount() {
		return port_status_count;
	}
	public void setPortStatusCount(AtomicLong port_status_count) {
		this.port_status_count = port_status_count;
	}
	public AtomicLong getPortStatusBytes() {
		return port_status_bytes;
	}
	public void setPortStatusBytes(AtomicLong port_status_bytes) {
		this.port_status_bytes = port_status_bytes;
	}
	public AtomicLong getErrorCount() {
		return error_count;
	}
	public void setErrorCount(AtomicLong error_count) {
		this.error_count = error_count;
	}
	public AtomicLong getErrorBytes() {
		return error_bytes;
	}
	public void setErrorBytes(AtomicLong error_bytes) {
		this.error_bytes = error_bytes;
	}
	public AtomicLong getHelloRequestCount() {
		return hello_request_count;
	}
	public void setHelloRequestCount(AtomicLong hello_request_count) {
		this.hello_request_count = hello_request_count;
	}
	public AtomicLong getHelloRequestBytes() {
		return hello_request_bytes;
	}
	public void setHelloRequestBytes(AtomicLong hello_request_bytes) {
		this.hello_request_bytes = hello_request_bytes;
	}
	public AtomicLong getHelloReplyCount() {
		return hello_reply_count;
	}
	public void setHelloReplyCount(AtomicLong hello_reply_count) {
		this.hello_reply_count = hello_reply_count;
	}
	public AtomicLong getHelloReplyBytes() {
		return hello_reply_bytes;
	}
	public void setHelloReplyBytes(AtomicLong hello_reply_bytes) {
		this.hello_reply_bytes = hello_reply_bytes;
	}
	public AtomicLong getEchoRequestCount() {
		return echo_request_count;
	}
	public void setEchoRequestCount(AtomicLong echo_request_count) {
		this.echo_request_count = echo_request_count;
	}
	public AtomicLong getEchoRequestBytes() {
		return echo_request_bytes;
	}
	public void setEchoRequestBytes(AtomicLong echo_request_bytes) {
		this.echo_request_bytes = echo_request_bytes;
	}
	public AtomicLong getEchoReplyCount() {
		return echo_reply_count;
	}
	public void setEchoReplyCount(AtomicLong echo_reply_count) {
		this.echo_reply_count = echo_reply_count;
	}
	public AtomicLong getEchoReplyBytes() {
		return echo_reply_bytes;
	}
	public void setEchoReplyBytes(AtomicLong echo_reply_bytes) {
		this.echo_reply_bytes = echo_reply_bytes;
	}
	public AtomicLong getVendorRequestCount() {
		return vendor_request_count;
	}
	public void setVendorRequestCount(AtomicLong vendor_request_count) {
		this.vendor_request_count = vendor_request_count;
	}
	public AtomicLong getVendorRequestBytes() {
		return vendor_request_bytes;
	}
	public void setVendorRequestBytes(AtomicLong vendor_request_bytes) {
		this.vendor_request_bytes = vendor_request_bytes;
	}
	public AtomicLong getVendorReplyCount() {
		return vendor_reply_count;
	}
	public void setVendorReplyCount(AtomicLong vendor_reply_count) {
		this.vendor_reply_count = vendor_reply_count;
	}
	public AtomicLong getVendorReplyBytes() {
		return vendor_reply_bytes;
	}
	public void setVendorReplyBytes(AtomicLong vendor_reply_bytes) {
		this.vendor_reply_bytes = vendor_reply_bytes;
	}
	
	public void addReadStateRequestMessage(long value){
		this.read_state_request_count.incrementAndGet();
		this.read_state_request_bytes.addAndGet(value);
	}
	
	public void addSendPacketMessage(long value){
		this.send_packet_count.incrementAndGet();
		this.send_packet_bytes.addAndGet(value);
	}
	
	public void addModifyStateMessage(long value){
		this.modify_state_count.incrementAndGet();
		this.modify_state_bytes.addAndGet(value);
	}
	
	public void addVendorRequestMessage(long value){
		this.vendor_request_count.incrementAndGet();
		this.vendor_request_bytes.addAndGet(value);
	}
	
	public void addVendorReplyMessage(long value){
		this.vendor_reply_count.incrementAndGet();
		this.vendor_reply_bytes.addAndGet(value);
	}
	
	public void addPacketInMessage(long value){
		this.packet_in_count.incrementAndGet();
		this.packet_in_bytes.addAndGet(value);
	}
	
	public void addFlowRemovedMessage(long value){
		this.flow_removed_count.incrementAndGet();
		this.flow_removed_bytes.addAndGet(value);
	}
	
	public void addReadStateReplyMessage(long value){
		this.read_state_reply_count.incrementAndGet();
		this.read_state_reply_bytes.addAndGet(value);
	}
	
	public void addPortStatusMessage(long value){
		this.port_status_count.incrementAndGet();
		this.port_status_bytes.addAndGet(value);
	}
	
	public void addFeaturesRequestMessage(long value){
		this.features_request_count.incrementAndGet();
		this.features_request_bytes.addAndGet(value);
	}
	
	public void addFeaturesReplyMessage(long value){
		this.features_reply_count.incrementAndGet();
		this.features_reply_bytes.addAndGet(value);
	}
	
	public void addBarrierRequestMessage(long value){
		this.barrier_request_count.incrementAndGet();
		this.barrier_request_bytes.addAndGet(value);
	}
	
	public void addBarrierReplyMessage(long value){
		this.barrier_reply_count.incrementAndGet();
		this.barrier_reply_bytes.addAndGet(value);
	}
	
	public void addEchoRequestMessage(long value){
		this.echo_request_count.incrementAndGet();
		this.echo_request_bytes.addAndGet(value);
	}
	
	public void addEchoReplyMessage(long value){
		this.echo_reply_count.incrementAndGet();
		this.echo_reply_bytes.addAndGet(value);
	}
	
	public void addConfigurationsRequestMessage(long value){
		this.configuration_request_count.incrementAndGet();
		this.configuration_request_bytes.addAndGet(value);
	}
	
	public void addConfigurationsReplyMessage(long value){
		this.configuration_reply_count.incrementAndGet();
		this.configuration_reply_bytes.addAndGet(value);
	}
	
	public void addHelloRequestMessage(long value){
		this.hello_request_count.incrementAndGet();
		this.hello_request_bytes.addAndGet(value);
	}
	
	public void addHelloReplyMessage(long value){
		this.hello_reply_count.incrementAndGet();
		this.hello_reply_bytes.addAndGet(value);
	}
	
	public void addErrorMessage(long value){
		this.error_count.incrementAndGet();
		this.error_bytes.addAndGet(value);
	}
}
