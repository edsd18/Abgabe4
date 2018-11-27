import auto.IFahrzeug;

public class CLkw extends CAuto implements IFahrzeug {
     private final int mMaxLoad; 
     private int mCurrentLoad = 0;
     public CLkw() {
        this("weiß", "MAN",521,42,150,2000 );
    }
     public CLkw(final String color, final String brand, final int maxSpeed, final int gears, int performance, int maxLoad) {
    	 super( color,brand,maxSpeed,gears,performance);
        mMaxLoad = maxLoad;
    }
     public int getMaxLoad() {
        return mMaxLoad;
    }
     public void setLoad(final int load) {
        if (load >= 0 && load <= mMaxLoad)
            mCurrentLoad = load;
         System.out.println("Changed load to " + mCurrentLoad + "kg");
    }
     public int getCurrentLoad() {
        return mCurrentLoad;
    }
  
     @Override
    public String toString() {
        String s = this.getClass().getName();
        s += " : " + this.hashCode();
        s += "\nCurrent speed: " + getCurrentSpeed();
        s += "\nMaximum load: " + mMaxLoad;
        s += "\nCurrent load: " + mCurrentLoad;
        
        return s;
    }
} 


