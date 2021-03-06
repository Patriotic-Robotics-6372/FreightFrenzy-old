package org.firstinspires.ftc.teamcode.auton.working;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.Robot2;

@Autonomous (name = "RedHubLeft", group = "PRTEST")
public class RedHubLeft extends LinearOpMode {

   Robot2 zoom = new Robot2();
    @Override


    public void runOpMode() throws InterruptedException {
        zoom.init(hardwareMap, telemetry);
        zoom.drivetrain.setPower(.4);
        zoom.drivetrain.setTelemetry(telemetry);
        zoom.drivetrain.useBrake(true);
        zoom.outtake.neutralPosition();

        zoom.lift.init();
        zoom.lift.setTelemetry(telemetry);
        zoom.lift.useEncoders(true);
        zoom.lift.useBrake(true);
        zoom.lift.setMaxPower(.3);
        waitForStart();
        while (opModeIsActive()) {

            //forward
            zoom.drivetrain.forward(12);
            sleep(250);
            //turn
            zoom.drivetrain.pointTurnLeft();
            sleep(250);
            //backward
            zoom.drivetrain.backward(21);
            sleep(250);
            //turn
            zoom.drivetrain.pointTurnRight();
            sleep(250);
            // forward
            zoom.drivetrain.forward(7.0);
            sleep(250);

            //drop lift
            zoom.lift.setLevel(2);
            zoom.lift.updateLevel();
            sleep(250);

            zoom.outtake.backPosition();
            sleep(2000);

            zoom.outtake.neutralPosition();
            zoom.lift.setLevel(0);
            zoom.lift.updateLevel();
            sleep(250);

            zoom.drivetrain.backward(16);
            sleep(250);

            zoom.drivetrain.pointTurnRight();
            sleep(250);

            zoom.drivetrain.backward(53);
            sleep(250);

            zoom.carousel.leftSpin(.5);
            sleep(3500);
            zoom.carousel.stopSpin();

            //forward
            zoom.drivetrain.forward(2);
            //turn right
            zoom.drivetrain.pointTurnLeft();
            sleep(500);
            //forward
            zoom.drivetrain.forward(18);
            //stop
            zoom.drivetrain.stop();
            //lift down
            //backward
            //turn
            //forward
            //STOP
            //
            break;

        }
    }
}
