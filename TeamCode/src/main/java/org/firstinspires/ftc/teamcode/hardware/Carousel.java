package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

/*
Author: Slimeafro
Date: 10.12.21
System: Carousel
 */

//Essentially an exact replica of the lift system with different variable and method names

public class Carousel {

   private DcMotor carousel;

   public Carousel(DcMotor c) {
        this.carousel = c;
   }

   //Different spins depending on what side of the field we are on

   public void rightSpin(double rotation) {
       spin(rotation);
   }

   public void leftSpin (double rotation) {
       spin(-rotation);
   }

   public void stopSpin () {
       spin(0);
   }

   public void spin(double c) {
       carousel.setPower(c);
   }

}
