/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezadvjavaexcep;

/**
 *
 * @author Boogster
 */
public class Calculator 
{
    
    double[] robsArray = new double [10];  //sets array
    double calculateAve;
    double standardDev;     
    int location,n;
    int elementsUsed;
    double sum1,sum2, means;
    String userInput;
    
    public Calculator (String userInput, int local)
    {
        location=local;
        n = Integer.parseInt(userInput); //convertws user input from string to integer
        robsArray[location]=n;  //sets value to location in array
        for (int i=1; i<=location; i++) //loop for adding sum1
        {
           sum1=sum1+robsArray[i];
        }
        double avg=sum1/location;
        //sum2=0;
        for (int i=1; i<=location; i++)
        {
            sum2=sum2+(robsArray[i]*robsArray[i]);
        }
        means=Math.round((avg)*100.0)/100.0;  //calculated for a two decimal result
        standardDev=Math.round((sum2 / location - means * means)*100.0)/100.0;  //calculated for a two decimal result
    }
    public double Means()
    {
     return means;
    }
    public double Standard()
    {
     return standardDev;
    }
}


