
import auto.IFahrzeug;

/*
 * @cond LICENSE
 * ######################################################################################
 * # Creative Commons BY SA                                                             #
 * #                                                                                    #
 * # Authored by Jörg Müller 2019                                                       #
 * ######################################################################################
 * @endcond
 */


/**
 * Diese Klasse führt in der main() Methode die Simulation aus
 */

public class CMain
{

    public static void main( String[] p_args )
    {   
        IFahrzeug car = new CAuto();
        IFahrzeug suv = new CSuv();
        IFahrzeug truck = new CLkw();
       IFahrzeug bike = new CMotorrad();
         car.accelerate(78);
        car.brake(25);
        car.shiftGears(12);
        suv.accelerate(17);
        suv.brake(3);
        suv.shiftGears(4);
         truck.accelerate(28);
        truck.brake(5);
        truck.shiftGears(32);
        ((CLkw)truck).setLoad(1000);
        bike.accelerate(9);
        bike.brake(3);
        bike.shiftGears(2);
       System.out.println("Bike has " + ((CMotorrad)bike).getCcm() + "ccm");
         System.out.println(car.toString());
        System.out.println(suv.toString());
        System.out.println(bike.toString());
        System.out.println(truck.toString());
    }
      
	}
 