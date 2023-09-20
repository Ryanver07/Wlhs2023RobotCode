package org.firstinspires.ftc.teamcode;
//import com.qualcomm.robotcore.eventloop.opmode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@Override
@TeleOp(name = "FourMotorMode", group = "Team 13463 (WLHS)")
public class FourMotorMode extends LinearOpMode {

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
            hardware.Motor_two.setPower(GCx);
            hardware.Motor_Three.setPower(GCy);
            hardware.Motor_Four.setPower(GCy);

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}