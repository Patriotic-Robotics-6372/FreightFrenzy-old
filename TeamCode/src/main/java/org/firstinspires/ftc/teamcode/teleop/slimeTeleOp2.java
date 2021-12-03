package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;


import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.Robot;

import static org.firstinspires.ftc.teamcode.hardware.Constants.Status.NORMAL;

@TeleOp (name = "PRTELEOP", group = "PRTeleop")
public class slimeTeleOp2 extends LinearOpMode {


    Robot zoom = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {

        telemetry.setMsTransmissionInterval(50);
        telemetry.addData("version", "2");
        telemetry.update();
        zoom.init(hardwareMap, telemetry);
        waitForStart();
        zoom.outtake.neutralPosition();
        while (opModeIsActive()) {

//        Movement

            /*
                if (Math.abs(gamepad1.left_stick_y) > 0.1) {
                    zoom.drivetrain.forward(gamepad1.left_stick_y);
                } else {
                    zoom.drivetrain.stopMotors();
                }

                if (Math.abs(gamepad1.right_stick_y) > 0.1) {
                    zoom.drivetrain.forward(gamepad1.right_stick_y);
                } else {
                    zoom.drivetrain.stopMotors();
                }
             */
            if (Math.abs(gamepad1.right_stick_y) > 0.1 || Math.abs(gamepad1.left_stick_y) > 0.1) {
                zoom.drivetrain.move(gamepad1.right_stick_y, -gamepad1.left_stick_y, gamepad1.right_stick_y, -gamepad1.left_stick_y);
            } else {
                zoom.drivetrain.stopMotors();
            }

//        Intake

            if (gamepad2.left_trigger > 0.1) {
                zoom.intake.spinForward(1);
            } else if (gamepad2.right_trigger > 0.1) {
                zoom.intake.spinBackward(1);
            } else {
                zoom.intake.stopIT();
            }

//        Carousel

            if (gamepad1.right_bumper) {
                zoom.carousel.rightSpin(1);
            } else {
                zoom.carousel.stopSpin();
            }

            if (gamepad1.left_bumper) {
                zoom.carousel.leftSpin(1);
            } else {
                zoom.carousel.stopSpin();   
            }

//         Outtake

            if (gamepad2.x) {
                zoom.outtake.backPosition();
            }

            if (gamepad2.y) {
                zoom.outtake.neutralPosition();
            }

            if (gamepad2.b) {
                zoom.outtake.forwardPosition();
            }

//         Lift

            if (gamepad2.dpad_up) {
                zoom.lift.up(.5);
            } else if (gamepad2.dpad_down) {
                zoom.lift.down(.5);
            } else {
                zoom.lift.stopLift();
            }

//          Telem
            telemetry.addData("pos", zoom.outtake.getOuttake2().getPosition());
            telemetry.update();
        }
    }
}
