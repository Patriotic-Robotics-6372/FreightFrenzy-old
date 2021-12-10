package org.firstinspires.ftc.teamcode.auton.working;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Constants;
import org.firstinspires.ftc.teamcode.hardware.Robot2;


@Autonomous (name = "RedWarehouseLeft", group = "PRTest")
public class RedWarehouseLeft extends LinearOpMode {

    Robot2 zoom = new Robot2();

    @Override
    public void runOpMode() throws InterruptedException {
        zoom.init(hardwareMap, telemetry);
        zoom.drivetrain.setPower(.3);
        zoom.drivetrain.setTelemetry(telemetry);
        zoom.drivetrain.useBrake(true);
        zoom.outtake.neutralPosition();
        waitForStart();
        //Line Up With Second Panel from Right, Left Seam
        while (opModeIsActive()) {
            //forward
            zoom.drivetrain.forward(16);
            sleep(1000);
            zoom.drivetrain.pointTurn(Constants.Status.RIGHT, 21);
            sleep(500);
            zoom.drivetrain.setPower(.5);
            zoom.drivetrain.forward(90);
            break;
            //LETS FUCKING GO
        }
    }
}
