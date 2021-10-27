package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.controller.PIDController;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "Gyro", group = "Test")
public class Gyro extends LinearOpMode {

    Robot bot;
    PIDController pid;

    double setAngle, currAngle, motorPower, speed = 0.2;

    @Override
    public void runOpMode() throws InterruptedException {
        bot = new Robot(hardwareMap, telemetry);
        pid = new PIDController(0.01, 0, 0.001);
        pid.setSetPoint(setAngle);
        bot.init();
        setAngle = bot.getIMU().getAngularOrientation().firstAngle;
        telemetry.setMsTransmissionInterval(50);
        telemetry.addData("setAngle", setAngle);
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {
//            while (bot.getFrontLeft().getCurrentPosition() < 1000) {
//                bot.setDrive(0.2);
//            }
//            bot.stopMotors();
            currAngle = bot.getIMU().getAngularOrientation().firstAngle;
            motorPower = pid.calculate(currAngle);
            motorPower = Math.max(-1, Math.min(1, motorPower));
            telemetry.addData("currAngle", currAngle)
                    .addData("motorPower", motorPower);
            telemetry.update();
            bot.setDrive(motorPower * speed, motorPower * speed, motorPower * speed, motorPower * speed);
        }
    }
}
