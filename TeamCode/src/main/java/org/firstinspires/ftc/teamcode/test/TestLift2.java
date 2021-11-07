package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.hardware.Lift;

@TeleOp (name = "TestLift", group = "PRTest")
public class TestLift2 extends LinearOpMode {

    Lift lift;
    @Override
    public void runOpMode() throws InterruptedException {
        lift = new Lift(hardwareMap.dcMotor.get("lift"));
        waitForStart();

        while (opModeIsActive()) {
            if (Math.abs(gamepad1.left_stick_y) > .1) {
                lift.up(gamepad1.left_stick_y);
            } else {
                lift.stopLift();
            }

            telemetry.addData("lift", lift.getLift().getCurrentPosition());
            telemetry.update();
        }
    }
}
