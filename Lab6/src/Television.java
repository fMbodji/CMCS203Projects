/** 
*The purpose of this class is to model a television
*Fatima Mbodji - 12/05/2023
*/

public class Television {
	
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	
	/**
	 * Parameterized constructor to initialize a Televison object
	 * Takes two arguments 
	 * @param brand for the name of the manufacturer
	 * @param size for the size of the screen
	 */
	public Television(String brand, int size) {
		this.MANUFACTURER=brand;
		this.SCREEN_SIZE=size;
		this.powerOn=false;
		this.channel=2;
		this.volume=20;
	}
	
	/**
	 * Method to access the name of the manufacturer of the Television object
	 * @return the value of the constant field MANUFACTURER
	 */
	public String getManufacturer() {
		return this.MANUFACTURER;
	}
	
	/**
	 * Method to access the size of the screen of the Television object
	 * @return the value of the constant field SCREEN_SIZE
	 */
	public int getScreenSize() {
		return this.SCREEN_SIZE;
	}
	
	/**
	 * Method to access the channel of the Television object
	 * @return the value of the field channel
	 */
	public int getChannel() {
		return this.channel;
	}
	
	/**
	 * Method to access the volume of the Television object
	 * @return the value of the field
	 */
	public int getVolume() {
		return this.volume;
	}
	
	/**
	 * Method to set the volume of the Television object
	 * @param channel value of the volume
	 */
	public void setChannel(int channel) {
		this.channel=channel;
	}
	
	/**
	 * Method to switch on or off the power of the Television object
	 */
	public void power() {
		powerOn=(!powerOn);
	}
	
	/**
	 * Method to increase the volume of the Television object by 1.
	 */
	public void increaseVolume() {
		this.volume++;
	}
	
	/**
	 * Method to decrease the volume of the Television object by 1.
	 */
	public void decreaseVolume() {
		this.volume--;
	}

}
