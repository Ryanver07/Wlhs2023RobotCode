package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
public class hardware {
    public static DcMotor Motor_one = hardwareMap.get(DcMotor.class, "M1");

    public static DcMotor Motor_two = hardwareMap.get(DcMotor.class, "M2");

    public static DcMotor Motor_Three = hardwareMap.get(DcMotor.class, "M3");

    public static DcMotor Motor_Four = hardwareMap.get(DcMotor.class, "M4");
}