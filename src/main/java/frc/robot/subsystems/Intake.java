package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase {

    private CANSparkMax intakeMotor;

    public Intake() {
        intakeMotor = new CANSparkMax(IntakeConstants.kLIntakeMotorPort, CANSparkMaxLowLevel.MotorType.kBrushless);

        intakeMotor.setSmartCurrentLimit(40);

    }

    public void intakeBalls() {
        setIntakePower(IntakeConstants.kIntakePower);
    }
    
    public void extakeBalls() {
        setIntakePower(-IntakeConstants.kIntakePower);
    }

    public void disbale() {
        setIntakePower(0);
    }

    public void setIntakePower(double power){
        intakeMotor.set(power);

    }
}