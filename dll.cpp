using System 
using Cals

Public Static Program
{
    Public Static Main(args As String())
    {
        Console.WriteLine(Function.Add(5,20)); 
        Console.WriteLine(Function.Sub(30,20)); 
        Console.WriteLine(Function.Mult(5,5)); 
        Console.WriteLine(Function.Div(40,20)); 
        Console.ReadKey();
    }
}

using System;
using System.Collections.Generic; 
using System.Linq;
using System.Text;
using System.Threading.Tasks; 
namespace CalSource
{
    public static class Functions
    {
        public static double Add(double num1,double num2){ 
        return num1+num2;
        }
        public static double Sub(double num1,double num2){ 
        return num1-num2;
        }
        public static double Mult(double num1,double num2){ 
        return num1*num2;
        }
        public static double Div(double num1,double num2){ 
        return num1/num2;
        }
    }
}
