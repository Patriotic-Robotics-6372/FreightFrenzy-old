package org.firstinspires.ftc.teamcode.auton;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Robot;
import org.firstinspires.ftc.teamcode.hardware.Robot2;

@Autonomous (name = "forward", group = "PRTest")
public class forward extends LinearOpMode {

    Robot2 zoom = new Robot2();

    @Override
    public void runOpMode() throws InterruptedException {
        zoom.init(hardwareMap, telemetry);
        zoom.drivetrain.setPower(.5);
        waitForStart();
        while (opModeIsActive()) {
            zoom.drivetrain.forward(6);
            sleep(100);
            zoom.drivetrain.stop();
        }
    }
}
