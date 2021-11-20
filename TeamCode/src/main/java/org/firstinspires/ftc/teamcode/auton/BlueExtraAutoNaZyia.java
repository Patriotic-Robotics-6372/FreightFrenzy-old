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
        zoom.drivetrain.setPower(.3);
        zoom.drivetrain.setTelemetry(telemetry);
        zoom.drivetrain.useBrake(true);
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
            zoom.drivetrain.forward(5);
            sleep(500);
            //turn left 135 degrees
            zoom.drivetrain.pointTurnLeft();
            sleep(500);
            //backward
            zoom.drivetrain.backward(28);
            sleep(500);
            //turn on carousel
            zoom.carousel.rightSpin(.5);
            sleep(3500);
            zoom.carousel.stopSpin();
            //forward
            zoom.drivetrain.forward(2);
            //turn right
            zoom.drivetrain.pointTurn(Constants.Status.RIGHT, 13.5);
            sleep(500);
            //forward
            zoom.drivetrain.forward(22.35);
            //stop
            zoom.drivetrain.stop();
            break;
            //LETS FUCKING GO
        }
    }
}
