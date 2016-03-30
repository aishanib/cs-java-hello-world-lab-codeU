package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
       //  I won't work!
		String version = System.getProperty("java.version");
		int position = version.indexOf('.');
		position = version.indexOf('.',position+1);
		return Double.parseDouble(version.substring(0,position));
	}

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
    	System.out.print(getVersion());
	}
}
