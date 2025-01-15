package frc.robot.Commands.ManipulatorCommands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.Subsystems.ManipulatorSubsystems.PivotSubsystem;

public class PivotCommand extends Command {
  
    private final PivotSubsystem m_subsystem;
    private final PIDController pidController;
    private double point;
    


    // intialize the command
    public PivotCommand(PivotSubsystem subsystem, double setpoint) {
       
        this.m_subsystem = subsystem;
        this.pidController = new PIDController(Constants.pivotP, Constants.pivotI, Constants.pivotD);
        pidController.setSetpoint(setpoint);
        point = setpoint;
        addRequirements(subsystem);
    }
    

    // initialize the software
    @Override
    public void initialize() {
        // we need to reset the pidController so it doesn't use the values from previous uses
        pidController.reset();

        System.out.println("PivotCommand started");

    }


    // Running the command
    @Override
    public void execute() {

        double speed = pidController.calculate(m_subsystem.leftPivotEncoder.getPosition());
       
        // see function in subsystem
        m_subsystem.setMotors(speed);

    }


    // end function
    @Override
    public void end(boolean interrupted) {
        
        m_subsystem.setMotors(0);
        System.out.println("PivotCommand Finished");  
    }


    // finished functions
    @Override
    public boolean isFinished() {
        // see function in subsystem
        return m_subsystem.iWannaPlayLeague(point); 

    }




} // end of class. DO NOT DELETE THIS BRACKET. SO MANY ISSUES BECAUSE WE WOULD ACCIDENTALLY DELETE A BRACKET. PLEASE DO NOT DELETE THE BRACKET
