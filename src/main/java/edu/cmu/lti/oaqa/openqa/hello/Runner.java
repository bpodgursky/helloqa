package edu.cmu.lti.oaqa.openqa.hello;

import edu.cmu.lti.oaqa.ecd.driver.ECDDriver;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.UUID;

public class Runner {
  public static void main(String[] args) throws Exception {
    BasicConfigurator.configure();
    Logger.getRootLogger().setLevel(Level.ERROR);

    String uuid = UUID.randomUUID().toString();
    if (args.length > 1) {
      uuid = args[1];
    }
    System.out.println("Experiment UUID: " + uuid);
    ECDDriver driver = new ECDDriver("helloqa.helloqa", uuid);
    driver.run();
  }
}
