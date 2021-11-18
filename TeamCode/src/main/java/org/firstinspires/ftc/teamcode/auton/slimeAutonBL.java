package org.firstinspires.ftc.teamcode.auton;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Robot2;

public class slimeAutonBL extends LinearOpMode {

Robot2 robot = new Robot2();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, telemetry);
        robot.drivetrain.setPower(.5);
        waitForStart();
        while(opModeIsActive()) {
            // forward x inches
            robot.drivetrain.forward(24);
            // stop
            robot.drivetrain.stop();
            sleep(500);
            // turn left 90 degrees
            robot.drivetrain.pointTurnLeft();
            // stop
            robot.drivetrain.stop();
            // forwad x inches
            robot.drivetrain.forward(12);
            // stop
            robot.drivetrain.stop();


        }
    }
}
