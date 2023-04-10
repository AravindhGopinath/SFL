package Basic_Configure_Type;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfigureType {
	
	static Logger logger = Logger.getLogger(BasicConfigureType.class);
	

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		logger.debug("Debug message");
		
		logger.info("launched");
		
	}
		
		
		
		

}
