/**
 * 
 */
package org.tecnificados.com.urlChecker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Juan Carlos Ballesteros (tecnificados.com)
 *
 */
public class Main {
	
	private static final Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		logger.info("begin");
		
		String urlToCheck = "https://openjdk.java.net/projects/jdk/15/";
		
		logger.info("status: "+Utils.checkURL(urlToCheck));
		
		logger.info("end");
		
	}

	

}
