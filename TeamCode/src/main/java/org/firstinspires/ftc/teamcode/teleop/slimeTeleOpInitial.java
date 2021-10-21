package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "slimeTeleOpInitial", group = "PRTest")
public class slimeTeleOpInitial extends OpMode {

    //Drivetrain
    DcMotor frontLeft, frontRight, backLeft, backRight;

    //Intake
 //   DcMotor intake;

    //Outtake
    //CRServo outtake;

    //Lift
    //DcMotor lift;

   //Carousel
   //DcMotor carousel;

    @Override
    public void init() {

        //DT
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");

        //Intake
//        intake = hardwareMap.dcMotor.get("intake");

        //Outtake (AGAIN, THIS IS A SERVO)

        //Lift

        //Carousel


    }

    @Override
    public void loop() {

//        Movement
//

        if (Math.abs(gamepad1.left_stick_y) > 0.1) {
                frontLeft.setPower(gamepad1.left_stick_y);
                backLeft.setPower(gamepad1.left_stick_y);
        } else {
            frontLeft.setPower(0);
            backLeft.setPower(0);
        }

        if (Math.abs(gamepad1.right_stick_y) > 0.1) {
                frontRight.setPower(gamepad1.right_stick_y);
                backRight.setPower(gamepad1.right_stick_y);
        } else {
            frontRight.setPower(0);
            backRight.setPower(0);
        }

//        (Left + Right)


        }

//        Intake

//        if (gamepad1.left_trigger > 0.1) {
//            intake.setPower(.1);
//        } else {
//            intake.setPower(0);
//        }


    }
}
