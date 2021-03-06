package edu.umb.cs680.HW07;


import java.util.LinkedList;

public class FileSystem {
	
	private static FileSystem instance = null;
	private LinkedList<Directory> rootD = new LinkedList<Directory>();

	public static FileSystem getFileSystem() {
		if (instance == null)
			instance = new FileSystem();
		return instance;
	}

	public LinkedList<Directory> getRootDirs() {
		return this.rootD;
	}

	public void addRootDir(Directory root) {
		rootD.add(root);
	}
	public static void main(String[]args)
    {
    	System.out.println("FileSystem Class Successfully Executed");
    }
}