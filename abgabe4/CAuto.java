import auto.IFahrzeug;
public class CAuto implements IFahrzeug {
    private static int sCarCount;
     protected final String mColor;
     protected final String mBrand;
     protected final int mMaxSpeed;
     protected int mGears;
     protected final int mSerialNumber;
     protected int mCurrentGear = 1;
     protected int mCurrentSpeed = 0;
    protected double mPerformance; // in KW
     public CAuto() {
        this("rot", "VW", 230, 5, 75);
    }
     public CAuto(final String color, final String brand, final int maxSpeed, final int gears, int performance) {
        mColor = color;
        mBrand = brand;
        mMaxSpeed = maxSpeed;
        mGears = gears;
        mPerformance = performance;
         mSerialNumber = sCarCount++;
    }
        
     public String getColor() {
        return mColor;
    }
     public String getBrand() {
        return mBrand;
    }
     public int getMaxSpeed() {
        return mMaxSpeed;
    }
     public int getGears() {
        return mGears;
    }
     public int getCurrentSpeed() {
        return mCurrentSpeed;
    }
     public int getCurrentGear() {
        return mCurrentGear;
    }
     @Override
    public void shiftGears(int gear) {
        if (gear < -1 || gear > mGears)
            return;
         mCurrentGear = gear;
         System.out.println(this.getClass().getName() + " shifted to gear: " + mCurrentGear);
    }
     public void setPerformance(int performanceInKW) {
        if (mPerformance <= 0.0)
            return;
        
        mPerformance = performanceInKW;
    }
     public double getPerformanceKW() {
        return mPerformance;
    }
     public double getPerformanceHP() {
        return getHP(mPerformance);
    }
     public String getSerialNumber() {
        int first = 0;
        int serial = mSerialNumber;
        while (serial >= 10) {
            first++;
            serial -= 10;
        }
         return "" + first + "-" + serial;
    }
   
     @Override
    public void accelerate(int increment) {
        if (mCurrentGear == 0)
            return;
        
        if (mCurrentGear == -1)
        increment = -1 * increment;
         if (mCurrentSpeed + increment > mMaxSpeed) {
            mCurrentSpeed = mMaxSpeed;
            return;
        }
        
        if (mCurrentSpeed + increment < 0) {
            mCurrentSpeed = 0;
            return;
        }
         mCurrentSpeed += increment;
         System.out.println(this.getClass().getName() + " changed speed to " + mCurrentSpeed + "km/h");
    }
     @Override
    public void brake(int decrement) {
        accelerate(-1 * decrement);
    }
     public void shiftUp() {        
        shiftGears(mCurrentGear + 1);
    }
     public void shiftDown() {
        shiftGears(mCurrentGear - 1);
    }
     public static double getHP(double performanceInKW) {
        return performanceInKW * 1.36;
    }
}
 