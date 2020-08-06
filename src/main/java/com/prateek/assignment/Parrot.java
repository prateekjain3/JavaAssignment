
package com.prateek.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

import com.prateek.constant.SoundConstant;
import com.prateek.inter.IFlyable;
import com.prateek.inter.INeighbor;

/**
 * This class represents Parrot attributes 
 * that extends attributes of Neighbor.
 */
public class Parrot extends Bird implements INeighbor,IFlyable {

	/**
	 * This is constructor invoking Chicken class's
	 * parameterized constructor with it's own sound.
	 */
	public Parrot(){
		super(SoundConstant.PARROT_DEFAULT.getSound());
	}

	@Override
	public void neighborName(final String neighborName) {
		if(StringUtils.isNotBlank(neighborName)){
			final String sound = getPropValue(neighborName);
			if(StringUtils.isEmpty(sound)){
				System.out.println(SoundConstant.PARROT_DEFAULT.getSound());
			}else{
				System.out.println(sound);
			}
		}
	}

	/**
	 * This method returns the value of configuration 
	 * key passed as input parameter.
	 */
	private String getPropValue(final String keyName){
		return getPropInstace().getProperty(keyName);
	}

	/**
	 * This method create and return the instance of configuration file.
	 */
	private Properties getPropInstace(){
		final Properties prop = new Properties();
		final File file = new File("./src/main/resources/myConfig.properties");  
		try (InputStream input = new FileInputStream(file.getAbsolutePath())) {
			prop.load(input);
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
		return prop;
	}

	@Override
	public void canFly() {
		System.out.println("Parrot : I can fly");
	}
}