package com.test;

import java.io.IOException;

//https://style.potepan.com/articles/35948.html

/**
 * 
 * @author 
 *
 *  Javaでbatファイルを実行
 *  
 */
public class Batch03AndBat {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder();
		
		pb.command("\\..\\..\\resource\\bat\\test.bat");
		pb.command("/../../resource/bat/test.bat");
		pb.command("/temp/test.bat");
		pb.command("\\..\\..\\resource\\bat\\test.bat");
		pb.command("test.bat");
		pb.command("C:\\work\\JavaBatch\\primitiveJavaBatch\\BatchProject\\src\\resource\\bat\\test.bat");
		
		//　実行時のパスのため
		// executePath = C:\pleiades\2022-09\java\17\bin\javaw.exe 		-Dfile.encoding=UTF-8			-classpath "C:\work\JavaBatch\primitiveBatch\BatchProject\bin"		-XX:+ShowCodeDetailsInExceptionMessages com.test.Sample03AndBat
		pb.command("C:\\work\\JavaBatch\\primitiveJavaBatch\\BatchProject\\src\\com\\test\\test.bat");
		
		pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		pb.redirectError(ProcessBuilder.Redirect.INHERIT);
		
		Process process = null;
		try {
			process = pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int ret = 0;
		try {
			ret = process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(ret);

	}

}
