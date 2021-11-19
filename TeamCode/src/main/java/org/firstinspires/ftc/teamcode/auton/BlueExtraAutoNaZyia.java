package org.firstinspires.ftc.teamcode.auton;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.Robot2;

@Autonomous (name = "BlueExtraAutoNaZyia", group = "PRTest")
public class BlueExtraAutoNaZyia extends LinearOpMode {

    Robot2 zoom = new Robot2();

    @Override
    public void runOpMode() throws InterruptedException {
        zoom.init(hardwareMap, telemetry);
        zoom.drivetrain.setPower(.5);
        zoom.drivetrain.setTelemetry(telemetry);
        waitForStart();
        while (opModeIsActive()) {
            /*
            // forward
            zoom.drivetrain.forward(22.5);
            //turn right
            zoom.drivetrain.stop();
            sleep(500);
            zoom.drivetrain.pointTurnRight();
           //stop
            zoom.drivetrain.stop();
            sleep(500);
            //forward
            zoom.drivetrain.forward(19);
            //stop
            zoom.drivetrain.stop();
            */

            //forward
            zoom.drivetrain.forward(3);
            sleep(500);
            //turn left 135 degrees
            zoom.drivetrain.pointTurnLeft();
            sleep(500);
            //backward
            zoom.drivetrain.backward(22);
            sleep(500);
            //turn on carousel
            zoom.carousel.rightSpin(.5);
            sleep(3000);
            zoom.carousel.stopSpin();
            //stop
            zoom.drivetrain.stop();


            break;
        }
    }
}
