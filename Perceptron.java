//import random, PDFfunctions
//import sigmoid, arctan,sign,others
public class Perceptron{

private static int perceptronID;///authentic within ANN, may be used for saving weights
private static float learningRate;//learningRate	//get	//set
private static float actual;//actual value			//get	//set
private static float [] x;//inputs;					//get	//set
private static float [] xActual;//"Actual" inputs;	//get	//set
private static float [] w;//weights					//get	//set	//update
private static float output;//actual Y				//get	//function(float: sumproduct())
private static float [] errors;						//get	//set
private static int functionType = 1;//functionType

public Perceptron(){  }///end of default constructor
public Perceptron(int ID){ setID(ID); }///end of  constructor with ID
 
public static void setID(int n){	perceptronID = n;}//end of setID
public static int  getID(){	return perceptronID;}//end of getID

public static void setLearningRate(float lamda){	learningRate = lamda;}//end of setID
public static float  getLearningRate(){	return learningRate;}//end of getID

public static float getOutput(){return output;}//end of getOutput
///setOutput 

public static float [] getWeights(){return w;}//end of setWeights
public static void setWeights(float[] weights){	for (int i =0; i < w.length; i++){	w[i] = weights[i];}}//end of setWeights
public static void updateWeights(float[] weightUpdate){		for (int i =0; i < w.length; i++){	w[i] += weightUpdate[i];	}}//end of updateWeights

public static void setActualOutput(float actualY){	actual = actualY;}//end of setActualOutput
public static float getActualOutput(){	return actual;}//end of setActualOutput

public static float [] getInput(){return x;}//end of getInput
public static void setInputs(float [] inputs){	for (int i =0; i < x.length; i++){x[i] = inputs[i];	}}//end of setInputs

public static float [] getActualInput(){return xActual;}//end of getActualInput
public static void setActualInputs(float [] ActualInputs){	for (int i =0; i < xActual.length; i++){xActual[i] = ActualInputs[i];	}}//end of setActualInputs

 
public static void setErrors(float [] e){	for (int i =0; i < e.length; i++){errors[i] = e[i];	}}//end of setErrors
public static float [] getErrors(){	return errors;	}//end of getErrors

public static void RandomizeWeights(float lower, float higher/*, int PDFtype*/){
	for (int i =0; i < w.length; i++){		///randomize weights here
	}
}//end of RandomizeWeights

public static float sumProduct(){
	float res = 0;
	for (int i = 0; i < w.length; i++){		res += w[i] * x[i];	}//end of for
	return res;
}//end of sumProduct

public static float getOutput(int function){
	// case (functionType){
	switch (function){
	case 1	:	output = arctan(sumProduct());	//break;
	case 2	:	output = sigmoid(sumProduct());	//break;
	case 3	:	output = linear(sumProduct());	//break;
	// case 4	:	output = arctan(sumProduct());	//break;
	default	:	output = sign(sumProduct());	//break;
	
	}//end of switch, function
	return output;
}//end of getOutput

// /use math labrary:
public static float arctan(float t){/*code sigmoid here*/return 1.0f;}//end of arctan
public static float sigmoid(float t){/*code arctan here*/return 1.0f;}//end of sigmoid
public static float sign(float t){if(t == 0.0) return 0; else if (t < 0.0) return -1; else return 1;}//end of sign
public static float linear(float t){	return  t;}//end of linear
public static float linear(float t, float slope, float yIntercept){	return slope * t + yIntercept;}//end of linear
/*other functions??*/

public float[] calculateUpdate(){return new float[w.length];}//end of calculateUpdate
public void updateW(float[] updates){	for (int i =0; i < w.length; i++){	w[i] += updates[i];}}//end of calculateUpdate

public static void backPropagate(int function){
	
	/*	
	*error = y - actualY
	*deltaW = learningRate * error * <current value of sigmoid>
	*update weights: W += deltaW
	*calculate "actual" inputs
	*/
///saving weights to file?
}//end of backPropagate

}//end of Perceptron
