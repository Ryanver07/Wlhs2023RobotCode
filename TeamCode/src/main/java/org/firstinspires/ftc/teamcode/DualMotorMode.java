package org.firstinspires.ftc.teamcode;

//import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Dual Motor Mode", group = "Team 13463 (WLHS)")

public class DualMotorMode extends LinearOpMode {
    public void runOpMode() {
        double GCx;
        double GCy;

        telemetry.addData("Status", "Initializing");
        telemetry.update();

        DcMotor Motor_Four = hardwareMap.get(DcMotor.class, "M4");
        DcMotor Motor_Three = hardwareMap.get(DcMotor.class, "M3");
        DcMotor Right_Motor = hardwareMap.get(DcMotor.class, "M2");
        DcMotor Left_Motor = hardwareMap.get(DcMotor.class, "M1");

        Right_Motor.setPower(0);
        Left_Motor.setPower(0);
        Motor_Three.setPower(0);
        Motor_Four.setPower(0);

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            GCy = gamepad1.right_stick_y;
            GCx = gamepad1.right_stick_x;
            double Left_Power = Math.min(Math.max(GCy-GCx, -1),1);
            double Right_Power = Math.min(Math.max(GCy+GCx, -1),1);

            Left_Motor.setPower(Left_Power);
            Right_Motor.setPower(Right_Power);

            telemetry.addData("Status", "Running");
            telemetry.addData("Right Stick Y: ", GCy);
            telemetry.addData("Right Stick X: ", GCx);
            telemetry.update();
            resetRuntime();
        }
        telemetry.addData("Status: ", "Stopped");
        telemetry.update();
    }

}
