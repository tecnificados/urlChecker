/**
 * 
 */
package org.tecnificados.com.urlChecker;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Juan Carlos Ballesteros (tecnificados.com)
 *
 */
public class Utils {
	
	private static final Logger logger = LogManager.getLogger(Utils.class);
	
	private static CloseableHttpClient httpClient = null;

	public static int checkURL(String urlToCheck) 
	{
		int statusCode=-1;
		if (httpClient==null)
		{
			httpClient = HttpClientBuilder.create().build();	
		}
		HttpHead head = new HttpHead(urlToCheck);
		try {			
		    CloseableHttpResponse response = httpClient.execute(head);
		    logger.debug("start petition");
		    statusCode = response.getStatusLine().getStatusCode();
		    logger.debug(statusCode);
		} catch (IOException ex) {
			logger.error("Error reading URL",ex);
		}
		return statusCode;
	}
	
}
