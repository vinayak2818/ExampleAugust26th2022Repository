package com.sgtesting.Autoit;

public class Sample {

	public static void main(String[] args) {
		Execute();

	}
	private static void Execute()
	{
		try {
		Runtime.getRuntime().exec("E:\\GitRepository\\NotePadSaveandclose.exe");	
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
