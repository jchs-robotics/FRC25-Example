package frc.robot.Commands.ManipulatorCommands;
import edu.wpi.first.wpilibj2.command.Command;


public class TemplateCommand extends Command {
    
    // ~~~~~~~~~~ initialize variables ~~~~~~~~~~ //
    // - subsystem variable
    // - PIDController variable
    // - position variable


    /* 
    EXAMPLE
     
    private final TemplateSubsystem m_subsystem;
    private final PIDController pidController;
    private double point;
    */


    // ~~~~~~~~~~ intialize the command ~~~~~~~~~~ //
    // constructer:
    // public COMMANDNAME(Parameters) {Command}

    // EXAMPLE:
    public TemplateCommand(/*TemplateSubsystem subsystem, double setpoint*/) {
       /* 
        // ~~~~~ initialize the stuff being used in the command ~~~~~ //
        this.m_subsystem = subsystem;
        this.pidController = new PIDController(ProportionalValue, IntegralValue, DerivativeValue); <-- watch the "0 to autonomous" video

        // ~~~~~ sets the point that will be used to calculate motor power ~~~~~ //
        pidController.setSetpoint(setpoint);

        // ~~~~~ set the setpoint to a variable to be used later on ~~~~~ //
        point = setpoint;

        // ~~~~~ idk what this does but its required ~~~~~ //
        addRequirements(subsystem);
        */
    }


    // ~~~~~~~~~~ initialize the software ~~~~~~~~~~ //
    @Override
    public void initialize() {
        // ~~~~~ we need to reset the pidController so it doesn't use the values from previous uses ~~~~~ /
        // pidController.reset();

        // ~~~~~ we can also include telemetry information to tell if the command is starting ~~~~~ //
        // System.out.println("PivotCommand started");
    }


    // ~~~~~~~~~~ Running the command ~~~~~~~~~~ //
    @Override
    public void execute() {
        // calculate the speed the motors need to go to reach the setpoint
        // use ONE of the encoders to calculate the value (i like to use the left one just bc)
        // set this calculated value to a variable
        // EXAMPLE: double speed = pidController.calculate(m_subsystem.motorEncoder.getPosition());
       
        // use the calculated value to set the speed of the motors
        // enter this value as a parameter to the setMotors function from the subsystem
        // EXAMPLE: m_subsystem.setMotors(speed);
    }


    // ~~~~~~~~~~ end the command ~~~~~~~~~~ //
    @Override
    public void end(boolean interrupted) {
        // when we want the motors to stop, we stop the motors
        // we can also add telemetry

        /* 
        EXAMPLE:
        m_subsystem.setMotors(0); 
        System.out.println("PivotCommand Finished");  
        */
    }


    // ~~~~~~~~~~ is the command finished? ~~~~~~~~~~ //
    @Override
    public boolean isFinished() {
        // we constantly check if the motor is at the desired position.
        // this command checks that and returns one of two values.
        // true - its finished
        // false - its not finished

        // see the function in the subsystem
        // EXAMPLE: return m_subsystem.tolerance(point); 
        return false; // TODO: delete this (i dont like the errors)
    }





} // end of class. DO NOT DELETE THIS BRACKET. SO MANY ISSUES BECAUSE WE WOULD ACCIDENTALLY DELETE A BRACKET. PLEASE DO NOT DELETE THE BRACKET
