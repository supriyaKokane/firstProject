package com.firstproject.QA.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.firstproject.QA.Base.BrowserSetup;

public class UtilityClass extends BrowserSetup {
	

	public static void ScreenShot(String ssName) throws IOException {
		// TODO Auto-generated method stub
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:/Users/pravin/Desktop/Software Testing/ScreenShots/"+ ssName+ ".jpg");
		
		FileUtils.copyFile(src, dest);
	}

}
