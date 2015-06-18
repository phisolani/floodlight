/**
 *    Copyright 2014, 
 *    Originally created by Pedro Heleno Isolani, 
 *    Federal University of Rio Grande do Sul
 **/

package net.floodlightcontroller.core.statistics;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The class aggregates the counters for a switch
 * 
 * @author Pedro Heleno Isolani
 *
 */

public class PerSwitchStatistics {

	private static Map<String, Counter> switches_map = new ConcurrentHashMap<String, Counter>();
	
	public static Map<String, Counter> getSwitches_map() {
		return switches_map;
	}

	public static void setSwitches_map(Map<String, Counter> switches_map) {
		PerSwitchStatistics.switches_map = switches_map;
	}
	
	 /**
	 * @author PHISOLANI
	 * @param dpid = String DPID
	 * @TODO: Create a control message counter
	 */	
    public static boolean createSwitchCounterIfNotExists(String dpid) {
		if (getSwitches_map().get(dpid) == null) {
			//System.out.println("Switches_map null yet");
			getSwitches_map().put(dpid,
					new Counter());
		}
		return true;
	}

}
