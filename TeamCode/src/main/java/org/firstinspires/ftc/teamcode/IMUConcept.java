package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "IMUConcept", group = "Test")
@Disabled
public class IMUConcept extends LinearOpMode {

    Robot bot;

    @Override
    public void runOpMode() throws InterruptedException {
        bot = new Robot(hardwareMap, telemetry);
        bot.init();
        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("firstAngle", bot.getIMU().getAngularOrientation().firstAngle)
                .addData("secondAngle", bot.getIMU().getAngularOrientation().secondAngle)
                .addData("thirdAngle", bot.getIMU().getAngularOrientation().thirdAngle);
            telemetry.update();
        }
    }
}
