package org.comp;

public class Desktop implements Hardware,Software {
public void desktopModel() {
	System.out.println("Dell E20");
}
	

@Override
public void softwareResources() {
	System.out.println("Operating system");
	
}
@Override
public void hardwareResources() {
	System.out.println("CPU");
	
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.softwareResources();
	d.hardwareResources();
	
}
}
