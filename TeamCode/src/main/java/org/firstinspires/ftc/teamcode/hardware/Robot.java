package org.firstinspires.ftc.teamcode.hardware;


import android.os.AsyncTask;

import com.qualcomm.hardware.ams.AMSColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Robot {

public Drivetrain drivetrain;
public Intake intake;
public Outtake outtake;
public Lift lift;
public Carousel carousel;


public void init(HardwareMap hwMap, Telemetry telemetry) {
    drivetrain = new Drivetrain(hwMap.dcMotor.get("frontLeft"), hwMap.dcMotor.get("frontRight"), hwMap.dcMotor.get("backLeft"), hwMap.dcMotor.get("backRight"));
    intake = new Intake(hwMap.dcMotor.get("intake"));
    outtake = new Outtake(hwMap.crservo.get("outtake"));
    lift = new Lift(hwMap.dcMotor.get("lift"));
    carousel = new Carousel(hwMap.dcMotor.get("leftCarousel"), hwMap.dcMotor.get("rightCarousel"));
    }


}



