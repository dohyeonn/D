package com.my.rest.album.util;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class AlbumUtil {

	public static String castLongToDateString(long value) {
		
		Date date = new Date(value);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return format.format(date);
	}
	
	public static long castByteToMegaByte(long value) {
		
		long megaByte = 1024L * 1024L;
		
		return value / megaByte;
	}
	
	public static long castByteToGigaByte(long value) {
		
		long gigaByte = 1024L * 1024L * 1024L ;
		
		return value / gigaByte;
	}
	
	public static boolean isValidationImage(File file) {

		boolean isValid = false;
		
		try {
			Image image = ImageIO.read(file);
			if(image != null) {
				isValid = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		
		return isValid;
	}
}
