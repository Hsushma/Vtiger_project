package com.vtiger.genericutility;

import java.time.LocalDateTime;

public class JavaUtility 
{
	/**
	 * this method will capture the date and time
	 * @return system date and time and return
	 */
	public String getSystemdateTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

}
