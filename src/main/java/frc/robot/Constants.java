package frc.robot;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;





public class Constants {
    // Manipulator variable names & CAN Ids

    public static final int leftElevatorID = 13;
    public static final int rightElevatorID = 13;

    public static final int leftPivotID = 13;
    public static final int rightPivotID = 13;


    // FIXME this might cause a null pointer exception. Atleast thats what happened during FTC
    public static final SparkMax leftElevator = new SparkMax(0, MotorType.kBrushless);
    public static final SparkMax rightElevator = new SparkMax(0, MotorType.kBrushless);

    public static final SparkMax leftPivot = new SparkMax(0, MotorType.kBrushless);
    public static final SparkMax rightPivot = new SparkMax(0, MotorType.kBrushless);

    
    
    // ENCODERS!! YAYY I LOVE ENCODERS!! WOOOO I LOVE THEM SO MUCH!!! WOO HOO!! HOORAY FOR ENCODERS!!
    public static final RelativeEncoder leftPivotEncoder = leftPivot.getEncoder();
    public static final RelativeEncoder rightPivotEncoder = rightPivot.getEncoder();




    // pid constants

    // FIXME FIXME DO NOT HAVE THESE VALUES THE ROBOT WILL GENUINELY EXPLODE AND BREAK I DONT WANT MR MAD AT ME PLEASE FIXME FIXME FIXME FIXME FIXME FIXME
    public static final double pivotP = 1;
    public static final double pivotI = 1;
    public static final double pivotD = 1;


}
