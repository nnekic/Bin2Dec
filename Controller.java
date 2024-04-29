package application;

import java.util.Iterator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller{
	
	@FXML
	private TextField TextFiledBinary;
	
	@FXML
	private Button ConvertButton;
	
	@FXML
	private TextField DecimalTextField;
	
	public void Convert() {
		try {
		int result = 0;
		
		String binaryNumbersString = TextFiledBinary.getText();
		int[] binaryNumbersArray = new int[binaryNumbersString.length()];
		for(int i = 0; i < binaryNumbersString.length(); i++) {
			binaryNumbersArray[i] = Character.getNumericValue(binaryNumbersString.charAt(i));
		}
		for(int i = 0; i < binaryNumbersArray.length; i++) {
			int decimalNumber;
			int forReversedSize = binaryNumbersArray.length;
			if(binaryNumbersArray[i] > 1 || binaryNumbersArray[i] < 0) {
				TextFiledBinary.setText("Please use numbers 1 or 0");
				DecimalTextField.setText("Decimal digit will be displayed here");
				break;
			}else{
					decimalNumber =((int)Math.pow(2, i)) * binaryNumbersArray[forReversedSize - i - 1];
					result += decimalNumber;
			}
			DecimalTextField.setText(Integer.toString(result));	
		}
		
		}
		catch(NumberFormatException e) {
			TextFiledBinary.setText("Please use numbers 1 or 0");
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
}

		
	

