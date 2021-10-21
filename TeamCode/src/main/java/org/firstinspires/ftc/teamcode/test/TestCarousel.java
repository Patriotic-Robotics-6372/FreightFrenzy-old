package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware.Carousel;

@Autonomous (name = "CarouselTest", group = "PRTest")

public class TestCarousel extends LinearOpMode {

    Carousel spin;

    @Override
    public void runOpMode() throws InterruptedException {
            spin = new Carousel(hardwareMap.dcMotor.get("Leftcarousel"),hardwareMap.dcMotor.get("Rightcarousel"));

            waitForStart();

            spin.rightSpin(.5);
            sleep(3000);

            spin.stopSpin();

    }
}
