package org.firstinspires.ftc.teamcode.auton.working;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.Robot2;

@Autonomous (name = "BlueLeft", group = "PRTest")
public class BlueLeft extends LinearOpMode {

Robot2 robot = new Robot2();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, telemetry);
        robot.drivetrain.setPower(.4);
        robot.drivetrain.setTelemetry(telemetry);
        robot.drivetrain.useBrake(true);
        robot.outtake.neutralPosition();
        waitForStart();
        //Line Up With 3rd Panel from Right, Left Seam
        while(opModeIsActive()) {
            // forward x inches
            robot.drivetrain.forward(16);;
            sleep(500);
            // turn left 90 degrees
            robot.drivetrain.pointTurn(Constants.Status.RIGHT, 14.1);
            //backwards
            robot.drivetrain.forward(8);
            sleep(600);
            // forward
            robot.drivetrain.setPower(.9);
            robot.drivetrain.backward(60);
            // stop
            robot.drivetrain.stop();

            break;


        }
    }
}
