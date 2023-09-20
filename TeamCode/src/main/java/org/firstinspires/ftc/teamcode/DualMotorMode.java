package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Dual Motor Mode", group = "Team 13463 (WLHS)")

public class DualMotorMode extends LinearOpMode {
    public void runOpMode() {
        double GCx;
        double GCy;

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            GCy = gamepad1.right_stick_y;
            GCx = gamepad1.right_stick_x;

            hardware.Motor_one.setPower(GCx);
            hardware.Motor_two.setPower(GCy);

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
