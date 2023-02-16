/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

/**
 *
 * @author Hp
 */
public class PayrollSystemClass
{
  private double jtxtEmployes_Name;
  private double jtxAdress;
  private double jtxCounty;
  private double jlblGross_Pay1;
  private double jtxRefrence_Nubmer;
  private double jtxtBasicSalary;
  private double jtxtOver_Time;
  private double jxlEmployee_Name;
  
  // CONSTUCTORS

    public PayrollSystemClass(double jtxtEmployes_Name, double jtxAdress, double jtxCounty, double jlblGross_Pay1, double jtxRefrence_Nubmer, double jtxtBasicSalary, double jtxtOver_Time, double jxlEmployee_Name)
    {
        this.jtxtEmployes_Name = jtxtEmployes_Name;
        this.jtxAdress = jtxAdress;
        this.jtxCounty = jtxCounty;
        this.jlblGross_Pay1 = jlblGross_Pay1;
        this.jtxRefrence_Nubmer = jtxRefrence_Nubmer;
        this.jtxtBasicSalary = jtxtBasicSalary;
        this.jtxtOver_Time = jtxtOver_Time;
        this.jxlEmployee_Name = jxlEmployee_Name;
    }
  
    // GETTERS

    public double getJtxtEmployes_Name()
    {
        return jtxtEmployes_Name;
    }

    public double getJtxAdress()
    {
        return jtxAdress;
    }

    public double getJtxCounty()
    {
        return jtxCounty;
    }

    public double getJlblGross_Pay1()
    {
        return jlblGross_Pay1;
    }

    public double getJtxRefrence_Nubmer()
    {
        return jtxRefrence_Nubmer;
    }

    public double getJtxtBasicSalary()
    {
        return jtxtBasicSalary;
    }

    public double getJtxtOver_Time()
    {
        return jtxtOver_Time;
    }

    public double getJxlEmployee_Name()
    {
        return jxlEmployee_Name;
    }
    
    // SETTERS

    public void setJtxtEmployes_Name(double jtxtEmployes_Name)
    {
        this.jtxtEmployes_Name = jtxtEmployes_Name;
    }

    public void setJtxAdress(double jtxAdress)
    {
        this.jtxAdress = jtxAdress;
    }

    public void setJtxCounty(double jtxCounty)
    {
        this.jtxCounty = jtxCounty;
    }

    public void setJlblGross_Pay1(double jlblGross_Pay1)
    {
        this.jlblGross_Pay1 = jlblGross_Pay1;
    }

    public void setJtxRefrence_Nubmer(double jtxRefrence_Nubmer)
    {
        this.jtxRefrence_Nubmer = jtxRefrence_Nubmer;
    }

    public void setJtxtBasicSalary(double jtxtBasicSalary)
    {
        this.jtxtBasicSalary = jtxtBasicSalary;
    }

    public void setJtxtOver_Time(double jtxtOver_Time)
    {
        this.jtxtOver_Time = jtxtOver_Time;
    }

    public void setJxlEmployee_Name(double jxlEmployee_Name)
    {
        this.jxlEmployee_Name = jxlEmployee_Name;
    }
    
                                  
}
