package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

public class  Intake {

    private DcMotor intake;

    public Intake(DcMotor i) {
        this.intake = i;
    }

    //spin forward
    public void spinForward(double power) {
        intake.setPower(power);
    }
    //spin backward
    public void spinBackward(double power ) {
        intake. setPower(-power);
    }
    //stop
    public void stop() {
        intake. setPower(0);
    }

}
