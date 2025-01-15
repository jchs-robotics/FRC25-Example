package frc.robot.Subsystems.ManipulatorSubsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class TemplateSubsystem extends SubsystemBase {
    
    // ~~~~~~~~~~ intialize and declare variables ~~~~~~~~~~ //
    // - motors/motor controller
    // - encoders


    // how to initialize a motor
    // private final SparkMax motorName = new SparkMax(id, motor type)

    // how to initialize built in encoders
    // private final RelativeEncoder encoderName = motorName.getEncoder();

    

    /*  
    EXAMPLE
   
    CAN ID: 1
    private final SparkMax motor = new SparkMax(1, MotorType.kBrushless);
  
    public final RelativeEncoder motorEncoder = motor.getEncoder();
    */


    // ~~~~~~~~~~ constructor ~~~~~~~~~~ //
    public TemplateSubsystem() {
        // should be empty
        // FIXME: does this even need to exsist? why did we have one last year?
    }


    // ~~~~~~~~~~ periodic method ~~~~~~~~~~ //
    @Override
    public void periodic() {
        // ~~~~~ this will run forver ~~~~~ //
        // - this is where we include the telemetry data for the subsystem
        // - (typically only the encoder positions)


        /*
        EXAMPLE: 

        SmartDashboard.putNumber("Motor Encoder Value: ", motorEncoder.getPosition());
        */
    }


    // ~~~~~~~~~~ set Motors method ~~~~~~~~~~ //
    public void setMotors(double speed) {
        // this is called by the commands.
        // the speed parameter is calculated by the PID controller to move the motors

        /*
        EXAMPLE:

        motor.set(speed);
        */
    }





    // FIXME
    // ~~~~~~~~~~ default commands ~~~~~~~~~~ //
    // - when no other commands are being ran, the default command automatically runs
    // - this command could be:
        // - manual controls
        // - a default set position
        // - 


    // default command (FTC)
    // public void setDefaultCommand(/*controller inputs */) {
        // this is how we did it in FTC, probably do it differently
    // }

    // default command (FRC)
    // public void initDefaultCommand() {
    //     setDefaultCommand();
    //     idk how to do it FRC style so if we dont figure it out js do it FTC style
    // }




    // idk what to call this
    // theres probably a better name for the function tho
    // i know this might not make much sense but we'll explain it better in person

    public boolean whyAreYouRunning(double point) {
        // we need an end condition for the PID, this provides it
        // we use a range of -2.5 to 2.5 of the point to account for imperfect PID

        /* 
        Example:
        return motorEncoder.getPosition() < (point + 2.5) 
                && motorEncoder.getPosition() > (point - 2.5);
        */
        return false; // TODO: delete this (i dont like the red error so yeah)
    }




}