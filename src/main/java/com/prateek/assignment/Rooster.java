
package com.prateek.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

import com.prateek.constant.SoundConstant;

/**
 * This class represents Rooster attributes 
 * that extends attributes of Chicken.
 */
public class Rooster extends Chicken {

	/**
	 * This is constructor invoking Chicken class's
	 * parameterized constructor with it's own sound.
	 */
	public Rooster(){
		super(SoundConstant.ROOSTER_SOUND.getSound());
	}

	/**
	 * This is parameterized constructor where input 
	 * parameter will be second language.
	 */
	public Rooster(final String secondLanguage){
		if(StringUtils.isNotBlank(secondLanguage)){
			final String valScndLang = getPropValue(secondLanguage);
			if(StringUtils.isEmpty(valScndLang)){
				System.out.println(SoundConstant.ROOSTER_SOUND.getSound());
			}else{
				System.out.println(valScndLang);
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

	/**
	 * This represents fly state of Rooster.
	 */
	@Override
	public void canFly() {
		System.out.println("Rooster : I cannot fly");
	}
}