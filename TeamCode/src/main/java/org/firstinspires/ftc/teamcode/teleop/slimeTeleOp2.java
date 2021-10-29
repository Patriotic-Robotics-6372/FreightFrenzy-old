package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;


import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.Robot;

import static org.firstinspires.ftc.teamcode.hardware.Constants.Status.NORMAL;


public class slimeTeleOp2 extends LinearOpMode {


    Robot zoom = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {
            while(opModeIsActive()) {

//        Movement


                if (Math.abs(gamepad1.left_stick_y) > 0.1) {
                    zoom.drivetrain.forward(.2);
                } else {
                    zoom.drivetrain.stopMotors();
                }

                if (Math.abs(gamepad1.right_stick_y) > 0.1) {
                    zoom.drivetrain.forward(.2);
                } else {
                    zoom.drivetrain.stopMotors();
                }

//        Intake

                if (gamepad1.left_trigger > 0.1) {
                    zoom.intake.spinForward(.2);
                } else {
                    zoom.intake.stopIT();
                }

//        Carousel

                if (gamepad1.right_bumper) {
                zoom.carousel.rightSpin(.1);
                }   else {
                    zoom.carousel.stopSpin();
                }

//         Outtake

                if (gamepad1.x) {
                    zoom.outtake.moveForward(.2);
            }

    }
}
