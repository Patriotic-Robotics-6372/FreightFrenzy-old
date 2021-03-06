package org.firstinspires.ftc.teamcode.auton.working;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.Robot2;

@Autonomous (name = "RedHubRight", group = "PRTEST")
public class RedHubRight extends LinearOpMode {

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
            zoom.drivetrain.pointTurnRight();
            sleep(250);
            //backward
            zoom.drivetrain.backward(16);
            sleep(250);
            //turn
            zoom.drivetrain.pointTurnLeft();
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

            zoom.drivetrain.backward(4);
            sleep(250);

            zoom.drivetrain.pointTurnLeft();
            sleep(250);

            zoom.drivetrain.setPower(.9);
            zoom.drivetrain.backward(70);
            sleep(250);

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
