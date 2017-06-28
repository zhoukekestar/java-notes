package io.github.zhoukekestar;

public class Reflect {
	
	private String message = null;
	public Reflect() {
		
	}
	
	public Reflect(String msg) {
		this.message = msg;
	}
	
	public void show() {
		System.out.println("Hello " + this.message);
	}
	
	public static void show(String msg) {
		System.out.println("Hello " + msg);
	}
}
