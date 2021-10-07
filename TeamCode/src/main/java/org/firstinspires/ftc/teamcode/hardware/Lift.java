package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

/*
Author: Slimeafro
Date: 10.7.21
System: Lift
 */


public class Lift {

   private DcMotor lift;

   public Lift(DcMotor l) {
        this.lift = l;
   }

   public void up(double power) {
       rotate(power);
   }

   public void down (double power) {
       rotate(-power);
   }

   public void stopLift () {
       rotate(0);
   }

   public void rotate(double l) {
       lift.setPower(l);
   }

}
