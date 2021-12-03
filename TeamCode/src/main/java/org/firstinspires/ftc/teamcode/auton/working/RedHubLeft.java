package org.firstinspires.ftc.teamcode.auton.working;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.hardware.Robot2;

@Autonomous (name = "RedHubLeft", group = "PRTEST")
public class RedHubLeft extends LinearOpMode {

   Robot2 zoom = new Robot2();
    @Override


    public void runOpMode() throws InterruptedException {
        zoom.init(hardwareMap, telemetry);
        zoom.drivetrain.setPower(.3);
        zoom.drivetrain.setTelemetry(telemetry);
        zoom.drivetrain.useBrake(true);
        zoom.outtake.neutralPosition();
        waitForStart();
        while (opModeIsActive()) {
            //forward
            zoom.drivetrain.forward(12);
            sleep(250);
            //turn
            zoom.drivetrain.pointTurnLeft();
            sleep(1000);
            //forward
            zoom.drivetrain.forward(6);
            sleep(250);
            //turn
            zoom.drivetrain.pointTurnRight();
            //drop lift
            zoom.lift.up();
            //lift down
            //backward
            //turn
            //forward
            //STOP
            break;

        }
    }
}
