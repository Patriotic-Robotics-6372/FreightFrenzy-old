package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "slimeTeleOpInitial", group = "PRTest")
public class slimeTeleOpInitial extends OpMode {

    //Drivetrain
    DcMotor frontleft, frontRight, backLeft, backRight;
    //Intake
    DcMotor intake;
    //Outtake
    CRServo outtake;
    //Lift
    DcMotor lift;
    //Carousel
   DcMotor carousel;

    @Override
    public void init() {

        //DT
        hardwareMap.dcMotor.get("frontLeft");
        hardwareMap.dcMotor.get("frontRight");
        hardwareMap.dcMotor.get("backLeft");
        hardwareMap.dcMotor.get("backRight");

        //Intake
        hardwareMap.crservo.get("intake");
        //Outtake

        //Lift

        //Carousel


    }

    @Override

    //Debating on whether or not I want to drive this the same as the dummy bot ;-;
    public void loop() {

        //Movement (Forwards anyway its just a test this code is annoyinggggggg
        if (Math.abs(gamepad1.left_stick_y) > 0.1) {
                frontleft.setPower(gamepad1.left_stick_y);
                backLeft.setPower(gamepad1.left_stick_y);
        } else {
            frontleft.setPower(0);
            backLeft.setPower(0);
        }

        if (Math.abs(gamepad1.right_stick_y) > 0.1) {
                frontRight.setPower(gamepad1.right_stick_y);
                backRight.setPower(gamepad1.right_stick_y);
        } else {
            frontRight.setPower(0);
            backRight.setPower(0);
        }

        //Intake

        if (gamepad1.left_trigger) {
            intake.setPower(.1);
        } else {
            intake.setPower(0);
        }


    }
}
