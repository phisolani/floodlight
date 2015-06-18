/**
*    Copyright 2014, UFRGS. 
**/

package net.floodlightcontroller.core.web;

import java.util.HashMap;
import java.util.Map;

import net.floodlightcontroller.routing.ForwardingBase;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Retrieve and set floodlight configurations
 * @author phisolani
 */
public class ControllerConfigurationResource extends ServerResource {
    @Get("json")
    public Map<String, Object> retrieve() {
    	//@phisolani
    	//TODO: Do better request load with json
    	//System.out.println(this.getRequest().getEntityAsText());
    	HashMap<String, String> configuration_map = new HashMap<String, String>();
    	try {
    		if (getRequest().getEntityAsText() != null){
    			String[] parameters = getRequest().getEntityAsText().split("&");
            	for (String s : parameters){
            		String[] parameter = s.split("=");
            		String name = parameter[0];
            		String value = parameter [1];
            		configuration_map.put(name, value);
            	}
            	System.out.println(configuration_map);
            	//*** IDLE TIMEOUT ***
            	if (configuration_map.containsKey("idle_timeout")){        		
            		ForwardingBase.FLOWMOD_DEFAULT_IDLE_TIMEOUT = Short.parseShort(configuration_map.get("idle_timeout"));        		
            	}
            	//*** HARD TIMEOUT ***
            	if (configuration_map.containsKey("hard_timeout")){
            		ForwardingBase.FLOWMOD_DEFAULT_HARD_TIMEOUT = Short.parseShort(configuration_map.get("hard_timeout"));        		
            	}
    		}    		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}    	
    	HashMap<String, Object> model = new HashMap<String, Object>();        
        model.put("idle_timeout", new Long(ForwardingBase.FLOWMOD_DEFAULT_IDLE_TIMEOUT));
        model.put("hard_timeout", new Long(ForwardingBase.FLOWMOD_DEFAULT_HARD_TIMEOUT));
        //System.out.println("idle " + ForwardingBase.FLOWMOD_DEFAULT_IDLE_TIMEOUT);
        //System.out.println("hard " + ForwardingBase.FLOWMOD_DEFAULT_HARD_TIMEOUT);
        return model;
    }
}
