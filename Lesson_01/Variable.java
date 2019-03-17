public class Variable {
	public static void main (String[] args) {
		char windowsEdition = '7';
		byte ram = 3;
		short systemType = 64;
		float cpuFrq = 2.2f;
		long coreNumb = 2;
		int servPack = 1;
		double hdCap = 500;
		boolean touchpad = false;
		System.out.println("Short description of my computer:");
		System.out.println("- OS: Windows "+ windowsEdition + ", Service Pack " + servPack);
		System.out.println("- OS type: " + systemType + "-bit");
		System.out.println("- RAM capacity: " + ram + " Gb");
		System.out.println("- CPU frequency: " + cpuFrq + " GHz");
		System.out.println("- CPU cores: " + coreNumb);
		System.out.println("- HDD capacity: " + hdCap + " Gb");
		System.out.println("- Touchpad availability: " + touchpad);
		}
}	