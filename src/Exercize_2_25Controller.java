import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Exercize_2_25Controller {

	@FXML
	private TextField input_Text_Field;

	@FXML
	private Label output_Label;

	@FXML
	void input_Text_Field_Typed(KeyEvent event) {
		if(0 == input_Text_Field.getText().length()) {
			output_Label.setText("Enter number");
			output_Label.setTextFill(Color.BLACK);
		}
		else if(!check_Input(input_Text_Field.getText())){
			output_Label.setText("Incorrect input");
			output_Label.setTextFill(Color.RED);
		}
		else if(input_Text_Field.getText().length() > 29) {
			output_Label.setText("Very long number");
			output_Label.setTextFill(Color.BLACK);
		}
		else if(check_Zeros(input_Text_Field.getText())){
			output_Label.setText("Zero");
			output_Label.setTextFill(Color.BLACK);
		}
		else {
			if(isEven(input_Text_Field.getText())) {
				output_Label.setText("Even");
				output_Label.setTextFill(Color.BLACK);
			}
			else {
				output_Label.setText("Odd");
				output_Label.setTextFill(Color.BLACK);
			}
		}

	}

	boolean check_Input(String S)
	{
		for(int i = 0; i < S.length(); i++) {
			if(!(Character.isDigit(S.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	boolean check_Zeros(String S)
	{
		int counter = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) != '0') {
				counter++;
			}
		}
		return (counter == 0);
	}

	boolean isEven(String S)
	{
		Integer num = (int)S.charAt(S.length()-1);
		return (0 == (num % 2));
	}

}
