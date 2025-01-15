package frc.robot.Subsystems.ManipulatorSubsystems;



import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PivotSubsystem extends SubsystemBase {
    
    // intialize and declare variables
    // - motors/motor controller
    // - encoders

    // although the hardware is already intialized, we make another variable bc it looks nicer :P
    private final SparkMax leftPivot = Constants.leftPivot;
    private final SparkMax rightPivot = Constants.rightPivot;

    public final RelativeEncoder leftPivotEncoder = Constants.leftPivotEncoder;
    public final RelativeEncoder rightPivotEncoder = Constants.rightPivotEncoder;



    // constructor
    public PivotSubsystem() {
        // should be empty
        // FIXME: does this even need to exsist? why did we have one last year?
    }


    // periodic method
    @Override
    public void periodic() {
    // put the encoder positions on smart dashboard   
        // left
        SmartDashboard.putNumber("Left Pivot Value: ", leftPivotEncoder.getPosition());
        // right
        SmartDashboard.putNumber("Right Pivot Value: ", rightPivotEncoder.getPosition());

    }


    // set Motors method
    public void setMotors(double speed) {
        // this is called by the pivotCommand.
        // the speed parameter is calculated by the PID controller to move the motors

        leftPivot.set(speed);
        rightPivot.set(speed);

    }





    // FIXME: default commands

    // default command (FTC)
    // public void setDefaultCommand(/*controller inputs */) {
        // this is how we did it in FTC, probably do it differently
    // }

    // default command (FRC)
    // public void initDefaultCommand() {
    //     setDefaultCommand();
    //     idk how to do it FRC style so if we dont figure it out js do it FTC style
    // }


    // end condition for the pivotCommand
    public boolean iWannaPlayLeague(double point) {
        // we need an end condition for the PID, this provides it
        // we use a range of -2.5 to 2.5 of the point to account for imperfect PID

        return leftPivotEncoder.getPosition() < (point + 2.5) 
                && leftPivotEncoder.getPosition() > (point - 2.5);
    }




}