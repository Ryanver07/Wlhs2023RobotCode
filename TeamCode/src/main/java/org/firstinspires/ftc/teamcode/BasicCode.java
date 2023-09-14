package org.firstinspires.ftc.teamcode;
//import com.qualcomm.robotcore.eventloop.opmode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
//@Override
@TeleOp
public class BasicCode extends LinearOpMode { public void runOpMode() {
    double x;
    double y;

    DcMotor test_motor1 = hardwareMap.get(DcMotor.class, "M1");
    DcMotor test_motor2 = hardwareMap.get(DcMotor.class, "M2");
    DcMotor test_motor3 = hardwareMap.get(DcMotor.class, "M3");
    DcMotor test_motor4 = hardwareMap.get(DcMotor.class, "M4");

    telemetry.addData("Status", "Initialized");
    telemetry.update();

    waitForStart();
        while (opModeIsActive())
        {
            y = gamepad1.right_stick_y;
            x = -gamepad1.right_stick_x;

            test_motor1.setPower(x);
            test_motor2.setPower(x);
            test_motor3.setPower(y);
            test_motor4.setPower(y);

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }

}
