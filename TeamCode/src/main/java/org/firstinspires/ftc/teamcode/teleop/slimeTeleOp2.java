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

                } else {

                }

                if (Math.abs(gamepad1.right_stick_y) > 0.1) {

                } else {

                }

//        Intake

                if (gamepad1.left_trigger > 0.1) {

                } else {

                }

//        Carousel

                if (gamepad1.right_bumper) {

                }   else {

                }
            }

    }
}
