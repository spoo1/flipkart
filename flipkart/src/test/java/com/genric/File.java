package com.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File {
String path="test data/test.Properties";
public String getDataFromProperties(String key) throws IOException
{
	FileInputStream ip=new FileInputStream(path);
	Properties pro=new Properties();
	pro.load(ip);
	String data = pro.getProperty(key);
	return data;
	
}

}
