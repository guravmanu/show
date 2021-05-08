package log4EX.log4_maven;

import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  
   
public class HelloWorld {  
   
  private static final Logger logger = LogManager.getLogger(HelloWorld.class);  
 public static void main(String[] args) {  
  
  BasicConfigurator.configure();  
  logger.info("Hello world");  
  logger.info("we are in logger info mode");  
   
 }  
   
}  
