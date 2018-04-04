package com.my;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import com.my.rest.album.util.AlbumUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Test.fileStructure();
		
		for(String fileList : list) {
			System.out.println(fileList);
		}

	}
	
	public static List<String> fileStructure() {
		
		List<String> list = new ArrayList<String>();
		
		File file = new File("C://dev//img");
        String fileName = "";
        boolean isExists = file.exists();
         
        if(!isExists) {
            System.out.println("There is nothing.");
        }
         
        if(file.isDirectory()) {
            File[] fileList = file.listFiles();
            for(File tFile : fileList) {
            	fileName = tFile.getName();
                             
                if(tFile.isDirectory()) {
//                    System.out.print(" is ");
//                    System.out.println("a directory.");
                    fileName = "[Directory]" + fileName;
                } else {
//                    System.out.print(" is ");
//                    System.out.println("a file.");
                    fileName = "[file]" + fileName;
                }
                list.add(fileName);
                
                System.out.println("tFile.getName(): "+fileName);
                System.out.println("tFile.getAbsolutePath(): "+tFile.getAbsolutePath());
                System.out.println("tFile.lastModified(): "+tFile.lastModified());
                System.out.println("tFile.lastModified() long to date: "+AlbumUtil.castLongToDateString(tFile.lastModified()));
                System.out.println("tFile.getPath(): "+tFile.getPath());
                try {
					System.out.println("tFile.getCanonicalPath(): "+tFile.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("tFile.getParent(): "+tFile.getParent());
                System.out.println("tFile.getFreeSpace(): "+tFile.getFreeSpace());
                System.out.println("tFile.getFreeSpace() byte to megabyte: "+AlbumUtil.castByteToMegaByte(tFile.getFreeSpace()));
                System.out.println("tFile.getTotalSpace(): "+tFile.getTotalSpace());
                System.out.println("tFile.getTotalSpace() byte to megabyte: "+AlbumUtil.castByteToMegaByte(tFile.getTotalSpace()));
                System.out.println("tFile.getUsableSpace(): "+tFile.getUsableSpace());
                System.out.println("tFile.getUsableSpace() byte to megabyte: "+AlbumUtil.castByteToMegaByte(tFile.getUsableSpace()));
                System.out.println("=================================================");
                
                
                
                try {
                    Image image = ImageIO.read(tFile);
                    if (image == null) {
                    	System.out.println("XXXXXXXXXXXXXXXX");
                    }else {
                    	System.out.println("OOOOOOOOOOOOOOOO");
                    }
                } catch(IOException ex) {
                	System.out.println("EEEEEEEEEEEEEE");
                }
                System.out.println("=================================================");
                
                
            }          
        } else {
            System.out.println("It is not a directory.");
        }
        
        return list;
	}

}
