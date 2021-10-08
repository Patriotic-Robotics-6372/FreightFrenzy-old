package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Outake {
    private CRServo outake

            public Outake(CRServo o) {this.outake = o;}

            // Move up
            public void moveForward(double power) {outake.setPower(power);}
            //Move down
            public void  moveBack(double power)  {outake.setPower(-power);}
            //stop
            public void  stop() {outake.setPower(0);}
}
