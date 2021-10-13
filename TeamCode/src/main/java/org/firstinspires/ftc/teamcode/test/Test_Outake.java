package org.firstinspires.ftc.teamcode.test;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Outake;

@Autonomous (name= "Outake test")
public class Test_Outake  extends LinearOpMode {
    Outake outake;
    @Override
    public void runOpMode () throws InterruptedException {
        outake = new Outake(hardwareMap.crservo.get("outake"));
        waitForStart();

        outake.moveForward( 0.5);
        sleep( 5000);
        outake.moveBack( 0.5 );
        sleep(5000);
        outake.stop();
        sleep(5000);
    }
}
