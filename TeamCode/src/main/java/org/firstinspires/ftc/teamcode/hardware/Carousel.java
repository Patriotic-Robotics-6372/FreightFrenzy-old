package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

/*
Author: Slimeafro
Date: 10.12.21
System: Carousel
 */


public class Carousel {

   private DcMotor carousel;

   public Carousel(DcMotor c) {
        this.carousel = c;
   }

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
