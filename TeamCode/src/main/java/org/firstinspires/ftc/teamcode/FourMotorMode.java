package org.firstinspires.ftc.teamcode;
//import com.qualcomm.robotcore.eventloop.opmode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

//@Override
@TeleOp(name = "FourMotorMode", group = "Team 13463 (WLHS)")
public class FourMotorMode extends LinearOpMode {

    public void runOpMode() {
        telemetry.addData("Status", "Initializing");
        telemetry.update();
        double GCx;
        double GCy;

        DcMotor Motor_Four = hardwareMap.get(DcMotor.class, "M4");
        DcMotor Motor_Three = hardwareMap.get(DcMotor.class, "M3");
        DcMotor Motor_two = hardwareMap.get(DcMotor.class, "M2");
        DcMotor Motor_one = hardwareMap.get(DcMotor.class, "M1");

        Motor_one.setPower(0);
        Motor_two.setPower(0);
        Motor_Three.setPower(0);
        Motor_Four.setPower(0);

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            GCy = gamepad1.right_stick_y;
            GCx = gamepad1.right_stick_x;

            Motor_one.setPower(GCx);
            Motor_two.setPower(GCx);
            Motor_Three.setPower(GCy);
            Motor_Four.setPower(GCy);

            telemetry.addData("Status", "Running");
            telemetry.addData("Right Stick X: ", GCx);
            telemetry.addData("Right Stick Y: ", GCy);
            telemetry.update();
            resetRuntime();
        }
    }
}