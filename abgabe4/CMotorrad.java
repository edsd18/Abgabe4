import auto.IFahrzeug;
	public class CMotorrad implements IFahrzeug {
	     private final String mBrand;
	    private final int mTopSpeed;
	    private final int mGears;
	    private final int mCcm;
	     private int mCurrentSpeed = 0;
	    private int mCurrentGear = 1;
	     public CMotorrad() {
	        this("MZ", 120, 5, 125);
	    }
	     public CMotorrad(String brand, int topSpeed, int gears, int ccm) {
	        mBrand = brand;
	        mTopSpeed = topSpeed;
	        mGears = gears;
	        mCcm = ccm;
	    }
	     public String getBrand() {
	        return mBrand;
	    }
	     public int getTopSpeed() {
	        return mTopSpeed;
	    }
	     public int getGears() {
	        return mGears;
	    }
	     public int getCcm() {
	        return mCcm;
	    }
	     public int getCurrentSpeed() {
	        return mCurrentSpeed;
	    }
	     public int getCurrentGear() {
	        return mCurrentGear;
	    }
	     @Override
	    public void shiftGears(final int gear) {
	        if (gear >= 1 && gear <= mGears)
	            mCurrentGear = gear;
	         System.out.println("Bike shifted to gear: " + mCurrentGear);
	    }
	     @Override
	    public void accelerate(final int increment) {
	        if (increment + mCurrentSpeed >= 0 && increment + mCurrentSpeed <= mTopSpeed)
	            mCurrentSpeed += increment;
	         System.out.println("Bike changed speed to " + mCurrentSpeed + "km/h");
	    }
	     @Override
	    public void brake(final int decrement) {
	        accelerate(-1 * decrement);
	    }
	     @Override
	    public String toString() {
	        String s = this.getClass().getName();
	        s += " : " + this.hashCode();
	        s += "\nTop speed: " + mTopSpeed;
	        s += "\nCurrent speed: " + mCurrentSpeed;
	        s += "\nGears: " + mGears;
	        s += "\nCurrentGear: " + mCurrentGear;
	        s += "\nCCM: " + mCcm;
	        
	        return s;
	    }

}
