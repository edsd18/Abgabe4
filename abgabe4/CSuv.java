import auto.IFahrzeug;

public class CSuv extends CAuto implements IFahrzeug{
	  private boolean m_offroadFahrbar;
	   private final int mSerialNumber;
	    private static int sSuvCount;
	    private  boolean mOffroadDrivable;
	    public CSuv() {
	        super();
	        mOffroadDrivable = true;
	        mSerialNumber = sSuvCount++;
	    }
	     public CSuv(boolean offroadDrivable) {
	        super();
	        mOffroadDrivable = offroadDrivable;
	        mSerialNumber = sSuvCount++;
	    }

	  public CSuv( final String color, final String brand, final int maxSpeed, final int gears, int performance, boolean p_offroadFahrbar )
	  {
	    // Aufruf des Konstruktur von CAuto
	    super(  color, brand,  maxSpeed,  gears,  performance);
	    this.m_offroadFahrbar = p_offroadFahrbar;
	    mSerialNumber = sSuvCount++;
	    
	    
      
	  }
	    public CSuv get() {
	        CSuv suv = new CSuv(
	                getColor(),
	                getBrand(),
	                getMaxSpeed(),
	                getGears(),
	                (int)getPerformanceKW(),
	                mOffroadDrivable
	        );
	         suv.accelerate(this.getCurrentSpeed());
	        suv.shiftGears(this.getCurrentGear());
	         return suv;
	    }
	     public boolean isOffroadDrivable() {
	        return mOffroadDrivable;
	    }
	     @Override
	    public String getSerialNumber() {
	        int first = 0;
	        int serial = mSerialNumber;
	        while (serial >= 10) {
	            first++;
	            serial -= 10;
	        }
	         return "" + first + "-" + serial;
	    }
	  public boolean getoffroadFahrbar() {
		  return m_offroadFahrbar;
	  }
	  
	  
}
