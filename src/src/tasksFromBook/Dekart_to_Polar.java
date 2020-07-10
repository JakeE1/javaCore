package tasksFromBook;
import static java.lang.Math.*;
import org.omg.CORBA.INTERNAL;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Dekart_to_Polar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("write x ");
        int xArgument = in.nextInt();
        System.out.println("write y ");
        int yArgument = in.nextInt();

        double polarRadius = sqrt( (xArgument * xArgument) + (yArgument * yArgument) ) ;
        double polarAngle  = atan2((double)xArgument,(double)yArgument);




        System.out.println("The result of conversion Dekaet system of coordinates to polar system of coordinates will be = ( " + polarRadius + " , " + polarAngle + " )" );







    }

}
