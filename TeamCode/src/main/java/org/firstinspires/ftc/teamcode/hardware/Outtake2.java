package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.Servo;

public class Outtake2 {
    private Servo outtake2;

    public Outtake2(Servo s) {this.outtake2 = s;}


    public void neutralPosition(double position) {
            outtake2.setPosition(position);
    }

    public void backPosition(double position) {
        outtake2.setPosition(0);
    }

    public void forwardPosition(double position) {
        outtake2.setPosition(position);
    }

    public Servo getOuttake2() {
        return outtake2;
    }
}
