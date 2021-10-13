package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Outtake {
    private CRServo outtake;

            public Outtake(CRServo o) {this.outtake = o;}

            // Move up
            public void moveForward(double power) {outtake.setPower(power);}
            //Move down
            public void  moveBack(double power)  {outtake.setPower(-power);}
            //stop
            public void  stop() {outtake.setPower(0);}
}
